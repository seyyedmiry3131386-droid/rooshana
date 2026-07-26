package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z54 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g64 b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ z54(g64 g64Var, dp2 dp2Var, int i, int i2) {
        this.a = i2;
        this.b = g64Var;
        this.c = dp2Var;
        this.d = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                at2.I(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
            default:
                at2.G(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
        }
        return tx8.a;
    }
}
