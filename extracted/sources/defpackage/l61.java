package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l61 extends p61 {
    public final int e;
    public final boolean f;

    public l61(int i, boolean z) {
        super(z ? i : 0, z ? 0 : i, z ? 0 : i, z ? i : 0);
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l61)) {
            return false;
        }
        l61 l61Var = (l61) obj;
        return this.e == l61Var.e && this.f == l61Var.f;
    }

    public final int hashCode() {
        return (this.e * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "End(radius=" + this.e + ", isRtl=" + this.f + ")";
    }
}
