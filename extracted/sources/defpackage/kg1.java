package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kg1 implements as5 {
    public final zr5 a;
    public final long b;
    public final long c;
    public final q68 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public kg1(q68 q68Var, long j, long j2, long j3, long j4, boolean z) {
        vy2.j(j >= 0 && j2 > j);
        this.d = q68Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new zr5();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    @Override // defpackage.as5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(defpackage.w72 r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg1.d(w72):long");
    }

    @Override // defpackage.as5
    public final kl7 m() {
        if (this.f != 0) {
            return new jg1(this);
        }
        return null;
    }

    @Override // defpackage.as5
    public final void t(long j) {
        this.h = j29.j(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
