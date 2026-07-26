package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class to5 extends y97 {
    public final int s;
    public final ke3 t;
    public final int u;

    public to5(int i) {
        ke3 ke3Var = new ke3("NotValidLocation", -8, i, null, 120);
        this.s = i;
        this.t = ke3Var;
        this.u = 5;
    }

    @Override // defpackage.y97
    public final int C() {
        return this.u;
    }

    @Override // defpackage.jf3
    public final Integer a() {
        return this.t.g;
    }

    @Override // defpackage.jf3
    public final int b() {
        return this.t.f;
    }

    @Override // defpackage.jf3
    public final String c() {
        return this.t.d;
    }

    @Override // defpackage.y97
    public final l32 d0() {
        ke3 ke3Var = this.t;
        ke3Var.getClass();
        return dw1.c(ke3Var);
    }

    @Override // defpackage.jf3
    public final int e() {
        return this.t.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to5)) {
            return false;
        }
        to5 to5Var = (to5) obj;
        return this.s == to5Var.s && js3.i(this.t, to5Var.t) && this.u == to5Var.u;
    }

    public final int hashCode() {
        return ((this.t.hashCode() + (this.s * 31)) * 31) + this.u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotValidLocationError(httpStatusCode=");
        sb.append(this.s);
        sb.append(", errorData=");
        sb.append(this.t);
        sb.append(", errorWeight=");
        return dw1.k(this.u, ")", sb);
    }
}
