package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class s70 {
    public final p70 c;
    public hh2 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public s70(List list) {
        p70 r70Var;
        if (list.isEmpty()) {
            r70Var = new cv(2);
        } else {
            r70Var = list.size() == 1 ? new r70(list) : new q70(list);
        }
        this.c = r70Var;
    }

    public final void a(o70 o70Var) {
        this.a.add(o70Var);
    }

    public float b() {
        if (this.h == -1.0f) {
            this.h = this.c.l();
        }
        return this.h;
    }

    public final float c() {
        Interpolator interpolator;
        uy3 uy3VarC = this.c.c();
        if (uy3VarC == null || uy3VarC.c() || (interpolator = uy3VarC.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        uy3 uy3VarC = this.c.c();
        if (uy3VarC.c()) {
            return 0.0f;
        }
        return (this.d - uy3VarC.b()) / (uy3VarC.a() - uy3VarC.b());
    }

    public Object e() {
        float fD = d();
        hh2 hh2Var = this.e;
        p70 p70Var = this.c;
        if (hh2Var == null && p70Var.a(fD) && !k()) {
            return this.f;
        }
        uy3 uy3VarC = p70Var.c();
        Interpolator interpolator = uy3VarC.e;
        Interpolator interpolator2 = uy3VarC.f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(uy3VarC, c()) : g(uy3VarC, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(uy3 uy3Var, float f);

    public Object g(uy3 uy3Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((o70) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        p70 p70Var = this.c;
        if (p70Var.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = p70Var.m();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = p70Var.m();
            }
            f = this.g;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (p70Var.h(f)) {
            h();
        }
    }

    public final void j(hh2 hh2Var) {
        hh2 hh2Var2 = this.e;
        if (hh2Var2 != null) {
            hh2Var2.getClass();
        }
        this.e = hh2Var;
    }

    public boolean k() {
        return false;
    }
}
