package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hw2 implements mz1 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final cm7 a;
    public final h26 b;
    public final boolean[] c = new boolean[4];
    public final fw2 d;
    public final k62 e;
    public gw2 f;
    public long g;
    public String h;
    public cp8 i;
    public boolean j;
    public long k;

    public hw2(cm7 cm7Var) {
        this.a = cm7Var;
        fw2 fw2Var = new fw2();
        fw2Var.e = new byte[128];
        this.d = fw2Var;
        this.k = -9223372036854775807L;
        this.e = new k62(178);
        this.b = new h26();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    @Override // defpackage.mz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.h26 r20) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw2.a(h26):void");
    }

    @Override // defpackage.mz1
    public final void c() {
        s7.g(this.c);
        fw2 fw2Var = this.d;
        fw2Var.a = false;
        fw2Var.c = 0;
        fw2Var.b = 0;
        gw2 gw2Var = this.f;
        if (gw2Var != null) {
            gw2Var.b = false;
            gw2Var.c = false;
            gw2Var.d = false;
            gw2Var.e = -1;
        }
        k62 k62Var = this.e;
        if (k62Var != null) {
            k62Var.d();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
        vy2.t(this.f);
        if (z) {
            this.f.b(0, this.g, this.j);
            gw2 gw2Var = this.f;
            gw2Var.b = false;
            gw2Var.c = false;
            gw2Var.d = false;
            gw2Var.e = -1;
        }
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        ft8Var.a();
        ft8Var.b();
        this.h = ft8Var.e;
        ft8Var.b();
        cp8 cp8VarO = x72Var.o(ft8Var.d, 2);
        this.i = cp8VarO;
        this.f = new gw2(cp8VarO);
        this.a.b(x72Var, ft8Var);
    }
}
