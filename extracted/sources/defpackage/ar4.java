package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hr4 b;
    public final /* synthetic */ qg6 c;

    public /* synthetic */ ar4(hr4 hr4Var, qg6 qg6Var, int i) {
        this.a = i;
        this.b = hr4Var;
        this.c = qg6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hr4 hr4Var = this.b;
                qq4 qq4Var = hr4Var.k;
                qg6 qg6Var = this.c;
                qq4Var.G(hr4Var.G(qg6Var));
                hr4Var.i.v(qg6Var.o0().a(17) ? qg6Var.S() : bm8.a);
                break;
            default:
                hr4 hr4Var2 = this.b;
                hr4Var2.k.G(hr4Var2.G(this.c));
                break;
        }
    }
}
