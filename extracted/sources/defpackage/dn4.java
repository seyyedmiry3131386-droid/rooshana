package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dn4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn4 b;
    public final /* synthetic */ gn4 c;

    public /* synthetic */ dn4(qn4 qn4Var, gn4 gn4Var, int i) {
        this.a = i;
        this.b = qn4Var;
        this.c = gn4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn4 qn4Var = this.b;
                gn4 gn4Var = this.c;
                qn4Var.i = gn4Var;
                if (qn4Var.j) {
                    qn4Var.k(gn4Var);
                }
                qn4Var.e(new dn4(qn4Var, gn4Var, 1), new od1(1, qn4Var));
                break;
            default:
                qn4 qn4Var2 = this.b;
                gn4 gn4Var2 = this.c;
                if (qn4Var2.a instanceof c0) {
                    gn4Var2.a();
                }
                break;
        }
    }
}
