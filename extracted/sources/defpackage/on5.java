package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class on5 extends qn5 {
    public final b32 a;

    public on5(b32 b32Var) {
        js3.p(b32Var, "nextEpisode");
        this.a = b32Var;
    }

    @Override // defpackage.qn5
    public final b32 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on5) && js3.i(this.a, ((on5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Hidden(nextEpisode=" + this.a + ")";
    }
}
