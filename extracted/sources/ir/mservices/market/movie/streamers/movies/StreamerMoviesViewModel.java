package ir.mservices.market.movie.streamers.movies;

import defpackage.jd7;
import defpackage.js3;
import defpackage.w68;
import defpackage.wu0;
import defpackage.xg5;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.streamers.data.StreamerMoviesDto;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieData;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerMoviesViewModel extends a {
    public final xg5 v;
    public final w68 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamerMoviesViewModel(xg5 xg5Var, jd7 jd7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.v = xg5Var;
        if (!jd7Var.a("streamerKey")) {
            throw new IllegalArgumentException("Required argument \"streamerKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("streamerKey");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"streamerKey\" is marked as non-null but was passed a null value");
        }
        this.w = new w68(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillData(StreamerMoviesDto streamerMoviesDto) {
        List<MovieDto> movies = streamerMoviesDto.getMovies();
        ArrayList arrayList = new ArrayList(wu0.V(movies, 10));
        Iterator<T> it = movies.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new StreamerMovieData((MovieDto) it.next())));
        }
        return arrayList;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new StreamerMoviesViewModel$doRequest$1(this, null));
    }
}
