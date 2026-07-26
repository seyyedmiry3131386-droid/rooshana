package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx {
    public final p67 a;

    public qx(p67 p67Var) {
        this.a = p67Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx) && js3.i(this.a, ((qx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
