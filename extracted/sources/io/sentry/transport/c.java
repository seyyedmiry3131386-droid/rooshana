package io.sentry.transport;

import io.sentry.DataCategory;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.clientreport.DiscardReason;
import io.sentry.h0;
import io.sentry.j0;
import io.sentry.n4;
import io.sentry.o4;
import io.sentry.p4;
import io.sentry.s6;
import io.sentry.u0;
import io.sentry.u4;
import io.sentry.v;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g {
    public final n a;
    public final io.sentry.cache.d b;
    public final b6 c;
    public final p d;
    public final h e;
    public final e f;
    public volatile b g;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(b6 b6Var, p pVar, h hVar, io.sentry.internal.debugmeta.c cVar) {
        int maxQueueSize = b6Var.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = b6Var.getEnvelopeDiskCache();
        final u0 logger = b6Var.getLogger();
        o4 dateProvider = b6Var.getDateProvider();
        n nVar = new n(maxQueueSize, new j0(4), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    h0 h0Var = bVar.b;
                    if (!io.sentry.config.a.J(h0Var, io.sentry.hints.d.class)) {
                        envelopeDiskCache.R(bVar.a, h0Var);
                    }
                    Object objB = h0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.j.class.isInstance(h0Var.b("sentry:typeCheckHint")) && objB != null) {
                        ((io.sentry.hints.j) objB).b(false);
                    }
                    Object objB2 = h0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.g.class.isInstance(h0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                        ((io.sentry.hints.g) objB2).c(true);
                    }
                    logger.i(SentryLevel.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(b6Var, cVar, pVar);
        this.g = null;
        this.a = nVar;
        io.sentry.cache.d envelopeDiskCache2 = b6Var.getEnvelopeDiskCache();
        io.sentry.config.a.W(envelopeDiskCache2, "envelopeCache is required");
        this.b = envelopeDiskCache2;
        this.c = b6Var;
        this.d = pVar;
        io.sentry.config.a.W(hVar, "transportGate is required");
        this.e = hVar;
        this.f = eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.transport.g
    public final void I0(io.sentry.internal.debugmeta.c cVar, h0 h0Var) {
        io.sentry.cache.d dVar;
        boolean z;
        io.sentry.internal.debugmeta.c cVarK;
        char c;
        byte b;
        List listSingletonList;
        Iterable<u4> iterable = (Iterable) cVar.c;
        boolean zJ = io.sentry.config.a.J(h0Var, io.sentry.hints.d.class);
        b6 b6Var = this.c;
        io.sentry.cache.d dVar2 = this.b;
        char c2 = 0;
        if (zJ) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Captured Envelope is already cached", new Object[0]);
            dVar = i.a;
            z = true;
        } else {
            dVar = dVar2;
            z = false;
        }
        p pVar = this.d;
        b6 b6Var2 = pVar.b;
        ArrayList arrayList = null;
        for (u4 u4Var : iterable) {
            String itemType = u4Var.a.e.getItemType();
            itemType.getClass();
            char c3 = c2;
            byte b2 = -1;
            switch (itemType.hashCode()) {
                case -1963501277:
                    c = 1;
                    if (itemType.equals("attachment")) {
                        b2 = c3;
                    }
                    break;
                case -1639516637:
                    c = 1;
                    if (itemType.equals("replay_video")) {
                        b2 = 1;
                    }
                    break;
                case -729715625:
                    c = 1;
                    if (itemType.equals("profile_chunk")) {
                        b2 = 2;
                    }
                    break;
                case -309425751:
                    c = 1;
                    if (itemType.equals("profile")) {
                        b = 3;
                        b2 = b;
                    }
                    break;
                case -191501435:
                    c = 1;
                    if (itemType.equals("feedback")) {
                        b = 4;
                        b2 = b;
                    }
                    break;
                case 107332:
                    c = 1;
                    if (itemType.equals("log")) {
                        b = 5;
                        b2 = b;
                    }
                    break;
                case 3536714:
                    c = 1;
                    if (itemType.equals("span")) {
                        b = 6;
                        b2 = b;
                    }
                    break;
                case 96891546:
                    c = 1;
                    if (itemType.equals("event")) {
                        b = 7;
                        b2 = b;
                    }
                    break;
                case 229505514:
                    c = 1;
                    if (itemType.equals("trace_metric")) {
                        b = 8;
                        b2 = b;
                    }
                    break;
                case 1536888764:
                    c = 1;
                    if (itemType.equals("check_in")) {
                        b = 9;
                        b2 = b;
                    }
                    break;
                case 1984987798:
                    c = 1;
                    if (itemType.equals("session")) {
                        b = 10;
                        b2 = b;
                    }
                    break;
                case 2141246174:
                    c = 1;
                    if (itemType.equals("transaction")) {
                        b = 11;
                        b2 = b;
                    }
                    break;
                default:
                    c = 1;
                    break;
            }
            switch (b2) {
                case 0:
                    listSingletonList = Collections.singletonList(DataCategory.Attachment);
                    break;
                case 1:
                    listSingletonList = Collections.singletonList(DataCategory.Replay);
                    break;
                case 2:
                    DataCategory[] dataCategoryArr = new DataCategory[2];
                    dataCategoryArr[c3] = DataCategory.ProfileChunkUi;
                    dataCategoryArr[c] = DataCategory.ProfileChunk;
                    listSingletonList = Arrays.asList(dataCategoryArr);
                    break;
                case 3:
                    listSingletonList = Collections.singletonList(DataCategory.Profile);
                    break;
                case 4:
                    listSingletonList = Collections.singletonList(DataCategory.Feedback);
                    break;
                case 5:
                    listSingletonList = Collections.singletonList(DataCategory.LogItem);
                    break;
                case 6:
                    listSingletonList = Collections.singletonList(DataCategory.Span);
                    break;
                case 7:
                    listSingletonList = Collections.singletonList(DataCategory.Error);
                    break;
                case 8:
                    listSingletonList = Collections.singletonList(DataCategory.TraceMetric);
                    break;
                case 9:
                    listSingletonList = Collections.singletonList(DataCategory.Monitor);
                    break;
                case 10:
                    listSingletonList = Collections.singletonList(DataCategory.Session);
                    break;
                case 11:
                    listSingletonList = Collections.singletonList(DataCategory.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(DataCategory.Unknown);
                    break;
            }
            Iterator it = listSingletonList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (pVar.d((DataCategory) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(u4Var);
                    b6Var2.getClientReportRecorder().j(DiscardReason.RATELIMIT_BACKOFF, u4Var);
                }
            }
            c2 = c3;
        }
        int i = c2;
        if (arrayList != null) {
            u0 logger = b6Var2.getLogger();
            SentryLevel sentryLevel = SentryLevel.WARNING;
            Object[] objArr = new Object[1];
            objArr[i] = Integer.valueOf(arrayList.size());
            logger.i(sentryLevel, "%d envelope items will be dropped due rate limiting.", objArr);
            ArrayList arrayList2 = new ArrayList();
            for (u4 u4Var2 : iterable) {
                if (!arrayList.contains(u4Var2)) {
                    arrayList2.add(u4Var2);
                }
            }
            if (arrayList2.isEmpty()) {
                b6Var2.getLogger().i(SentryLevel.WARNING, "Envelope discarded due all items rate limited.", new Object[i]);
                Object objB = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.j.class.isInstance(h0Var.b("sentry:typeCheckHint")) && objB != null) {
                    ((io.sentry.hints.j) objB).b(i);
                }
                Object objB2 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.g.class.isInstance(h0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                    ((io.sentry.hints.g) objB2).c(false);
                }
                Object objB3 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.c.class.isInstance(h0Var.b("sentry:typeCheckHint")) && objB3 != null) {
                    ((io.sentry.hints.c) objB3).a.countDown();
                    b6Var2.getLogger().i(SentryLevel.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                cVarK = null;
            } else {
                cVarK = new io.sentry.internal.debugmeta.c((p4) cVar.b, arrayList2);
            }
        } else {
            cVarK = cVar;
        }
        if (cVarK == null) {
            if (z) {
                dVar2.l1(cVar);
                return;
            }
            return;
        }
        if (s6.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
            cVarK = b6Var.getClientReportRecorder().k(cVarK);
        }
        Future futureSubmit = this.a.submit(new b(this, cVarK, h0Var, dVar));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            b6Var.getClientReportRecorder().g(DiscardReason.QUEUE_OVERFLOW, cVarK);
            return;
        }
        Object objB4 = h0Var.b("sentry:typeCheckHint");
        if (!v.class.isInstance(h0Var.b("sentry:typeCheckHint")) || objB4 == null) {
            return;
        }
        v vVar = (v) objB4;
        vVar.g.add(vVar.f);
        b6Var.getLogger().i(SentryLevel.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // io.sentry.transport.g
    public final void a(boolean z) {
        this.d.close();
        this.a.shutdown();
        this.c.getLogger().i(SentryLevel.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            return;
        }
        try {
            long flushTimeoutMillis = this.c.getFlushTimeoutMillis();
            if (this.a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.c.getLogger().i(SentryLevel.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.a.shutdownNow();
            if (this.g != null) {
                this.a.getRejectedExecutionHandler().rejectedExecution(this.g, this.a);
            }
        } catch (InterruptedException unused) {
            this.c.getLogger().i(SentryLevel.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final void c(long j) {
        n nVar = this.a;
        nVar.getClass();
        try {
            q qVar = nVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qVar.getClass();
            qVar.a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            nVar.c.f(SentryLevel.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(false);
    }

    @Override // io.sentry.transport.g
    public final p e() {
        return this.d;
    }

    @Override // io.sentry.transport.g
    public final boolean f() {
        boolean z;
        p pVar = this.d;
        pVar.getClass();
        pVar.a.getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = pVar.c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((DataCategory) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        n nVar = this.a;
        n4 n4Var = nVar.b;
        return (z || (n4Var != null && (nVar.d.a().b(n4Var) > 2000000000L ? 1 : (nVar.d.a().b(n4Var) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.g
    public final void q(io.sentry.internal.debugmeta.c cVar) {
        I0(cVar, new h0());
    }
}
