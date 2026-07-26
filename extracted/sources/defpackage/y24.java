package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y24 implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ t34 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y24(int i, t34 t34Var, Object obj) {
        this.b = t34Var;
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int iIntValue = num.intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.b.a(this.c, this.d, qz0Var, 0);
                } else {
                    qz0Var.U();
                }
                break;
            default:
                num.getClass();
                this.b.a(this.c, this.d, qz0Var, hs9.W(1));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ y24(t34 t34Var, int i, Object obj, int i2) {
        this.b = t34Var;
        this.c = i;
        this.d = obj;
    }
}
