package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eo4 implements co4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo4 b;

    public /* synthetic */ eo4(fo4 fo4Var, int i) {
        this.a = i;
        this.b = fo4Var;
    }

    @Override // defpackage.co4
    public final void c(xf3 xf3Var, int i) {
        switch (this.a) {
            case 0:
                go4 go4Var = this.b.a;
                xf3Var.Y(go4Var.c, i, go4Var.z);
                break;
            case 1:
                xf3Var.Y(this.b.a.c, i, null);
                break;
            case 2:
                go4 go4Var2 = this.b.a;
                xf3Var.Y(go4Var2.c, i, go4Var2.z);
                break;
            default:
                xf3Var.Y(this.b.a.c, i, null);
                break;
        }
    }
}
