package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ag0 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;

    public /* synthetic */ ag0(hx4 hx4Var, int i, int i2) {
        this.a = i2;
        this.b = hx4Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bg0.a(this.b, qz0Var, hs9.W(1));
                break;
            default:
                rq4.b(this.b, qz0Var, hs9.W(1));
                break;
        }
        return tx8.a;
    }
}
