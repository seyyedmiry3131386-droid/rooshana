package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uj1 implements qj1 {
    public final float a;
    public final float b;
    public final ki2 c;

    public uj1(float f, float f2, ki2 ki2Var) {
        this.a = f;
        this.b = f2;
        this.c = ki2Var;
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return w07.h(this.c.a(L(f)), 4294967296L);
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return i / getDensity();
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / getDensity();
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.b;
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj1)) {
            return false;
        }
        uj1 uj1Var = (uj1) obj;
        return Float.compare(this.a, uj1Var.a) == 0 && Float.compare(this.b, uj1Var.b) == 0 && js3.i(this.c, uj1Var.c);
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    @Override // defpackage.qj1
    public final float s(long j) {
        if (kj8.a(jj8.b(j), 4294967296L)) {
            return this.c.b(jj8.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
