package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.data.webapi.SingleMovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.movie.ui.common.MovieHomeReelData;
import ir.mservices.market.movie.ui.home.HomeFragment;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeSingleMovieData;
import ir.mservices.market.movie.ui.home.recycler.b;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.reels.home.data.ReelRefId;
import ir.mservices.market.reels.ui.ReelsActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nb3 implements r7, og5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HomeFragment b;

    public /* synthetic */ nb3(HomeFragment homeFragment, int i) {
        this.a = i;
        this.b = homeFragment;
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        Boolean bool = (Boolean) obj;
        int i = HomeFragment.z1;
        js3.p(bool, "callback");
        HomeFragment homeFragment = this.b;
        FragmentActivity fragmentActivityF = homeFragment.F();
        if (fragmentActivityF != null) {
            d56 d56Var = homeFragment.v1;
            if (d56Var != null) {
                d56Var.a(fragmentActivityF, bool.booleanValue());
            } else {
                js3.V("permissionHelper");
                throw null;
            }
        }
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        String analyticsName;
        String analyticsName2;
        int i = this.a;
        HomeFragment homeFragment = this.b;
        switch (i) {
            case 1:
                MovieHomeReelData movieHomeReelData = (MovieHomeReelData) obj;
                int i2 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((u35) qg5Var, "<unused var>");
                js3.p(movieHomeReelData, "recyclerData");
                Intent intent = new Intent(homeFragment.F(), (Class<?>) ReelsActivity.class);
                intent.putExtra("reel_dto", movieHomeReelData.a);
                homeFragment.y0(intent);
                break;
            case 2:
                MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                int i3 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((s35) qg5Var, "<unused var>");
                js3.p(movieHomeMovieData, "recyclerData");
                MovieDto movieDto = movieHomeMovieData.a;
                String action = movieDto.getAction();
                if (action == null || f88.n0(action)) {
                    pk5.g(homeFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                } else {
                    FragmentActivity fragmentActivityF = homeFragment.F();
                    String action2 = movieDto.getAction();
                    if (action2 != null) {
                        t61.w(action2, "parse(...)", fragmentActivityF, null, null);
                    }
                }
                break;
            case 3:
                ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                int i4 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((v62) qg5Var, "<unused var>");
                js3.p(extHeaderData, "recyclerData");
                String str = extHeaderData.a;
                if (ExtensionPointDto.TYPE_BANNER_LIST.equalsIgnoreCase(str) || ExtensionPointDto.TYPE_BANNER_LIST_NO_TITLE.equalsIgnoreCase(str)) {
                    String str2 = extHeaderData.b;
                    String str3 = extHeaderData.c;
                    pk5.g(homeFragment.J0, new NavIntentDirections.UrlReceive(new t09(str2, dw1.n("Detail ext - ", str3), str3, "Banners")), -1);
                } else if (ExtensionPointDto.TYPE_REEL_LIST.equalsIgnoreCase(str)) {
                    pk5.g(homeFragment.J0, new NavIntentDirections.ReelsHome(new j17(ReelRefId.REEL_MORE_BTN)), -1);
                }
                break;
            case 4:
                int i5 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((x35) qg5Var, "<unused var>");
                js3.p((MovieHomeReelsRowData) obj, "<unused var>");
                pk5.g(homeFragment.J0, new NavIntentDirections.ReelsHome(new j17(ReelRefId.REEL_MORE_BTN)), -1);
                break;
            case 5:
                MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                int i6 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((e35) qg5Var, "<unused var>");
                js3.p(movieHomeBannerData, "recyclerData");
                qa3 qa3VarE2 = homeFragment.e2();
                HomeMovieBannerDto homeMovieBannerDto = movieHomeBannerData.a;
                String analyticsName3 = homeMovieBannerDto.getAnalyticsName();
                js3.p(analyticsName3, AppMeasurementSdk.ConditionalUserProperty.NAME);
                qa3VarE2.a.b("movie_home_banner", AppMeasurementSdk.ConditionalUserProperty.NAME, analyticsName3);
                FragmentActivity fragmentActivityF2 = homeFragment.F();
                String action3 = homeMovieBannerDto.getAction();
                if (action3 != null) {
                    t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                }
                break;
            case 6:
                MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                int i7 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((b45) qg5Var, "<unused var>");
                js3.p(movieHomeBannerData2, "recyclerData");
                FragmentActivity fragmentActivityF3 = homeFragment.F();
                String action4 = movieHomeBannerData2.a.getAction();
                if (action4 != null) {
                    t61.w(action4, "parse(...)", fragmentActivityF3, NearbyRepository.SERVICE_ID, null);
                }
                break;
            case 7:
                MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                int i8 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((b) qg5Var, "<unused var>");
                js3.p(movieHomeMoviesRowData, "recyclerData");
                HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                if (homeMovieListDto != null && (analyticsName = homeMovieListDto.getAnalyticsName()) != null) {
                    homeFragment.e2().a.b("movie_home_list", AppMeasurementSdk.ConditionalUserProperty.NAME, analyticsName);
                }
                HomeMovieListDto homeMovieListDto2 = movieHomeMoviesRowData.g;
                if (homeMovieListDto2 != null) {
                    HomeMovieListDto homeMovieListDto3 = f88.n0(homeMovieListDto2.getListKey()) ? null : homeMovieListDto2;
                    if (homeMovieListDto3 != null) {
                        String listKey = homeMovieListDto3.getListKey();
                        String headerTitle = homeMovieListDto3.getHeaderTitle();
                        if (headerTitle == null) {
                            headerTitle = "";
                        }
                        String analyticsName4 = homeMovieListDto3.getAnalyticsName();
                        pk5.g(homeFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle, analyticsName4 != null ? analyticsName4 : "", homeFragment.i2())), -1);
                    }
                }
                break;
            case 8:
                MovieHomeSingleMovieData movieHomeSingleMovieData = (MovieHomeSingleMovieData) obj;
                int i9 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((c45) qg5Var, "<unused var>");
                js3.p(movieHomeSingleMovieData, "recyclerData");
                qa3 qa3VarE22 = homeFragment.e2();
                SingleMovieDto singleMovieDto = movieHomeSingleMovieData.a;
                String analyticsName5 = singleMovieDto.getAnalyticsName();
                js3.p(analyticsName5, AppMeasurementSdk.ConditionalUserProperty.NAME);
                qa3VarE22.a.b("movie_home_single_item", AppMeasurementSdk.ConditionalUserProperty.NAME, analyticsName5);
                FragmentActivity fragmentActivityF4 = homeFragment.F();
                String action5 = singleMovieDto.getAction();
                if (action5 != null) {
                    t61.w(action5, "parse(...)", fragmentActivityF4, NearbyRepository.SERVICE_ID, null);
                }
                break;
            case 9:
                MovieHomeBannersRowData movieHomeBannersRowData = (MovieHomeBannersRowData) obj;
                int i10 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((g35) qg5Var, "<unused var>");
                js3.p(movieHomeBannersRowData, "recyclerData");
                HomeMovieBannerListDto homeMovieBannerListDto = movieHomeBannersRowData.g;
                if (homeMovieBannerListDto != null && (analyticsName2 = homeMovieBannerListDto.getAnalyticsName()) != null) {
                    homeFragment.e2().a.b("movie_home_banner_list", AppMeasurementSdk.ConditionalUserProperty.NAME, analyticsName2);
                }
                pk5.g(homeFragment.J0, new NavIntentDirections.MovieBannersList(new a05(homeMovieBannerListDto, homeFragment.i2(), homeMovieBannerListDto != null ? homeMovieBannerListDto.getBannerListKey() : null, homeMovieBannerListDto != null ? homeMovieBannerListDto.getRefId() : null)), -1);
                break;
            case 10:
                MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                int i11 = HomeFragment.z1;
                js3.p(view, "<unused var>");
                js3.p((h35) qg5Var, "<unused var>");
                js3.p(movieHomeBannersItemData, "recyclerData");
                qa3 qa3VarE23 = homeFragment.e2();
                HomeMovieBannerDto homeMovieBannerDto2 = movieHomeBannersItemData.a;
                String analyticsName6 = homeMovieBannerDto2.getAnalyticsName();
                js3.p(analyticsName6, AppMeasurementSdk.ConditionalUserProperty.NAME);
                qa3VarE23.a.b("movie_home_banner_list_item", AppMeasurementSdk.ConditionalUserProperty.NAME, analyticsName6);
                FragmentActivity fragmentActivityF5 = homeFragment.F();
                String action6 = homeMovieBannerDto2.getAction();
                if (action6 != null) {
                    t61.w(action6, "parse(...)", fragmentActivityF5, NearbyRepository.SERVICE_ID, null);
                }
                break;
            default:
                rc rcVar = (rc) qg5Var;
                AddaxBoxData addaxBoxData = (AddaxBoxData) obj;
                int i12 = HomeFragment.z1;
                js3.p(view, "view");
                js3.p(rcVar, "viewHolder");
                js3.p(addaxBoxData, "recyclerData");
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                clickEventBuilder.b("addax_action_home_" + addaxBoxDto.getId());
                clickEventBuilder.a();
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("addax_action_home_" + addaxBoxDto.getId() + "_" + addaxBoxDto.getDisplayMode());
                clickEventBuilder2.a();
                FragmentActivity fragmentActivityF6 = homeFragment.F();
                if (fragmentActivityF6 != null) {
                    new wv8(fragmentActivityF6, homeFragment.x1).m(view, rcVar, addaxBoxData);
                }
                break;
        }
    }
}
