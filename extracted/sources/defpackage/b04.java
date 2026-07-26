package defpackage;

import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b04 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xc6 d;
    public final /* synthetic */ PlayerMovieData e;
    public final /* synthetic */ dl5 f;
    public final /* synthetic */ dp2 g;
    public final /* synthetic */ int h;

    public /* synthetic */ b04(hx4 hx4Var, boolean z, xc6 xc6Var, PlayerMovieData playerMovieData, dl5 dl5Var, dp2 dp2Var, int i, int i2) {
        this.a = i2;
        this.b = hx4Var;
        this.c = z;
        this.d = xc6Var;
        this.e = playerMovieData;
        this.f = dl5Var;
        this.g = dp2Var;
        this.h = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                tt3.c(this.b, this.c, this.d, this.e, this.f, this.g, (qz0) obj, hs9.W(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dy3.b(this.b, this.c, this.d, this.e, this.f, this.g, (qz0) obj, hs9.W(this.h | 1));
                break;
        }
        return tx8.a;
    }
}
