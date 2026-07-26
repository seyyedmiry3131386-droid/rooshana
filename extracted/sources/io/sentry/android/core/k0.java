package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import defpackage.za1;
import io.sentry.SentryAttributeType;
import io.sentry.SentryLevel;
import io.sentry.c6;
import io.sentry.g5;
import io.sentry.i5;
import io.sentry.k4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements io.sentry.b0 {
    public final Context a;
    public final j0 b;
    public final SentryAndroidOptions c;
    public final Future d;
    public final io.sentry.util.e e = new io.sentry.util.e(new io.sentry.u1(16));

    public k0(Context context, j0 j0Var, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = j0Var;
        io.sentry.config.a.W(sentryAndroidOptions, "The options object is required.");
        this.c = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new za1(this, sentryAndroidOptions, 11));
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().f(SentryLevel.WARNING, "Device info caching task rejected.", e);
            futureSubmit = null;
        }
        this.d = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public final void a(k4 k4Var, io.sentry.h0 h0Var) {
        Boolean bool;
        io.sentry.protocol.a aVarD = k4Var.b.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        aVarD.e = (String) i0.c.b(this.a);
        io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.c);
        m0 m0Var = null;
        if (hVarB.b()) {
            aVarD.b = (hVarB.b() ? new i5(hVarB.b * 1000000) : null) == null ? null : io.sentry.config.a.A(Double.valueOf(r2.a / 1000000.0d).longValue());
        }
        if (!io.sentry.config.a.K(h0Var) && aVarD.k == null && (bool = c0.e.d) != null) {
            aVarD.k = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        io.sentry.u0 logger = sentryAndroidOptions.getLogger();
        j0 j0Var = this.b;
        PackageInfo packageInfoF = i0.f(context, logger, j0Var);
        if (packageInfoF != null) {
            String strH = i0.h(packageInfoF, j0Var);
            if (k4Var.l == null) {
                k4Var.l = strH;
            }
            Future future = this.d;
            if (future != null) {
                try {
                    m0Var = (m0) future.get();
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().i(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            aVarD.a = packageInfoF.packageName;
            aVarD.f = packageInfoF.versionName;
            aVarD.g = i0.h(packageInfoF, j0Var);
            HashMap map = new HashMap();
            String[] strArr = packageInfoF.requestedPermissions;
            int[] iArr = packageInfoF.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            aVarD.h = map;
            if (m0Var != null) {
                try {
                    h0 h0Var2 = m0Var.f;
                    if (h0Var2 != null) {
                        aVarD.l = Boolean.valueOf(h0Var2.a);
                        String[] strArr2 = (String[]) h0Var2.b;
                        if (strArr2 != null) {
                            aVarD.m = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        k4Var.b.m(aVarD);
    }

    @Override // io.sentry.b0
    public final c6 b(c6 c6Var, io.sentry.h0 h0Var) {
        boolean zE = e(c6Var, h0Var);
        if (zE) {
            a(c6Var, h0Var);
        }
        c(c6Var, false, zE);
        return c6Var;
    }

    public final void c(k4 k4Var, boolean z, boolean z2) {
        io.sentry.protocol.g0 g0Var = k4Var.i;
        if (g0Var == null) {
            g0Var = new io.sentry.protocol.g0();
            k4Var.i = g0Var;
        }
        if (g0Var.b == null) {
            g0Var.b = r0.a(this.a);
        }
        String str = g0Var.d;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
            g0Var.d = "{{auto}}";
        }
        io.sentry.protocol.e eVar = k4Var.b;
        io.sentry.protocol.g gVarE = eVar.e();
        Future future = this.d;
        if (gVarE == null) {
            if (future != null) {
                try {
                    eVar.o(((m0) future.get()).a(z, z2));
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().i(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.p pVarG = eVar.g();
            if (future != null) {
                try {
                    eVar.r(((m0) future.get()).g);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to retrieve os system", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().i(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (pVarG != null) {
                String str2 = pVarG.a;
                eVar.k(pVarG, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            h0 h0Var = ((m0) future.get()).e;
            if (h0Var != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(h0Var.a));
                String str3 = (String) h0Var.b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    k4Var.b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Error getting side loaded info.", th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // io.sentry.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.w4 d(io.sentry.w4 r9, io.sentry.h0 r10) {
        /*
            r8 = this;
            boolean r0 = r8.e(r9, r10)
            r1 = 1
            if (r0 == 0) goto L5f
            r8.a(r9, r10)
            java.util.ArrayList r2 = r9.e()
            if (r2 == 0) goto L5f
            boolean r10 = io.sentry.config.a.K(r10)
            java.util.ArrayList r2 = r9.e()
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()
            io.sentry.protocol.c0 r3 = (io.sentry.protocol.c0) r3
            io.sentry.android.core.internal.util.f r4 = io.sentry.android.core.internal.util.f.a
            r4.getClass()
            java.lang.Long r4 = r3.a
            if (r4 == 0) goto L47
            long r4 = r4.longValue()
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            java.lang.Thread r6 = r6.getThread()
            long r6 = io.sentry.android.core.internal.util.f.d(r6)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L47
            r4 = r1
            goto L48
        L47:
            r4 = 0
        L48:
            java.lang.Boolean r5 = r3.f
            if (r5 != 0) goto L52
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r3.f = r5
        L52:
            if (r10 != 0) goto L1c
            java.lang.Boolean r5 = r3.h
            if (r5 != 0) goto L1c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.h = r4
            goto L1c
        L5f:
            r8.c(r9, r1, r0)
            java.util.ArrayList r10 = r9.d()
            if (r10 == 0) goto La3
            int r0 = r10.size()
            if (r0 <= r1) goto La3
            java.lang.Object r0 = defpackage.o40.u(r1, r10)
            io.sentry.protocol.u r0 = (io.sentry.protocol.u) r0
            java.lang.String r1 = "java.lang"
            java.lang.String r2 = r0.c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La3
            io.sentry.protocol.a0 r0 = r0.e
            if (r0 == 0) goto La3
            java.util.List r0 = r0.a
            if (r0 == 0) goto La3
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r0.next()
            io.sentry.protocol.z r1 = (io.sentry.protocol.z) r1
            java.lang.String r2 = "com.android.internal.os.RuntimeInit$MethodAndArgsCaller"
            java.lang.String r1 = r1.f
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L8a
            java.util.Collections.reverse(r10)
        La3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.k0.d(io.sentry.w4, io.sentry.h0):io.sentry.w4");
    }

    public final boolean e(k4 k4Var, io.sentry.h0 h0Var) {
        if (io.sentry.config.a.Y(h0Var)) {
            return true;
        }
        this.c.getLogger().i(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", k4Var.a);
        return false;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, io.sentry.h0 h0Var) {
        boolean zE = e(d0Var, h0Var);
        if (zE) {
            a(d0Var, h0Var);
        }
        c(d0Var, false, zE);
        return d0Var;
    }

    @Override // io.sentry.b0
    public final g5 k(g5 g5Var) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            g5Var.a("device.brand", new io.sentry.protocol.m(sentryAttributeType, Build.BRAND));
            g5Var.a("device.model", new io.sentry.protocol.m(sentryAttributeType.apiName(), Build.MODEL));
            g5Var.a("device.family", new io.sentry.protocol.m(sentryAttributeType.apiName(), this.e.a()));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to retrieve device info", th);
        }
        try {
            SentryAttributeType sentryAttributeType2 = SentryAttributeType.STRING;
            g5Var.a("os.name", new io.sentry.protocol.m(sentryAttributeType2, "Android"));
            g5Var.a("os.version", new io.sentry.protocol.m(sentryAttributeType2.apiName(), Build.VERSION.RELEASE));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to retrieve os system", th2);
        }
        return g5Var;
    }
}
