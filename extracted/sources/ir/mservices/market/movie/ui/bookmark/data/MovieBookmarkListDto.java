package ir.mservices.market.movie.ui.bookmark.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.SearchMovieDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieBookmarkListDto implements Serializable, bf5, Cloneable {

    @vo7("eol")
    private final Boolean eol;

    @vo7("headerMessage")
    private final String headerMessage;

    @vo7("movies")
    private final List<SearchMovieDto> movies;

    public MovieBookmarkListDto(String str, List<SearchMovieDto> list, Boolean bool) {
        this.headerMessage = str;
        this.movies = list;
        this.eol = bool;
    }

    public /* bridge */ Object clone() {
        return super.clone();
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return js3.i(this.eol, Boolean.TRUE);
    }

    public final Boolean getEol() {
        return this.eol;
    }

    public final String getHeaderMessage() {
        return this.headerMessage;
    }

    public final List<SearchMovieDto> getMovies() {
        return this.movies;
    }
}
