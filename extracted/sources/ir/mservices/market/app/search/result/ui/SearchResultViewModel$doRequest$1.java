package ir.mservices.market.app.search.result.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bl4;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.ca7;
import defpackage.dp2;
import defpackage.f88;
import defpackage.g51;
import defpackage.gu9;
import defpackage.hl5;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k45;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v25;
import defpackage.vb7;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.y97;
import defpackage.yl5;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.home.ui.recycler.SearchBannerData;
import ir.mservices.market.app.packages.data.PackageDto;
import ir.mservices.market.app.search.result.data.SearchApplicationListDTO;
import ir.mservices.market.app.search.result.data.SearchItemDto;
import ir.mservices.market.app.search.result.ui.recycler.RestrictedApplicationData;
import ir.mservices.market.app.search.result.ui.recycler.SearchAdsAppData;
import ir.mservices.market.app.search.result.ui.recycler.SearchAppListData;
import ir.mservices.market.app.search.result.ui.recycler.SearchAppListMoreData;
import ir.mservices.market.app.search.result.ui.recycler.SearchNormalAppData;
import ir.mservices.market.app.search.result.ui.recycler.SearchScreenshotAppData;
import ir.mservices.market.app.search.result.ui.recycler.SearchScrollableScreenshotAppData;
import ir.mservices.market.app.search.result.ui.recycler.SearchSummaryAppData;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.movie.data.webapi.MovieListDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.movie.ui.home.recycler.SearchMovieBannerData;
import ir.mservices.market.version2.webapi.responsedto.SearchAppListDto;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.search.result.ui.SearchResultViewModel$doRequest$1", f = "SearchResultViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SearchResultViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ SearchResultViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultViewModel$doRequest$1(SearchResultViewModel searchResultViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = searchResultViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SearchResultViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchResultViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        final bz6 bz6Var = new bz6();
        final SearchResultViewModel searchResultViewModel = this.a;
        final ca7 ca7Var = searchResultViewModel.v;
        jd7 jd7Var = searchResultViewModel.t;
        final String str = (String) jd7Var.b("BUNDLE_KEY_QUERY");
        if (str == null) {
            str = "";
        }
        Integer num = (Integer) jd7Var.b("BUNDLE_KEY_INDEX");
        int iIntValue = num != null ? num.intValue() : -1;
        String str2 = (String) jd7Var.b("BUNDLE_KEY_QUERY_SOURCE");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) jd7Var.b("BUNDLE_KEY_TAB");
        String str4 = str3 != null ? str3 : "";
        ca7Var.getClass();
        final String str5 = str2;
        final String str6 = str4;
        final int i = iIntValue;
        bz6Var.a = e.b(gu9.x((xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.app.search.result.ui.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new AppSearchResultRepositoryImpl$getAppSearchResult$1$1(ca7Var, str, i, str5, str6, searchResultViewModel, null), null);
            }
        }).a, new dp2() { // from class: ir.mservices.market.app.search.result.ui.b
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                Object value;
                SearchApplicationListDTO searchApplicationListDTO;
                HomeBannerDto appBanner;
                SearchApplicationListDTO searchApplicationListDTO2 = (SearchApplicationListDTO) obj2;
                bz6 bz6Var2 = bz6Var;
                Filter filterA = bz6Var2.b;
                if (filterA == null) {
                    List<String> ignoreConditions = searchApplicationListDTO2.getIgnoreConditions();
                    if (ignoreConditions == null) {
                        ignoreConditions = EmptyList.a;
                    }
                    filterA = ir.mservices.market.version2.ui.recycler.filter.a.a(ignoreConditions);
                }
                bz6Var2.b = filterA;
                SearchResultViewModel searchResultViewModel2 = searchResultViewModel;
                i iVar = searchResultViewModel2.C;
                ir.mservices.market.version2.manager.install.a aVar = searchResultViewModel2.x;
                yl5 yl5Var = searchResultViewModel2.y;
                ArrayList arrayList = new ArrayList();
                if (searchResultViewModel2.z) {
                    searchResultViewModel2.G = searchApplicationListDTO2.getGooglePlaySearch();
                }
                l lVar = searchResultViewModel2.H;
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, searchApplicationListDTO2.getGoogleSearchConfig()));
                for (SearchItemDto searchItemDto : searchApplicationListDTO2.getItems()) {
                    String itemType = searchItemDto.getItemType();
                    switch (itemType.hashCode()) {
                        case -1295505267:
                            searchApplicationListDTO = searchApplicationListDTO2;
                            if (itemType.equals(SearchItemDto.APP_BANNER) && (appBanner = searchItemDto.getAppBanner()) != null) {
                                String title = appBanner.getTitle();
                                if (title != null && !f88.n0(title)) {
                                    arrayList.add(new HomeMoreTitleRowData(appBanner.getTitle(), appBanner.getItemId(), null, false, null, null, null, null, 240));
                                }
                                arrayList.add(new SearchBannerData(appBanner));
                                continue;
                            }
                            searchApplicationListDTO2 = searchApplicationListDTO;
                            break;
                        case -1103664178:
                            searchApplicationListDTO = searchApplicationListDTO2;
                            if (itemType.equals(SearchItemDto.MOVIE_LIST)) {
                                HomeMovieListDto movieList = searchItemDto.getMovieList();
                                if (movieList != null) {
                                    HomeMovieListDto homeMovieListDto = !movieList.getMovies().isEmpty() ? movieList : null;
                                    if (homeMovieListDto != null) {
                                        String analyticsName = homeMovieListDto.getAnalyticsName();
                                        String listKey = homeMovieListDto.getListKey();
                                        k45 k45Var = searchResultViewModel2.u;
                                        String headerTitle = homeMovieListDto.getHeaderTitle();
                                        SearchResultViewModel searchResultViewModel3 = searchResultViewModel2;
                                        searchResultViewModel2 = searchResultViewModel3;
                                        arrayList.add(new MovieHomeMoviesRowData(homeMovieListDto, new bz6(e.b(gu9.x(k45Var.b(new MovieListDto(headerTitle == null ? "" : headerTitle, homeMovieListDto.getEol(), homeMovieListDto.getAnalyticsName(), homeMovieListDto.getMovies(), homeMovieListDto.getIgnoreConditions()), listKey, searchResultViewModel3, true, homeMovieListDto.getBackgroundImage()), new v25(homeMovieListDto, analyticsName, 20)), y97.G(searchResultViewModel2)), null, null, null, 14), false, null, false, null, homeMovieListDto.getDisplayMode(), new SearchResultViewModel$homeSearchResultMapper$2$4$1(1, searchResultViewModel2, SearchResultViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 892));
                                    }
                                } else {
                                    continue;
                                }
                            }
                            searchApplicationListDTO2 = searchApplicationListDTO;
                            break;
                        case -858176652:
                            searchApplicationListDTO = searchApplicationListDTO2;
                            if (itemType.equals(SearchItemDto.APP_SCROLLABLE_SCREENSHOT)) {
                                SearchSpecialAppDTO app = searchItemDto.getApp();
                                String itemType2 = searchItemDto.getItemType();
                                String packageName = searchItemDto.getApp().getApplication().getPackageName();
                                js3.o(packageName, "getPackageName(...)");
                                arrayList.add(new SearchScrollableScreenshotAppData(app, itemType2, (vb7) yl5Var.a(packageName), aVar.b, iVar));
                                continue;
                            }
                            searchApplicationListDTO2 = searchApplicationListDTO;
                            break;
                        case -218513950:
                            searchApplicationListDTO = searchApplicationListDTO2;
                            if (itemType.equals(SearchItemDto.APP_COMPACT)) {
                                String bgColor = searchItemDto.getApp().getBgColor();
                                if (bgColor == null || f88.n0(bgColor)) {
                                    String packageName2 = searchItemDto.getApp().getApplication().getPackageName();
                                    SearchSpecialAppDTO app2 = searchItemDto.getApp();
                                    String itemType3 = searchItemDto.getItemType();
                                    js3.m(packageName2);
                                    arrayList.add(new SearchNormalAppData(app2, itemType3, (vb7) yl5Var.a(packageName2), aVar.b));
                                } else {
                                    String packageName3 = searchItemDto.getApp().getApplication().getPackageName();
                                    SearchSpecialAppDTO app3 = searchItemDto.getApp();
                                    String itemType4 = searchItemDto.getItemType();
                                    js3.m(packageName3);
                                    arrayList.add(new SearchAdsAppData(app3, itemType4, (vb7) yl5Var.a(packageName3), aVar.b));
                                    continue;
                                }
                            }
                            searchApplicationListDTO2 = searchApplicationListDTO;
                            break;
                        case -58184100:
                            searchApplicationListDTO = searchApplicationListDTO2;
                            if (itemType.equals(SearchItemDto.MOVIE_BANNER)) {
                                HomeMovieBannerDto movieBanner = searchItemDto.getMovieBanner();
                                if (movieBanner != null) {
                                    arrayList.add(new SearchMovieBannerData(movieBanner, null, false));
                                } else {
                                    continue;
                                }
                            }
                            searchApplicationListDTO2 = searchApplicationListDTO;
                            break;
                        case 858738495:
                            searchApplicationListDTO = searchApplicationListDTO2;
                            if (itemType.equals(SearchItemDto.APP_SUMMARY)) {
                                SearchSpecialAppDTO app4 = searchItemDto.getApp();
                                String itemType5 = searchItemDto.getItemType();
                                String packageName4 = searchItemDto.getApp().getApplication().getPackageName();
                                js3.o(packageName4, "getPackageName(...)");
                                arrayList.add(new SearchSummaryAppData(app4, itemType5, (vb7) yl5Var.a(packageName4), aVar.b));
                                continue;
                            }
                            searchApplicationListDTO2 = searchApplicationListDTO;
                            break;
                        case 870465087:
                            if (itemType.equals(SearchItemDto.APP_LIST)) {
                                SearchAppListDto appList = searchItemDto.getAppList();
                                if (!appList.isMulti() && appList.getApps() != null) {
                                    hl5 hl5Var = searchResultViewModel2.w;
                                    PackageDto packageDto = new PackageDto(appList.getTitle(), appList.getApps(), appList.getEol(), "", appList.getIgnoreConditions());
                                    String packageKey = appList.getPackageKey();
                                    if (packageKey == null) {
                                        packageKey = "";
                                    }
                                    SearchResultViewModel searchResultViewModel4 = searchResultViewModel2;
                                    searchResultViewModel2 = searchResultViewModel4;
                                    searchApplicationListDTO = searchApplicationListDTO2;
                                    SearchAppListData searchAppListData = new SearchAppListData(appList, new bz6(e.b(gu9.x(hl5Var.h(packageDto, packageKey, null, searchResultViewModel4, true), new v25(appList, searchResultViewModel2, 21)), y97.G(searchResultViewModel2)), null, null, null, 14), new SearchResultViewModel$homeSearchResultMapper$2$searchAppListData$1(1, searchResultViewModel2, SearchResultViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0));
                                    String title2 = appList.getTitle();
                                    if (title2 != null && !f88.n0(title2)) {
                                        String title3 = appList.getTitle();
                                        String packageKey2 = appList.getPackageKey();
                                        String str7 = packageKey2 == null ? "" : packageKey2;
                                        AdInfoDto adInfoDTO = appList.getAdInfoDTO();
                                        String bgColor2 = appList.getBgColor();
                                        ArrayList arrayListQ0 = kotlin.collections.a.Q0(appList.getApps());
                                        List<String> ignoreConditions2 = appList.getIgnoreConditions();
                                        ArrayList arrayListQ02 = ignoreConditions2 != null ? kotlin.collections.a.Q0(ignoreConditions2) : null;
                                        String packageKey3 = appList.getPackageKey();
                                        arrayList.add(new SearchAppListMoreData(title3, str7, adInfoDTO, bgColor2, arrayListQ0, arrayListQ02, packageKey3 == null ? "" : packageKey3));
                                    }
                                    arrayList.add(searchAppListData);
                                }
                            }
                            searchApplicationListDTO2 = searchApplicationListDTO;
                            break;
                        case 982128956:
                            if (itemType.equals(SearchItemDto.APP_RESTRICTED)) {
                                arrayList.add(new RestrictedApplicationData(searchItemDto.getRestrictedApp(), searchItemDto.getItemType()));
                            }
                            break;
                        case 1752501037:
                            if (itemType.equals(SearchItemDto.APP_SCREENSHOT)) {
                                SearchSpecialAppDTO app5 = searchItemDto.getApp();
                                String itemType6 = searchItemDto.getItemType();
                                String packageName5 = searchItemDto.getApp().getApplication().getPackageName();
                                js3.o(packageName5, "getPackageName(...)");
                                arrayList.add(new SearchScreenshotAppData(app5, itemType6, (vb7) yl5Var.a(packageName5), aVar.b, iVar));
                            }
                            break;
                    }
                    searchApplicationListDTO = searchApplicationListDTO2;
                    searchApplicationListDTO2 = searchApplicationListDTO;
                }
                SearchApplicationListDTO searchApplicationListDTO3 = searchApplicationListDTO2;
                int i2 = searchResultViewModel2.D + 1;
                searchResultViewModel2.D = i2;
                searchResultViewModel2.z = false;
                if ((i2 == 1 && searchApplicationListDTO3.getEol()) || searchResultViewModel2.D > 1) {
                    bt2.G(y97.G(searchResultViewModel2), null, null, new SearchResultViewModel$showSnackBar$1(searchResultViewModel2, null), 3);
                }
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bl4.G((MyketRecyclerData) it.next(), arrayList2);
                }
                return arrayList2;
            }
        }), y97.G(searchResultViewModel));
        return bz6Var;
    }
}
