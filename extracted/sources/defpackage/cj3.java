package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj3 {
    public static final cj3 f = new cj3(0, true, 1, 1, wc4.c);
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final wc4 e;

    public cj3(int i, boolean z, int i2, int i3, wc4 wc4Var) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = i3;
        this.e = wc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj3)) {
            return false;
        }
        cj3 cj3Var = (cj3) obj;
        return this.a == cj3Var.a && this.b == cj3Var.b && this.c == cj3Var.c && this.d == cj3Var.d && js3.i(this.e, cj3Var.e);
    }

    public final int hashCode() {
        return this.e.a.hashCode() + ((((((((38347 + this.a) * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d) * 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=false, capitalization=" + ((Object) wq2.X(this.a)) + ", autoCorrect=" + this.b + ", keyboardType=" + ((Object) xq2.L(this.c)) + ", imeAction=" + ((Object) bj3.a(this.d)) + ", platformImeOptions=null, hintLocales=" + this.e + ')';
    }
}
