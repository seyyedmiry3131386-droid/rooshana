package ir.mservices.market.app.search.result.data;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.version2.webapi.responsedto.RestrictedAppDTO;
import ir.mservices.market.version2.webapi.responsedto.SearchAppListDto;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchItemDto implements Serializable {
    public static final String APP_BANNER = "AppBanner";
    public static final String APP_COMPACT = "AppCompact";
    public static final String APP_LIST = "AppList";
    public static final String APP_RESTRICTED = "AppRestricted";
    public static final String APP_SCREENSHOT = "AppWithScreenshot";
    public static final String APP_SCROLLABLE_SCREENSHOT = "AppWithScrollableScreenshot";
    public static final String APP_SUMMARY = "AppWithSummary";
    public static final Companion Companion = new Companion(null);
    public static final String MOVIE_BANNER = "MovieBanner";
    public static final String MOVIE_LIST = "MovieList";

    @vo7("app")
    private final SearchSpecialAppDTO app;

    @vo7("appBanner")
    private final HomeBannerDto appBanner;

    @vo7("appList")
    private final SearchAppListDto appList;

    @vo7("itemType")
    private final String itemType;

    @vo7("movieBanner")
    private final HomeMovieBannerDto movieBanner;

    @vo7("movieList")
    private final HomeMovieListDto movieList;

    @vo7("restrictedApp")
    private final RestrictedAppDTO restrictedApp;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public SearchItemDto(String str, SearchSpecialAppDTO searchSpecialAppDTO, RestrictedAppDTO restrictedAppDTO, SearchAppListDto searchAppListDto, HomeMovieListDto homeMovieListDto, HomeBannerDto homeBannerDto, HomeMovieBannerDto homeMovieBannerDto) {
        js3.p(str, "itemType");
        js3.p(searchSpecialAppDTO, "app");
        js3.p(restrictedAppDTO, "restrictedApp");
        js3.p(searchAppListDto, "appList");
        this.itemType = str;
        this.app = searchSpecialAppDTO;
        this.restrictedApp = restrictedAppDTO;
        this.appList = searchAppListDto;
        this.movieList = homeMovieListDto;
        this.appBanner = homeBannerDto;
        this.movieBanner = homeMovieBannerDto;
    }

    public final SearchSpecialAppDTO getApp() {
        return this.app;
    }

    public final HomeBannerDto getAppBanner() {
        return this.appBanner;
    }

    public final SearchAppListDto getAppList() {
        return this.appList;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final HomeMovieBannerDto getMovieBanner() {
        return this.movieBanner;
    }

    public final HomeMovieListDto getMovieList() {
        return this.movieList;
    }

    public final RestrictedAppDTO getRestrictedApp() {
        return this.restrictedApp;
    }
}
