package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xq4 b;
    public final /* synthetic */ hq4 c;

    public /* synthetic */ k11(xq4 xq4Var, hq4 hq4Var, int i) {
        this.a = i;
        this.b = xq4Var;
        this.c = hq4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xq4 xq4Var = this.b;
                if (!xq4Var.j()) {
                    if (xq4Var.A) {
                        hq4 hq4Var = this.c;
                        if (!xq4.k(hq4Var)) {
                            if (xq4Var.i(hq4Var)) {
                                xq4Var.A = false;
                            }
                        }
                    }
                    xq4Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.r0(this.c, Integer.MIN_VALUE, 7, is4.t0(new sr4(5)));
                break;
            case 2:
                this.b.g.r0(this.c, Integer.MIN_VALUE, 12, is4.t0(new sr4(8)));
                break;
            case 3:
                this.b.g.r0(this.c, Integer.MIN_VALUE, 11, is4.t0(new sr4(4)));
                break;
            case 4:
                this.b.g.r0(this.c, Integer.MIN_VALUE, 3, is4.t0(new sr4(15)));
                break;
            case 5:
                this.b.g.r0(this.c, Integer.MIN_VALUE, 1, is4.t0(new sr4(1)));
                break;
            case 6:
                is4 is4Var = this.b.g;
                is4Var.getClass();
                hq4 hq4Var2 = this.c;
                is4Var.r0(hq4Var2, Integer.MIN_VALUE, 1, is4.t0(new ur4(is4Var, hq4Var2, 2)));
                break;
            case 7:
                is4 is4Var2 = this.b.g;
                is4Var2.getClass();
                hq4 hq4Var3 = this.c;
                is4Var2.r0(hq4Var3, Integer.MIN_VALUE, 1, is4.t0(new ur4(is4Var2, hq4Var3, 2)));
                break;
            case 8:
                this.b.g.r0(this.c, Integer.MIN_VALUE, 1, is4.t0(new sr4(1)));
                break;
            default:
                this.b.g.r0(this.c, Integer.MIN_VALUE, 9, is4.t0(new sr4(9)));
                break;
        }
    }
}
