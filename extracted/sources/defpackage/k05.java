package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k05 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ qx6 c;
    public final /* synthetic */ dp2 d;

    public /* synthetic */ k05(hx4 hx4Var, qx6 qx6Var, dp2 dp2Var, int i, int i2) {
        this.a = i2;
        this.b = hx4Var;
        this.c = qx6Var;
        this.d = dp2Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bt2.b(this.b, this.c, this.d, qz0Var, hs9.W(1));
                break;
            default:
                wu8.d(this.b, this.c, this.d, qz0Var, hs9.W(1));
                break;
        }
        return tx8.a;
    }
}
