package defpackage;

import android.view.View;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.streamers.StreamerProfileFragment;
import ir.mservices.market.movie.streamers.StreamerProfileListAction;
import ir.mservices.market.movie.streamers.recycler.OtherStreamerData;
import ir.mservices.market.movie.streamers.recycler.OtherStreamersMoreData;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieData;
import ir.mservices.market.movie.streamers.recycler.StreamerMoviesMoreData;
import ir.mservices.market.movie.streamers.recycler.StreamerNameData;
import ir.mservices.market.movie.streamers.recycler.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f78 implements og5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StreamerProfileFragment b;

    public /* synthetic */ f78(StreamerProfileFragment streamerProfileFragment, int i) {
        this.a = i;
        this.b = streamerProfileFragment;
    }

    @Override // defpackage.og5
    public final void m(View view, qg5 qg5Var, Object obj) {
        int i = this.a;
        StreamerProfileFragment streamerProfileFragment = this.b;
        switch (i) {
            case 0:
                int i2 = StreamerProfileFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p((StreamerNameData) obj, "<unused var>");
                streamerProfileFragment.S1().r(StreamerProfileListAction.FollowStreamerAction.INSTANCE);
                break;
            case 1:
                int i3 = StreamerProfileFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((a) qg5Var, "<unused var>");
                js3.p((StreamerNameData) obj, "<unused var>");
                streamerProfileFragment.S1().r(StreamerProfileListAction.UnFollowStreamerAction.INSTANCE);
                break;
            case 2:
                StreamerMovieData streamerMovieData = (StreamerMovieData) obj;
                int i4 = StreamerProfileFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((v68) qg5Var, "<unused var>");
                js3.p(streamerMovieData, "recyclerData");
                MovieDto movieDto = streamerMovieData.a;
                streamerProfileFragment.getClass();
                pk5.g(streamerProfileFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                break;
            case 3:
                int i5 = StreamerProfileFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((y68) qg5Var, "<unused var>");
                js3.p((StreamerMoviesMoreData) obj, "<unused var>");
                pk5.g(streamerProfileFragment.J0, new NavIntentDirections.StreamerMovies(new w68(((h78) streamerProfileFragment.j1.getValue()).a)), -1);
                break;
            case 4:
                OtherStreamerData otherStreamerData = (OtherStreamerData) obj;
                int i6 = StreamerProfileFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((sw5) qg5Var, "<unused var>");
                js3.p(otherStreamerData, "recyclerData");
                pk5.g(streamerProfileFragment.J0, new NavIntentDirections.StreamerProfile(new h78(otherStreamerData.a.getId(), null)), -1);
                break;
            default:
                int i7 = StreamerProfileFragment.s1;
                js3.p(view, "<unused var>");
                js3.p((tw5) qg5Var, "<unused var>");
                js3.p((OtherStreamersMoreData) obj, "<unused var>");
                pk5.g(streamerProfileFragment.J0, new NavIntentDirections.StreamersMore(), -1);
                break;
        }
    }
}
