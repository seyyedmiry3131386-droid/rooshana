package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xw0 implements gz1 {
    public final ll a;
    public final int b;

    public xw0(ll llVar, int i) {
        this.a = llVar;
        this.b = i;
    }

    @Override // defpackage.gz1
    public final void a(jg0 jg0Var) {
        int i = jg0Var.d;
        ll llVar = this.a;
        if (i != -1) {
            jg0Var.f(llVar.b, i, jg0Var.e);
        } else {
            jg0Var.f(llVar.b, jg0Var.b, jg0Var.c);
        }
        int i2 = jg0Var.b;
        int i3 = jg0Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iT = ok4.t(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - llVar.b.length(), 0, ((aj0) jg0Var.f).i());
        jg0Var.h(iT, iT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw0)) {
            return false;
        }
        xw0 xw0Var = (xw0) obj;
        return js3.i(this.a.b, xw0Var.a.b) && this.b == xw0Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return dw1.q(sb, this.b, ')');
    }

    public xw0(String str, int i) {
        this(new ll(str), i);
    }
}
