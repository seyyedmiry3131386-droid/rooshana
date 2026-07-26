package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g26 extends mx4 {
    public final vt b;

    public g26(vt vtVar) {
        this.b = vtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g26) {
            return this.b == ((g26) obj).b;
        }
        return false;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        f26 f26Var = new f26();
        f26Var.o = this.b;
        return f26Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        f26 f26Var = (f26) gx4Var;
        f26Var.o = this.b;
        t17.f(f26Var);
    }
}
