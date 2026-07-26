package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xt2 {
    public static final xt2 c = new xt2(0, zu0.g);
    public final long a;
    public final float b;

    public xt2(float f, long j) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xt2.class != obj.getClass()) {
            return false;
        }
        xt2 xt2Var = (xt2) obj;
        return zu0.c(this.a, xt2Var.a) && au1.b(this.b, xt2Var.b);
    }

    public final int hashCode() {
        int i = zu0.i;
        return Float.floatToIntBits(this.b) + (tw8.a(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Glow(elevationColor=");
        bl4.F(this.a, ", elevation=", sb);
        sb.append((Object) au1.c(this.b));
        sb.append(')');
        return sb.toString();
    }
}
