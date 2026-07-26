package defpackage;

import android.graphics.Paint;
import androidx.compose.ui.node.i;

/* JADX INFO: loaded from: classes.dex */
public final class kc8 extends gx4 implements gv1 {
    public xr7 o;
    public float p;
    public long q;
    public jx9 r;
    public Paint s;
    public op1 t;

    public final void C0() {
        int iE = gu9.E(zu0.b(0.0f, this.q));
        int iE2 = gu9.E(this.q);
        Paint paint = this.s;
        js3.m(paint);
        paint.setColor(iE);
        Paint paint2 = this.s;
        js3.m(paint2);
        paint2.setShadowLayer(this.p, 0.0f, 0.0f, iE2);
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        i iVar2;
        vm0 vm0Var = iVar.a;
        tm0 tm0VarV = vm0Var.b.v();
        if (this.r == null) {
            jx9 jx9VarC = dt2.c();
            this.r = jx9VarC;
            this.s = (Paint) jx9VarC.b;
            C0();
        }
        if (this.t == null) {
            this.t = new op1(this.o, vm0Var.b.A(), iVar.getLayoutDirection(), iVar);
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
        }
        op1 op1Var = this.t;
        js3.m(op1Var);
        rq4 rq4VarW = op1Var.w(this.o, vm0Var.b.A(), iVar2.getLayoutDirection(), iVar2);
        if (rq4VarW instanceof ww5) {
            sy6 sy6Var = ((ww5) rq4VarW).p;
            jx9 jx9Var = this.r;
            js3.m(jx9Var);
            tm0VarV.h(sy6Var, jx9Var);
        } else if (rq4VarW instanceof xw5) {
            long j = ((xw5) rq4VarW).p.e;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float fE = ey7.e(vm0Var.b.A());
            float fC = ey7.c(vm0Var.b.A());
            jx9 jx9Var2 = this.r;
            js3.m(jx9Var2);
            tm0VarV.d(0.0f, 0.0f, fE, fC, fIntBitsToFloat, fIntBitsToFloat2, jx9Var2);
        } else if (rq4VarW instanceof vw5) {
            u26 u26Var = ((vw5) rq4VarW).p;
            jx9 jx9Var3 = this.r;
            js3.m(jx9Var3);
            tm0VarV.q(u26Var, jx9Var3);
        }
        iVar2.a();
    }
}
