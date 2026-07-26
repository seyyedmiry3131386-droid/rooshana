package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import defpackage.yd1;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchHomeMovieListDto implements Serializable {

    @vo7("analyticsName")
    private String analyticsName;

    @vo7("movies")
    private final List<MovieDto> movies;

    @vo7("headerTitle")
    private final String title;

    public SearchHomeMovieListDto(String str, String str2, List<MovieDto> list) {
        this.title = str;
        this.analyticsName = str2;
        this.movies = list;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final List<MovieDto> getMovies() {
        return this.movies;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAnalyticsName(String str) {
        this.analyticsName = str;
    }

    public /* synthetic */ SearchHomeMovieListDto(String str, String str2, List list, int i, yd1 yd1Var) {
        this((i & 1) != 0 ? null : str, str2, list);
    }
}
