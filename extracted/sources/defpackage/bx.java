package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bx {
    public final Object a;
    public final ww b;
    public final hi3 c;

    public bx(Object obj, ww wwVar, hi3 hi3Var) {
        this.a = obj;
        this.b = wwVar;
        this.c = hi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        ww wwVar = bxVar.b;
        ww wwVar2 = this.b;
        return js3.i(wwVar2, wwVar) && wwVar2.a(this.a, bxVar.a) && js3.i(this.c, bxVar.c);
    }

    public final int hashCode() {
        ww wwVar = this.b;
        return this.c.hashCode() + ((wwVar.b(this.a) + (wwVar.hashCode() * 31)) * 31);
    }
}
