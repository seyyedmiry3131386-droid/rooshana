package ir.mservices.market.app.home;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.av;
import defpackage.bj2;
import defpackage.bl4;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.dc0;
import defpackage.dp2;
import defpackage.dv2;
import defpackage.dw1;
import defpackage.e71;
import defpackage.f88;
import defpackage.fv7;
import defpackage.g51;
import defpackage.gu9;
import defpackage.hl5;
import defpackage.is3;
import defpackage.ja1;
import defpackage.js3;
import defpackage.k45;
import defpackage.lc3;
import defpackage.mc3;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.sl0;
import defpackage.t15;
import defpackage.tb1;
import defpackage.th;
import defpackage.tx8;
import defpackage.up;
import defpackage.ut4;
import defpackage.vb7;
import defpackage.vp7;
import defpackage.vr2;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.wv8;
import defpackage.xe2;
import defpackage.y97;
import defpackage.yg2;
import defpackage.yl5;
import defpackage.yu0;
import ir.mservices.market.app.common.data.DisplayMode;
import ir.mservices.market.app.common.data.HomeAppsDto;
import ir.mservices.market.app.common.recycler.FilteredAppNestedData;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotListData;
import ir.mservices.market.app.detail.ui.recycler.AppVideoShotData;
import ir.mservices.market.app.home.HomeAction;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.app.home.data.ExtensionHomeAppDto;
import ir.mservices.market.app.home.data.HomeAppDto;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.app.home.data.HomeDto;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.app.home.data.HomeVideoListDto;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppsData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeExtReviewModuleData;
import ir.mservices.market.app.home.ui.recycler.HomeExtensionReviewData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.home.ui.recycler.HomeSingleAppData;
import ir.mservices.market.app.home.ui.recycler.HomeTopBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeVideoData;
import ir.mservices.market.app.home.ui.recycler.HomeVideoListData;
import ir.mservices.market.app.home.ui.recycler.HugeBannerData;
import ir.mservices.market.app.packages.data.PackageDto;
import ir.mservices.market.common.data.DynamicButtonDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.model.SubmitCommentRepository$getCommentFlow$$inlined$transform$1;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.BackgroundImageDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.data.webapi.MovieListDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import ir.mservices.market.version2.webapi.responsedto.MovieBannerLists;
import ir.mservices.market.version2.webapi.responsedto.VideoRowDto;
import ir.mservices.market.viewModel.BaseHomeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeViewModel extends BaseHomeViewModel {
    public final vp7 A;
    public final hl5 B;
    public final wv8 C;
    public final t15 D;
    public final vr2 E;
    public final vr2 F;
    public final k45 G;
    public final ut4 H;
    public final i I;
    public final pv6 J;
    public final l K;
    public final i L;
    public String M;
    public boolean N;
    public final dv2 x;
    public final yl5 y;
    public final a z;

    /* JADX INFO: renamed from: ir.mservices.market.app.home.HomeViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.home.HomeViewModel$1", f = "HomeViewModel.kt", l = {783}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return HomeViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            HomeViewModel homeViewModel = HomeViewModel.this;
            pv6 pv6Var = homeViewModel.u;
            bj2 bj2Var = new bj2(2, homeViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 6), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.home.HomeViewModel$createMovieListRowsData$1, reason: invalid class name and case insensitive filesystem */
    public static final /* synthetic */ class C01681 extends FunctionReferenceImpl implements dp2 {
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            String str = (String) obj;
            js3.p(str, "p0");
            ((HomeViewModel) this.receiver).k(str);
            return tx8.a;
        }
    }

    public HomeViewModel(dv2 dv2Var, yl5 yl5Var, a aVar, vp7 vp7Var, hl5 hl5Var, wv8 wv8Var, t15 t15Var, vr2 vr2Var, vr2 vr2Var2, k45 k45Var, ut4 ut4Var) {
        js3.p(dv2Var, "graphicUtils");
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(aVar, "installQueue");
        this.x = dv2Var;
        this.y = yl5Var;
        this.z = aVar;
        this.A = vp7Var;
        this.B = hl5Var;
        this.C = wv8Var;
        this.D = t15Var;
        this.E = vr2Var;
        this.F = vr2Var2;
        this.G = k45Var;
        this.H = ut4Var;
        i iVarE = vy2.e(0, 7, null);
        this.I = iVarE;
        this.J = new pv6(iVarE);
        this.K = ja1.b(null);
        this.L = vy2.e(0, 7, null);
        this.M = "";
        this.N = true;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    private final MovieHomeMoviesRowData createMovieListRowsData(HomeMovieListDto homeMovieListDto) {
        String headerTitle = homeMovieListDto.getHeaderTitle();
        if (headerTitle == null) {
            headerTitle = "";
        }
        return new MovieHomeMoviesRowData(homeMovieListDto, getMovieNestedList(new MovieListDto(headerTitle, homeMovieListDto.getEol(), homeMovieListDto.getAnalyticsName(), homeMovieListDto.getMovies(), homeMovieListDto.getIgnoreConditions()), homeMovieListDto.getAnalyticsName(), homeMovieListDto.getListKey(), homeMovieListDto.getBackgroundImage()), this.N, null, false, null, homeMovieListDto.getDisplayMode(), new C01681(1, this, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 880);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillHomeData(HomeDto homeDto) {
        HomeBannerAppsDto homeBannerAppsDto;
        List<HomeBannerAppDto> apps;
        ExtensionPointDto extensionPointDto;
        String url;
        final HomeViewModel homeViewModel = this;
        ArrayList arrayList = new ArrayList();
        ArrayList<Object> arrayList2 = new ArrayList();
        List<HomeBannerDto> banners = homeDto.getBanners();
        if (banners != null) {
            arrayList2.addAll(banners);
        }
        List<HomeAppDto> app = homeDto.getApp();
        if (app != null) {
            arrayList2.addAll(app);
        }
        List<HomeAppsDto> apps2 = homeDto.getApps();
        if (apps2 != null) {
            arrayList2.addAll(apps2);
        }
        List<ExtensionPointDto> exts = homeDto.getExts();
        if (exts != null) {
            arrayList2.addAll(exts);
        }
        List<HomeVideoListDto> videos = homeDto.getVideos();
        if (videos != null) {
            arrayList2.addAll(videos);
        }
        List<HomeBannerAppsDto> bannerApps = homeDto.getBannerApps();
        if (bannerApps != null) {
            arrayList2.addAll(bannerApps);
        }
        List<MovieBannerLists> movieBannerLists = homeDto.getMovieBannerLists();
        if (movieBannerLists != null) {
            arrayList2.addAll(movieBannerLists);
        }
        List<AddaxBoxDto> addaxList = homeDto.getAddaxList();
        if (addaxList != null) {
            arrayList2.addAll(addaxList);
        }
        List<HomeMovieBannerListDto> bannersList = homeDto.getBannersList();
        if (bannersList != null) {
            arrayList2.addAll(bannersList);
        }
        if (arrayList2.size() > 1) {
            yu0.Y(arrayList2, new yg2(20));
        }
        List<HomeBannerDto> topBanners = homeDto.getTopBanners();
        List listJ0 = topBanners != null ? kotlin.collections.a.J0(topBanners, new yg2(21)) : null;
        if (homeDto.getHugeBanner() != null) {
            arrayList.add(new HugeBannerData(homeDto.getHugeBanner()));
        } else if (listJ0 != null && !listJ0.isEmpty()) {
            if (listJ0.size() == 1) {
                arrayList.add(new HomeBannerData((HomeBannerDto) listJ0.get(0)));
            } else {
                arrayList.add(new HomeTopBannerData());
            }
        }
        for (Object obj : arrayList2) {
            if (obj instanceof HomeAppDto) {
                HomeAppDto homeAppDto = (HomeAppDto) obj;
                if (homeAppDto.getApplication() != null) {
                    GeneralFilter generalFilterA = ir.mservices.market.version2.ui.recycler.filter.a.a(homeAppDto.getIgnoreConditions());
                    if (generalFilterA == null || !generalFilterA.u(new FilteredAppNestedData(homeAppDto.getApplication()))) {
                        String packageName = homeAppDto.getApplication().getPackageName();
                        bz6 singleApp = homeViewModel.getSingleApp(homeAppDto);
                        HomeViewModel$fillHomeData$11$homeSingleAppData$1 homeViewModel$fillHomeData$11$homeSingleAppData$1 = new HomeViewModel$fillHomeData$11$homeSingleAppData$1(1, homeViewModel, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0);
                        js3.m(packageName);
                        HomeSingleAppData homeSingleAppData = new HomeSingleAppData(singleApp, homeAppDto, packageName, homeViewModel$fillHomeData$11$homeSingleAppData$1);
                        String title = homeAppDto.getTitle();
                        if (title != null && !f88.n0(title)) {
                            arrayList.add(new HomeMoreTitleRowData(homeAppDto.getTitle(), "", homeAppDto.getAdInfoDto(), false, null, null, null, packageName, 112));
                        }
                        arrayList.add(homeSingleAppData);
                        homeViewModel = this;
                    }
                }
            }
            if (obj instanceof HomeAppsDto) {
                HomeAppsDto homeAppsDto = (HomeAppsDto) obj;
                if (homeAppsDto.getApps() != null) {
                    PackageDto packageDto = new PackageDto(homeAppsDto.getTitle(), homeAppsDto.getApps(), homeAppsDto.getEol(), "", homeAppsDto.getIgnoreConditions());
                    String packageKey = homeAppsDto.getPackageKey();
                    if (packageKey == null || f88.n0(packageKey)) {
                        homeViewModel = this;
                    } else {
                        String packageKey2 = homeAppsDto.getPackageKey();
                        homeViewModel = this;
                        HomeAppsRowData homeAppsRowData = new HomeAppsRowData(homeAppsDto, homeAppsDto, getHomeAppNestedList(packageDto, homeAppsDto.getPackageKey(), this, homeAppsDto.isMulti(), homeAppsDto.isDigested()), null, packageKey2, homeViewModel.N, new HomeViewModel$fillHomeData$11$homeAppsRowData$1(1, homeViewModel, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 8);
                        String title2 = homeAppsDto.getTitle();
                        if (title2 != null && !f88.n0(title2)) {
                            arrayList.add(new HomeMoreTitleRowData(homeAppsDto.getTitle(), homeAppsDto.getPackageKey(), homeAppsDto.getAdInfoDTO(), !f88.n0(homeAppsDto.getPackageKey()), null, null, null, packageKey2, 112));
                        }
                        arrayList.add(homeAppsRowData);
                    }
                }
            }
            homeViewModel = this;
            if (obj instanceof HomeBannerDto) {
                HomeBannerDto homeBannerDto = (HomeBannerDto) obj;
                String title3 = homeBannerDto.getTitle();
                if (title3 != null && !f88.n0(title3)) {
                    arrayList.add(new HomeMoreTitleRowData(homeBannerDto.getTitle(), "", null, false, null, null, null, null, 248));
                }
                arrayList.add(new HomeBannerData(homeBannerDto));
            } else if (!(obj instanceof ExtensionPointDto) || (url = (extensionPointDto = (ExtensionPointDto) obj).getUrl()) == null || f88.n0(url)) {
                if (obj instanceof HomeVideoListDto) {
                    HomeVideoListDto homeVideoListDto = (HomeVideoListDto) obj;
                    if (homeVideoListDto.getVideos() != null) {
                        long j = is3.p + 1;
                        is3.p = j;
                        HomeVideoListData homeVideoListData = new HomeVideoListData(homeVideoListDto, homeViewModel.getHomeVideoApps(homeVideoListDto), j, new HomeViewModel$fillHomeData$11$homeVideoListData$1(1, homeViewModel, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0));
                        String title4 = homeVideoListDto.getTitle();
                        if (title4 != null && !f88.n0(title4)) {
                            String title5 = homeVideoListDto.getTitle();
                            String strValueOf = String.valueOf(j);
                            AdInfoDto adInfoDTO = homeVideoListDto.getAdInfoDTO();
                            List<VideoRowDto> videos2 = homeVideoListDto.getVideos();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<T> it = videos2.iterator();
                            while (it.hasNext()) {
                                ApplicationDTO application = ((VideoRowDto) it.next()).getApplication();
                                if (application != null) {
                                    arrayList3.add(application);
                                }
                            }
                            arrayList.add(new HomeMoreTitleRowData(title5, strValueOf, adInfoDTO, true, null, kotlin.collections.a.Q0(arrayList3), homeVideoListDto.getIgnoreConditions(), String.valueOf(j), 16));
                        }
                        arrayList.add(homeVideoListData);
                    }
                }
                if ((obj instanceof HomeBannerAppsDto) && (apps = (homeBannerAppsDto = (HomeBannerAppsDto) obj).getApps()) != null && !apps.isEmpty()) {
                    long j2 = is3.p + 1;
                    is3.p = j2;
                    HomeBannerAppsData homeBannerAppsData = new HomeBannerAppsData(homeBannerAppsDto, homeViewModel.getHomeBannerApps(homeBannerAppsDto), j2, homeViewModel.N, new HomeViewModel$fillHomeData$11$homeBannerAppsData$1(1, homeViewModel, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0));
                    String title6 = homeBannerAppsDto.getTitle();
                    if (title6 != null && !f88.n0(title6)) {
                        String title7 = homeBannerAppsDto.getTitle();
                        AdInfoDto adInfoDTO2 = homeBannerAppsDto.getAdInfoDTO();
                        List<HomeBannerAppDto> apps3 = homeBannerAppsDto.getApps();
                        ArrayList arrayList4 = new ArrayList(wu0.V(apps3, 10));
                        Iterator<T> it2 = apps3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((HomeBannerAppDto) it2.next()).getApp());
                        }
                        ArrayList arrayListQ0 = kotlin.collections.a.Q0(arrayList4);
                        List<String> ignoreConditions = homeBannerAppsDto.getIgnoreConditions();
                        arrayList.add(new HomeMoreTitleRowData(title7, "", adInfoDTO2, false, null, arrayListQ0, ignoreConditions != null ? kotlin.collections.a.Q0(ignoreConditions) : null, String.valueOf(j2), 16));
                    }
                    arrayList.add(homeBannerAppsData);
                } else if (obj instanceof MovieBannerLists) {
                    MovieBannerLists movieBannerLists2 = (MovieBannerLists) obj;
                    if (movieBannerLists2.getItem() != null) {
                        arrayList.add(homeViewModel.createMovieListRowsData(movieBannerLists2.getItem()));
                    }
                } else {
                    if (obj instanceof AddaxBoxDto) {
                        AddaxBoxDto addaxBoxDto = (AddaxBoxDto) obj;
                        if (addaxBoxDto.canAddAddax()) {
                            arrayList.add(new AddaxBoxData(addaxBoxDto));
                            bt2.G(y97.G(homeViewModel), null, null, new HomeViewModel$fillHomeData$11$7(homeViewModel, addaxBoxDto, null), 3);
                        }
                    }
                    if (obj instanceof HomeMovieBannerListDto) {
                        HomeMovieBannerListDto homeMovieBannerListDto = (HomeMovieBannerListDto) obj;
                        if (!homeMovieBannerListDto.getBanners().isEmpty()) {
                            arrayList.add(new MovieHomeBannersRowData(homeMovieBannerListDto, new bz6(e.b(gu9.x(homeViewModel.H.i(homeMovieBannerListDto, homeMovieBannerListDto.getBannerListKey(), homeMovieBannerListDto.getRefId(), homeViewModel), new sl0(17)), y97.G(homeViewModel)), null, null, null, 14), false, null, false, homeViewModel.N, null, false, null, homeMovieBannerListDto.getSpan(), homeMovieBannerListDto.getDisplayMode(), new HomeViewModel$fillHomeData$11$bannerNestedData$2(1, homeViewModel, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 460));
                        }
                    }
                }
            } else {
                String url2 = extensionPointDto.getUrl();
                boolean zEqualsIgnoreCase = ExtensionPointDto.TYPE_APP_LIST.equalsIgnoreCase(extensionPointDto.getType());
                final wv8 wv8Var = homeViewModel.C;
                if (zEqualsIgnoreCase || ExtensionPointDto.TYPE_UPDATE_APP_LIST.equalsIgnoreCase(extensionPointDto.getType())) {
                    pv6 pv6VarB = e.b(dw1.e(wv8Var, extensionPointDto.getUrl(), homeViewModel, true), y97.G(homeViewModel));
                    arrayList.add(new ExtHeaderRowData(homeViewModel.getExtHeaderAppsData(extensionPointDto, extensionPointDto.getUrl(), pv6VarB), url2, homeViewModel.N, new HomeViewModel$fillHomeData$11$1$1(1, this, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 56));
                    homeViewModel = this;
                    arrayList.add(new HomeAppsRowData(null, (DisplayMode) obj, getExtensionApps(extensionPointDto, pv6VarB), null, url2, this.N, new HomeViewModel$fillHomeData$11$1$2(1, homeViewModel, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 8));
                } else if (ExtensionPointDto.TYPE_APP.equalsIgnoreCase(extensionPointDto.getType())) {
                    final String url3 = extensionPointDto.getUrl();
                    wv8Var.getClass();
                    js3.p(url3, "url");
                    arrayList.add(new HomeSingleAppData(homeViewModel.getExtensionApp(extensionPointDto, e.b((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.common.ext.model.a
                        @Override // defpackage.bp2
                        public final Object invoke() {
                            return new ir.mservices.market.model.paging.b(new ExtensionAppsRepositoryImpl$getExtensionApp$1$1(wv8Var, url3, homeViewModel, null));
                        }
                    }).a, y97.G(homeViewModel))), (DisplayMode) obj, url2, new HomeViewModel$fillHomeData$11$2(1, homeViewModel, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
                } else if (ExtensionPointDto.TYPE_APP_REVIEW_LIST.equalsIgnoreCase(extensionPointDto.getType())) {
                    pv6 pv6VarB2 = e.b(dw1.e(wv8Var, extensionPointDto.getUrl(), homeViewModel, true), y97.G(homeViewModel));
                    arrayList.add(new ExtHeaderRowData(homeViewModel.getExtHeaderAppsData(extensionPointDto, extensionPointDto.getUrl(), pv6VarB2), url2, homeViewModel.N, new HomeViewModel$fillHomeData$11$3$1(1, homeViewModel, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 56));
                    arrayList.add(new HomeExtReviewModuleData(url2, homeViewModel.getExtensionReviews(extensionPointDto, pv6VarB2), extensionPointDto, homeViewModel.N, new HomeViewModel$fillHomeData$11$3$2(1, this, HomeViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
                    homeViewModel = this;
                }
            }
        }
        DynamicButtonDto dynamicButton = homeDto.getDynamicButton();
        if (dynamicButton != null) {
            l lVar = homeViewModel.v;
            lVar.getClass();
            lVar.p(null, dynamicButton);
        }
        ArrayList arrayList5 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            bl4.G((MyketRecyclerData) it3.next(), arrayList5);
        }
        return arrayList5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fillHomeData$lambda$11$5(HomeMovieBannerListDto homeMovieBannerListDto) {
        js3.p(homeMovieBannerListDto, "dto");
        List<HomeMovieBannerDto> banners = homeMovieBannerListDto.getBanners();
        ArrayList arrayList = new ArrayList(wu0.V(banners, 10));
        Iterator<T> it = banners.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new MovieHomeBannersItemData((HomeMovieBannerDto) it.next())));
        }
        return arrayList;
    }

    private final xe2 getCommentScenarioFlow(String str) {
        return new vb7(new SubmitCommentRepository$getCommentFlow$$inlined$transform$1(this.E.g.f, null, str));
    }

    private final bz6 getExtHeaderAppsData(ExtensionPointDto extensionPointDto, String str, xe2 xe2Var) {
        return new bz6(e.b(gu9.x(xe2Var, new up(extensionPointDto, str, 1)), y97.G(this)), null, null, e.b(gu9.x(this.D.h(extensionPointDto, ExtensionPointDto.TYPE_HEADER), new sl0(18)), y97.G(this)), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtHeaderAppsData$lambda$0(ExtensionPointDto extensionPointDto, String str, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        ArrayList arrayList = new ArrayList();
        String title = homeExtensionAppsDto.getTitle();
        if (title != null && !f88.n0(title) && !homeExtensionAppsDto.getApps().isEmpty()) {
            arrayList.add(new RecyclerItem(new ExtHeaderData(extensionPointDto.getType(), str, homeExtensionAppsDto.getTitle(), homeExtensionAppsDto.getAdInfoDto())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtHeaderAppsData$lambda$1(fv7 fv7Var) {
        js3.p(fv7Var, "it");
        ArrayList arrayList = fv7Var.a;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    private final bz6 getExtensionApp(ExtensionPointDto extensionPointDto, xe2 xe2Var) {
        return new bz6(e.b(gu9.x(xe2Var, new lc3(this, extensionPointDto)), y97.G(this)), null, null, e.b(gu9.x(this.D.g(extensionPointDto), new sl0(19)), y97.G(this)), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionApp$lambda$0(HomeViewModel homeViewModel, ExtensionPointDto extensionPointDto, ExtensionHomeAppDto extensionHomeAppDto) {
        js3.p(extensionHomeAppDto, "it");
        ApplicationDTO app = extensionHomeAppDto.getApp();
        if (app == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<ScreenshotDto> screenshots = extensionHomeAppDto.getScreenshots();
        if (screenshots != null) {
            VideoShotDto videoshot = extensionHomeAppDto.getVideoshot();
            String packageName = app.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            String refId = app.getRefId();
            js3.o(refId, "getRefId(...)");
            arrayList.add(new RecyclerItem(new AppScreenshotListData(new bz6(homeViewModel.getScreeShotsRecyclerItem(screenshots, videoshot, packageName, refId, app.getCallbackUrl(), app.getInstallCallbackUrl(), app.getClickCallback()), (GeneralFilter) null, (qp2) null, 6))));
        }
        String title = app.getTitle();
        js3.o(title, "getTitle(...)");
        yl5 yl5Var = homeViewModel.y;
        String packageName2 = app.getPackageName();
        js3.o(packageName2, "getPackageName(...)");
        arrayList.add(new RecyclerItem(new FilteredAppNestedData(app, title, true, yl5Var.a(packageName2), homeViewModel.z.b, extensionPointDto.isDigested(), 64, 0)));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionApp$lambda$1(fv7 fv7Var) {
        js3.p(fv7Var, "it");
        ArrayList arrayList = fv7Var.a;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    private final bz6 getExtensionApps(ExtensionPointDto extensionPointDto, xe2 xe2Var) {
        return new bz6(e.b(gu9.x(xe2Var, new lc3(extensionPointDto, this)), y97.G(this)), null, null, e.b(gu9.x(this.D.g(extensionPointDto), new sl0(20)), y97.G(this)), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionApps$lambda$0(ExtensionPointDto extensionPointDto, HomeViewModel homeViewModel, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        List<ApplicationDTO> apps = homeExtensionAppsDto.getApps();
        ArrayList arrayList = new ArrayList(wu0.V(apps, 10));
        for (ApplicationDTO applicationDTO : apps) {
            String title = applicationDTO.getTitle();
            js3.o(title, "getTitle(...)");
            boolean zIsMulti = extensionPointDto.isMulti();
            yl5 yl5Var = homeViewModel.y;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            arrayList.add(new RecyclerItem(new FilteredAppNestedData(applicationDTO, title, zIsMulti, yl5Var.a(packageName), homeViewModel.z.b, extensionPointDto.isDigested(), 64, 0)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionApps$lambda$1(fv7 fv7Var) {
        js3.p(fv7Var, "it");
        ArrayList arrayList = fv7Var.a;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    private final bz6 getExtensionReviews(ExtensionPointDto extensionPointDto, xe2 xe2Var) {
        return new bz6(e.b(gu9.x(xe2Var, new mc3(this, 0)), y97.G(this)), null, null, e.b(gu9.x(this.D.g(extensionPointDto), new sl0(21)), y97.G(this)), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionReviews$lambda$0(HomeViewModel homeViewModel, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        List<ApplicationDTO> apps = homeExtensionAppsDto.getApps();
        ArrayList arrayList = new ArrayList(wu0.V(apps, 10));
        for (ApplicationDTO applicationDTO : apps) {
            InCompleteReviewDto inCompleteReviewDto = new InCompleteReviewDto();
            inCompleteReviewDto.setPackageName(applicationDTO.getPackageName());
            inCompleteReviewDto.setTitle(applicationDTO.getTitle());
            inCompleteReviewDto.setCategoryName(applicationDTO.getCategoryName());
            inCompleteReviewDto.setIconPath(applicationDTO.getIconPath());
            l lVar = homeViewModel.K;
            js3.o(applicationDTO.getPackageName(), "getPackageName(...)");
            av avVar = new av(27);
            lVar.getClass();
            lVar.p(null, avVar);
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            String packageName2 = applicationDTO.getPackageName();
            js3.o(packageName2, "getPackageName(...)");
            xe2 submitCommentStateFlow = homeViewModel.getSubmitCommentStateFlow(packageName2);
            String packageName3 = applicationDTO.getPackageName();
            js3.o(packageName3, "getPackageName(...)");
            arrayList.add(new RecyclerItem(new HomeExtensionReviewData(inCompleteReviewDto, packageName, submitCommentStateFlow, homeViewModel.getCommentScenarioFlow(packageName3))));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionReviews$lambda$1(fv7 fv7Var) {
        js3.p(fv7Var, "it");
        ArrayList arrayList = fv7Var.a;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    private final bz6 getHomeAppNestedList(PackageDto packageDto, String str, Object obj, boolean z, boolean z2) {
        return new bz6(e.b(gu9.x(this.B.h(packageDto, str, null, obj, true), new th(z, this, z2)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getHomeAppNestedList$lambda$0(boolean z, HomeViewModel homeViewModel, boolean z2, PackageDto packageDto) {
        js3.p(packageDto, "it");
        List<ApplicationDTO> appList = packageDto.getAppList();
        if (appList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(wu0.V(appList, 10));
        for (ApplicationDTO applicationDTO : appList) {
            String title = applicationDTO.getTitle();
            js3.o(title, "getTitle(...)");
            yl5 yl5Var = homeViewModel.y;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            arrayList.add(new RecyclerItem(new FilteredAppNestedData(applicationDTO, title, z, yl5Var.a(packageName), homeViewModel.z.b, z2, 64, 0)));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.bz6 getHomeBannerApps(ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto r12) {
        /*
            r11 = this;
            bz6 r0 = new bz6
            vp7 r1 = r11.A
            r1.getClass()
            java.lang.String r1 = "homeItem"
            defpackage.js3.p(r12, r1)
            java.util.List r1 = r12.getIgnoreConditions()
            ir.mservices.market.version2.ui.recycler.filter.GeneralFilter r1 = ir.mservices.market.version2.ui.recycler.filter.a.a(r1)
            if (r1 == 0) goto L52
            java.util.List r2 = r12.getApps()
            r3 = 0
            if (r2 == 0) goto L4d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r2.next()
            r6 = r5
            ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto r6 = (ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto) r6
            ir.mservices.market.app.common.recycler.FilteredAppNestedData r7 = new ir.mservices.market.app.common.recycler.FilteredAppNestedData
            ir.mservices.market.version2.webapi.responsedto.ApplicationDTO r6 = r6.getApp()
            r7.<init>(r6)
            boolean r6 = r1.u(r7)
            if (r6 != 0) goto L26
            r4.add(r5)
            goto L26
        L46:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L4d
            r3 = r4
        L4d:
            if (r3 != 0) goto L50
            goto L52
        L50:
            r8 = r3
            goto L57
        L52:
            java.util.List r3 = r12.getApps()
            goto L50
        L57:
            ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto r4 = new ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto
            java.lang.String r5 = r12.getAnalyticsName()
            java.lang.String r6 = r12.getDisplayMode()
            java.lang.String r7 = r12.getTitle()
            java.util.List r9 = r12.getIgnoreConditions()
            ir.mservices.market.app.detail.data.AdInfoDto r10 = r12.getAdInfoDTO()
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.util.List r1 = defpackage.br9.B(r4)
            na4 r2 = defpackage.bz6.e
            a06 r1 = defpackage.sl3.y(r1, r2)
            d9 r2 = new d9
            r3 = 5
            r2.<init>(r3, r1)
            m r1 = new m
            r3 = 21
            r1.<init>(r11, r12, r3)
            sz5 r12 = defpackage.gu9.x(r2, r1)
            fu0 r1 = defpackage.y97.G(r11)
            pv6 r1 = androidx.paging.e.b(r12, r1)
            r4 = 0
            r5 = 14
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.home.HomeViewModel.getHomeBannerApps(ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto):bz6");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getHomeBannerApps$lambda$0(HomeViewModel homeViewModel, HomeBannerAppsDto homeBannerAppsDto, HomeBannerAppsDto homeBannerAppsDto2) {
        js3.p(homeBannerAppsDto2, "it");
        List<HomeBannerAppDto> apps = homeBannerAppsDto2.getApps();
        if (apps == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(wu0.V(apps, 10));
        for (HomeBannerAppDto homeBannerAppDto : apps) {
            yl5 yl5Var = homeViewModel.y;
            String packageName = homeBannerAppDto.getApp().getPackageName();
            js3.o(packageName, "getPackageName(...)");
            xe2 xe2VarA = yl5Var.a(packageName);
            pv6 pv6Var = homeViewModel.z.b;
            String displayMode = homeBannerAppsDto.getDisplayMode();
            String analyticsName = homeBannerAppsDto.getAnalyticsName();
            arrayList.add(new RecyclerItem(new HomeBannerAppData((vb7) xe2VarA, pv6Var, homeBannerAppDto, displayMode, (analyticsName == null || f88.n0(analyticsName)) ? "" : homeBannerAppsDto.getAnalyticsName())));
        }
        return arrayList;
    }

    private final bz6 getHomeVideoApps(final HomeVideoListDto homeVideoListDto) {
        final vp7 vp7Var = this.A;
        vp7Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.app.home.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                vp7 vp7Var2 = vp7Var;
                dc0 dc0Var = null;
                HomeRepositoryImpl$getVideoList$1$1 homeRepositoryImpl$getVideoList$1$1 = new HomeRepositoryImpl$getVideoList$1$1(vp7Var2, this, null);
                HomeVideoListDto homeVideoListDto2 = homeVideoListDto;
                if (homeVideoListDto2 != null) {
                    boolean z = !homeVideoListDto2.getEol();
                    vp7Var2.getClass();
                    HomeVideoListDto homeVideoListDtoR = vp7.R(homeVideoListDto2, z);
                    if (homeVideoListDtoR.getVideos() != null) {
                        List<VideoRowDto> videos = homeVideoListDto2.getVideos();
                        dc0Var = new dc0(videos != null ? videos.size() : 0, 9, homeVideoListDtoR);
                    }
                }
                return new ir.mservices.market.model.paging.a(homeRepositoryImpl$getVideoList$1$1, dc0Var);
            }
        }).a, new defpackage.m(this, homeVideoListDto, 22)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getHomeVideoApps$lambda$0(HomeViewModel homeViewModel, HomeVideoListDto homeVideoListDto, HomeVideoListDto homeVideoListDto2) {
        RecyclerItem recyclerItem;
        js3.p(homeVideoListDto2, "it");
        List<VideoRowDto> videos = homeVideoListDto2.getVideos();
        if (videos == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoRowDto videoRowDto : videos) {
            ApplicationDTO application = videoRowDto.getApplication();
            if (application != null) {
                yl5 yl5Var = homeViewModel.y;
                String packageName = application.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                recyclerItem = new RecyclerItem(new HomeVideoData((vb7) yl5Var.a(packageName), homeViewModel.z.b, videoRowDto, homeVideoListDto.isDigested(), homeVideoListDto.getTitle(), homeVideoListDto.getAnalyticsName()));
            } else {
                recyclerItem = null;
            }
            if (recyclerItem != null) {
                arrayList.add(recyclerItem);
            }
        }
        return arrayList;
    }

    private final bz6 getMovieNestedList(MovieListDto movieListDto, String str, String str2, BackgroundImageDto backgroundImageDto) {
        return new bz6(e.b(gu9.x(this.G.b(movieListDto, str2, this, true, backgroundImageDto), new defpackage.m(backgroundImageDto, str, 20)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMovieNestedList$lambda$0(BackgroundImageDto backgroundImageDto, String str, MovieListDto movieListDto) {
        js3.p(movieListDto, "it");
        List<MovieDto> movies = movieListDto.getMovies();
        ArrayList arrayList = new ArrayList(wu0.V(movies, 10));
        Iterator<T> it = movies.iterator();
        while (it.hasNext()) {
            MovieHomeMovieData movieHomeMovieData = new MovieHomeMovieData((MovieDto) it.next(), backgroundImageDto != null ? backgroundImageDto.getTextColor() : null, backgroundImageDto != null ? backgroundImageDto.getSpaceCount() : null, backgroundImageDto != null ? 2 : 1);
            movieHomeMovieData.f = str;
            arrayList.add(new RecyclerItem(movieHomeMovieData));
        }
        return arrayList;
    }

    private final List<RecyclerItem> getScreeShotsRecyclerItem(List<ScreenshotDto> list, VideoShotDto videoShotDto, String str, String str2, String str3, String str4, String str5) {
        ArrayList arrayList = new ArrayList();
        if (videoShotDto != null) {
            arrayList.add(new RecyclerItem(new AppVideoShotData(str, videoShotDto, this.L, str2, str3, str4, str5)));
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RecyclerItem(new AppScreenshotData((ScreenshotDto) it.next(), list, str, str2, str3, str4, str5)));
            }
        }
        return arrayList;
    }

    private final bz6 getSingleApp(HomeAppDto homeAppDto) {
        ApplicationDTO application = homeAppDto.getApplication();
        js3.n(application, "null cannot be cast to non-null type ir.mservices.market.version2.webapi.responsedto.ApplicationDTO");
        ArrayList arrayList = new ArrayList();
        List<ScreenshotDto> screenshots = homeAppDto.getScreenshots();
        VideoShotDto videoshot = homeAppDto.getVideoshot();
        String packageName = homeAppDto.getApplication().getPackageName();
        js3.o(packageName, "getPackageName(...)");
        String refId = homeAppDto.getApplication().getRefId();
        js3.o(refId, "getRefId(...)");
        arrayList.add(new RecyclerItem(new AppScreenshotListData(new bz6(getScreeShotsRecyclerItem(screenshots, videoshot, packageName, refId, homeAppDto.getApplication().getCallbackUrl(), homeAppDto.getApplication().getInstallCallbackUrl(), homeAppDto.getApplication().getClickCallback()), (GeneralFilter) null, (qp2) null, 6))));
        String title = application.getTitle();
        js3.o(title, "getTitle(...)");
        String packageName2 = application.getPackageName();
        js3.o(packageName2, "getPackageName(...)");
        arrayList.add(new RecyclerItem(new FilteredAppNestedData(application, title, true, this.y.a(packageName2), this.z.b, homeAppDto.isDigested(), 64, 0)));
        return new bz6(arrayList, (GeneralFilter) null, (qp2) null, 6);
    }

    private final xe2 getSubmitCommentStateFlow(String str) {
        ir.mservices.market.common.model.a aVar = this.F.g;
        return new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, str, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitAction(HomeAction.InitAction initAction) {
        this.M = initAction.getCategoryId();
        this.N = initAction.getHasSideNavigation();
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new HomeViewModel$doRequest$1(this, this.x.d(), null));
    }
}
