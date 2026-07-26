package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* JADX INFO: loaded from: classes.dex */
public final class cn0 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ cn0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var, 0);
                    int iB = ok4.B(qz0Var);
                    j56 j56VarL = qz0Var.l();
                    hx4 hx4VarC = b.c(qz0Var, ex4.b);
                    hz0.d0.getClass();
                    bp2 bp2Var = d.b;
                    qz0Var.e0();
                    if (qz0Var.S) {
                        qz0Var.k(bp2Var);
                    } else {
                        qz0Var.o0();
                    }
                    ia7.o(qz0Var, d.f, vv0VarA);
                    ia7.o(qz0Var, d.e, j56VarL);
                    qp2 qp2Var = d.g;
                    if (qz0Var.S || !js3.i(qz0Var.M(), Integer.valueOf(iB))) {
                        o40.C(iB, qz0Var, iB, qp2Var);
                    }
                    ia7.o(qz0Var, d.d, hx4VarC);
                    this.b.a(wv0.a, qz0Var, 6);
                    qz0Var.q(true);
                } else {
                    qz0Var.U();
                }
                break;
            default:
                qz0 qz0Var2 = (qz0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vv0 vv0VarA2 = tv0.a(jv.c, eq.o, qz0Var2, 0);
                    int iB2 = ok4.B(qz0Var2);
                    j56 j56VarL2 = qz0Var2.l();
                    hx4 hx4VarC2 = b.c(qz0Var2, ex4.b);
                    hz0.d0.getClass();
                    bp2 bp2Var2 = d.b;
                    qz0Var2.e0();
                    if (qz0Var2.S) {
                        qz0Var2.k(bp2Var2);
                    } else {
                        qz0Var2.o0();
                    }
                    ia7.o(qz0Var2, d.f, vv0VarA2);
                    ia7.o(qz0Var2, d.e, j56VarL2);
                    qp2 qp2Var2 = d.g;
                    if (qz0Var2.S || !js3.i(qz0Var2.M(), Integer.valueOf(iB2))) {
                        o40.C(iB2, qz0Var2, iB2, qp2Var2);
                    }
                    ia7.o(qz0Var2, d.d, hx4VarC2);
                    this.b.a(wv0.a, qz0Var2, 6);
                    qz0Var2.q(true);
                } else {
                    qz0Var2.U();
                }
                break;
        }
        return tx8.a;
    }
}
