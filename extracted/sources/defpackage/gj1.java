package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gj1 implements gz1 {
    public final int a;
    public final int b;

    public gj1(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        sn3.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.gz1
    public final void a(jg0 jg0Var) {
        int i = jg0Var.c;
        aj0 aj0Var = (aj0) jg0Var.f;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = aj0Var.i();
        }
        jg0Var.a(jg0Var.c, Math.min(i3, aj0Var.i()));
        int i4 = jg0Var.b;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        jg0Var.a(Math.max(0, i6), jg0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj1)) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        return this.a == gj1Var.a && this.b == gj1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return dw1.q(sb, this.b, ')');
    }
}
