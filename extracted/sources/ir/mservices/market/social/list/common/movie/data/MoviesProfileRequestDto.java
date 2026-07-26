package ir.mservices.market.social.list.common.movie.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MoviesProfileRequestDto implements RequestDTO {

    @vo7("movies")
    private final List<String> movies;

    @vo7("title")
    private final String title;

    public MoviesProfileRequestDto(String str, List<String> list) {
        js3.p(str, "title");
        js3.p(list, "movies");
        this.title = str;
        this.movies = list;
    }

    public final List<String> getMovies() {
        return this.movies;
    }

    public final String getTitle() {
        return this.title;
    }
}
