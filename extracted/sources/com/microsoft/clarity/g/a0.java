package com.microsoft.clarity.g;

import android.content.Context;
import com.microsoft.clarity.g.a0;
import com.microsoft.clarity.models.AssetType;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.SessionMetadata;
import com.microsoft.clarity.models.ingest.AssetCheck;
import com.microsoft.clarity.models.ingest.PayloadUploadResponse;
import com.microsoft.clarity.models.repositories.RepositoryAsset;
import com.microsoft.clarity.models.repositories.WebRepositoryAsset;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import defpackage.wu0;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Semaphore;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {
    public static final ConcurrentHashMap g = new ConcurrentHashMap();
    public static final int h = 5;
    public final Context a;
    public final L b;
    public final h0 c;
    public final com.microsoft.clarity.o.a d;
    public final com.microsoft.clarity.n.b e;
    public final DynamicConfig f;

    public a0(Context context, L l, String str) {
        js3.p(context, "context");
        js3.p(l, "networkUsageTracker");
        js3.p(str, "projectId");
        this.a = context;
        this.b = l;
        h0 h0VarB = com.microsoft.clarity.b.a.b(context, str);
        this.c = h0VarB;
        this.d = com.microsoft.clarity.b.a.a(context, h0VarB, l);
        this.e = com.microsoft.clarity.b.a.b(context);
        this.f = com.microsoft.clarity.b.a.k;
    }

    public final void a(boolean z) {
        List listP0;
        com.microsoft.clarity.n.d dVar = (com.microsoft.clarity.n.d) this.e;
        dVar.getClass();
        synchronized (com.microsoft.clarity.n.d.b) {
            try {
                List listA = com.microsoft.clarity.p.f.a(dVar.a, null, System.currentTimeMillis() - ((long) 259200000), 1);
                ArrayList arrayList = new ArrayList(wu0.V(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(dVar.a.a((File) it.next()));
                }
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(SessionMetadata.Companion.fromJson((String) it2.next()));
                }
                listP0 = kotlin.collections.a.P0(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (SessionMetadata sessionMetadata : kotlin.collections.a.J0(listP0, new U())) {
            try {
                String sessionId = sessionMetadata.getSessionId();
                a(sessionId, new X(this, sessionMetadata, sessionId, z));
            } catch (Exception e) {
                if (!(e instanceof FileNotFoundException)) {
                    this.c.a(e, ErrorType.UploadSession, null);
                }
            }
        }
    }

    public final void a(SessionMetadata sessionMetadata, com.microsoft.clarity.n.g gVar) {
        final SessionMetadata sessionMetadata2;
        Exception exc;
        tx8 tx8Var;
        AssetCheck assetCheck;
        js3.p(sessionMetadata, "sessionMetadata");
        js3.p(gVar, "sessionRepository");
        try {
            if (sessionMetadata.getLeanSession()) {
                return;
            }
            if (this.b.a != null) {
                try {
                    long j = 86400000;
                    if (sessionMetadata.getTimestamp() / j != System.currentTimeMillis() / j) {
                        return;
                    }
                    L l = this.b;
                    if (l.a != null) {
                        String string = l.b.getString(l.d, "");
                        String str = DateFormat.getDateInstance(3, Locale.UK).format(new Date());
                        js3.o(str, "getDateInstance(DateForm…Locale.UK).format(Date())");
                        boolean zI = js3.i(string, str);
                        long j2 = 0;
                        if (zI) {
                            j2 = l.b.getLong(l.c, 0L);
                        }
                        long j3 = j2 / ((long) 1048576);
                        Long l2 = l.a;
                        js3.m(l2);
                        if (j3 >= l2.longValue()) {
                            return;
                        }
                    }
                } catch (Exception e) {
                    exc = e;
                    sessionMetadata2 = sessionMetadata;
                }
            }
            List listA = gVar.a(sessionMetadata.getSessionId());
            HashSet hashSet = new HashSet();
            ArrayList<RepositoryAsset> arrayList = new ArrayList();
            for (Object obj : listA) {
                if (hashSet.add(((RepositoryAsset) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
            for (RepositoryAsset repositoryAsset : arrayList) {
                if (repositoryAsset instanceof WebRepositoryAsset) {
                    assetCheck = new AssetCheck(null, repositoryAsset.getId(), ((WebRepositoryAsset) repositoryAsset).getVersion(), repositoryAsset.getType().ordinal());
                } else {
                    assetCheck = new AssetCheck(repositoryAsset.getId(), null, null, repositoryAsset.getType().ordinal());
                }
                arrayList2.add(assetCheck);
            }
            Map mapA = ((com.microsoft.clarity.o.f) this.d).a(sessionMetadata, arrayList2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapA.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listA) {
                if (!linkedHashMap.containsKey(((RepositoryAsset) obj2).getId())) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(wu0.V(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                tx8Var = tx8.a;
                if (!zHasNext) {
                    break;
                }
                RepositoryAsset repositoryAsset2 = (RepositoryAsset) it.next();
                String sessionId = sessionMetadata.getSessionId();
                AssetType type = repositoryAsset2.getType();
                String id = repositoryAsset2.getId();
                js3.p(sessionId, "sessionId");
                js3.p(type, "type");
                js3.p(id, "identifier");
                com.microsoft.clarity.p.g gVarA = gVar.a(type);
                String strA = com.microsoft.clarity.n.g.a(sessionId, id);
                LogLevel logLevel = com.microsoft.clarity.q.l.a;
                com.microsoft.clarity.q.l.b("Deleting Asset " + strA + " from session " + sessionId + " repository");
                js3.p(strA, "filename");
                com.microsoft.clarity.p.f.a((com.microsoft.clarity.p.e) gVarA, strA, false, false, 6).delete();
                arrayList4.add(tx8Var);
            }
            final Semaphore semaphore = new Semaphore(5);
            ArrayList<RepositoryAsset> arrayList5 = new ArrayList();
            for (Object obj3 : listA) {
                if (linkedHashMap.containsKey(((RepositoryAsset) obj3).getId())) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(wu0.V(arrayList5, 10));
            for (final RepositoryAsset repositoryAsset3 : arrayList5) {
                sessionMetadata2 = sessionMetadata;
                final com.microsoft.clarity.n.g gVar2 = gVar;
                try {
                    arrayList6.add(CompletableFuture.supplyAsync(new Supplier() { // from class: jh9
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return a0.a(semaphore, gVar2, sessionMetadata2, repositoryAsset3, this);
                        }
                    }));
                    gVar = gVar2;
                    sessionMetadata = sessionMetadata2;
                } catch (Exception e2) {
                    e = e2;
                }
            }
            sessionMetadata2 = sessionMetadata;
            ArrayList arrayList7 = new ArrayList(wu0.V(arrayList6, 10));
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                ((CompletableFuture) it2.next()).get();
                arrayList7.add(tx8Var);
            }
            return;
        } catch (Exception e3) {
            e = e3;
            sessionMetadata2 = sessionMetadata;
        }
        exc = e;
        com.microsoft.clarity.q.l.c("Assets upload failed for session " + sessionMetadata2.getSessionId() + " with Error: " + exc + '.');
    }

    public static final tx8 a(Semaphore semaphore, com.microsoft.clarity.n.c cVar, SessionMetadata sessionMetadata, RepositoryAsset repositoryAsset, a0 a0Var) {
        js3.p(semaphore, "$semaphore");
        js3.p(cVar, "$sessionRepository");
        js3.p(sessionMetadata, "$sessionMetadata");
        js3.p(repositoryAsset, "$asset");
        js3.p(a0Var, "this$0");
        try {
            semaphore.acquire();
            if (com.microsoft.clarity.q.v.a(new Y(repositoryAsset, a0Var, sessionMetadata)) != null) {
                String sessionId = sessionMetadata.getSessionId();
                AssetType type = repositoryAsset.getType();
                String id = repositoryAsset.getId();
                js3.p(sessionId, "sessionId");
                js3.p(type, "type");
                js3.p(id, "identifier");
                com.microsoft.clarity.p.g gVarA = ((com.microsoft.clarity.n.g) cVar).a(type);
                String strA = com.microsoft.clarity.n.g.a(sessionId, id);
                LogLevel logLevel = com.microsoft.clarity.q.l.a;
                com.microsoft.clarity.q.l.b("Deleting Asset " + strA + " from session " + sessionId + " repository");
                js3.p(strA, "filename");
                com.microsoft.clarity.p.f.a((com.microsoft.clarity.p.e) gVarA, strA, false, false, 6).delete();
            } else {
                com.microsoft.clarity.q.l.c("Asset '" + repositoryAsset.getId() + "' upload failed for session " + sessionMetadata.getSessionId() + '.');
            }
            semaphore.release();
            return tx8.a;
        } catch (Throwable th) {
            semaphore.release();
            throw th;
        }
    }

    public static final Object a(dp2 dp2Var, Object obj) {
        js3.p(dp2Var, "$tmp0");
        return dp2Var.invoke(obj);
    }

    public static void a(String str, X x) {
        ConcurrentHashMap concurrentHashMap = g;
        final Z z = Z.a;
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, str, new Function() { // from class: kh9
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a0.a(z, obj);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        js3.o(objComputeIfAbsent, "sessionLocks.computeIfAbsent(key) { Object() }");
        synchronized (objComputeIfAbsent) {
            x.invoke();
        }
    }

    public final void a(PayloadUploadResponse payloadUploadResponse, SessionMetadata sessionMetadata) {
        List<PayloadUploadResponse.PayloadUploadResponseSignal> signals;
        sessionMetadata.setLastUploadedPayloadTimestamp(Long.valueOf(System.currentTimeMillis()));
        PayloadUploadResponse.PayloadUploadResponseData data = payloadUploadResponse.getData();
        if (data != null && (signals = data.getSignals()) != null) {
            for (PayloadUploadResponse.PayloadUploadResponseSignal payloadUploadResponseSignal : signals) {
                if (js3.i(payloadUploadResponseSignal.getType(), "cl_dtrs") && payloadUploadResponseSignal.getValue() != null) {
                    sessionMetadata.setBotDetectionToken(payloadUploadResponseSignal.getValue());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        ((com.microsoft.clarity.n.d) this.e).a(sessionMetadata.getSessionId(), sessionMetadata);
    }
}
