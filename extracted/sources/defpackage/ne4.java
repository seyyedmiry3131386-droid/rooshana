package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ne4 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg8 b;

    public /* synthetic */ ne4(wg8 wg8Var, int i) {
        this.a = i;
        this.b = wg8Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a(((nr5) obj).a, eq.H);
                break;
            case 1:
                ah6 ah6Var = (ah6) obj;
                this.b.e(at2.i0(ah6Var, false));
                ah6Var.a();
                break;
            default:
                ah6 ah6Var2 = (ah6) obj;
                this.b.e(at2.i0(ah6Var2, false));
                ah6Var2.a();
                break;
        }
        return tx8.a;
    }
}
