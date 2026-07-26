package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* JADX INFO: loaded from: classes.dex */
public final class qa0 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qa0(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str = (String) this.c;
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = qz0Var.f(str);
                    Object objM = qz0Var.M();
                    if (zF || objM == jz0.a) {
                        objM = new kt(str, 1);
                        qz0Var.l0(objM);
                    }
                    eu euVar = new eu((dp2) objM, false);
                    a aVar = (a) this.b;
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
                    aVar.invoke(qz0Var, 0);
                    qz0Var.q(true);
                } else {
                    qz0Var.U();
                }
                break;
            case 1:
                qz0 qz0Var2 = (qz0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hx4 hx4VarY = yh0.y(androidx.compose.foundation.layout.b.a(ex4.b, ci0.b, ci0.c), (wy5) this.c);
                    bv bvVar = jv.d;
                    bb0 bb0Var = eq.m;
                    a aVar2 = (a) this.b;
                    cb7 cb7VarA = bb7.a(bvVar, bb0Var, qz0Var2, 54);
                    int iB2 = ok4.B(qz0Var2);
                    j56 j56VarL2 = qz0Var2.l();
                    hx4 hx4VarC2 = b.c(qz0Var2, hx4VarY);
                    hz0.d0.getClass();
                    bp2 bp2Var2 = d.b;
                    qz0Var2.e0();
                    if (qz0Var2.S) {
                        qz0Var2.k(bp2Var2);
                    } else {
                        qz0Var2.o0();
                    }
                    ia7.o(qz0Var2, d.f, cb7VarA);
                    ia7.o(qz0Var2, d.e, j56VarL2);
                    qp2 qp2Var2 = d.g;
                    if (qz0Var2.S || !js3.i(qz0Var2.M(), Integer.valueOf(iB2))) {
                        o40.C(iB2, qz0Var2, iB2, qp2Var2);
                    }
                    ia7.o(qz0Var2, d.d, hx4VarC2);
                    aVar2.a(eb7.a, qz0Var2, 6);
                    qz0Var2.q(true);
                } else {
                    qz0Var2.U();
                }
                break;
            case 2:
                qz0 qz0Var3 = (qz0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ((rp2) this.c).a((ih8) this.b, qz0Var3, 6);
                } else {
                    qz0Var3.U();
                }
                break;
            default:
                qz0 qz0Var4 = (qz0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (qz0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    wb5 wb5Var = (wb5) this.c;
                    Object objM2 = qz0Var4.M();
                    if (objM2 == jz0.a) {
                        objM2 = new u8(wb5Var, 10);
                        qz0Var4.l0(objM2);
                    }
                    hx4 hx4VarN = hs9.N(ex4.b, (dp2) objM2);
                    a aVar3 = (a) this.b;
                    cl4 cl4VarD2 = bg0.d(eq.c, false);
                    int iB3 = ok4.B(qz0Var4);
                    j56 j56VarL3 = qz0Var4.l();
                    hx4 hx4VarC3 = b.c(qz0Var4, hx4VarN);
                    hz0.d0.getClass();
                    bp2 bp2Var3 = d.b;
                    qz0Var4.e0();
                    if (qz0Var4.S) {
                        qz0Var4.k(bp2Var3);
                    } else {
                        qz0Var4.o0();
                    }
                    ia7.o(qz0Var4, d.f, cl4VarD2);
                    ia7.o(qz0Var4, d.e, j56VarL3);
                    qp2 qp2Var3 = d.g;
                    if (qz0Var4.S || !js3.i(qz0Var4.M(), Integer.valueOf(iB3))) {
                        o40.C(iB3, qz0Var4, iB3, qp2Var3);
                    }
                    ia7.o(qz0Var4, d.d, hx4VarC3);
                    aVar3.invoke(qz0Var4, 0);
                    qz0Var4.q(true);
                } else {
                    qz0Var4.U();
                }
                break;
        }
        return tx8.a;
    }
}
