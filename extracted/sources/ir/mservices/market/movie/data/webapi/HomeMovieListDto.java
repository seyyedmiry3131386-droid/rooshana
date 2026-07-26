package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.MovieIgnoreConditionDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeMovieListDto implements Serializable {

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("bgImage")
    private final BackgroundImageDto backgroundImage;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("eol")
    private final boolean eol;

    @vo7("headerTitle")
    private final String headerTitle;

    @vo7("ignoreConditions")
    private final List<MovieIgnoreConditionDto> ignoreConditions;

    @vo7("listKey")
    private final String listKey;

    @vo7("movies")
    private final List<MovieDto> movies;

    public HomeMovieListDto(String str, String str2, String str3, List<MovieDto> list, boolean z, String str4, List<MovieIgnoreConditionDto> list2, BackgroundImageDto backgroundImageDto) {
        js3.p(str, "listKey");
        js3.p(list, "movies");
        js3.p(str4, "displayMode");
        this.listKey = str;
        this.headerTitle = str2;
        this.analyticsName = str3;
        this.movies = list;
        this.eol = z;
        this.displayMode = str4;
        this.ignoreConditions = list2;
        this.backgroundImage = backgroundImageDto;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HomeMovieListDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.HomeMovieListDto");
        HomeMovieListDto homeMovieListDto = (HomeMovieListDto) obj;
        return js3.i(this.listKey, homeMovieListDto.listKey) && js3.i(this.backgroundImage, homeMovieListDto.backgroundImage);
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final BackgroundImageDto getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final List<MovieIgnoreConditionDto> getIgnoreConditions() {
        return this.ignoreConditions;
    }

    public final String getListKey() {
        return this.listKey;
    }

    public final List<MovieDto> getMovies() {
        return this.movies;
    }

    public int hashCode() {
        return this.listKey.hashCode();
    }
}
