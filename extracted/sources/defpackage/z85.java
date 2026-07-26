package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z85 implements mz1 {
    public String e;
    public cp8 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final h26 a = new h26(new byte[15], 2);
    public final ao0 b = new ao0();
    public final h26 c = new h26();
    public final a95 p = new a95();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0420  */
    @Override // defpackage.mz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.h26 r25) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z85.a(h26):void");
    }

    @Override // defpackage.mz1
    public final void c() {
        this.d = 0;
        this.l = 0;
        this.a.G(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        ft8Var.a();
        ft8Var.b();
        this.e = ft8Var.e;
        ft8Var.b();
        this.f = x72Var.o(ft8Var.d, 1);
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
    }
}
