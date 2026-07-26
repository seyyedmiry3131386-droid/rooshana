package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qf2 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ qf2(a aVar) {
        this.a = 0;
        this.b = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int iIntValue = num.intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.b.a(zf2.a, qz0Var, 6);
                } else {
                    qz0Var.U();
                }
                return tx8.a;
            case 1:
                num.getClass();
                y40.d(this.b, qz0Var, hs9.W(7));
                break;
            default:
                num.getClass();
                xu7.a(this.b, qz0Var, hs9.W(55));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ qf2(a aVar, int i, int i2) {
        this.a = i2;
        this.b = aVar;
    }
}
