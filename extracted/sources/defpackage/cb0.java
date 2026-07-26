package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class cb0 implements qd {
    public final float a;
    public final float b;

    public cb0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.qd
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.a;
        float f3 = this.a;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        return (((long) Math.round((f4 + this.b) * f2)) & 4294967295L) | (((long) Math.round(f5)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb0)) {
            return false;
        }
        cb0 cb0Var = (cb0) obj;
        return Float.compare(this.a, cb0Var.a) == 0 && Float.compare(this.b, cb0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return t61.k(sb, this.b, ')');
    }
}
