package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i05 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qx6 b;
    public final /* synthetic */ dp2 c;

    public /* synthetic */ i05(qx6 qx6Var, dp2 dp2Var, int i) {
        this.a = i;
        this.b = qx6Var;
        this.c = dp2Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                qx6 qx6Var = this.b;
                pj3 pj3Var = qx6Var.i;
                dp2 dp2Var = this.c;
                if (pj3Var != null) {
                    dp2Var.invoke(new lc6(qx6Var.a, pj3Var));
                }
                dp2Var.invoke(new yb6(s7.f0(qx6Var)));
                break;
            default:
                qx6 qx6Var2 = this.b;
                pj3 pj3Var2 = qx6Var2.i;
                dp2 dp2Var2 = this.c;
                if (pj3Var2 != null) {
                    dp2Var2.invoke(new lc6(qx6Var2.a, pj3Var2));
                }
                dp2Var2.invoke(new yb6(s7.f0(qx6Var2)));
                break;
        }
        return tx8.a;
    }
}
