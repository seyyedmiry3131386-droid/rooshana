package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeMovieDto implements Serializable {

    @vo7(CommonDataKt.HOME_MOVIE_ADDAX_TYPE)
    private final AddaxBoxDto addax;

    @vo7(CommonDataKt.HOME_MOVIE_TYPE_BANNER)
    private final HomeMovieBannerDto banner;

    @vo7("bannerList")
    private final HomeMovieBannerListDto bannerList;

    @vo7(CommonDataKt.HOME_MOVIE_TYPE_EXTENSION)
    private final ExtensionPointDto extensionPoint;

    @vo7("movies")
    private final HomeMovieListDto movies;

    @vo7("reelList")
    private final HomeReelListDto reelList;

    @vo7("singleMovie")
    private final SingleMovieDto singleMovie;

    @vo7("type")
    private final String type;

    public HomeMovieDto(String str, HomeMovieListDto homeMovieListDto, HomeMovieBannerDto homeMovieBannerDto, SingleMovieDto singleMovieDto, HomeMovieBannerListDto homeMovieBannerListDto, AddaxBoxDto addaxBoxDto, HomeReelListDto homeReelListDto, ExtensionPointDto extensionPointDto) {
        js3.p(str, "type");
        this.type = str;
        this.movies = homeMovieListDto;
        this.banner = homeMovieBannerDto;
        this.singleMovie = singleMovieDto;
        this.bannerList = homeMovieBannerListDto;
        this.addax = addaxBoxDto;
        this.reelList = homeReelListDto;
        this.extensionPoint = extensionPointDto;
    }

    public final AddaxBoxDto getAddax() {
        return this.addax;
    }

    public final HomeMovieBannerDto getBanner() {
        return this.banner;
    }

    public final HomeMovieBannerListDto getBannerList() {
        return this.bannerList;
    }

    public final ExtensionPointDto getExtensionPoint() {
        return this.extensionPoint;
    }

    public final HomeMovieListDto getMovies() {
        return this.movies;
    }

    public final HomeReelListDto getReelList() {
        return this.reelList;
    }

    public final SingleMovieDto getSingleMovie() {
        return this.singleMovie;
    }

    public final String getType() {
        return this.type;
    }
}
