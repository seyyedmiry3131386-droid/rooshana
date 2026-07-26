package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hj1 implements gz1 {
    public final int a;
    public final int b;

    public hj1(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        sn3.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.gz1
    public final void a(jg0 jg0Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = jg0Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(jg0Var.b((i5 - i4) + (-1))) && Character.isLowSurrogate(jg0Var.b(jg0Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = jg0Var.c;
            aj0 aj0Var = (aj0) jg0Var.f;
            if (i8 + i7 >= aj0Var.i()) {
                i6 = aj0Var.i() - jg0Var.c;
                break;
            } else {
                i6 = (Character.isHighSurrogate(jg0Var.b((jg0Var.c + i7) + (-1))) && Character.isLowSurrogate(jg0Var.b(jg0Var.c + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = jg0Var.c;
        jg0Var.a(i9, i6 + i9);
        int i10 = jg0Var.b;
        jg0Var.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj1)) {
            return false;
        }
        hj1 hj1Var = (hj1) obj;
        return this.a == hj1Var.a && this.b == hj1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return dw1.q(sb, this.b, ')');
    }
}
