package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchHomeItemDto implements Serializable {

    @vo7("bannerList")
    private final HomeMovieBannerListDto bannerList;

    @vo7("movies")
    private final SearchHomeMovieListDto movies;

    @vo7("type")
    private final String type;

    public SearchHomeItemDto(String str, SearchHomeMovieListDto searchHomeMovieListDto, HomeMovieBannerListDto homeMovieBannerListDto) {
        js3.p(str, "type");
        this.type = str;
        this.movies = searchHomeMovieListDto;
        this.bannerList = homeMovieBannerListDto;
    }

    public final HomeMovieBannerListDto getBannerList() {
        return this.bannerList;
    }

    public final SearchHomeMovieListDto getMovies() {
        return this.movies;
    }

    public final String getType() {
        return this.type;
    }
}
