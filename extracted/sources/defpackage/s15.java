package defpackage;

import android.view.View;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.MovieFullDto;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s15 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    public /* synthetic */ s15(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, int i) {
        this.a = i;
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String type;
        int i = this.a;
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
        switch (i) {
            case 0:
                int i2 = MovieDetailRecyclerListFragment.H1;
                movieDetailRecyclerListFragment.J0.p();
                break;
            case 1:
                int i3 = MovieDetailRecyclerListFragment.H1;
                MovieFullDto movieFullDtoF = movieDetailRecyclerListFragment.X1().F();
                if (movieFullDtoF == null || (type = movieFullDtoF.getType()) == null) {
                    type = CommonDataKt.MOVIE_TYPE_MOVIE;
                }
                ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                actionBarEventBuilder.b(type.concat("_search"));
                actionBarEventBuilder.a();
                pk5.g(movieDetailRecyclerListFragment.J0, new NavIntentDirections.MovieSearch(new wh7("", "Detail")), -1);
                break;
            default:
                int i4 = MovieDetailRecyclerListFragment.H1;
                movieDetailRecyclerListFragment.f2();
                break;
        }
    }
}
