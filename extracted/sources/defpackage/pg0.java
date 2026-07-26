package defpackage;

import androidx.compose.ui.platform.o;

/* JADX INFO: loaded from: classes.dex */
public final class pg0 implements mg0 {
    public final qj1 a;
    public final long b;

    public pg0(w98 w98Var, long j) {
        this.a = w98Var;
        this.b = j;
    }

    @Override // defpackage.mg0
    public final hx4 a(hx4 hx4Var, qd qdVar) {
        return hx4Var.d(new yf0(qdVar, false, o.a));
    }

    public final float b() {
        long j = this.b;
        if (!h31.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.J(h31.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg0)) {
            return false;
        }
        pg0 pg0Var = (pg0) obj;
        return js3.i(this.a, pg0Var.a) && h31.b(this.b, pg0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) h31.l(this.b)) + ')';
    }
}
