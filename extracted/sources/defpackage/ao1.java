package defpackage;

import androidx.compose.ui.window.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ao1 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo1 b;

    public /* synthetic */ ao1(bo1 bo1Var, int i) {
        this.a = i;
        this.b = bo1Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bo1 bo1Var = this.b;
                    b.a(bo1Var.f, bo1Var.e, s7.X(-662606506, new ao1(bo1Var, 1), qz0Var), qz0Var, 384);
                } else {
                    qz0Var.U();
                }
                break;
            case 1:
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.b.b.a(0, qz0Var);
                } else {
                    qz0Var.U();
                }
                break;
            default:
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.b.b().invoke(qz0Var, 0);
                } else {
                    qz0Var.U();
                }
                break;
        }
        return tx8.a;
    }
}
