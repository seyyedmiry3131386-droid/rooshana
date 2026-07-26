package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p16 implements hl {
    public final int a;
    public final int b;
    public final long c;
    public final di8 d;
    public final w96 e;
    public final z64 f;
    public final int g;
    public final int h;
    public final xi8 i;

    public p16(int i, int i2, long j, di8 di8Var, w96 w96Var, z64 z64Var, int i3, int i4, xi8 xi8Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = di8Var;
        this.e = w96Var;
        this.f = z64Var;
        this.g = i3;
        this.h = i4;
        this.i = xi8Var;
        if (jj8.a(j, jj8.c) || jj8.c(j) >= 0.0f) {
            return;
        }
        sn3.b("lineHeight can't be negative (" + jj8.c(j) + ')');
    }

    public final p16 a(p16 p16Var) {
        return p16Var == null ? this : q16.a(this, p16Var.a, p16Var.b, p16Var.c, p16Var.d, p16Var.e, p16Var.f, p16Var.g, p16Var.h, p16Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p16)) {
            return false;
        }
        p16 p16Var = (p16) obj;
        return this.a == p16Var.a && this.b == p16Var.b && jj8.a(this.c, p16Var.c) && js3.i(this.d, p16Var.d) && js3.i(this.e, p16Var.e) && js3.i(this.f, p16Var.f) && this.g == p16Var.g && this.h == p16Var.h && js3.i(this.i, p16Var.i);
    }

    public final int hashCode() {
        int iD = (jj8.d(this.c) + (((this.a * 31) + this.b) * 31)) * 31;
        di8 di8Var = this.d;
        int iHashCode = (iD + (di8Var != null ? di8Var.hashCode() : 0)) * 31;
        w96 w96Var = this.e;
        int iHashCode2 = (iHashCode + (w96Var != null ? w96Var.hashCode() : 0)) * 31;
        z64 z64Var = this.f;
        int iHashCode3 = (((((iHashCode2 + (z64Var != null ? z64Var.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        xi8 xi8Var = this.i;
        return iHashCode3 + (xi8Var != null ? xi8Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) of8.a(this.a)) + ", textDirection=" + ((Object) ug8.a(this.b)) + ", lineHeight=" + ((Object) jj8.e(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) u64.a(this.g)) + ", hyphens=" + ((Object) af3.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
