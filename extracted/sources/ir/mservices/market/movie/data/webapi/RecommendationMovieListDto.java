package ir.mservices.market.movie.data.webapi;

import defpackage.bf5;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendationMovieListDto implements Serializable, bf5 {

    @vo7("eol")
    private final Boolean eol;

    @vo7("headerMessage")
    private final String headerMessage;

    @vo7("movies")
    private final List<MovieRecommendationDto> movies;

    public RecommendationMovieListDto(String str, List<MovieRecommendationDto> list, Boolean bool) {
        this.headerMessage = str;
        this.movies = list;
        this.eol = bool;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        Boolean bool = this.eol;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Boolean getEol() {
        return this.eol;
    }

    public final String getHeaderMessage() {
        return this.headerMessage;
    }

    public final List<MovieRecommendationDto> getMovies() {
        return this.movies;
    }
}
