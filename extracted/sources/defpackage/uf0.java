package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class uf0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new uf0(0, 0, 0, 0);
    }

    public uf0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException(dw1.j(i, i3, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(dw1.j(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uf0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        uf0 uf0Var = (uf0) obj;
        return this.a == uf0Var.a && this.b == uf0Var.b && this.c == uf0Var.c && this.d == uf0Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(uf0.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return dw1.k(this.d, "] }", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uf0(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        js3.p(rect, "rect");
    }
}
