package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yl6 {
    public static final yl6 c = new yl6(0.0f, new gu0(0.0f));
    public final float a;
    public final gu0 b;

    public yl6(float f, gu0 gu0Var) {
        this.a = f;
        this.b = gu0Var;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl6)) {
            return false;
        }
        yl6 yl6Var = (yl6) obj;
        return this.a == yl6Var.a && this.b.equals(yl6Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.floatToIntBits(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
