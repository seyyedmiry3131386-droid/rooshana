package androidx.constraintlayout.core.widgets.analyzer;

import defpackage.f31;
import defpackage.l50;
import defpackage.wj1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {
    @Override // defpackage.wj1
    public final void a(wj1 wj1Var) {
        l50 l50Var = (l50) this.b;
        int i = l50Var.w0;
        a aVar = this.h;
        Iterator it = aVar.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((a) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            aVar.d(i3 + l50Var.y0);
        } else {
            aVar.d(i2 + l50Var.y0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void d() {
        f31 f31Var = this.b;
        if (f31Var instanceof l50) {
            a aVar = this.h;
            aVar.b = true;
            ArrayList arrayList = aVar.l;
            l50 l50Var = (l50) f31Var;
            int i = l50Var.w0;
            boolean z = l50Var.x0;
            int i2 = 0;
            if (i == 0) {
                aVar.e = DependencyNode$Type.d;
                while (i2 < l50Var.v0) {
                    f31 f31Var2 = l50Var.u0[i2];
                    if (z || f31Var2.i0 != 8) {
                        a aVar2 = f31Var2.d.h;
                        aVar2.k.add(aVar);
                        arrayList.add(aVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                aVar.e = DependencyNode$Type.e;
                while (i2 < l50Var.v0) {
                    f31 f31Var3 = l50Var.u0[i2];
                    if (z || f31Var3.i0 != 8) {
                        a aVar3 = f31Var3.d.i;
                        aVar3.k.add(aVar);
                        arrayList.add(aVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                aVar.e = DependencyNode$Type.f;
                while (i2 < l50Var.v0) {
                    f31 f31Var4 = l50Var.u0[i2];
                    if (z || f31Var4.i0 != 8) {
                        a aVar4 = f31Var4.e.h;
                        aVar4.k.add(aVar);
                        arrayList.add(aVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            aVar.e = DependencyNode$Type.g;
            while (i2 < l50Var.v0) {
                f31 f31Var5 = l50Var.u0[i2];
                if (z || f31Var5.i0 != 8) {
                    a aVar5 = f31Var5.e.i;
                    aVar5.k.add(aVar);
                    arrayList.add(aVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void e() {
        f31 f31Var = this.b;
        if (f31Var instanceof l50) {
            int i = ((l50) f31Var).w0;
            a aVar = this.h;
            if (i == 0 || i == 1) {
                f31Var.a0 = aVar.g;
            } else {
                f31Var.b0 = aVar.g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void f() {
        this.c = null;
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
