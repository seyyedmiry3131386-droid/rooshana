package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sf8 {
    public final ll a;
    public ll b;
    public boolean c = false;
    public s95 d = null;

    public sf8(ll llVar, ll llVar2) {
        this.a = llVar;
        this.b = llVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf8)) {
            return false;
        }
        sf8 sf8Var = (sf8) obj;
        return js3.i(this.a, sf8Var.a) && js3.i(this.b, sf8Var.b) && this.c == sf8Var.c && js3.i(this.d, sf8Var.d);
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31;
        s95 s95Var = this.d;
        return iHashCode + (s95Var == null ? 0 : s95Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
