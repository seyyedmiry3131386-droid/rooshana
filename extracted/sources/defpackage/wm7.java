package defpackage;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: loaded from: classes.dex */
public final class wm7 {
    public final ResolvedTextDirection a;
    public final int b;
    public final long c;

    public wm7(ResolvedTextDirection resolvedTextDirection, int i, long j) {
        this.a = resolvedTextDirection;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm7)) {
            return false;
        }
        wm7 wm7Var = (wm7) obj;
        return this.a == wm7Var.a && this.b == wm7Var.b && this.c == wm7Var.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
