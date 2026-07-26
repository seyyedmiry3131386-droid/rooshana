package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gs8 extends mx4 {
    public final g34 b;

    public gs8(g34 g34Var) {
        this.b = g34Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs8) && js3.i(this.b, ((gs8) obj).b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        hs8 hs8Var = new hs8();
        hs8Var.o = this.b;
        return hs8Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((hs8) gx4Var).o = this.b;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ')';
    }
}
