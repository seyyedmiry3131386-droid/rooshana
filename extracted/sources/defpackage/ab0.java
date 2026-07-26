package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ab0 implements pd {
    public final float a;

    public ab0(float f) {
        this.a = f;
    }

    @Override // defpackage.pd
    public final int a(int i, int i2, LayoutDirection layoutDirection) {
        float f = (i2 - i) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.a;
        float f2 = this.a;
        if (layoutDirection != layoutDirection2) {
            f2 *= -1;
        }
        return Math.round((1 + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab0) && Float.compare(this.a, ((ab0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return t61.k(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
