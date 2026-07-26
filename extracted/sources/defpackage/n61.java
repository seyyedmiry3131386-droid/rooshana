package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n61 extends p61 {
    public final int e;
    public final boolean f;

    public n61(int i, boolean z) {
        super(z ? 0 : i, z ? i : 0, z ? i : 0, z ? 0 : i);
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n61)) {
            return false;
        }
        n61 n61Var = (n61) obj;
        return this.e == n61Var.e && this.f == n61Var.f;
    }

    public final int hashCode() {
        return (this.e * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "Start(radius=" + this.e + ", isRtl=" + this.f + ")";
    }
}
