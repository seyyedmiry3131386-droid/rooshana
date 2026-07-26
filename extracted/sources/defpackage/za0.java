package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class za0 implements qd {
    public final float a;
    public final float b;

    public za0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.qd
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f = 1;
        float f2 = (this.a + f) * (((int) (j3 >> 32)) / 2.0f);
        return (((long) Math.round((f + this.b) * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f2)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        za0 za0Var = (za0) obj;
        return Float.compare(this.a, za0Var.a) == 0 && Float.compare(this.b, za0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return t61.k(sb, this.b, ')');
    }
}
