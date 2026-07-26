package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;
    public final /* synthetic */ ec1 c;

    public /* synthetic */ i00(n00 n00Var, ec1 ec1Var, int i) {
        this.a = i;
        this.b = n00Var;
        this.c = ec1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n00 n00Var = this.b;
                ec1 ec1Var = this.c;
                synchronized (ec1Var) {
                }
                b62 b62Var = n00Var.c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                be beVarX = hd1Var.X((ks4) hd1Var.d.e);
                hd1Var.b0(beVarX, 1013, new bd1(beVarX, ec1Var, 1));
                break;
            default:
                n00 n00Var2 = this.b;
                ec1 ec1Var2 = this.c;
                b62 b62Var2 = n00Var2.c;
                String str2 = j29.a;
                hd1 hd1Var2 = b62Var2.a.s;
                be beVarA0 = hd1Var2.a0();
                hd1Var2.b0(beVarA0, 1007, new bd1(beVarA0, ec1Var2, 0));
                break;
        }
    }
}
