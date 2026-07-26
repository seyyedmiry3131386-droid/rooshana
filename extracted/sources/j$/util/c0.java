package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final c0 c = new c0();
    public final boolean a;
    public final double b;

    public c0() {
        this.a = false;
        this.b = Double.NaN;
    }

    public c0(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        boolean z = c0Var.a;
        boolean z2 = this.a;
        return (z2 && z) ? Double.compare(this.b, c0Var.b) == 0 : z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalDouble[" + this.b + "]";
        }
        return "OptionalDouble.empty";
    }
}
