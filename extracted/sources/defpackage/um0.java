package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class um0 {
    public qj1 a;
    public LayoutDirection b;
    public tm0 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um0)) {
            return false;
        }
        um0 um0Var = (um0) obj;
        return js3.i(this.a, um0Var.a) && this.b == um0Var.b && js3.i(this.c, um0Var.c) && ey7.b(this.d, um0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) ey7.g(this.d)) + ')';
    }
}
