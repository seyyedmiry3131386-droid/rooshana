package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class al extends dl {
    public float a;
    public float b;

    public al(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.dl
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.dl
    public final int b() {
        return 2;
    }

    @Override // defpackage.dl
    public final dl c() {
        return new al(0.0f, 0.0f);
    }

    @Override // defpackage.dl
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.dl
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return alVar.a == this.a && alVar.b == this.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
