package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mm6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm6 b;

    public /* synthetic */ mm6(rm6 rm6Var, int i) {
        this.a = i;
        this.b = rm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.J = true;
                break;
            case 1:
                this.b.A();
                break;
            default:
                rm6 rm6Var = this.b;
                if (!rm6Var.P) {
                    yp4 yp4Var = rm6Var.s;
                    yp4Var.getClass();
                    yp4Var.l(rm6Var);
                }
                break;
        }
    }
}
