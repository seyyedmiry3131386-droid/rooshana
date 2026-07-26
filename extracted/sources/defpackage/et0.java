package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class et0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public et0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || et0.class != obj.getClass()) {
            return false;
        }
        et0 et0Var = (et0) obj;
        return zu0.c(this.a, et0Var.a) && zu0.c(this.b, et0Var.b) && zu0.c(this.c, et0Var.c) && zu0.c(this.d, et0Var.d) && zu0.c(this.e, et0Var.e) && zu0.c(this.f, et0Var.f) && zu0.c(this.g, et0Var.g) && zu0.c(this.h, et0Var.h);
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.h) + t61.d(t61.d(t61.d(t61.d(t61.d(t61.d(tw8.a(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableSurfaceColors(containerColor=");
        bl4.F(this.a, ", contentColor=", sb);
        bl4.F(this.b, ", focusedContainerColor=", sb);
        bl4.F(this.c, ", focusedContentColor=", sb);
        bl4.F(this.d, ", pressedContainerColor=", sb);
        bl4.F(this.e, ", pressedContentColor=", sb);
        bl4.F(this.f, ", disabledContainerColor=", sb);
        bl4.F(this.g, ", disabledContentColor=", sb);
        sb.append((Object) zu0.i(this.h));
        sb.append(')');
        return sb.toString();
    }
}
