package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c68 extends qy4 {
    public final d68 a;
    public p38 b;
    public b68 c;

    public c68() {
        d68 d68Var = new d68();
        d68Var.k = false;
        this.a = d68Var;
        this.c = d68Var;
    }

    @Override // defpackage.qy4
    public final float a() {
        return this.c.b();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        d68 d68Var = this.a;
        this.c = d68Var;
        d68Var.l = f;
        boolean z = f > f2;
        d68Var.k = z;
        if (z) {
            d68Var.d(-f3, f - f2, f5, f6, f4);
        } else {
            d68Var.d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
