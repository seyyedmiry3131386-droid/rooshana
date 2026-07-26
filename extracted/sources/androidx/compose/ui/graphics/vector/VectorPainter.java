package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.g;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bp2;
import defpackage.ey7;
import defpackage.g16;
import defpackage.hv1;
import defpackage.nm5;
import defpackage.o40;
import defpackage.s08;
import defpackage.tc0;
import defpackage.th0;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.wv8;

/* JADX INFO: loaded from: classes.dex */
public final class VectorPainter extends g16 {
    public final wb5 f = g.h(new ey7(0));
    public final wb5 g = g.h(Boolean.FALSE);
    public final c h;
    public final wb5 i;
    public float j;
    public tc0 k;

    public VectorPainter(a aVar) {
        c cVar = new c(aVar);
        cVar.f = new bp2() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                s08 s08Var = (s08) this.g.i;
                tx8 tx8Var = tx8.a;
                s08Var.setValue(tx8Var);
                return tx8Var;
            }
        };
        this.h = cVar;
        this.i = g.g(tx8.a, th0.p);
        this.j = 1.0f;
    }

    @Override // defpackage.g16
    public final boolean b(float f) {
        this.j = f;
        return true;
    }

    @Override // defpackage.g16
    public final boolean d(tc0 tc0Var) {
        this.k = tc0Var;
        return true;
    }

    @Override // defpackage.g16
    public final long h() {
        return ((ey7) ((s08) this.f).getValue()).a;
    }

    @Override // defpackage.g16
    public final void i(hv1 hv1Var) {
        tc0 tc0Var = this.k;
        c cVar = this.h;
        if (tc0Var == null) {
            tc0Var = (tc0) ((s08) cVar.g).getValue();
        }
        if (((Boolean) ((s08) this.g).getValue()).booleanValue() && hv1Var.getLayoutDirection() == LayoutDirection.b) {
            long jD0 = hv1Var.d0();
            wv8 wv8VarX = hv1Var.X();
            long jA = wv8VarX.A();
            wv8VarX.v().e();
            try {
                ((nm5) wv8VarX.b).y(-1.0f, 1.0f, jD0);
                cVar.e(hv1Var, this.j, tc0Var);
            } finally {
                o40.F(wv8VarX, jA);
            }
        } else {
            cVar.e(hv1Var, this.j, tc0Var);
        }
        ((s08) this.i).getValue();
    }
}
