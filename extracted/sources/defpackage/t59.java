package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t59 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;
    public final /* synthetic */ ec1 c;

    public /* synthetic */ t59(n00 n00Var, ec1 ec1Var, int i) {
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
                b62 b62Var = n00Var.c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                be beVarA0 = hd1Var.a0();
                hd1Var.b0(beVarA0, 1015, new bd1(beVarA0, ec1Var, 2));
                break;
            default:
                n00 n00Var2 = this.b;
                ec1 ec1Var2 = this.c;
                synchronized (ec1Var2) {
                }
                b62 b62Var2 = n00Var2.c;
                String str2 = j29.a;
                hd1 hd1Var2 = b62Var2.a.s;
                be beVarX = hd1Var2.X((ks4) hd1Var2.d.e);
                hd1Var2.b0(beVarX, 1020, new j2((Object) beVarX, (Object) ec1Var2, 8));
                break;
        }
    }
}
