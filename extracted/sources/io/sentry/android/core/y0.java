package io.sentry.android.core;

import io.sentry.MeasurementUnit$Duration;
import io.sentry.SpanStatus;
import io.sentry.android.core.performance.AppStartMetrics$AppStartType;
import io.sentry.c6;
import io.sentry.g5;
import io.sentry.k6;
import io.sentry.m6;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.w4;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements io.sentry.b0 {
    public final d a;
    public final SentryAndroidOptions b;
    public final AutoClosableReentrantLock c = new AutoClosableReentrantLock();

    public y0(SentryAndroidOptions sentryAndroidOptions, d dVar) {
        io.sentry.config.a.W(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.b = sentryAndroidOptions;
        this.a = dVar;
    }

    public static void a(io.sentry.android.core.performance.g gVar, io.sentry.protocol.d0 d0Var) {
        m6 m6Var;
        if (gVar.a != AppStartMetrics$AppStartType.COLD) {
            return;
        }
        io.sentry.protocol.e eVar = d0Var.b;
        ArrayList arrayList = d0Var.s;
        k6 k6VarI = eVar.i();
        if (k6VarI == null) {
            return;
        }
        io.sentry.protocol.v vVar = k6VarI.a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                m6Var = null;
                break;
            }
            io.sentry.protocol.y yVar = (io.sentry.protocol.y) it.next();
            if (yVar.f.contentEquals("app.start.cold")) {
                m6Var = yVar.d;
                break;
            }
        }
        io.sentry.android.core.performance.h hVar = new io.sentry.android.core.performance.h();
        io.sentry.android.core.performance.h hVar2 = gVar.d;
        long j = hVar2.b;
        long j2 = hVar2.c;
        long j3 = io.sentry.android.core.performance.g.p;
        hVar.a = "Process Initialization";
        hVar.b = j;
        hVar.c = j2;
        hVar.d = j3;
        if (hVar.b() && Math.abs(hVar.a()) <= 10000) {
            arrayList.add(f(hVar, m6Var, vVar, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(gVar.g.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(f((io.sentry.android.core.performance.h) it2.next(), m6Var, vVar, "contentprovider.load"));
            }
        }
        io.sentry.android.core.performance.h hVar3 = gVar.f;
        if (hVar3.d != 0) {
            arrayList.add(f(hVar3, m6Var, vVar, "application.load"));
        }
    }

    public static boolean c(io.sentry.protocol.d0 d0Var) {
        for (io.sentry.protocol.y yVar : d0Var.s) {
            if (yVar.f.contentEquals("app.start.cold") || yVar.f.contentEquals("app.start.warm")) {
                return true;
            }
        }
        k6 k6VarI = d0Var.b.i();
        if (k6VarI == null) {
            return false;
        }
        String str = k6VarI.e;
        return str.equals("app.start.cold") || str.equals("app.start.warm");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(io.sentry.protocol.d0 r11) {
        /*
            java.util.ArrayList r11 = r11.s
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            io.sentry.protocol.y r3 = (io.sentry.protocol.y) r3
            java.lang.String r4 = "ui.load.initial_display"
            java.lang.String r5 = r3.f
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L20
            r1 = r3
            goto L2b
        L20:
            java.lang.String r4 = "ui.load.full_display"
            java.lang.String r5 = r3.f
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2b
            r2 = r3
        L2b:
            if (r1 == 0) goto L8
            if (r2 == 0) goto L8
        L2f:
            if (r1 != 0) goto L35
            if (r2 != 0) goto L35
            goto Lc7
        L35:
            java.util.Iterator r11 = r11.iterator()
        L39:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r11.next()
            io.sentry.protocol.y r0 = (io.sentry.protocol.y) r0
            if (r0 == r1) goto L39
            if (r0 != r2) goto L4a
            goto L39
        L4a:
            java.util.Map r3 = r0.k
            java.lang.Double r4 = r0.a
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L65
            java.lang.String r7 = "thread.name"
            java.lang.Object r3 = r3.get(r7)
            if (r3 == 0) goto L65
            java.lang.String r7 = "main"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L63
            goto L65
        L63:
            r3 = r5
            goto L66
        L65:
            r3 = r6
        L66:
            if (r1 == 0) goto L86
            double r7 = r4.doubleValue()
            java.lang.Double r9 = r1.a
            double r9 = r9.doubleValue()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L86
            java.lang.Double r9 = r1.b
            if (r9 == 0) goto L82
            double r9 = r9.doubleValue()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L86
        L82:
            if (r3 == 0) goto L86
            r3 = r6
            goto L87
        L86:
            r3 = r5
        L87:
            if (r2 == 0) goto La4
            double r7 = r4.doubleValue()
            java.lang.Double r4 = r2.a
            double r9 = r4.doubleValue()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto La4
            java.lang.Double r4 = r2.b
            if (r4 == 0) goto La3
            double r9 = r4.doubleValue()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 > 0) goto La4
        La3:
            r5 = r6
        La4:
            if (r3 != 0) goto La8
            if (r5 == 0) goto L39
        La8:
            java.util.Map r4 = r0.k
            if (r4 != 0) goto Lb3
            j$.util.concurrent.ConcurrentHashMap r4 = new j$.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r0.k = r4
        Lb3:
            if (r3 == 0) goto Lbc
            java.lang.String r0 = "ui.contributes_to_ttid"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4.put(r0, r3)
        Lbc:
            if (r5 == 0) goto L39
            java.lang.String r0 = "ui.contributes_to_ttfd"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4.put(r0, r3)
            goto L39
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.y0.e(io.sentry.protocol.d0):void");
    }

    public static io.sentry.protocol.y f(io.sentry.android.core.performance.h hVar, m6 m6Var, io.sentry.protocol.v vVar, String str) {
        long jA;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.f.b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(hVar.b / 1000.0d);
        if (hVar.b()) {
            jA = hVar.a() + hVar.b;
        } else {
            jA = 0;
        }
        return new io.sentry.protocol.y(dValueOf, Double.valueOf(jA / 1000.0d), vVar, new m6(), m6Var, str, hVar.a, SpanStatus.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.b0
    public final c6 b(c6 c6Var, io.sentry.h0 h0Var) {
        return c6Var;
    }

    @Override // io.sentry.b0
    public final w4 d(w4 w4Var, io.sentry.h0 h0Var) {
        return w4Var;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, io.sentry.h0 h0Var) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        io.sentry.r rVarA = this.c.a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                rVarA.close();
                return d0Var;
            }
            io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
            boolean zC = c(d0Var);
            HashMap map2 = d0Var.t;
            io.sentry.protocol.e eVar = d0Var.b;
            if (zC) {
                if (gVarC.m && ((Boolean) gVarC.b.a()).booleanValue()) {
                    long jA = gVarC.b(sentryAndroidOptions).a();
                    if (jA != 0) {
                        map2.put(gVarC.a == AppStartMetrics$AppStartType.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.m(Float.valueOf(jA), MeasurementUnit$Duration.MILLISECOND.apiName()));
                        a(gVarC, d0Var);
                        gVarC.m = false;
                        gVarC.g.clear();
                        gVarC.h.clear();
                    }
                }
                io.sentry.protocol.a aVarD = eVar.d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                    eVar.m(aVarD);
                }
                aVarD.j = gVarC.a == AppStartMetrics$AppStartType.COLD ? "cold" : "warm";
            }
            e(d0Var);
            io.sentry.protocol.v vVar = d0Var.a;
            k6 k6VarI = eVar.i();
            if (vVar != null && k6VarI != null && k6VarI.e.contentEquals("ui.load")) {
                d dVar = this.a;
                ConcurrentHashMap concurrentHashMap = dVar.c;
                io.sentry.r rVarA2 = dVar.f.a();
                try {
                    if (dVar.c()) {
                        Map map3 = (Map) concurrentHashMap.get(vVar);
                        concurrentHashMap.remove(vVar);
                        rVarA2.close();
                        map = map3;
                    } else {
                        rVarA2.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } finally {
                }
            }
            rVarA.close();
            return d0Var;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.b0
    public final g5 k(g5 g5Var) {
        return g5Var;
    }
}
