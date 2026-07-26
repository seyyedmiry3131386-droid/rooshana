package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pn5 extends qn5 {
    public final b32 a;
    public final boolean b;

    public pn5(b32 b32Var, boolean z) {
        js3.p(b32Var, "nextEpisode");
        this.a = b32Var;
        this.b = z;
    }

    @Override // defpackage.qn5
    public final b32 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn5)) {
            return false;
        }
        pn5 pn5Var = (pn5) obj;
        return js3.i(this.a, pn5Var.a) && this.b == pn5Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "Visible(nextEpisode=" + this.a + ", isLoading=" + this.b + ")";
    }
}
