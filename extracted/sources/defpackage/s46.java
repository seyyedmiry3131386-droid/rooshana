package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s46 implements s61 {
    public final float a;

    public s46(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            un3.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.s61
    public final float a(long j, qj1 qj1Var) {
        return (this.a / 100.0f) * ey7.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s46) && Float.compare(this.a, ((s46) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
