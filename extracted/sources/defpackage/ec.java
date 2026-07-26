package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ec extends mx4 {
    public final iz b;

    public ec(iz izVar) {
        this.b = izVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ec) {
            return this.b == ((ec) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        fc fcVar = new fc();
        fcVar.q = this.b;
        n nVar = new n(5, fcVar);
        dc dcVar = new dc();
        dcVar.o = nVar;
        fcVar.C0(dcVar);
        return fcVar;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((fc) gx4Var).q = this.b;
    }
}
