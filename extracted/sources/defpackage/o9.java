package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o9 implements s9 {
    public final qz4 a;
    public final String b;
    public final int c;

    public o9(qz4 qz4Var, String str, int i) {
        js3.p(str, "moviePosterUrl");
        this.a = qz4Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return js3.i(this.a, o9Var.a) && js3.i(this.b, o9Var.b) && this.c == o9Var.c;
    }

    public final int hashCode() {
        return rm7.k(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdContentScreen(movieAd=");
        sb.append(this.a);
        sb.append(", moviePosterUrl=");
        sb.append(this.b);
        sb.append(", adSequenceSize=");
        return dw1.k(this.c, ")", sb);
    }
}
