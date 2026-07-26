package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xm0 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ xm0(int i, int i2, dp2 dp2Var, hx4 hx4Var) {
        this.a = i2;
        this.b = hx4Var;
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
                ml9.c(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
            default:
                ub1.i(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
        }
        return tx8.a;
    }
}
