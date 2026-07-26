package defpackage;

import android.view.View;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import ir.mservices.market.movie.data.webapi.PlayerMovieDto;
import ir.mservices.market.movie.ui.detail.recycler.MovieDownloadEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeData;
import ir.mservices.market.movie.ui.detail.recycler.a;
import ir.mservices.market.movie.ui.detail.recycler.b;
import ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData;
import ir.mservices.market.movie.uri.MovieUriViewModel;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketMultiRadio;
import ir.myket.movie.common.domain.models.PlaySource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z65 implements og5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovieSeasonsRecyclerListFragment b;

    public /* synthetic */ z65(MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment, int i) {
        this.a = i;
        this.b = movieSeasonsRecyclerListFragment;
    }

    @Override // defpackage.og5
    public final void m(View view, qg5 qg5Var, Object obj) {
        int i = this.a;
        MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment = this.b;
        switch (i) {
            case 0:
                MovieSeasonFixedTitleData movieSeasonFixedTitleData = (MovieSeasonFixedTitleData) obj;
                int i2 = MovieSeasonsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((t65) qg5Var, "<unused var>");
                js3.p(movieSeasonFixedTitleData, "recyclerData");
                pk5.g(movieSeasonsRecyclerListFragment.J0, new NavIntentDirections.SingleSelect(new nx7(new DialogDataModel(movieSeasonsRecyclerListFragment.Q1(), "DIALOG_KEY_SHOW_SEASON", null, 12), movieSeasonsRecyclerListFragment.L(rs6.select_season_dialog_title), (MyketMultiRadio.Item[]) movieSeasonFixedTitleData.c.toArray(new MyketMultiRadio.Item[0]), movieSeasonFixedTitleData.d, sj8.b())), -1);
                return;
            case 1:
                MovieEpisodeData movieEpisodeData = (MovieEpisodeData) obj;
                int i3 = MovieSeasonsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((b) qg5Var, "<unused var>");
                js3.p(movieEpisodeData, "recyclerData");
                MovieUriViewModel movieUriViewModelS1 = movieSeasonsRecyclerListFragment.S1();
                EpisodeDto episodeDto = movieEpisodeData.a;
                String playId = episodeDto.getPlayId();
                String id = episodeDto.getId();
                js3.p(id, "id");
                String strConcat = "episode_".concat(id);
                String str = movieSeasonsRecyclerListFragment.T1().a;
                PlayerMovieDto playerMovieDto = (PlayerMovieDto) movieSeasonsRecyclerListFragment.R1().E.a.getValue();
                ec9 ec9Var = movieSeasonsRecyclerListFragment.i1;
                if (ec9Var == null) {
                    js3.V("vpnUtils");
                    throw null;
                }
                boolean zA = ec9Var.a();
                List list = (List) movieSeasonsRecyclerListFragment.R1().C.a.getValue();
                PlaySource[] playSourceArr = PlaySource.a;
                MovieUriViewModel.s(movieUriViewModelS1, playId, strConcat, str, playerMovieDto, zA, list, 192);
                return;
            default:
                MovieDownloadEpisodeData movieDownloadEpisodeData = (MovieDownloadEpisodeData) obj;
                int i4 = MovieSeasonsRecyclerListFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p(movieDownloadEpisodeData, "recyclerData");
                MovieUriViewModel movieUriViewModelS12 = movieSeasonsRecyclerListFragment.S1();
                EpisodeDto episodeDto2 = movieDownloadEpisodeData.a;
                movieUriViewModelS12.r(episodeDto2.getId(), episodeDto2.getPlayId(), episodeDto2);
                return;
        }
    }
}
