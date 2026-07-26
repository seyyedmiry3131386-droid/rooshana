package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* JADX INFO: loaded from: classes.dex */
public final class ww4 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ww4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM = qz0Var.M();
                    if (objM == jz0.a) {
                        objM = new us3(16);
                        qz0Var.l0(objM);
                    }
                    eu euVar = new eu((dp2) objM, false);
                    wb5 wb5Var = (wb5) this.b;
                    cl4 cl4VarD = bg0.d(eq.c, false);
                    int iB = ok4.B(qz0Var);
                    j56 j56VarL = qz0Var.l();
                    hx4 hx4VarC = b.c(qz0Var, euVar);
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
                    ((qp2) wb5Var.getValue()).invoke(qz0Var, 0);
                    qz0Var.q(true);
                } else {
                    qz0Var.U();
                }
                break;
            default:
                qz0 qz0Var2 = (qz0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mi8.b((String) this.b, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, qz0Var2, 0, 0, 262142);
                } else {
                    qz0Var2.U();
                }
                break;
        }
        return tx8.a;
    }
}
