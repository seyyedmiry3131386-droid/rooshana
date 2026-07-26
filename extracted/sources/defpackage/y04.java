package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class y04 extends mx4 {
    public final rp2 b;

    public y04(rp2 rp2Var) {
        this.b = rp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y04) {
            return this.b == ((y04) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        e14 e14Var = new e14();
        e14Var.o = this.b;
        return e14Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((e14) gx4Var).o = this.b;
    }
}
