package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zk extends dl {
    public float a;

    public zk(float f) {
        this.a = f;
    }

    @Override // defpackage.dl
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.dl
    public final int b() {
        return 1;
    }

    @Override // defpackage.dl
    public final dl c() {
        return new zk(0.0f);
    }

    @Override // defpackage.dl
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.dl
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zk) && ((zk) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
