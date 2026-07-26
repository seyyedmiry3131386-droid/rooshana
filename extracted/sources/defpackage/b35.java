package defpackage;

import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.b;
import ir.mservices.market.views.SmallMovieOvalButton;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class b35 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ MovieEpisodeData c;

    public /* synthetic */ b35(b bVar, MovieEpisodeData movieEpisodeData, int i) {
        this.a = i;
        this.b = bVar;
        this.c = movieEpisodeData;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                SmallMovieOvalButton smallMovieOvalButton = this.b.x().x;
                MovieEpisodeData movieEpisodeData = this.c;
                smallMovieOvalButton.setState(b.y(movieEpisodeData, (Pair) obj, (dq4) movieEpisodeData.c.getValue()));
                break;
            default:
                dq4 dq4Var = (dq4) obj;
                SmallMovieOvalButton smallMovieOvalButton2 = this.b.x().x;
                MovieEpisodeData movieEpisodeData2 = this.c;
                v48 v48Var = movieEpisodeData2.b;
                smallMovieOvalButton2.setState(b.y(movieEpisodeData2, v48Var != null ? (Pair) v48Var.getValue() : null, dq4Var));
                break;
        }
        return tx8.a;
    }
}
