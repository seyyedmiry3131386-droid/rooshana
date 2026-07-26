package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.ui.client.ad.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z8 implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dp2 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z8(hx4 hx4Var, wd6 wd6Var, zl6 zl6Var, PlayerMovieData playerMovieData, rn5 rn5Var, dp2 dp2Var, int i) {
        this.c = hx4Var;
        this.d = wd6Var;
        this.e = zl6Var;
        this.f = playerMovieData;
        this.g = rn5Var;
        this.b = dp2Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(1);
                b.c((ExoPlayer) this.c, (s9) this.d, (cb) this.e, this.b, (bp2) this.g, (dp2) this.f, (qz0) obj, iW);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW2 = hs9.W(7);
                rf0.b((hx4) this.c, (wd6) this.d, (zl6) this.e, (PlayerMovieData) this.f, (rn5) this.g, this.b, (qz0) obj, iW2);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ z8(ExoPlayer exoPlayer, s9 s9Var, cb cbVar, dp2 dp2Var, bp2 bp2Var, dp2 dp2Var2, int i) {
        this.c = exoPlayer;
        this.d = s9Var;
        this.e = cbVar;
        this.b = dp2Var;
        this.g = bp2Var;
        this.f = dp2Var2;
    }
}
