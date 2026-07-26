package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y49 {
    public final List a;
    public final int b;
    public final int c;
    public final boolean d;

    public y49(int i, int i2, List list, boolean z) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y49)) {
            return false;
        }
        y49 y49Var = (y49) obj;
        return js3.i(this.a, y49Var.a) && this.b == y49Var.b && this.c == y49Var.c && this.d == y49Var.d;
    }

    public final int hashCode() {
        List list = this.a;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "VideoConfigData(preferredMimeTypes=" + this.a + ", minHeight=" + this.b + ", minBitrate=" + this.c + ", downgradeQuality=" + this.d + ")";
    }
}
