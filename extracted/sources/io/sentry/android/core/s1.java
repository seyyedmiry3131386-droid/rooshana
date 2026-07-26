package io.sentry.android.core;

import io.sentry.c3;
import io.sentry.e3;
import io.sentry.l5;
import io.sentry.n4;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.Date;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements io.sentry.x0, io.sentry.android.core.internal.util.r {
    public static final long h = TimeUnit.SECONDS.toNanos(1);
    public static final l5 i = new l5(new Date(0), 0);
    public final boolean a;
    public final io.sentry.android.core.internal.util.s c;
    public volatile String d;
    public final AutoClosableReentrantLock b = new AutoClosableReentrantLock();
    public final TreeSet e = new TreeSet(new q1(0));
    public final ConcurrentSkipListSet f = new ConcurrentSkipListSet();
    public long g = 16666666;

    public s1(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.s sVar) {
        this.c = sVar;
        this.a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static long g(n4 n4Var) {
        if (n4Var instanceof l5) {
            return n4Var.b(i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - n4Var.d());
    }

    @Override // io.sentry.android.core.internal.util.r
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (h / ((double) f));
        this.g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new r1(j, j2, j3, j4, z, z2, j5));
        }
    }

    public final void d() {
        io.sentry.r rVarA = this.b.a();
        try {
            if (this.d != null) {
                this.c.b(this.d);
                this.d = null;
            }
            this.f.clear();
            this.e.clear();
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

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ec A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:78:0x0150, B:80:0x015a, B:82:0x015e, B:84:0x0166, B:90:0x0173, B:95:0x0182, B:99:0x018d, B:101:0x0199, B:104:0x01a5, B:106:0x01af, B:107:0x01b9, B:102:0x019e, B:108:0x01bb, B:110:0x01ec, B:58:0x00e5, B:62:0x010b, B:66:0x0116, B:68:0x011a, B:70:0x0121), top: B:142:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(io.sentry.k1 r36) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.s1.e(io.sentry.k1):void");
    }

    public final void f(io.sentry.k1 k1Var) {
        String str;
        if (!this.a || (k1Var instanceof c3) || (k1Var instanceof e3)) {
            return;
        }
        io.sentry.r rVarA = this.b.a();
        try {
            this.e.add(k1Var);
            if (this.d == null) {
                io.sentry.android.core.internal.util.s sVar = this.c;
                if (sVar.g) {
                    String strX = io.sentry.config.a.x();
                    sVar.f.put(strX, this);
                    sVar.c();
                    str = strX;
                } else {
                    str = null;
                }
                this.d = str;
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
}
