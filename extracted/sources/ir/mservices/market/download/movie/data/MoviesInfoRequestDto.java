package ir.mservices.market.download.movie.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MoviesInfoRequestDto implements Serializable, RequestDTO {

    @vo7("movie_ids")
    private final List<String> movieIdList;

    public MoviesInfoRequestDto(List<String> list) {
        js3.p(list, "movieIdList");
        this.movieIdList = list;
    }

    public final List<String> getMovieIdList() {
        return this.movieIdList;
    }
}
