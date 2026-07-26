package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lq7 implements gz1 {
    public final int a;
    public final int b;

    public lq7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gz1
    public final void a(jg0 jg0Var) {
        int iT = ok4.t(this.a, 0, ((aj0) jg0Var.f).i());
        int iT2 = ok4.t(this.b, 0, ((aj0) jg0Var.f).i());
        if (iT < iT2) {
            jg0Var.h(iT, iT2);
        } else {
            jg0Var.h(iT2, iT);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq7)) {
            return false;
        }
        lq7 lq7Var = (lq7) obj;
        return this.a == lq7Var.a && this.b == lq7Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return dw1.q(sb, this.b, ')');
    }
}
