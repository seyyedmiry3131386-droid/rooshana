package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zl6 {
    public final long a;
    public final float b;
    public final long c;
    public final String d;

    public zl6(long j, float f, long j2, String str) {
        js3.p(str, "playId");
        this.a = j;
        this.b = f;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl6)) {
            return false;
        }
        zl6 zl6Var = (zl6) obj;
        return this.a == zl6Var.a && Float.compare(this.b, zl6Var.b) == 0 && this.c == zl6Var.c && js3.i(this.d, zl6Var.d);
    }

    public final int hashCode() {
        long j = this.a;
        int iG = dw1.g(this.b, ((int) (j ^ (j >>> 32))) * 31, 31);
        long j2 = this.c;
        return this.d.hashCode() + ((iG + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarTimeState(currentPlaybackPosition=");
        sb.append(this.a);
        sb.append(", bufferedPercent=");
        sb.append(this.b);
        sb.append(", totalDurationTime=");
        sb.append(this.c);
        sb.append(", playId=");
        return dw1.s(sb, this.d, ")");
    }
}
