package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i37 extends o27 {
    public final o27 b;
    public final int c;

    public i37(o27 o27Var, int i) {
        this.b = o27Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i37)) {
            return false;
        }
        i37 i37Var = (i37) obj;
        return js3.i(i37Var.b, this.b) && i37Var.c == this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.c * 31);
    }
}
