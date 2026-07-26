package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.animation.o;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class su6 {
    public static final float a;
    public static final float b = 12;
    public static final float c;

    static {
        float f = 2;
        a = f;
        c = f;
    }

    public static final void a(final boolean z, hx4 hx4Var, boolean z2, final mu6 mu6Var, qz0 qz0Var, final int i) {
        int i2;
        final hx4 hx4Var2;
        final boolean z3;
        boolean z4;
        Object objK;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(408580840);
        if ((i & 6) == 0) {
            i2 = (qz0Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var2.h(null) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 |= qz0Var2.f(mu6Var) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (qz0Var2.R(i4 & 1, (74899 & i4) != 74898)) {
            qz0Var2.W();
            int i5 = i & 1;
            ex4 ex4Var = ex4.b;
            if (i5 == 0 || qz0Var2.z()) {
                z4 = true;
                hx4Var2 = ex4Var;
            } else {
                qz0Var2.U();
                hx4Var2 = hx4Var;
                z4 = z2;
            }
            qz0Var2.r();
            u48 u48VarA = b.a(z ? b / 2 : 0, ja1.E(MotionSchemeKeyTokens.b, qz0Var2), null, qz0Var2, 0, 12);
            long j = (z4 && z) ? mu6Var.a : (!z4 || z) ? (z4 || !z) ? mu6Var.d : mu6Var.c : mu6Var.b;
            if (z4) {
                qz0Var2.a0(1194696477);
                objK = o.a(j, ja1.E(MotionSchemeKeyTokens.c, qz0Var2), null, qz0Var, 0, 12);
                qz0Var2 = qz0Var;
                qz0Var2.q(false);
            } else {
                qz0Var2.a0(1194874138);
                objK = g.k(new zu0(j), qz0Var2);
                qz0Var2.q(false);
            }
            hx4 hx4VarG = androidx.compose.foundation.layout.b.g(yh0.z(androidx.compose.foundation.layout.b.o(hx4Var2.d(ex4Var).d(ex4Var), eq.g, 2), a), vu6.c);
            boolean zF = qz0Var2.f(objK) | qz0Var2.f(u48VarA);
            Object objM = qz0Var2.M();
            if (zF || objM == jz0.a) {
                objM = new v25(objK, u48VarA, 13);
                qz0Var2.l0(objM);
            }
            ml9.c(hx4VarG, (dp2) objM, qz0Var2, 0);
            z3 = z4;
        } else {
            qz0Var2.U();
            hx4Var2 = hx4Var;
            z3 = z2;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: qu6
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    su6.a(z, hx4Var2, z3, mu6Var, (qz0) obj, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }
}
