package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o94 {
    public final Object a;
    public final String b;

    public o94(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o94)) {
            return false;
        }
        o94 o94Var = (o94) obj;
        return this.a == o94Var.a && this.b.equals(o94Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
