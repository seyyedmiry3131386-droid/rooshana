package defpackage;

import ir.myket.player.ui.client.ad.components.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fa implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dp2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fa(int i, int i2, dp2 dp2Var, hx4 hx4Var) {
        this.e = hx4Var;
        this.c = i;
        this.b = dp2Var;
        this.d = i2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(this.d | 1);
                a.b((hx4) this.e, this.c, this.b, (qz0) obj, iW);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW2 = hs9.W(this.d | 1);
                ub1.h((pj3) this.e, this.b, this.c, (qz0) obj, iW2);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ fa(pj3 pj3Var, dp2 dp2Var, int i, int i2) {
        this.e = pj3Var;
        this.b = dp2Var;
        this.c = i;
        this.d = i2;
    }
}
