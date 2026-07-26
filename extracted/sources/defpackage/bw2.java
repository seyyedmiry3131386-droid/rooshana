package defpackage;

import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.f;

/* JADX INFO: loaded from: classes.dex */
public final class bw2 extends f {
    @Override // defpackage.wj1
    public final void a(wj1 wj1Var) {
        a aVar = this.h;
        if (aVar.c && !aVar.j) {
            aVar.d((int) ((((a) aVar.l.get(0)).g * ((aw2) this.b).u0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void d() {
        f31 f31Var = this.b;
        aw2 aw2Var = (aw2) f31Var;
        int i = aw2Var.v0;
        int i2 = aw2Var.w0;
        int i3 = aw2Var.y0;
        a aVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                aVar.l.add(f31Var.V.d.h);
                this.b.V.d.h.k.add(aVar);
                aVar.f = i;
            } else if (i2 != -1) {
                aVar.l.add(f31Var.V.d.i);
                this.b.V.d.i.k.add(aVar);
                aVar.f = -i2;
            } else {
                aVar.b = true;
                aVar.l.add(f31Var.V.d.i);
                this.b.V.d.i.k.add(aVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            aVar.l.add(f31Var.V.e.h);
            this.b.V.e.h.k.add(aVar);
            aVar.f = i;
        } else if (i2 != -1) {
            aVar.l.add(f31Var.V.e.i);
            this.b.V.e.i.k.add(aVar);
            aVar.f = -i2;
        } else {
            aVar.b = true;
            aVar.l.add(f31Var.V.e.i);
            this.b.V.e.i.k.add(aVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void e() {
        f31 f31Var = this.b;
        int i = ((aw2) f31Var).y0;
        a aVar = this.h;
        if (i == 1) {
            f31Var.a0 = aVar.g;
        } else {
            f31Var.b0 = aVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void f() {
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final boolean k() {
        return false;
    }

    public final void m(a aVar) {
        a aVar2 = this.h;
        aVar2.k.add(aVar);
        aVar.l.add(aVar2);
    }
}
