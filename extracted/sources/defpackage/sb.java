package defpackage;

import ir.myket.player.ui.client.ad.components.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sb implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ np2 g;

    public /* synthetic */ sb(pg0 pg0Var, hx4 hx4Var, ey6 ey6Var, dp2 dp2Var, int i, int i2) {
        this.e = pg0Var;
        this.b = hx4Var;
        this.f = ey6Var;
        this.g = dp2Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(1);
                a.e(this.b, this.c, this.d, (String) this.e, (bp2) this.f, (bp2) this.g, (qz0) obj, iW);
                break;
            default:
                ((Integer) obj2).getClass();
                tv8.e((pg0) this.e, this.b, (ey6) this.f, (dp2) this.g, this.c, (qz0) obj, hs9.W(this.d | 1));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ sb(hx4 hx4Var, int i, int i2, String str, bp2 bp2Var, bp2 bp2Var2, int i3) {
        this.b = hx4Var;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = bp2Var;
        this.g = bp2Var2;
    }
}
