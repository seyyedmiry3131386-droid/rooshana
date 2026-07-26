package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn4 implements co4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ go4 b;
    public final /* synthetic */ jp4 c;

    public /* synthetic */ rn4(go4 go4Var, jp4 jp4Var, int i) {
        this.a = i;
        this.b = go4Var;
        this.c = jp4Var;
    }

    @Override // defpackage.co4
    public final void c(xf3 xf3Var, int i) {
        switch (this.a) {
            case 0:
                xf3Var.z(this.b.c, i, this.c.c(true));
                break;
            default:
                xf3Var.a0(this.b.c, i, this.c.c(true), true);
                break;
        }
    }
}
