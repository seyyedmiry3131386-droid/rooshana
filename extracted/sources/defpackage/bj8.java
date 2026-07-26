package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj8 {
    public final long a;
    public final long b;

    public bj8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj8)) {
            return false;
        }
        bj8 bj8Var = (bj8) obj;
        return zu0.c(this.a, bj8Var.a) && zu0.c(this.b, bj8Var.b);
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.b) + (tw8.a(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        bl4.F(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) zu0.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
