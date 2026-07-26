package defpackage;

import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d00 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ PlayerMovieData c;
    public final /* synthetic */ wd6 d;
    public final /* synthetic */ xc6 e;
    public final /* synthetic */ dl5 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ bp2 h;
    public final /* synthetic */ dp2 i;
    public final /* synthetic */ dp2 j;

    public /* synthetic */ d00(hx4 hx4Var, PlayerMovieData playerMovieData, wd6 wd6Var, xc6 xc6Var, dl5 dl5Var, String str, bp2 bp2Var, dp2 dp2Var, dp2 dp2Var2, int i, int i2) {
        this.a = i2;
        this.b = hx4Var;
        this.c = playerMovieData;
        this.d = wd6Var;
        this.e = xc6Var;
        this.f = dl5Var;
        this.g = str;
        this.h = bp2Var;
        this.i = dp2Var;
        this.j = dp2Var2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(7);
                yh0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (qz0) obj, iW);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iW2 = hs9.W(7);
                m91.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (qz0) obj, iW2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW3 = hs9.W(7);
                ub1.g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (qz0) obj, iW3);
                break;
        }
        return tx8.a;
    }
}
