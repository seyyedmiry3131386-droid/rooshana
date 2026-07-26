package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {
    public static final e0 c = new e0();
    public final boolean a;
    public final long b;

    public e0() {
        this.a = false;
        this.b = 0L;
    }

    public e0(long j) {
        this.a = true;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        boolean z = e0Var.a;
        boolean z2 = this.a;
        return (z2 && z) ? this.b == e0Var.b : z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalLong[" + this.b + "]";
        }
        return "OptionalLong.empty";
    }
}
