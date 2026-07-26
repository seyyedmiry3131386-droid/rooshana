package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.o;

/* JADX INFO: loaded from: classes.dex */
public final class eo8 implements qp2 {
    public final /* synthetic */ jr8 a;
    public final /* synthetic */ a b;
    public final /* synthetic */ io8 c;

    public eo8(jr8 jr8Var, a aVar, io8 io8Var) {
        this.a = jr8Var;
        this.b = aVar;
        this.c = io8Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            iz0 iz0Var = new iz0(o.a, new nh1(4, this.a));
            cl4 cl4VarD = bg0.d(eq.c, false);
            int iB = ok4.B(qz0Var);
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = b.c(qz0Var, iz0Var);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cl4VarD);
            ia7.o(qz0Var, d.e, j56VarL);
            qp2 qp2Var = d.g;
            if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                o40.C(iB, qz0Var, iB, qp2Var);
            }
            ia7.o(qz0Var, d.d, hx4VarC);
            this.b.a(this.c, qz0Var, 6);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
