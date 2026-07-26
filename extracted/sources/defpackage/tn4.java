package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tn4 implements co4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ go4 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tn4(go4 go4Var, boolean z, int i) {
        this.a = i;
        this.b = go4Var;
        this.c = z;
    }

    @Override // defpackage.co4
    public final void c(xf3 xf3Var, int i) {
        switch (this.a) {
            case 0:
                xf3Var.j0(this.b.c, i, this.c);
                break;
            default:
                xf3Var.T(this.b.c, i, this.c);
                break;
        }
    }
}
