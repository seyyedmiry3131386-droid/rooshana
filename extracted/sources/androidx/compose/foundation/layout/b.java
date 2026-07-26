package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.o;
import defpackage.ab0;
import defpackage.bb0;
import defpackage.cb0;
import defpackage.eq;
import defpackage.fg8;
import defpackage.hx4;
import defpackage.js3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;

    static {
        Direction direction = Direction.b;
        a = new FillElement(direction, 1.0f);
        Direction direction2 = Direction.a;
        b = new FillElement(direction2, 1.0f);
        Direction direction3 = Direction.c;
        c = new FillElement(direction3, 1.0f);
        ab0 ab0Var = eq.p;
        int i2 = 1;
        d = new d(direction, new fg8(i2, ab0Var), ab0Var);
        ab0 ab0Var2 = eq.o;
        e = new d(direction, new fg8(i2, ab0Var2), ab0Var2);
        bb0 bb0Var = eq.m;
        int i3 = 2;
        f = new d(direction2, new fg8(i3, bb0Var), bb0Var);
        bb0 bb0Var2 = eq.l;
        g = new d(direction2, new fg8(i3, bb0Var2), bb0Var2);
        cb0 cb0Var = eq.g;
        int i4 = 3;
        h = new d(direction3, new fg8(i4, cb0Var), cb0Var);
        cb0 cb0Var2 = eq.c;
        i = new d(direction3, new fg8(i4, cb0Var2), cb0Var2);
    }

    public static final hx4 a(hx4 hx4Var, float f2, float f3) {
        return hx4Var.d(new c(f2, f3));
    }

    public static /* synthetic */ hx4 b(hx4 hx4Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(hx4Var, f2, f3);
    }

    public static final hx4 c(hx4 hx4Var, float f2) {
        return hx4Var.d(f2 == 1.0f ? a : new FillElement(Direction.b, f2));
    }

    public static final hx4 d(hx4 hx4Var, float f2) {
        return hx4Var.d(new a(0.0f, f2, 0.0f, f2, true, o.a, 5));
    }

    public static final hx4 e(hx4 hx4Var, float f2, float f3) {
        return hx4Var.d(new a(0.0f, f2, 0.0f, f3, true, o.a, 5));
    }

    public static hx4 f(float f2) {
        return new a(0.0f, Float.NaN, 0.0f, f2, false, o.a, 5);
    }

    public static final hx4 g(hx4 hx4Var, float f2) {
        return hx4Var.d(new a(f2, f2, f2, f2, false, o.a));
    }

    public static hx4 h(hx4 hx4Var, float f2, float f3, float f4, float f5, int i2) {
        return hx4Var.d(new a(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false, o.a));
    }

    public static final hx4 i(hx4 hx4Var, float f2) {
        return hx4Var.d(new a(f2, f2, f2, f2, true, o.a));
    }

    public static final hx4 j(hx4 hx4Var, float f2, float f3) {
        return hx4Var.d(new a(f2, f3, f2, f3, true, o.a));
    }

    public static final hx4 k(hx4 hx4Var, float f2, float f3, float f4, float f5) {
        return hx4Var.d(new a(f2, f3, f4, f5, true, o.a));
    }

    public static final hx4 l(hx4 hx4Var, float f2) {
        return hx4Var.d(new a(f2, 0.0f, f2, 0.0f, true, o.a, 10));
    }

    public static hx4 m(hx4 hx4Var, float f2) {
        return hx4Var.d(new a(Float.NaN, 0.0f, f2, 0.0f, true, o.a, 10));
    }

    public static hx4 n(hx4 hx4Var) {
        bb0 bb0Var = eq.m;
        return hx4Var.d(js3.i(bb0Var, bb0Var) ? f : js3.i(bb0Var, eq.l) ? g : new d(Direction.a, new fg8(2, bb0Var), bb0Var));
    }

    public static hx4 o(hx4 hx4Var, cb0 cb0Var, int i2) {
        cb0 cb0Var2 = eq.g;
        if ((i2 & 1) != 0) {
            cb0Var = cb0Var2;
        }
        return hx4Var.d(cb0Var.equals(cb0Var2) ? h : cb0Var.equals(eq.c) ? i : new d(Direction.c, new fg8(3, cb0Var), cb0Var));
    }

    public static hx4 p() {
        ab0 ab0Var = eq.p;
        return js3.i(ab0Var, ab0Var) ? d : js3.i(ab0Var, eq.o) ? e : new d(Direction.b, new fg8(1, ab0Var), ab0Var);
    }
}
