package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xm5 {
    public final String a;
    public final String b;
    public final rm5 c;
    public final a82 d;

    public xm5(String str, String str2, rm5 rm5Var, a82 a82Var) {
        this.a = str;
        this.b = str2;
        this.c = rm5Var;
        this.d = a82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm5)) {
            return false;
        }
        xm5 xm5Var = (xm5) obj;
        return js3.i(this.a, xm5Var.a) && js3.i(this.b, xm5Var.b) && js3.i(this.c, xm5Var.c) && js3.i(this.d, xm5Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31)) * 961);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.a + ", method=" + this.b + ", headers=" + this.c + ", body=null, extras=" + this.d + ')';
    }
}
