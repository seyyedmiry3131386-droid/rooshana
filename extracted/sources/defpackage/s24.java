package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class s24 extends mx4 {
    public final v24 b;

    public s24(v24 v24Var) {
        this.b = v24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s24) && js3.i(this.b, ((s24) obj).b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        t24 t24Var = new t24();
        t24Var.o = this.b;
        return t24Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        t24 t24Var = (t24) gx4Var;
        v24 v24Var = t24Var.o;
        v24 v24Var2 = this.b;
        if (js3.i(v24Var, v24Var2) || !t24Var.a.n) {
            return;
        }
        v24 v24Var3 = t24Var.o;
        v24Var3.d();
        v24Var3.b = null;
        t24Var.o = v24Var2;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.b + ')';
    }
}
