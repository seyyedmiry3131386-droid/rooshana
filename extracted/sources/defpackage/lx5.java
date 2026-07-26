package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lx5 {
    public final long a;
    public final wy5 b;

    public lx5() {
        long jF = gu9.f(4284900966L);
        wy5 wy5VarD = yh0.d(0.0f, 0.0f, 3);
        this.a = jF;
        this.b = wy5VarD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lx5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        lx5 lx5Var = (lx5) obj;
        return zu0.c(this.a, lx5Var.a) && js3.i(this.b, lx5Var.b);
    }

    public final int hashCode() {
        int i = zu0.i;
        return this.b.hashCode() + (tw8.a(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        bl4.F(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
