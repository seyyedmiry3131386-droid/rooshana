package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public abstract class bg0 {
    public static final rb5 a = c(true);
    public static final rb5 b = c(false);
    public static final eg0 c = new eg0(eq.c, false);
    public static final lh d = lh.c;

    public static final void a(hx4 hx4Var, qz0 qz0Var, int i) {
        qz0Var.c0(-211209833);
        int i2 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            long j = qz0Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            hx4 hx4VarC = b.c(qz0Var, hx4Var);
            j56 j56VarL = qz0Var.l();
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, d);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            ia7.g(qz0Var, Integer.valueOf(i3), d.g);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ag0(hx4Var, i, 0);
        }
    }

    public static final void b(a96 a96Var, b96 b96Var, yk4 yk4Var, LayoutDirection layoutDirection, int i, int i2, qd qdVar) {
        qd qdVar2;
        Object objV = yk4Var.v();
        zf0 zf0Var = objV instanceof zf0 ? (zf0) objV : null;
        a96.i(a96Var, b96Var, ((zf0Var == null || (qdVar2 = zf0Var.o) == null) ? qdVar : qdVar2).a((((long) b96Var.a) << 32) | (((long) b96Var.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), layoutDirection));
    }

    public static final rb5 c(boolean z) {
        rb5 rb5Var = new rb5(9);
        cb0 cb0Var = eq.c;
        rb5Var.m(cb0Var, new eg0(cb0Var, z));
        cb0 cb0Var2 = eq.d;
        rb5Var.m(cb0Var2, new eg0(cb0Var2, z));
        cb0 cb0Var3 = eq.e;
        rb5Var.m(cb0Var3, new eg0(cb0Var3, z));
        cb0 cb0Var4 = eq.f;
        rb5Var.m(cb0Var4, new eg0(cb0Var4, z));
        cb0 cb0Var5 = eq.g;
        rb5Var.m(cb0Var5, new eg0(cb0Var5, z));
        cb0 cb0Var6 = eq.h;
        rb5Var.m(cb0Var6, new eg0(cb0Var6, z));
        cb0 cb0Var7 = eq.i;
        rb5Var.m(cb0Var7, new eg0(cb0Var7, z));
        cb0 cb0Var8 = eq.j;
        rb5Var.m(cb0Var8, new eg0(cb0Var8, z));
        cb0 cb0Var9 = eq.k;
        rb5Var.m(cb0Var9, new eg0(cb0Var9, z));
        return rb5Var;
    }

    public static final cl4 d(qd qdVar, boolean z) {
        cl4 cl4Var = (cl4) (z ? a : b).g(qdVar);
        return cl4Var == null ? new eg0(qdVar, z) : cl4Var;
    }

    public static final eg0 e(qd qdVar, boolean z, qz0 qz0Var, int i) {
        if (js3.i(qdVar, eq.c) && !z) {
            qz0Var.a0(244332343);
            qz0Var.q(false);
            return c;
        }
        qz0Var.a0(244380021);
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && qz0Var.f(qdVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !qz0Var.g(z)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object objM = qz0Var.M();
        if (z4 || objM == jz0.a) {
            objM = new eg0(qdVar, z);
            qz0Var.l0(objM);
        }
        eg0 eg0Var = (eg0) objM;
        qz0Var.q(false);
        return eg0Var;
    }
}
