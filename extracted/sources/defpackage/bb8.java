package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bb8 {
    public static final bb8 c = new bb8(-9223372036854775807L, false);
    public boolean a;
    public long b;

    public bb8(long j, boolean z) {
        this.b = j;
        this.a = z;
    }

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
