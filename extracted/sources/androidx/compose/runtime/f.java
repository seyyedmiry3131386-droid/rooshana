package androidx.compose.runtime;

import defpackage.bt2;
import defpackage.eq;
import defpackage.qp2;
import defpackage.qx4;
import defpackage.ry;
import defpackage.u61;
import defpackage.v61;
import defpackage.w61;

/* JADX INFO: loaded from: classes.dex */
public final class f implements qx4 {
    public final qx4 a;
    public final ry b = new ry(8);

    public f(qx4 qx4Var) {
        this.a = qx4Var;
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        return bt2.H(this, v61Var);
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return eq.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k0(defpackage.g51 r7, defpackage.dp2 r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            dp2 r8 = r0.a
            kotlin.b.b(r7)
            goto L76
        L38:
            kotlin.b.b(r7)
            ry r7 = r6.b
            r0.a = r8
            r0.d = r4
            boolean r2 = r7.n()
            if (r2 == 0) goto L4a
            tx8 r7 = defpackage.tx8.a
            goto L73
        L4a:
            om0 r2 = new om0
            g51 r5 = defpackage.ok4.I(r0)
            r2.<init>(r4, r5)
            r2.v()
            java.lang.Object r4 = r7.c
            monitor-enter(r4)
            java.lang.Object r5 = r7.d     // Catch: java.lang.Throwable -> L85
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L85
            r5.add(r2)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r4)
            wb r4 = new wb
            r5 = 6
            r4.<init>(r7, r2, r5)
            r2.x(r4)
            java.lang.Object r7 = r2.u()
            if (r7 != r1) goto L71
            goto L73
        L71:
            tx8 r7 = defpackage.tx8.a
        L73:
            if (r7 != r1) goto L76
            goto L83
        L76:
            qx4 r7 = r6.a
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r7.k0(r0, r8)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            return r7
        L85:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.f.k0(g51, dp2):java.lang.Object");
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        return bt2.x(this, v61Var);
    }
}
