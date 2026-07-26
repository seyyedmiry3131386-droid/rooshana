package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wg6 extends mx4 {
    public final jh b;

    public wg6(jh jhVar) {
        this.b = jhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg6) && this.b.equals(((wg6) obj).b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new xg6(this.b, null);
    }

    public final int hashCode() {
        return (this.b.b * 31) + 1237;
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        xg6 xg6Var = (xg6) gx4Var;
        jh jhVar = xg6Var.p;
        jh jhVar2 = this.b;
        if (js3.i(jhVar, jhVar2)) {
            return;
        }
        xg6Var.p = jhVar2;
        if (xg6Var.q) {
            xg6Var.E0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false)";
    }
}
