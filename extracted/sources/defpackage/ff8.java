package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class ff8 {
    public final gf8 a;
    public final String b;
    public boolean c;
    public af8 d;
    public final ArrayList e;
    public boolean f;

    public ff8(gf8 gf8Var, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = gf8Var;
        this.b = str;
        this.e = new ArrayList();
    }

    public static void c(ff8 ff8Var, String str, bp2 bp2Var) {
        ff8Var.getClass();
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(bp2Var, "block");
        ff8Var.d(new jp1(str, bp2Var), 0L);
    }

    public final void a() {
        gf8 gf8Var = this.a;
        TimeZone timeZone = ih9.a;
        synchronized (gf8Var) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        af8 af8Var = this.d;
        if (af8Var != null && af8Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((af8) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                af8 af8Var2 = (af8) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    c67.a(logger, af8Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(af8 af8Var, long j) {
        js3.p(af8Var, "task");
        synchronized (this.a) {
            if (!this.c) {
                if (f(af8Var, j, false)) {
                    this.a.c(this);
                }
            } else if (af8Var.b) {
                Logger logger = this.a.b;
                if (logger.isLoggable(Level.FINE)) {
                    c67.a(logger, af8Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.a.b;
                if (logger2.isLoggable(Level.FINE)) {
                    c67.a(logger2, af8Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.af8 r12, long r13, boolean r15) {
        /*
            r11 = this;
            gf8 r0 = r11.a
            java.util.logging.Logger r0 = r0.b
            java.lang.String r1 = "task"
            defpackage.js3.p(r12, r1)
            ff8 r1 = r12.c
            if (r1 != r11) goto Le
            goto L12
        Le:
            if (r1 != 0) goto L8a
            r12.c = r11
        L12:
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.e
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L39
            long r9 = r12.d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L36
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L89
            java.lang.String r13 = "already scheduled"
            defpackage.c67.a(r0, r12, r11, r13)
            return r7
        L36:
            r5.remove(r6)
        L39:
            r12.d = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5f
            if (r15 == 0) goto L51
            long r3 = r3 - r1
            java.lang.String r15 = defpackage.c67.d(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L5c
        L51:
            long r3 = r3 - r1
            java.lang.String r15 = defpackage.c67.d(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L5c:
            defpackage.c67.a(r0, r12, r11, r15)
        L5f:
            java.util.Iterator r15 = r5.iterator()
            r0 = r7
        L64:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r15.next()
            af8 r3 = (defpackage.af8) r3
            long r3 = r3.d
            long r3 = r3 - r1
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L78
            goto L7c
        L78:
            int r0 = r0 + 1
            goto L64
        L7b:
            r0 = r8
        L7c:
            if (r0 != r8) goto L82
            int r0 = r5.size()
        L82:
            r5.add(r0, r12)
            if (r0 != 0) goto L89
            r12 = 1
            return r12
        L89:
            return r7
        L8a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff8.f(af8, long, boolean):boolean");
    }

    public final void g() {
        gf8 gf8Var = this.a;
        TimeZone timeZone = ih9.a;
        synchronized (gf8Var) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
