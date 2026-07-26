package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class bg {
    public static final float a;
    public static final float b;

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(final tr5 tr5Var, final hx4 hx4Var, final long j, qz0 qz0Var, final int i) {
        int i2;
        qz0Var.c0(1776202187);
        int i3 = (qz0Var.f(tr5Var) ? 4 : 2) | i | (qz0Var.f(hx4Var) ? 32 : 16) | 128;
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            qz0Var.W();
            if ((i & 1) == 0 || qz0Var.z()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                qz0Var.U();
                i2 = i3 & (-897);
            }
            qz0Var.r();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM = qz0Var.M();
            if (z || objM == jz0.a) {
                objM = new n(6, tr5Var);
                qz0Var.l0(objM);
            }
            final hx4 hx4VarA = hn7.a(hx4Var, false, (dp2) objM);
            tt3.a(tr5Var, eq.d, s7.X(-1653527038, new qp2() { // from class: vf
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    qz0 qz0Var2 = (qz0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (qz0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = j;
                        hx4 hx4Var2 = hx4VarA;
                        if (j2 != 9205357640488583168L) {
                            qz0Var2.a0(-1244013944);
                            hx4 hx4VarH = b.h(hx4Var2, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)), 0.0f, 0.0f, 12);
                            cl4 cl4VarD = bg0.d(eq.d, false);
                            long j3 = qz0Var2.T;
                            int i5 = (int) (j3 ^ (j3 >>> 32));
                            j56 j56VarL = qz0Var2.l();
                            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarH);
                            hz0.d0.getClass();
                            bp2 bp2Var = d.b;
                            qz0Var2.e0();
                            if (qz0Var2.S) {
                                qz0Var2.k(bp2Var);
                            } else {
                                qz0Var2.o0();
                            }
                            ia7.o(qz0Var2, d.f, cl4VarD);
                            ia7.o(qz0Var2, d.e, j56VarL);
                            ia7.g(qz0Var2, Integer.valueOf(i5), d.g);
                            ia7.n(qz0Var2, d.h);
                            ia7.o(qz0Var2, d.d, hx4VarC);
                            bg.b(null, qz0Var2, 0, 1);
                            qz0Var2.q(true);
                            qz0Var2.q(false);
                        } else {
                            qz0Var2.a0(-1243644858);
                            bg.b(hx4Var2, qz0Var2, 0, 0);
                            qz0Var2.q(false);
                        }
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, i4 | 432);
        } else {
            qz0Var.U();
        }
        final long j2 = j;
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(hx4Var, j2, i) { // from class: wf
                public final /* synthetic */ hx4 b;
                public final /* synthetic */ long c;

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(1);
                    bg.a(this.a, this.b, this.c, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void b(hx4 hx4Var, qz0 qz0Var, int i, int i2) {
        int i3;
        qz0Var.c0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        }
        if (qz0Var.R(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                hx4Var = ex4.b;
            }
            z27.a(qz0Var, androidx.compose.ui.b.a(b.j(hx4Var, b, a), new yf(0)));
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new xf(hx4Var, i, i2);
        }
    }
}
