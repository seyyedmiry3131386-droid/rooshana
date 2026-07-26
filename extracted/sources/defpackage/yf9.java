package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class yf9 {
    public final uf0 a;
    public final float b;

    public yf9(uf0 uf0Var, float f) {
        this.a = uf0Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yf9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        yf9 yf9Var = (yf9) obj;
        return js3.i(this.a, yf9Var.a) && this.b == yf9Var.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return t61.k(sb, this.b, ')');
    }

    public yf9(Rect rect, float f) {
        this.a = new uf0(rect);
        this.b = f;
    }
}
