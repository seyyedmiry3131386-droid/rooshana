package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ur7 {
    public static final ur7 d = new ur7();
    public final long a;
    public final long b;
    public final float c;

    public ur7(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur7)) {
            return false;
        }
        ur7 ur7Var = (ur7) obj;
        return zu0.c(this.a, ur7Var.a) && nr5.c(this.b, ur7Var.b) && this.c == ur7Var.c;
    }

    public final int hashCode() {
        int i = zu0.i;
        return Float.floatToIntBits(this.c) + ((nr5.e(this.b) + (tw8.a(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        bl4.F(this.a, ", offset=", sb);
        sb.append((Object) nr5.i(this.b));
        sb.append(", blurRadius=");
        return t61.k(sb, this.c, ')');
    }

    public /* synthetic */ ur7() {
        this(gu9.f(4278190080L), 0L, 0.0f);
    }
}
