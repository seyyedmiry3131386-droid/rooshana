package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ h00(n00 n00Var, Exception exc, int i) {
        this.a = i;
        this.b = n00Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Exception exc = this.c;
        n00 n00Var = this.b;
        switch (i) {
            case 0:
                b62 b62Var = n00Var.c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                be beVarA0 = hd1Var.a0();
                hd1Var.b0(beVarA0, 1029, new l31(beVarA0, exc, 17));
                break;
            default:
                b62 b62Var2 = n00Var.c;
                String str2 = j29.a;
                hd1 hd1Var2 = b62Var2.a.s;
                be beVarA02 = hd1Var2.a0();
                hd1Var2.b0(beVarA02, 1014, new l31(beVarA02, exc, 24));
                break;
        }
    }
}
