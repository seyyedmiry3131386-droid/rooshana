package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn4 implements co4, r94, q94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ go4 b;

    public /* synthetic */ sn4(go4 go4Var, int i) {
        this.a = i;
        this.b = go4Var;
    }

    @Override // defpackage.co4
    public void c(xf3 xf3Var, int i) {
        switch (this.a) {
            case 0:
                xf3Var.K(this.b.c, i);
                break;
            case 1:
                xf3Var.f0(this.b.c, i);
                break;
            case 2:
            case 11:
            case 13:
            default:
                xf3Var.Y(this.b.c, i, null);
                break;
            case 3:
                xf3Var.A(this.b.c, i);
                break;
            case 4:
                xf3Var.k(this.b.c, i);
                break;
            case 5:
                xf3Var.G(this.b.c, i);
                break;
            case 6:
                xf3Var.p(this.b.c, i);
                break;
            case 7:
                xf3Var.g0(this.b.c, i);
                break;
            case 8:
                xf3Var.S(this.b.c, i);
                break;
            case 9:
                xf3Var.Y(this.b.c, i, null);
                break;
            case 10:
                go4 go4Var = this.b;
                xf3Var.Y(go4Var.c, i, go4Var.z);
                break;
            case 12:
                xf3Var.Y(this.b.c, i, null);
                break;
            case 14:
                xf3Var.v(this.b.c, i);
                break;
        }
    }

    @Override // defpackage.r94
    public void d(Object obj, vd2 vd2Var) {
        ((eb6) obj).y(this.b.a, new db6(vd2Var));
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        eb6 eb6Var = (eb6) obj;
        switch (this.a) {
            case 11:
                eb6Var.N(this.b.y);
                break;
            default:
                eb6Var.N(this.b.y);
                break;
        }
    }
}
