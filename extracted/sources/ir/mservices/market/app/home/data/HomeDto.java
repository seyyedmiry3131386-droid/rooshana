package ir.mservices.market.app.home.data;

import defpackage.bf5;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.app.common.data.HomeAppsDto;
import ir.mservices.market.common.data.DynamicButtonDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto;
import ir.mservices.market.version2.webapi.responsedto.MovieBannerLists;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeDto implements Serializable, bf5 {
    public static final Companion Companion = new Companion(null);
    public static final String GAME = "Game";
    public static final String MAIN = "All";

    @vo7("addaxList")
    private final List<AddaxBoxDto> addaxList;

    @vo7("app")
    private List<HomeAppDto> app;

    @vo7("apps")
    private final List<HomeAppsDto> apps;

    @vo7("bannerApps")
    private final List<HomeBannerAppsDto> bannerApps;

    @vo7("banners")
    private final List<HomeBannerDto> banners;

    @vo7("bannersList")
    private final List<HomeMovieBannerListDto> bannersList;

    @vo7("dynamicButton")
    private final DynamicButtonDto dynamicButton;

    @vo7("eol")
    private final boolean eol;

    @vo7("exts")
    private final List<ExtensionPointDto> exts;

    @vo7("hugeBanner")
    private final HugeBannerDto hugeBanner;

    @vo7("movieBannerLists")
    private final List<MovieBannerLists> movieBannerLists;

    @vo7("topBanners")
    private final List<HomeBannerDto> topBanners;

    @vo7("videos")
    private List<HomeVideoListDto> videos;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeDto(List<HomeBannerDto> list, List<HomeBannerDto> list2, List<HomeAppDto> list3, List<? extends HomeAppsDto> list4, List<ExtensionPointDto> list5, List<HomeVideoListDto> list6, HugeBannerDto hugeBannerDto, List<HomeBannerAppsDto> list7, DynamicButtonDto dynamicButtonDto, List<MovieBannerLists> list8, List<AddaxBoxDto> list9, List<HomeMovieBannerListDto> list10, boolean z) {
        this.topBanners = list;
        this.banners = list2;
        this.app = list3;
        this.apps = list4;
        this.exts = list5;
        this.videos = list6;
        this.hugeBanner = hugeBannerDto;
        this.bannerApps = list7;
        this.dynamicButton = dynamicButtonDto;
        this.movieBannerLists = list8;
        this.addaxList = list9;
        this.bannersList = list10;
        this.eol = z;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final List<AddaxBoxDto> getAddaxList() {
        return this.addaxList;
    }

    public final List<HomeAppDto> getApp() {
        return this.app;
    }

    public final List<HomeAppsDto> getApps() {
        return this.apps;
    }

    public final List<HomeBannerAppsDto> getBannerApps() {
        return this.bannerApps;
    }

    public final List<HomeBannerDto> getBanners() {
        return this.banners;
    }

    public final List<HomeMovieBannerListDto> getBannersList() {
        return this.bannersList;
    }

    public final DynamicButtonDto getDynamicButton() {
        return this.dynamicButton;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<ExtensionPointDto> getExts() {
        return this.exts;
    }

    public final HugeBannerDto getHugeBanner() {
        return this.hugeBanner;
    }

    public final List<MovieBannerLists> getMovieBannerLists() {
        return this.movieBannerLists;
    }

    public final List<HomeBannerDto> getTopBanners() {
        return this.topBanners;
    }

    public final List<HomeVideoListDto> getVideos() {
        return this.videos;
    }

    public final void setApp(List<HomeAppDto> list) {
        this.app = list;
    }

    public final void setVideos(List<HomeVideoListDto> list) {
        this.videos = list;
    }

    public /* synthetic */ HomeDto(List list, List list2, List list3, List list4, List list5, List list6, HugeBannerDto hugeBannerDto, List list7, DynamicButtonDto dynamicButtonDto, List list8, List list9, List list10, boolean z, int i, yd1 yd1Var) {
        this(list, list2, list3, list4, list5, list6, hugeBannerDto, list7, dynamicButtonDto, list8, list9, list10, (i & 4096) != 0 ? false : z);
    }
}
