package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.f09;
import io.sentry.SentryLevel;
import io.sentry.util.AutoClosableReentrantLock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final io.sentry.util.e a;
    public final SentryAndroidOptions b;
    public final ConcurrentHashMap c;
    public final WeakHashMap d;
    public final j0 e;
    public final AutoClosableReentrantLock f;
    public final io.sentry.util.e g;

    public d(io.sentry.hints.i iVar, SentryAndroidOptions sentryAndroidOptions) {
        j0 j0Var = new j0();
        this.c = new ConcurrentHashMap();
        this.d = new WeakHashMap();
        this.f = new AutoClosableReentrantLock();
        this.g = new io.sentry.util.e(new f09(iVar, sentryAndroidOptions.getLogger(), 24));
        this.a = new io.sentry.util.e(new io.sentry.u1(7));
        this.b = sentryAndroidOptions;
        this.e = j0Var;
    }

    public final void a(Activity activity2) {
        io.sentry.r rVarA = this.f.a();
        try {
            if (!c()) {
                rVarA.close();
                return;
            }
            d(new b(this, activity2, 0), "FrameMetricsAggregator.add");
            c cVarB = b();
            if (cVarB != null) {
                this.d.put(activity2, cVarB);
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
    }

    public final c b() {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!c() || !((Boolean) this.g.a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrW = ((FrameMetricsAggregator) this.a.a()).a.w();
        int i3 = 0;
        if (sparseIntArrayArrW == null || sparseIntArrayArrW.length <= 0 || (sparseIntArray = sparseIntArrayArrW[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new c(i3, i, i2);
    }

    public final boolean c() {
        if (!((Boolean) this.g.a()).booleanValue()) {
            return false;
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        return sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    public final void d(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.f.a.c()) {
                runnable.run();
                return;
            }
            j0 j0Var = this.e;
            ((Handler) j0Var.a).post(new e1(this, runnable, str, 1));
        } catch (Throwable unused) {
            if (str != null) {
                this.b.getLogger().i(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }
}
