package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w39 extends u39 {
    public final String a;
    public final List b;
    public final int c;
    public final ch0 d;
    public final float e;
    public final ch0 f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public w39(String str, List list, int i, ch0 ch0Var, float f, ch0 ch0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = ch0Var;
        this.e = f;
        this.f = ch0Var2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w39.class == obj.getClass()) {
            w39 w39Var = (w39) obj;
            return js3.i(this.a, w39Var.a) && js3.i(this.d, w39Var.d) && this.e == w39Var.e && js3.i(this.f, w39Var.f) && this.g == w39Var.g && this.h == w39Var.h && this.i == w39Var.i && this.j == w39Var.j && this.k == w39Var.k && this.l == w39Var.l && this.m == w39Var.m && this.n == w39Var.n && this.c == w39Var.c && js3.i(this.b, w39Var.b);
        }
        return false;
    }

    public final int hashCode() {
        int i = rm7.i(this.a.hashCode() * 31, 31, this.b);
        ch0 ch0Var = this.d;
        int iG = dw1.g(this.e, (i + (ch0Var != null ? ch0Var.hashCode() : 0)) * 31, 31);
        ch0 ch0Var2 = this.f;
        return dw1.g(this.n, dw1.g(this.m, dw1.g(this.l, dw1.g(this.k, (((dw1.g(this.h, dw1.g(this.g, (iG + (ch0Var2 != null ? ch0Var2.hashCode() : 0)) * 31, 31), 31) + this.i) * 31) + this.j) * 31, 31), 31), 31), 31) + this.c;
    }
}
