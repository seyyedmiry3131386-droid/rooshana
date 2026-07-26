package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 implements pd {
    public final float a;

    public ya0(float f) {
        this.a = f;
    }

    @Override // defpackage.pd
    public final int a(int i, int i2, LayoutDirection layoutDirection) {
        return Math.round((1 + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya0) && Float.compare(this.a, ((ya0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return t61.k(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
