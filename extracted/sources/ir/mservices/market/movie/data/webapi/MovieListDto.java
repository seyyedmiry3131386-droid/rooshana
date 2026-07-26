package ir.mservices.market.movie.data.webapi;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.MovieIgnoreConditionDto;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieListDto implements Serializable, bf5 {
    public static final Companion Companion = new Companion(null);
    private static final MovieListDto empty = new MovieListDto("", true, null, EmptyList.a, null);

    @vo7("analyticsName")
    private String analyticsName;

    @vo7("eol")
    private final boolean eol;

    @vo7("ignoreConditions")
    private final List<MovieIgnoreConditionDto> ignoreConditions;

    @vo7("movies")
    private final List<MovieDto> movies;

    @vo7("title")
    private final String title;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final MovieListDto getEmpty() {
            return MovieListDto.empty;
        }

        private Companion() {
        }
    }

    public MovieListDto(String str, boolean z, String str2, List<MovieDto> list, List<MovieIgnoreConditionDto> list2) {
        js3.p(str, "title");
        js3.p(list, "movies");
        this.title = str;
        this.eol = z;
        this.analyticsName = str2;
        this.movies = list;
        this.ignoreConditions = list2;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<MovieIgnoreConditionDto> getIgnoreConditions() {
        return this.ignoreConditions;
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
}
