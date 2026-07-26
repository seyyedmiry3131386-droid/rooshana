package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    public static final d0 c = new d0();
    public final boolean a;
    public final int b;

    public d0() {
        this.a = false;
        this.b = 0;
    }

    public d0(int i) {
        this.a = true;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        boolean z = d0Var.a;
        boolean z2 = this.a;
        return (z2 && z) ? this.b == d0Var.b : z2 == z;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalInt[" + this.b + "]";
        }
        return "OptionalInt.empty";
    }
}
