package defpackage;

import androidx.compose.foundation.f;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.compose.ui.window.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class d51 {
    public static final a51 a;

    static {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.a;
        s01 s01Var = d.a;
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.a;
        SecureFlagPolicy secureFlagPolicy3 = SecureFlagPolicy.a;
        long j = zu0.d;
        long j2 = zu0.b;
        a = new a51(j, j2, j2, zu0.b(0.38f, j2), zu0.b(0.38f, j2));
    }

    public static final void a(a51 a51Var, hx4 hx4Var, a aVar, qz0 qz0Var, int i) {
        int i2;
        hx4 hx4Var2;
        qz0Var.c0(-527864079);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(a51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            hx4Var2 = hx4Var;
            i2 |= qz0Var.f(hx4Var2) ? 32 : 16;
        } else {
            hx4Var2 = hx4Var;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(aVar) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            hx4 hx4VarF = rq4.f(j97.e(hx4Var2, c51.d, la7.a(c51.e), 0L, 0L, 28), a51Var.a, tt3.d);
            IntrinsicSize intrinsicSize = IntrinsicSize.a;
            hx4 hx4VarF0 = y97.f0(yh0.B(yq2.y0(hx4VarF), 0.0f, c51.i, 1), y97.W(qz0Var));
            int i3 = (i2 << 3) & 7168;
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var, 0);
            long j = qz0Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = b.c(qz0Var, hx4VarF0);
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, androidx.compose.ui.node.d.f, vv0VarA);
            ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i4), androidx.compose.ui.node.d.g);
            ia7.n(qz0Var, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
            aVar.a(wv0.a, qz0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i, 8, a51Var, hx4Var, aVar);
        }
    }

    public static final void b(hx4 hx4Var, a51 a51Var, dp2 dp2Var, qz0 qz0Var, int i, int i2) {
        int i3;
        int i4;
        qz0Var.c0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (qz0Var.f(a51Var) ? 32 : 16);
        }
        int i7 = i4 | (qz0Var.h(dp2Var) ? 256 : 128);
        if (qz0Var.R(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                hx4Var = ex4.b;
            }
            if (i6 != 0) {
                a51Var = a;
            }
            a(a51Var, hx4Var, s7.X(-250345048, new x5(dp2Var, a51Var, 3), qz0Var), qz0Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            qz0Var.U();
        }
        hx4 hx4Var2 = hx4Var;
        a51 a51Var2 = a51Var;
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(hx4Var2, a51Var2, dp2Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, a51 a51Var, hx4 hx4Var, rp2 rp2Var, bp2 bp2Var, qz0 qz0Var, int i) {
        int i2;
        rp2 rp2Var2;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (qz0Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var2.f(a51Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var2.f(hx4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qz0Var2.h(rp2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= qz0Var2.h(bp2Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (qz0Var2.R(i3 & 1, (74899 & i3) != 74898)) {
            bb0 bb0Var = c51.f;
            fv fvVar = jv.a;
            float f = c51.h;
            ev evVarG = jv.g(f);
            boolean z2 = ((i3 & 458752) == 131072) | ((i3 & 112) == 32);
            Object objM = qz0Var2.M();
            if (z2 || objM == jz0.a) {
                objM = new u11(1, bp2Var, z);
                qz0Var2.l0(objM);
            }
            hx4 hx4VarC = androidx.compose.foundation.layout.b.c(f.b(hx4Var, z, str, null, (bp2) objM, 12), 1.0f);
            float f2 = c51.a;
            float f3 = c51.b;
            float f4 = c51.c;
            hx4 hx4VarB = yh0.B(androidx.compose.foundation.layout.b.k(hx4VarC, f2, f4, f3, f4), f, 0.0f, 2);
            cb7 cb7VarA = bb7.a(evVarG, bb0Var, qz0Var2, 54);
            long j = qz0Var2.T;
            int i4 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC2 = b.c(qz0Var2, hx4VarB);
            hz0.d0.getClass();
            bp2 bp2Var2 = androidx.compose.ui.node.d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            qp2 qp2Var = androidx.compose.ui.node.d.f;
            ia7.o(qz0Var2, qp2Var, cb7VarA);
            qp2 qp2Var2 = androidx.compose.ui.node.d.e;
            ia7.o(qz0Var2, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i4);
            qp2 qp2Var3 = androidx.compose.ui.node.d.g;
            ia7.g(qz0Var2, numValueOf, qp2Var3);
            dp2 dp2Var = androidx.compose.ui.node.d.h;
            ia7.n(qz0Var2, dp2Var);
            qp2 qp2Var4 = androidx.compose.ui.node.d.d;
            ia7.o(qz0Var2, qp2Var4, hx4VarC2);
            if (rp2Var == null) {
                qz0Var2.a0(-1597947094);
                qz0Var2.q(false);
                rp2Var2 = rp2Var;
            } else {
                qz0Var2.a0(-1597947093);
                float f5 = c51.j;
                hx4 hx4VarH = androidx.compose.foundation.layout.b.h(ex4.b, f5, 0.0f, f5, f5, 2);
                cl4 cl4VarD = bg0.d(eq.c, false);
                long j2 = qz0Var2.T;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                j56 j56VarL2 = qz0Var2.l();
                hx4 hx4VarC3 = b.c(qz0Var2, hx4VarH);
                qz0Var2.e0();
                if (qz0Var2.S) {
                    qz0Var2.k(bp2Var2);
                } else {
                    qz0Var2.o0();
                }
                ia7.o(qz0Var2, qp2Var, cl4VarD);
                ia7.o(qz0Var2, qp2Var2, j56VarL2);
                ia7.g(qz0Var2, Integer.valueOf(i5), qp2Var3);
                ia7.n(qz0Var2, dp2Var);
                ia7.o(qz0Var2, qp2Var4, hx4VarC3);
                rp2Var2 = rp2Var;
                rp2Var2.a(new zu0(z ? a51Var.c : a51Var.e), qz0Var2, 0);
                qz0Var2.q(true);
                qz0Var2.q(false);
            }
            gj8 gj8Var = new gj8(z ? a51Var.b : a51Var.d, c51.m, c51.n, null, c51.p, c51.g, c51.o, 16613240);
            if (1.0f <= 0.0d) {
                pn3.a("invalid weight; must be greater than zero");
            }
            y97.f(str, new a24(1.0f, true), gj8Var, null, 0, false, 1, 0, qz0Var2, (i3 & 14) | 1572864, 952);
            qz0Var2 = qz0Var2;
            qz0Var2.q(true);
        } else {
            rp2Var2 = rp2Var;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new pa0(str, z, a51Var, hx4Var, rp2Var2, bp2Var, i);
        }
    }
}
