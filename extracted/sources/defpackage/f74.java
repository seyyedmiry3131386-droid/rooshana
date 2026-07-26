package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f74 implements ki2 {
    public final float a;

    public f74(float f) {
        this.a = f;
    }

    @Override // defpackage.ki2
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.ki2
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f74) && Float.compare(this.a, ((f74) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return t61.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
