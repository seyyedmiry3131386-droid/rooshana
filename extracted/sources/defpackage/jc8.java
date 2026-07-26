package defpackage;

import androidx.compose.ui.node.i;
import androidx.tv.material3.tokens.a;

/* JADX INFO: loaded from: classes.dex */
public final class jc8 extends gx4 implements gv1 {
    public xr7 o;
    public fe0 p;
    public op1 q;
    public r70 r;

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        vm0 vm0Var = iVar.a;
        iVar.a();
        fe0 fe0Var = this.p;
        ne0 ne0Var = fe0Var.a;
        xr7 xr7Var = js3.i(fe0Var.c, a.a) ? this.o : this.p.c;
        if (this.q == null) {
            this.q = new op1(xr7Var, vm0Var.b.A(), iVar.getLayoutDirection(), iVar);
        }
        if (this.r == null) {
            float fS = iVar.S(ne0Var.a);
            r70 r70Var = new r70();
            r70Var.b = fS;
            this.r = r70Var;
        }
        float f = -iVar.S(this.p.b);
        ((nm5) vm0Var.b.b).p(f, f, f, f);
        op1 op1Var = this.q;
        js3.m(op1Var);
        rq4 rq4VarW = op1Var.w(xr7Var, iVar.d(), iVar.getLayoutDirection(), iVar);
        r70 r70Var2 = this.r;
        js3.m(r70Var2);
        float fS2 = iVar.S(ne0Var.a);
        if (((p88) r70Var2.c) == null || r70Var2.b != fS2) {
            r70Var2.b = fS2;
            r70Var2.c = new p88(fS2, 0.0f, 1, 0, 26);
        }
        p88 p88Var = (p88) r70Var2.c;
        js3.m(p88Var);
        wn5.B(iVar, rq4VarW, ne0Var.b, 1.0f, p88Var, 48);
        float f2 = -f;
        ((nm5) vm0Var.b.b).p(f2, f2, f2, f2);
    }
}
