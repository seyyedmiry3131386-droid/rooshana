package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class wy5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public wy5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            pn3.a("Padding must be non-negative");
        }
    }

    public final float a(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.a ? this.a : this.c;
    }

    public final float b(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.a ? this.c : this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wy5)) {
            return false;
        }
        wy5 wy5Var = (wy5) obj;
        return au1.b(this.a, wy5Var.a) && au1.b(this.b, wy5Var.b) && au1.b(this.c, wy5Var.c) && au1.b(this.d, wy5Var.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + dw1.g(this.c, dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) au1.c(this.a)) + ", top=" + ((Object) au1.c(this.b)) + ", end=" + ((Object) au1.c(this.c)) + ", bottom=" + ((Object) au1.c(this.d)) + ')';
    }
}
