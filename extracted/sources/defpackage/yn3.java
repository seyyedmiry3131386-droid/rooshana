package defpackage;

import androidx.compose.ui.node.LayoutNode$LayoutState;
import androidx.compose.ui.node.LayoutNode$UsageByParent;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.m;

/* JADX INFO: loaded from: classes.dex */
public final class yn3 extends ye4 {
    @Override // defpackage.ye4
    public final void A0() {
        k kVarY = this.p.p.y();
        js3.m(kVarY);
        kVarY.o0();
    }

    @Override // defpackage.yk4
    public final int P(int i) {
        hh2 hh2VarE = this.p.p.E();
        cl4 cl4VarZ = hh2VarE.z();
        h hVar = (h) hh2VarE.b;
        return cl4VarZ.i((m) hVar.H.e, hVar.n(), i);
    }

    @Override // defpackage.yk4
    public final int a(int i) {
        hh2 hh2VarE = this.p.p.E();
        cl4 cl4VarZ = hh2VarE.z();
        h hVar = (h) hh2VarE.b;
        return cl4VarZ.g((m) hVar.H.e, hVar.n(), i);
    }

    @Override // androidx.compose.ui.node.j
    public final int i0(rd rdVar) {
        k kVar = this.p.p.t().q;
        js3.m(kVar);
        l14 l14Var = kVar.q;
        n14 n14Var = kVar.f;
        if (n14Var.d == LayoutNode$LayoutState.b) {
            l14Var.d = true;
            if (l14Var.b) {
                n14Var.f = true;
                n14Var.g = true;
            }
        } else {
            l14Var.e = true;
        }
        yn3 yn3Var = kVar.f().W;
        if (yn3Var != null) {
            yn3Var.k = true;
        }
        kVar.B();
        yn3 yn3Var2 = kVar.f().W;
        if (yn3Var2 != null) {
            yn3Var2.k = false;
        }
        Integer num = (Integer) l14Var.g.get(rdVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.u.g(iIntValue, rdVar);
        return iIntValue;
    }

    @Override // defpackage.yk4
    public final int l(int i) {
        hh2 hh2VarE = this.p.p.E();
        cl4 cl4VarZ = hh2VarE.z();
        h hVar = (h) hh2VarE.b;
        return cl4VarZ.e((m) hVar.H.e, hVar.n(), i);
    }

    @Override // defpackage.yk4
    public final int n(int i) {
        hh2 hh2VarE = this.p.p.E();
        cl4 cl4VarZ = hh2VarE.z();
        h hVar = (h) hh2VarE.b;
        return cl4VarZ.b((m) hVar.H.e, hVar.n(), i);
    }

    @Override // defpackage.yk4
    public final b96 t(long j) {
        c0(j);
        m mVar = this.p;
        zb5 zb5VarL = mVar.p.L();
        Object[] objArr = zb5VarL.a;
        int i = zb5VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            k kVarY = ((h) objArr[i2]).y();
            js3.m(kVarY);
            kVarY.j = LayoutNode$UsageByParent.c;
        }
        h hVar = mVar.p;
        ye4.y0(this, hVar.y.d(this, hVar.n(), j));
        return this;
    }
}
