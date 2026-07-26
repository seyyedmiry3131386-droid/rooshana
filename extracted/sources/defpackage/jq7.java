package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jq7 implements gz1 {
    public final ll a;
    public final int b;

    public jq7(String str, int i) {
        this.a = new ll(str);
        this.b = i;
    }

    @Override // defpackage.gz1
    public final void a(jg0 jg0Var) {
        int i = jg0Var.d;
        ll llVar = this.a;
        if (i != -1) {
            int i2 = jg0Var.e;
            String str = llVar.b;
            String str2 = llVar.b;
            jg0Var.f(str, i, i2);
            if (str2.length() > 0) {
                jg0Var.g(i, str2.length() + i);
            }
        } else {
            int i3 = jg0Var.b;
            int i4 = jg0Var.c;
            String str3 = llVar.b;
            String str4 = llVar.b;
            jg0Var.f(str3, i3, i4);
            if (str4.length() > 0) {
                jg0Var.g(i3, str4.length() + i3);
            }
        }
        int i5 = jg0Var.b;
        int i6 = jg0Var.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iT = ok4.t(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - llVar.b.length(), 0, ((aj0) jg0Var.f).i());
        jg0Var.h(iT, iT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq7)) {
            return false;
        }
        jq7 jq7Var = (jq7) obj;
        return js3.i(this.a.b, jq7Var.a.b) && this.b == jq7Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return dw1.q(sb, this.b, ')');
    }
}
