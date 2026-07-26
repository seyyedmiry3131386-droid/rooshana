package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dq4 {
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;

    public dq4(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq4)) {
            return false;
        }
        dq4 dq4Var = (dq4) obj;
        return js3.i(this.a, dq4Var.a) && this.b == dq4Var.b && this.c == dq4Var.c && this.d == dq4Var.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "MediaPlaybackState(playId=" + this.a + ", isPlaying=" + this.b + ", currentPosition=" + this.c + ", duration=" + this.d + ")";
    }
}
