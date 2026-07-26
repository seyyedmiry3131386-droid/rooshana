package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kz implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl5 b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ PlayerMovieData d;

    public /* synthetic */ kz(dl5 dl5Var, ExoPlayer exoPlayer, PlayerMovieData playerMovieData, int i, int i2) {
        this.a = i2;
        this.b = dl5Var;
        this.c = exoPlayer;
        this.d = playerMovieData;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                y40.b(this.b, this.c, this.d, qz0Var, hs9.W(1));
                break;
            default:
                tv8.d(this.b, this.c, this.d, qz0Var, hs9.W(1));
                break;
        }
        return tx8.a;
    }
}
