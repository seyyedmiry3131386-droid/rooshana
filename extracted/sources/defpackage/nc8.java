package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.l;

/* JADX INFO: loaded from: classes.dex */
public final class nc8 implements qp2 {
    public final /* synthetic */ hx4 a;
    public final /* synthetic */ xr7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ne0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ a g;

    public nc8(hx4 hx4Var, xr7 xr7Var, long j, float f, ne0 ne0Var, float f2, a aVar) {
        this.a = hx4Var;
        this.b = xr7Var;
        this.c = j;
        this.d = f;
        this.e = ne0Var;
        this.f = f2;
        this.g = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zR = qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2);
        tx8 tx8Var = tx8.a;
        if (!zR) {
            qz0Var.U();
            return tx8Var;
        }
        hx4 hx4VarC = pc8.c(this.a, this.b, pc8.d(this.c, this.d, qz0Var), this.e, ((qj1) qz0Var.j(l.h)).S(this.f));
        Object objM = qz0Var.M();
        av avVar = jz0.a;
        if (objM == avVar) {
            objM = new lc8(0);
            qz0Var.l0(objM);
        }
        hx4 hx4VarA = hn7.a(hx4VarC, false, (dp2) objM);
        Object objM2 = qz0Var.M();
        if (objM2 == avVar) {
            objM2 = mc8.a;
            qz0Var.l0(objM2);
        }
        hx4 hx4VarA2 = bd8.a(hx4VarA, tx8Var, (PointerInputEventHandler) objM2);
        cl4 cl4VarD = bg0.d(eq.c, true);
        int iB = ok4.B(qz0Var);
        j56 j56VarL = qz0Var.l();
        hx4 hx4VarC2 = b.c(qz0Var, hx4VarA2);
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
        ia7.o(qz0Var, d.d, hx4VarC2);
        this.g.invoke(qz0Var, 0);
        qz0Var.q(true);
        return tx8Var;
    }
}
