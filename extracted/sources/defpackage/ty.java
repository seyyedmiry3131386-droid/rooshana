package defpackage;

import ir.myket.player.domain.models.PlayerMovieData;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ty implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl5 b;
    public final /* synthetic */ PlayerMovieData c;

    public /* synthetic */ ty(dl5 dl5Var, PlayerMovieData playerMovieData, int i) {
        this.a = i;
        this.b = dl5Var;
        this.c = playerMovieData;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                th0.k(b.M(new Pair("on", "player_series_change_season")), "movie_click");
                PlayerMovieData playerMovieData = this.c;
                this.b.a(new cr(new we6(playerMovieData.b, playerMovieData.d.a)));
                break;
            case 1:
                th0.k(b.M(new Pair("on", "player_series_change_season")), "movie_click");
                PlayerMovieData playerMovieData2 = this.c;
                this.b.a(new cr(new we6(playerMovieData2.b, playerMovieData2.d.a)));
                break;
            default:
                th0.k(b.M(new Pair("on", "player_series_change_season")), "movie_click");
                PlayerMovieData playerMovieData3 = this.c;
                this.b.a(new cr(new we6(playerMovieData3.b, playerMovieData3.d.a)));
                break;
        }
        return tx8.a;
    }
}
