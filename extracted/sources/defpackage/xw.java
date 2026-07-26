package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xw {
    public final hi3 a;
    public final pi3 b;
    public final ww c;

    public xw(hi3 hi3Var, pi3 pi3Var, ww wwVar) {
        this.a = hi3Var;
        this.b = pi3Var;
        this.c = wwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        if (!js3.i(this.a, xwVar.a)) {
            return false;
        }
        ww wwVar = xwVar.c;
        ww wwVar2 = this.c;
        return js3.i(wwVar2, wwVar) && wwVar2.a(this.b, xwVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ww wwVar = this.c;
        return wwVar.b(this.b) + ((wwVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
