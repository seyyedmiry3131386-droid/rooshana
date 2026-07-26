package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.SentryLevel;
import io.sentry.Session$State;
import io.sentry.a1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.d;
import io.sentry.android.core.internal.gestures.f;
import io.sentry.android.core.v1;
import io.sentry.android.core.x;
import io.sentry.b6;
import io.sentry.cache.c;
import io.sentry.h0;
import io.sentry.h6;
import io.sentry.hints.a;
import io.sentry.i6;
import io.sentry.j6;
import io.sentry.l;
import io.sentry.l6;
import io.sentry.m1;
import io.sentry.protocol.m;
import io.sentry.protocol.q;
import io.sentry.protocol.v;
import io.sentry.r;
import io.sentry.u0;
import io.sentry.util.network.b;
import io.sentry.w3;
import io.sentry.w4;
import io.sentry.x3;
import ir.mservices.market.version2.fragments.IbexFragment;
import ir.mservices.market.version2.webapi.responsedto.AparatUrlInfoDTO;
import ir.mservices.market.version2.webapi.responsedto.AparatVideoDTO;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg1 implements nd8, zh1, hb8, gb8, q94, gr4, uw, n31, ob7, w3, l6, x3, b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tg1(qb7 qb7Var, Object obj, d30 d30Var, int i) {
        this.a = i;
        this.b = qb7Var;
        this.d = obj;
        this.c = d30Var;
    }

    @Override // io.sentry.w3
    public void a(i6 i6Var) {
        ConcurrentHashMap concurrentHashMap;
        gg1 gg1Var = (gg1) this.b;
        w4 w4Var = (w4) this.c;
        h0 h0Var = (h0) this.d;
        if (i6Var == null) {
            ((b6) gg1Var.b).getLogger().i(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strE = null;
        Session$State session$State = w4Var.f() != null ? Session$State.Crashed : null;
        boolean z = Session$State.Crashed == session$State || w4Var.g();
        q qVar = w4Var.d;
        String str = (qVar == null || (concurrentHashMap = qVar.f) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) w4Var.d.f.get("user-agent");
        Object objB = h0Var.b("sentry:typeCheckHint");
        if (objB instanceof a) {
            strE = ((a) objB).e();
            session$State = Session$State.Abnormal;
        }
        if (!i6Var.d(session$State, str, z, strE) || i6Var.g == Session$State.Ok) {
            return;
        }
        i6Var.b(io.sentry.config.a.z());
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        Long lValueOf;
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 9:
                ((ps4) obj).g(((pg) obj4).b, (ks4) obj3, (op4) obj2);
                return;
            default:
                io.sentry.android.core.cache.a aVar = (io.sentry.android.core.cache.a) obj4;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) obj3;
                io.sentry.android.core.cache.b bVar = (io.sentry.android.core.cache.b) obj2;
                switch (aVar.d.a) {
                    case 21:
                        lValueOf = Long.valueOf(((x) obj).d);
                        break;
                    default:
                        lValueOf = Long.valueOf(((v1) obj).d);
                        break;
                }
                u0 logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                String str = aVar.b;
                logger.i(sentryLevel, "Writing last reported %s marker with timestamp %d", str, lValueOf);
                String str2 = aVar.c;
                b6 b6Var = bVar.a;
                String cacheDirPath = b6Var.getCacheDirPath();
                if (cacheDirPath == null) {
                    b6Var.getLogger().i(sentryLevel, o40.y("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str2));
                    try {
                        fileOutputStream.write(String.valueOf(lValueOf).getBytes(c.i));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return;
                    } finally {
                        try {
                            break;
                        } catch (Throwable th) {
                        }
                    }
                } catch (Throwable th2) {
                    b6Var.getLogger().f(SentryLevel.ERROR, o40.y("Error writing the ", str, " marker to the disk"), th2);
                    return;
                }
        }
    }

    @Override // defpackage.ob7
    public Object apply(Object obj) throws Throwable {
        Cursor cursor;
        String str;
        long jInsert;
        LogEventDropped$Reason logEventDropped$Reason;
        int i = this.a;
        String str2 = "bytes";
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        LogEventDropped$Reason logEventDropped$Reason2 = LogEventDropped$Reason.CACHE_FULL;
        int i5 = 2;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i6 = 0;
        qb7 qb7Var = (qb7) this.b;
        switch (i) {
            case 10:
                ArrayList arrayList = (ArrayList) obj2;
                d30 d30Var = (d30) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    boolean z = cursor2.getInt(7) != 0;
                    on onVar = new on();
                    onVar.f = new HashMap();
                    String string = cursor2.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    onVar.a = string;
                    onVar.d = Long.valueOf(cursor2.getLong(i5));
                    onVar.e = Long.valueOf(cursor2.getLong(3));
                    if (z) {
                        String string2 = cursor2.getString(4);
                        onVar.c = new o12(string2 == null ? qb7.f : new u12(string2), cursor2.getBlob(5));
                        str = str2;
                    } else {
                        String string3 = cursor2.getString(4);
                        u12 u12Var = string3 == null ? qb7.f : new u12(string3);
                        Cursor cursorQuery = qb7Var.b().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                                break;
                            }
                            byte[] bArr = new byte[length];
                            int i7 = 0;
                            int length2 = 0;
                            while (i7 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i7);
                                String str3 = str2;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                    length2 += bArr2.length;
                                    i7++;
                                    cursorQuery = cursor;
                                    str2 = str3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            str = str2;
                            cursorQuery.close();
                            onVar.c = new o12(u12Var, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        onVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new v20(j, d30Var, onVar.f()));
                    str2 = str;
                    i5 = 2;
                }
                return null;
            case 11:
                l20 l20Var = (l20) obj2;
                o12 o12Var = l20Var.c;
                String str4 = l20Var.a;
                d30 d30Var2 = (d30) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = qb7Var.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * qb7Var.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                m20 m20Var = qb7Var.d;
                if (jSimpleQueryForLong >= m20Var.a) {
                    qb7Var.u(1L, logEventDropped$Reason2, str4);
                    return -1L;
                }
                Long lD = qb7.d(sQLiteDatabase, d30Var2);
                if (lD != null) {
                    jInsert = lD.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", d30Var2.a);
                    contentValues.put("priority", Integer.valueOf(gk6.a(d30Var2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = d30Var2.b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = m20Var.e;
                byte[] bArr4 = o12Var.b;
                boolean z2 = bArr4.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(l20Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(l20Var.e));
                contentValues2.put("payload_encoding", o12Var.a.a);
                contentValues2.put("code", l20Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr4 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i8));
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i9 - 1) * i8, Math.min(i9 * i8, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(l20Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                HashMap map = (HashMap) obj3;
                vp7 vp7Var = (vp7) obj2;
                ArrayList arrayList3 = (ArrayList) vp7Var.d;
                Cursor cursor3 = (Cursor) obj;
                qb7Var.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i6);
                    int i10 = cursor3.getInt(1);
                    LogEventDropped$Reason logEventDropped$Reason3 = LogEventDropped$Reason.REASON_UNKNOWN;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            logEventDropped$Reason3 = LogEventDropped$Reason.MESSAGE_TOO_OLD;
                        } else if (i10 == 2) {
                            logEventDropped$Reason = logEventDropped$Reason2;
                        } else if (i10 == i4) {
                            logEventDropped$Reason3 = LogEventDropped$Reason.PAYLOAD_TOO_BIG;
                        } else if (i10 == i3) {
                            logEventDropped$Reason3 = LogEventDropped$Reason.MAX_RETRIES_REACHED;
                        } else if (i10 == i2) {
                            logEventDropped$Reason3 = LogEventDropped$Reason.INVALID_PAYLOD;
                        } else if (i10 == 6) {
                            logEventDropped$Reason3 = LogEventDropped$Reason.SERVER_ERROR;
                        } else {
                            wn5.x("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
                        }
                        logEventDropped$Reason = logEventDropped$Reason3;
                    } else {
                        logEventDropped$Reason = logEventDropped$Reason3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new jd4(j2, logEventDropped$Reason));
                    i6 = 0;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i11 = ld4.c;
                    new ArrayList();
                    arrayList3.add(new ld4((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long jA = qb7Var.b.a();
                SQLiteDatabase sQLiteDatabaseB = qb7Var.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        wl8 wl8Var = new wl8(cursorRawQuery.getLong(0), jA);
                        cursorRawQuery.close();
                        sQLiteDatabaseB.setTransactionSuccessful();
                        sQLiteDatabaseB.endTransaction();
                        vp7Var.c = wl8Var;
                        vp7Var.e = new qt2(new g68(qb7Var.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * qb7Var.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), m20.f.a));
                        vp7Var.b = (String) qb7Var.e.get();
                        return new lt0((wl8) vp7Var.c, DesugarCollections.unmodifiableList(arrayList3), (qt2) vp7Var.e, (String) vp7Var.b);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseB.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // defpackage.gr4
    public void b(hq4 hq4Var) {
        hr4 hr4Var = (hr4) this.b;
        wp7 wp7Var = (wp7) this.c;
        Bundle bundle = (Bundle) this.d;
        xq4 xq4Var = hr4Var.g;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        xq4Var.n(hq4Var, wp7Var, bundle);
    }

    @Override // io.sentry.x3
    public void c(m1 m1Var) {
        f fVar = (f) this.b;
        a1 a1Var = (a1) this.c;
        m1 m1Var2 = (m1) this.d;
        if (m1Var == null) {
            a1Var.J(m1Var2);
        } else {
            fVar.c.getLogger().i(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", m1Var2.getName());
        }
    }

    @Override // io.sentry.l6
    public void d(j6 j6Var) {
        io.sentry.android.core.c cVarB;
        h6 h6Var = (h6) this.b;
        l6 l6Var = (l6) this.c;
        AtomicReference atomicReference = (AtomicReference) this.d;
        if (l6Var != null) {
            l6Var.d(j6Var);
        }
        io.sentry.android.core.f fVar = h6Var.r.k;
        if (fVar != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) fVar.a;
            WeakReference weakReference = (WeakReference) fVar.b;
            String str = (String) fVar.c;
            Activity activity2 = (Activity) weakReference.get();
            int i = 1;
            if (activity2 != null) {
                d dVar = activityLifecycleIntegration.q;
                v vVar = h6Var.a;
                r rVarA = dVar.f.a();
                try {
                    if (dVar.c()) {
                        io.sentry.android.core.b bVar = new io.sentry.android.core.b(dVar, activity2, i);
                        io.sentry.android.core.c cVar = null;
                        dVar.d(bVar, null);
                        io.sentry.android.core.c cVar2 = (io.sentry.android.core.c) dVar.d.remove(activity2);
                        if (cVar2 != null && (cVarB = dVar.b()) != null) {
                            cVar = new io.sentry.android.core.c(cVarB.a - cVar2.a, cVarB.b - cVar2.b, cVarB.c - cVar2.c);
                        }
                        if (cVar != null) {
                            int i2 = cVar.c;
                            int i3 = cVar.b;
                            int i4 = cVar.a;
                            if (i4 != 0 || i3 != 0 || i2 != 0) {
                                m mVar = new m(Integer.valueOf(i4), "none");
                                m mVar2 = new m(Integer.valueOf(i3), "none");
                                m mVar3 = new m(Integer.valueOf(i2), "none");
                                HashMap map = new HashMap();
                                map.put("frames_total", mVar);
                                map.put("frames_slow", mVar2);
                                map.put("frames_frozen", mVar3);
                                dVar.c.put(vVar, map);
                            }
                        }
                    }
                    rVarA.close();
                } catch (Throwable th) {
                    try {
                        rVarA.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.d;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().i(SentryLevel.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        l lVar = h6Var.q;
        if (lVar != null) {
            atomicReference.set(lVar.f(h6Var));
        }
    }

    @Override // io.sentry.util.network.b
    public io.sentry.internal.debugmeta.c e(Object obj) throws EOFException {
        String str;
        Charset charsetA;
        rb4 rb4Var = (rb4) this.b;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
        io.sentry.okhttp.c cVar = (io.sentry.okhttp.c) this.d;
        w47 w47Var = (w47) obj;
        js3.p(w47Var, "req");
        b57 b57Var = w47Var.d;
        if (b57Var != null) {
            gh0 gh0Var = new gh0();
            b57Var.d(gh0Var);
            byte[] bArrP = gh0Var.P(gh0Var.b);
            int i = b57.a;
            rb4Var.F(((w47) ref$ObjectRef.a).b, ol3.m(bArrP, b57Var.b(), 0, 6));
            dt4 dt4VarB = b57Var.b();
            u0 logger = cVar.a.m().getLogger();
            js3.o(logger, "getLogger(...)");
            if (dt4VarB != null) {
                try {
                    str = dt4VarB.a;
                } catch (Exception e) {
                    logger.i(SentryLevel.ERROR, "Failed to parse buffered request body: " + e.getMessage(), new Object[0]);
                }
            } else {
                str = null;
            }
            String strName = (dt4VarB == null || (charsetA = dt4VarB.a(zp0.a)) == null) ? null : charsetA.name();
            if (strName == null) {
                strName = "UTF-8";
            }
            return io.sentry.config.a.v(bArrP, str, strName, logger);
        }
        return null;
    }

    @Override // defpackage.nd8
    public Object execute() {
        vg1 vg1Var = (vg1) this.b;
        d30 d30Var = (d30) this.c;
        l20 l20Var = (l20) this.d;
        qb7 qb7Var = (qb7) vg1Var.d;
        qb7Var.getClass();
        Priority priority = d30Var.c;
        if (Log.isLoggable(wn5.O("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(priority);
        }
        ((Long) qb7Var.g(new tg1(qb7Var, (Object) l20Var, d30Var, 11))).getClass();
        vg1Var.a.y(d30Var, 1, false);
        return null;
    }

    @Override // defpackage.zh1
    public List f(int i, yo8 yo8Var, int[] iArr) {
        vh1 vh1Var = (vh1) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        lj3 lj3VarM = ImmutableList.m();
        for (int i2 = 0; i2 < yo8Var.a; i2++) {
            lj3VarM.O(new yh1(i, yo8Var, i2, vh1Var, iArr[i2], str, str2));
        }
        return lj3VarM.S();
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        on onVar = (on) this.b;
        on onVar2 = (on) this.c;
        Integer num = (Integer) this.d;
        ((eb6) obj).B(num.intValue(), ((he6) onVar.a).c.a, ((he6) onVar2.a).c.a);
    }

    @Override // defpackage.hb8
    public ox9 j(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        l68 l68Var = (l68) this.d;
        String str2 = (String) obj;
        t15 t15VarC = FirebaseMessaging.c(firebaseMessaging.c);
        xc2 xc2Var = firebaseMessaging.a;
        xc2Var.a();
        String strD = "[DEFAULT]".equals(xc2Var.b) ? "" : xc2Var.d();
        String strB = firebaseMessaging.i.b();
        synchronized (t15VarC) {
            String strA = l68.a(System.currentTimeMillis(), str2, strB);
            if (strA != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) t15VarC.b).edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA);
                editorEdit.commit();
            }
        }
        if (l68Var == null || !str2.equals(l68Var.a)) {
            firebaseMessaging.f(str2);
        }
        return z67.g(str2);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        String str;
        List<String> urls;
        String str2;
        IbexFragment ibexFragment = (IbexFragment) this.b;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
        String str3 = (String) this.d;
        AparatVideoDTO aparatVideoDTO = (AparatVideoDTO) obj;
        int i = IbexFragment.r1;
        Object obj2 = null;
        if ((aparatVideoDTO != null ? aparatVideoDTO.getVideo() : null) == null) {
            ibexFragment.t1();
        } else {
            List<AparatUrlInfoDTO> file_link_all = aparatVideoDTO.getVideo().getFile_link_all();
            if (file_link_all == null || file_link_all.isEmpty()) {
                String file_link = aparatVideoDTO.getVideo().getFile_link();
                if (file_link == null || f88.n0(file_link)) {
                    ibexFragment.t1();
                } else {
                    String file_link2 = aparatVideoDTO.getVideo().getFile_link();
                    js3.o(file_link2, "getFile_link(...)");
                    ref$ObjectRef.a = file_link2;
                }
            } else {
                List<AparatUrlInfoDTO> file_link_all2 = aparatVideoDTO.getVideo().getFile_link_all();
                js3.o(file_link_all2, "getFile_link_all(...)");
                Iterator<T> it = file_link_all2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (js3.i(((AparatUrlInfoDTO) next).getProfile(), "720p")) {
                        obj2 = next;
                        break;
                    }
                }
                AparatUrlInfoDTO aparatUrlInfoDTO = (AparatUrlInfoDTO) obj2;
                if (aparatUrlInfoDTO == null || (urls = aparatUrlInfoDTO.getUrls()) == null || (str = urls.get(0)) == null) {
                    List<AparatUrlInfoDTO> file_link_all3 = aparatVideoDTO.getVideo().getFile_link_all();
                    js3.o(file_link_all3, "getFile_link_all(...)");
                    String str4 = ((AparatUrlInfoDTO) kotlin.collections.a.u0(file_link_all3)).getUrls().get(0);
                    js3.o(str4, "get(...)");
                    str = str4;
                }
                ref$ObjectRef.a = str;
            }
        }
        if (!f88.n0((CharSequence) ref$ObjectRef.a) && (str2 = (String) ref$ObjectRef.a) != null && !f88.n0(str2)) {
            try {
                new URL(str2);
                ibexFragment.w1((String) ref$ObjectRef.a, str3);
                return;
            } catch (MalformedURLException unused) {
            }
        }
        ibexFragment.t1();
    }

    public /* synthetic */ tg1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.uw
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public n94 mo52apply(Object obj) {
        int i = this.a;
        int i2 = 18;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 7:
                xq4 xq4Var = (xq4) obj4;
                Handler handler = xq4Var.l;
                lo4 lo4Var = new lo4(xq4Var, (hq4) obj3, new ii(xq4Var, (sr4) obj2, (iq4) obj, 14));
                bq7 bq7Var = new bq7(0);
                String str = j29.a;
                rq7 rq7Var = new rq7();
                j29.a0(handler, new ii(rq7Var, lo4Var, bq7Var, i2));
                return rq7Var;
            default:
                xq4 xq4Var2 = (xq4) obj4;
                hq4 hq4Var = (hq4) obj3;
                List list = (List) obj;
                Handler handler2 = xq4Var2.l;
                lo4 lo4Var2 = new lo4(xq4Var2, hq4Var, new m11(xq4Var2, (gs4) obj2, hq4Var, list, 8));
                bq7 bq7Var2 = new bq7(0);
                String str2 = j29.a;
                rq7 rq7Var2 = new rq7();
                j29.a0(handler2, new ii(rq7Var2, lo4Var2, bq7Var2, i2));
                return rq7Var2;
        }
    }
}
