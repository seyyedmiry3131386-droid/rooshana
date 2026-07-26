package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iq7 implements gz1 {
    public final int a;
    public final int b;

    public iq7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gz1
    public final void a(jg0 jg0Var) {
        boolean z = jg0Var.d != -1;
        aj0 aj0Var = (aj0) jg0Var.f;
        if (z) {
            jg0Var.d = -1;
            jg0Var.e = -1;
        }
        int iT = ok4.t(this.a, 0, aj0Var.i());
        int iT2 = ok4.t(this.b, 0, aj0Var.i());
        if (iT != iT2) {
            if (iT < iT2) {
                jg0Var.g(iT, iT2);
            } else {
                jg0Var.g(iT2, iT);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq7)) {
            return false;
        }
        iq7 iq7Var = (iq7) obj;
        return this.a == iq7Var.a && this.b == iq7Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return dw1.q(sb, this.b, ')');
    }
}
