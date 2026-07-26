package defpackage;

import androidx.compose.animation.core.a;

/* JADX INFO: loaded from: classes.dex */
public final class gy7 {
    public final a a;
    public long b;

    public gy7(a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy7)) {
            return false;
        }
        gy7 gy7Var = (gy7) obj;
        return this.a.equals(gy7Var.a) && zq3.b(this.b, gy7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) zq3.c(this.b)) + ')';
    }
}
