package io.sentry.android.core;

import android.app.Activity;
import android.net.TrafficStats;
import android.util.Log;
import defpackage.gg1;
import io.sentry.SentryLevel;
import io.sentry.a5;
import io.sentry.b6;
import io.sentry.h4;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements io.sentry.j1, q0, io.sentry.u0, io.sentry.logger.c, io.sentry.metrics.b, a5 {
    public static final t b = new t(0);
    public static final t c = new t(1);
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i) {
        this.a = i;
    }

    @Override // io.sentry.j1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.logger.c
    public io.sentry.logger.b b(b6 b6Var, gg1 gg1Var) {
        m mVar = new m(b6Var, gg1Var);
        c0.e.b(mVar);
        return mVar;
    }

    @Override // io.sentry.j1
    public void c() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.a5
    public void d() {
        Activity activityA = j0.b.a();
        if (activityA == null) {
            h4.b().m().getLogger().i(SentryLevel.ERROR, "Cannot show user feedback dialog, no activity is available. Make sure to call SentryAndroid.init() in your Application.onCreate() method.", new Object[0]);
        } else {
            new p1(activityA).show();
        }
    }

    @Override // io.sentry.u0
    public void e(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        switch (this.a) {
            case 2:
                if (objArr.length != 0) {
                    String.format(str, objArr);
                    break;
                }
                break;
            default:
                if (objArr.length != 0) {
                    f(sentryLevel, String.format(str, objArr), th);
                } else {
                    f(sentryLevel, str, th);
                }
                break;
        }
    }

    @Override // io.sentry.u0
    public void f(SentryLevel sentryLevel, String str, Throwable th) {
        switch (this.a) {
            case 2:
                break;
            default:
                int i = k.a[sentryLevel.ordinal()];
                break;
        }
    }

    @Override // io.sentry.u0
    public void i(SentryLevel sentryLevel, String str, Object... objArr) {
        switch (this.a) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                } else {
                    Log.println(7, "Sentry", str);
                }
                break;
            default:
                int i = 5;
                if (objArr.length != 0) {
                    int i2 = k.a[sentryLevel.ordinal()];
                    if (i2 == 1) {
                        i = 4;
                    } else if (i2 != 2) {
                        i = i2 != 4 ? 3 : 7;
                    }
                    Log.println(i, "Sentry", String.format(str, objArr));
                } else {
                    int i3 = k.a[sentryLevel.ordinal()];
                    if (i3 == 1) {
                        i = 4;
                    } else if (i3 != 2) {
                        i = i3 != 4 ? 3 : 7;
                    }
                    Log.println(i, "Sentry", str);
                }
                break;
        }
    }

    @Override // io.sentry.u0
    public boolean l(SentryLevel sentryLevel) {
        switch (this.a) {
        }
        return true;
    }

    @Override // io.sentry.metrics.b
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public io.sentry.metrics.a mo27b(b6 b6Var, gg1 gg1Var) {
        o oVar = new o(b6Var, gg1Var);
        c0.e.b(oVar);
        return oVar;
    }

    private final void g(SentryLevel sentryLevel, String str, Throwable th) {
    }
}
