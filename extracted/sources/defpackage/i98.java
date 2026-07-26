package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class i98 extends mx4 {
    public final bp2 b;

    public i98(bp2 bp2Var) {
        this.b = bp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i98) {
            return this.b == ((i98) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new k98(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((k98) gx4Var).q = this.b;
    }
}
