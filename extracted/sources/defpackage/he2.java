package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class he2 extends vy3 {
    @Override // defpackage.s70
    public final Object f(uy3 uy3Var, float f) {
        return Float.valueOf(m(uy3Var, f));
    }

    public final float l() {
        return m(this.c.c(), c());
    }

    public final float m(uy3 uy3Var, float f) {
        float f2;
        Object obj = uy3Var.b;
        Object obj2 = uy3Var.b;
        if (obj == null || uy3Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hh2 hh2Var = this.e;
        if (hh2Var != null) {
            f2 = f;
            Float f3 = (Float) hh2Var.C(uy3Var.g, uy3Var.h.floatValue(), (Float) obj2, (Float) uy3Var.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        if (uy3Var.i == -3987645.8f) {
            uy3Var.i = ((Float) obj2).floatValue();
        }
        float f4 = uy3Var.i;
        if (uy3Var.j == -3987645.8f) {
            uy3Var.j = ((Float) uy3Var.c).floatValue();
        }
        return aw4.f(f4, uy3Var.j, f2);
    }
}
