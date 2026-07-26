package defpackage;

import androidx.compose.material3.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bn0 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ np2 f;

    public /* synthetic */ bn0(hx4 hx4Var, wb5 wb5Var, a aVar, androidx.compose.foundation.text.contextmenu.provider.a aVar2, bp2 bp2Var) {
        this.a = 2;
        this.b = hx4Var;
        this.c = wb5Var;
        this.f = aVar;
        this.d = aVar2;
        this.e = bp2Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                m91.b(this.b, (xr7) this.c, (zm0) this.d, (b) this.e, (a) this.f, (qz0) obj, hs9.W(196609));
                break;
            case 1:
                ((Integer) obj2).getClass();
                c26.c(this.b, (String) this.c, (String) this.d, (String) this.e, (dp2) this.f, (qz0) obj, hs9.W(24577));
                break;
            default:
                wb5 wb5Var = (wb5) this.c;
                a aVar = (a) this.f;
                androidx.compose.foundation.text.contextmenu.provider.a aVar2 = (androidx.compose.foundation.text.contextmenu.provider.a) this.d;
                bp2 bp2Var = (bp2) this.e;
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM = qz0Var.M();
                    if (objM == jz0.a) {
                        objM = new u8(wb5Var, 4);
                        qz0Var.l0(objM);
                    }
                    hx4 hx4VarN = hs9.N(this.b, (dp2) objM);
                    cl4 cl4VarD = bg0.d(eq.c, true);
                    long j = qz0Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    j56 j56VarL = qz0Var.l();
                    hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarN);
                    hz0.d0.getClass();
                    bp2 bp2Var2 = d.b;
                    qz0Var.e0();
                    if (qz0Var.S) {
                        qz0Var.k(bp2Var2);
                    } else {
                        qz0Var.o0();
                    }
                    ia7.o(qz0Var, d.f, cl4VarD);
                    ia7.o(qz0Var, d.e, j56VarL);
                    ia7.g(qz0Var, Integer.valueOf(i), d.g);
                    ia7.n(qz0Var, d.h);
                    ia7.o(qz0Var, d.d, hx4VarC);
                    aVar.invoke(qz0Var, 0);
                    aVar2.b(bp2Var, qz0Var, 6);
                    qz0Var.q(true);
                } else {
                    qz0Var.U();
                }
                return tx8.a;
        }
        return tx8.a;
    }

    public /* synthetic */ bn0(hx4 hx4Var, Object obj, Object obj2, Object obj3, np2 np2Var, int i, int i2) {
        this.a = i2;
        this.b = hx4Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = np2Var;
    }
}
