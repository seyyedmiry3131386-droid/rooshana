package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yq4 implements gr4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hr4 b;

    public /* synthetic */ yq4(hr4 hr4Var, int i) {
        this.a = i;
        this.b = hr4Var;
    }

    @Override // defpackage.gr4
    public final void b(hq4 hq4Var) {
        switch (this.a) {
            case 0:
                this.b.g.t.Y();
                break;
            case 1:
                xq4 xq4Var = this.b.g;
                if (xq4Var.t.q0() != null) {
                    ol3 ol3Var = xq4Var.e;
                    xq4Var.t(hq4Var);
                    ol3Var.getClass();
                    ja1.y(new bq7(-6));
                    break;
                }
                break;
            case 2:
                this.b.g.t.z();
                break;
            case 3:
                this.b.g.t.F0();
                break;
            case 4:
                this.b.g.t.a0();
                break;
            case 5:
                this.b.g.t.c();
                break;
            case 6:
                this.b.g.t.stop();
                break;
            case 7:
                xq4 xq4Var2 = this.b.g;
                j29.N(xq4Var2.t, xq4Var2.p);
                break;
            case 8:
                this.b.g.t.X();
                break;
            case 9:
                this.b.g.t.E0();
                break;
            case 10:
                this.b.g.g(hq4Var, true);
                break;
            default:
                j29.L(this.b.g.t);
                break;
        }
    }

    public /* synthetic */ yq4(hr4 hr4Var, fv6 fv6Var) {
        this.a = 1;
        this.b = hr4Var;
    }
}
