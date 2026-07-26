package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hg4 implements uh6 {
    public final ig4 a;
    public int b;
    public Class c;

    public hg4(ig4 ig4Var) {
        this.a = ig4Var;
    }

    @Override // defpackage.uh6
    public final void a() {
        this.a.n(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hg4) {
            hg4 hg4Var = (hg4) obj;
            if (this.b == hg4Var.b && this.c == hg4Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
