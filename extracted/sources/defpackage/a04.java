package defpackage;

import androidx.navigation3.ui.a;
import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a04 implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ np2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ dp2 h;
    public final /* synthetic */ int i;

    public /* synthetic */ a04(hx4 hx4Var, wd6 wd6Var, xc6 xc6Var, PlayerMovieData playerMovieData, bp2 bp2Var, dl5 dl5Var, dp2 dp2Var, int i) {
        this.b = hx4Var;
        this.c = wd6Var;
        this.d = xc6Var;
        this.e = playerMovieData;
        this.f = bp2Var;
        this.g = dl5Var;
        this.h = dp2Var;
        this.i = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wd6 wd6Var = (wd6) this.c;
                PlayerMovieData playerMovieData = (PlayerMovieData) this.e;
                xc6 xc6Var = (xc6) this.d;
                bp2 bp2Var = (bp2) this.f;
                dl5 dl5Var = (dl5) this.g;
                ((Integer) obj2).getClass();
                tt3.d(hs9.W(this.i | 1), (qz0) obj, bp2Var, this.h, this.b, dl5Var, xc6Var, wd6Var, playerMovieData);
                break;
            case 1:
                wd6 wd6Var2 = (wd6) this.c;
                xc6 xc6Var2 = (xc6) this.d;
                PlayerMovieData playerMovieData2 = (PlayerMovieData) this.e;
                bp2 bp2Var2 = (bp2) this.f;
                dl5 dl5Var2 = (dl5) this.g;
                ((Integer) obj2).getClass();
                dy3.c(hs9.W(this.i | 1), (qz0) obj, bp2Var2, this.h, this.b, dl5Var2, xc6Var2, wd6Var2, playerMovieData2);
                break;
            default:
                ((Integer) obj2).getClass();
                a.a((ke7) this.c, (lk5) this.e, this.b, (qd) this.d, this.h, (dp2) this.f, (qp2) this.g, (qz0) obj, hs9.W(this.i | 1));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ a04(hx4 hx4Var, wd6 wd6Var, PlayerMovieData playerMovieData, xc6 xc6Var, bp2 bp2Var, dl5 dl5Var, dp2 dp2Var, int i) {
        this.b = hx4Var;
        this.c = wd6Var;
        this.e = playerMovieData;
        this.d = xc6Var;
        this.f = bp2Var;
        this.g = dl5Var;
        this.h = dp2Var;
        this.i = i;
    }

    public /* synthetic */ a04(ke7 ke7Var, lk5 lk5Var, hx4 hx4Var, qd qdVar, dp2 dp2Var, dp2 dp2Var2, qp2 qp2Var, int i) {
        this.c = ke7Var;
        this.e = lk5Var;
        this.b = hx4Var;
        this.d = qdVar;
        this.h = dp2Var;
        this.f = dp2Var2;
        this.g = qp2Var;
        this.i = i;
    }
}
