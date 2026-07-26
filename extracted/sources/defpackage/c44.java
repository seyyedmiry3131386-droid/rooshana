package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c44 implements fd7, bd7 {
    public final gd7 a;
    public final bd7 b;
    public final sb5 c;

    public c44(fd7 fd7Var, Map map, bd7 bd7Var) {
        m22 m22Var = new m22(15, fd7Var);
        u58 u58Var = hd7.a;
        this.a = new gd7(map, m22Var);
        this.b = bd7Var;
        sb5 sb5Var = de7.a;
        this.c = new sb5();
    }

    @Override // defpackage.fd7
    public final ed7 a(String str, bp2 bp2Var) {
        return this.a.a(str, bp2Var);
    }

    @Override // defpackage.fd7
    public final boolean b(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.bd7
    public final void c(Object obj, a aVar, qz0 qz0Var, int i) {
        int i2;
        qz0Var.c0(-858296452);
        if ((i & 6) == 0) {
            i2 = (qz0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(this) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            this.b.c(obj, aVar, qz0Var, i2 & 126);
            boolean zH = qz0Var.h(this) | qz0Var.h(obj);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new m(this, obj, 26);
                qz0Var.l0(objM);
            }
            zk8.d(obj, (dp2) objM, qz0Var);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i, 12, this, obj, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // defpackage.fd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map d() {
        /*
            r14 = this;
            sb5 r0 = r14.c
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            bd7 r11 = r14.b
            r11.f(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            gd7 r0 = r14.a
            java.util.Map r0 = r0.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c44.d():java.util.Map");
    }

    @Override // defpackage.fd7
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.bd7
    public final void f(Object obj) {
        this.b.f(obj);
    }
}
