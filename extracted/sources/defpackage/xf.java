package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xf implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xf(t34 t34Var, int i) {
        this.c = t34Var;
        this.b = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                bg.b((hx4) this.c, (qz0) obj, hs9.W(1), this.b);
                break;
            default:
                t34 t34Var = (t34) this.c;
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pg pgVar = t34Var.b.a;
                    int i = this.b;
                    bs3 bs3VarH = pgVar.h(i);
                    ((a) bs3VarH.c.b).g(t34Var.c, Integer.valueOf(i - bs3VarH.a), qz0Var, 0);
                } else {
                    qz0Var.U();
                }
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ xf(hx4 hx4Var, int i, int i2) {
        this.c = hx4Var;
        this.b = i2;
    }
}
