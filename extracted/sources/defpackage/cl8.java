package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cl8 {
    public final ya5 a;
    public bl8 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public cl8() {
        ya5 ya5Var = qq3.a;
        this.a = new ya5();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(bl8 bl8Var, long j, long j2, float[] fArr, long j3) {
        long j4 = bl8Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            bl8Var.g = j3;
            bl8Var.a(bl8Var.e, bl8Var.f, j, j2, fArr);
        }
    }
}
