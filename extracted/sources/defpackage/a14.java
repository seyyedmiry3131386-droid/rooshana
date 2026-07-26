package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class a14 extends mx4 {
    public final String b;

    public a14(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a14) && this.b.equals(((a14) obj).b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        b14 b14Var = new b14();
        b14Var.o = this.b;
        return b14Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((b14) gx4Var).o = this.b;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.b) + ')';
    }
}
