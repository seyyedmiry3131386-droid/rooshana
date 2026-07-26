package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vy6 {
    public static final long a = (((long) 1023) << 50) ^ (-1);
    public static final long b = (-1) ^ (((long) 33554431) << 25);
    public static final long c;

    static {
        long j = 33554431;
        c = j | (((long) Math.min(0, 1023)) << 50) | (j << 25);
    }
}
