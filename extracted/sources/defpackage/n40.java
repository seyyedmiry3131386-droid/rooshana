package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n40 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj5 b;

    public /* synthetic */ n40(dj5 dj5Var, int i) {
        this.a = 1;
        this.b = dj5Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int iIntValue = num.intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.b.a(0, qz0Var);
                } else {
                    qz0Var.U();
                }
                break;
            case 1:
                num.getClass();
                this.b.a(hs9.W(1), qz0Var);
                break;
            case 2:
                int iIntValue2 = num.intValue();
                if (qz0Var.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.b.a(0, qz0Var);
                } else {
                    qz0Var.U();
                }
                break;
            case 3:
                int iIntValue3 = num.intValue();
                if (qz0Var.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    this.b.a(0, qz0Var);
                } else {
                    qz0Var.U();
                }
                break;
            default:
                int iIntValue4 = num.intValue();
                if (qz0Var.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    this.b.a(0, qz0Var);
                } else {
                    qz0Var.U();
                }
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ n40(dj5 dj5Var, int i, byte b) {
        this.a = i;
        this.b = dj5Var;
    }
}
