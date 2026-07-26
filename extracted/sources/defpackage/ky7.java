package defpackage;

import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class ky7 extends gx4 implements f14 {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long C0(defpackage.el4 r7) {
        /*
            r6 = this;
            float r0 = r6.q
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.q
            int r0 = r7.b0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.r
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.r
            int r3 = r7.b0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.o
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.o
            int r4 = r7.b0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.p
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.p
            int r7 = r7.b0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = defpackage.j31.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky7.C0(el4):long");
    }

    @Override // defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        long jC0 = C0(jVar);
        if (h31.f(jC0)) {
            return h31.h(jC0);
        }
        if (!this.s) {
            i = j31.f(i, jC0);
        }
        return j31.g(yk4Var.l(i), jC0);
    }

    @Override // defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        long jC0 = C0(jVar);
        if (h31.e(jC0)) {
            return h31.g(jC0);
        }
        if (!this.s) {
            i = j31.g(i, jC0);
        }
        return j31.f(yk4Var.P(i), jC0);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jC0 = C0(el4Var);
        if (this.s) {
            jA = j31.e(j, jC0);
        } else {
            if (Float.isNaN(this.o)) {
                iJ = h31.j(j);
                int iH2 = h31.h(jC0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = h31.j(jC0);
            }
            if (Float.isNaN(this.q)) {
                iH = h31.h(j);
                int iJ2 = h31.j(jC0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = h31.h(jC0);
            }
            if (Float.isNaN(this.p)) {
                i = h31.i(j);
                int iG2 = h31.g(jC0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = h31.i(jC0);
            }
            if (Float.isNaN(this.r)) {
                iG = h31.g(j);
                int i2 = h31.i(jC0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = h31.g(jC0);
            }
            jA = j31.a(iJ, iH, i, iG);
        }
        b96 b96VarT = yk4Var.t(jA);
        return el4Var.D(b96VarT.a, b96VarT.b, b.I(), new q(b96VarT, 8));
    }

    @Override // defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        long jC0 = C0(jVar);
        if (h31.f(jC0)) {
            return h31.h(jC0);
        }
        if (!this.s) {
            i = j31.f(i, jC0);
        }
        return j31.g(yk4Var.n(i), jC0);
    }

    @Override // defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        long jC0 = C0(jVar);
        if (h31.e(jC0)) {
            return h31.g(jC0);
        }
        if (!this.s) {
            i = j31.g(i, jC0);
        }
        return j31.f(yk4Var.a(i), jC0);
    }
}
