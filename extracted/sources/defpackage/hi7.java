package defpackage;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.common.search.b;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment;
import ir.mservices.market.search.history.ui.recycler.SearchAppData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryTagData;
import ir.mservices.market.search.history.ui.recycler.SearchTermData;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.SearchSuggestionsAppDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hi7 implements og5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchHistoryRecyclerListFragment b;

    public /* synthetic */ hi7(SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment, int i) {
        this.a = i;
        this.b = searchHistoryRecyclerListFragment;
    }

    @Override // defpackage.og5
    public final void m(View view, qg5 qg5Var, Object obj) {
        String str;
        b bVar;
        b bVar2;
        int i = this.a;
        SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = this.b;
        switch (i) {
            case 0:
                mr mrVar = (mr) qg5Var;
                AppNestedData appNestedData = (AppNestedData) obj;
                int i2 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p(mrVar, "viewHolder");
                js3.p(appNestedData, "recyclerData");
                ApplicationDTO applicationDTO = appNestedData.a;
                if (applicationDTO != null) {
                    searchHistoryRecyclerListFragment.V0(applicationDTO, mrVar.x(), new Tracker("search", appNestedData.b, "recommendation"));
                    return;
                }
                return;
            case 1:
                bq bqVar = (bq) qg5Var;
                AppNestedData appNestedData2 = (AppNestedData) obj;
                int i3 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p(bqVar, "viewHolder");
                js3.p(appNestedData2, "recyclerData");
                ApplicationDTO applicationDTO2 = appNestedData2.a;
                if (applicationDTO2 != null) {
                    searchHistoryRecyclerListFragment.V0(applicationDTO2, bqVar.x(), new Tracker("search", appNestedData2.b, "recommendation"));
                    return;
                }
                return;
            case 2:
                h95 h95Var = (h95) qg5Var;
                AppNestedData appNestedData3 = (AppNestedData) obj;
                int i4 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p(h95Var, "viewHolder");
                js3.p(appNestedData3, "recyclerData");
                ApplicationDTO applicationDTO3 = appNestedData3.a;
                if (applicationDTO3 != null) {
                    searchHistoryRecyclerListFragment.V0(applicationDTO3, h95Var.x(), new Tracker("search", appNestedData3.b, "recommendation"));
                    return;
                }
                return;
            case 3:
                MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                int i5 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p((s35) qg5Var, "<unused var>");
                js3.p(movieHomeMovieData, "recyclerData");
                MovieDto movieDto = movieHomeMovieData.a;
                pk5.g(searchHistoryRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                return;
            case 4:
                SearchHistoryData searchHistoryData = (SearchHistoryData) obj;
                int i6 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p((qi7) qg5Var, "<unused var>");
                js3.p(searchHistoryData, "recyclerData");
                searchHistoryRecyclerListFragment.W0(searchHistoryData.a, searchHistoryData.b);
                return;
            case 5:
                MovieHomeBannersItemData movieHomeBannersItemData = (MovieHomeBannersItemData) obj;
                int i7 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p((h35) qg5Var, "<unused var>");
                js3.p(movieHomeBannersItemData, "recyclerData");
                f65 f65Var = searchHistoryRecyclerListFragment.Z0;
                if (f65Var == null) {
                    js3.V("movieSearchAnalytics");
                    throw null;
                }
                HomeMovieBannerDto homeMovieBannerDto = movieHomeBannersItemData.a;
                String analyticsName = homeMovieBannerDto.getAnalyticsName();
                js3.p(analyticsName, AppMeasurementSdk.ConditionalUserProperty.NAME);
                f65Var.a().b("movie_search_banner_list_item", AppMeasurementSdk.ConditionalUserProperty.NAME, analyticsName);
                FragmentActivity fragmentActivityF = searchHistoryRecyclerListFragment.F();
                String action = homeMovieBannerDto.getAction();
                if (action != null) {
                    t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                    return;
                }
                return;
            case 6:
                UserCardData userCardData = (UserCardData) obj;
                int i8 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p((b29) qg5Var, "<unused var>");
                js3.p(userCardData, "recyclerData");
                UserDto userDto = userCardData.a;
                pk5.e(searchHistoryRecyclerListFragment.F(), userDto.getAccountKey(), userDto.getNickname(), UserProfileRefId.g);
                return;
            case 7:
                UserCardData userCardData2 = (UserCardData) obj;
                int i9 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p((d19) qg5Var, "<unused var>");
                js3.p(userCardData2, "recyclerData");
                UserDto userDto2 = userCardData2.a;
                pk5.e(searchHistoryRecyclerListFragment.F(), userDto2.getAccountKey(), userDto2.getNickname(), UserProfileRefId.g);
                return;
            case 8:
                SearchTermData searchTermData = (SearchTermData) obj;
                int i10 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p((sj7) qg5Var, "<unused var>");
                js3.p(searchTermData, "recyclerData");
                String str2 = searchTermData.b;
                if (str2 != null && (bVar = searchHistoryRecyclerListFragment.d1) != null) {
                    bVar.a(str2, "Suggestions");
                }
                am2 am2VarC0 = searchHistoryRecyclerListFragment.C0();
                if (am2VarC0 != null) {
                    searchHistoryRecyclerListFragment.U0().E(str2);
                    int i11 = searchTermData.a;
                    if (js3.i(searchHistoryRecyclerListFragment.U0().E.a.getValue(), CommonDataKt.MOVIE_TYPE_MOVIE)) {
                        f65 f65Var2 = searchHistoryRecyclerListFragment.Z0;
                        if (f65Var2 == null) {
                            js3.V("movieSearchAnalytics");
                            throw null;
                        }
                        String str3 = searchHistoryRecyclerListFragment.c1;
                        js3.p(str3, "query");
                        f65Var2.a().b("movie_search_suggest_term", AppMeasurementSdk.ConditionalUserProperty.NAME, str2, "query", str3);
                        str = "MOVIE";
                    } else {
                        rn6 rn6Var = searchHistoryRecyclerListFragment.Y0;
                        if (rn6Var == null) {
                            js3.V("searchAnalytics");
                            throw null;
                        }
                        rn6Var.t("term", searchHistoryRecyclerListFragment.c1, str2);
                        str = "APP";
                    }
                    dw1.C(am2VarC0, new ii7(str2, "Suggestions", str, i11), null, 6);
                    return;
                }
                return;
            case 9:
                SearchAppData searchAppData = (SearchAppData) obj;
                int i12 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p((nh7) qg5Var, "<unused var>");
                js3.p(searchAppData, "recyclerData");
                SearchSuggestionsAppDto searchSuggestionsAppDto = searchAppData.a;
                String title = searchSuggestionsAppDto.getTitle();
                if (title != null && (bVar2 = searchHistoryRecyclerListFragment.d1) != null) {
                    bVar2.a(title, "");
                }
                String packageName = searchSuggestionsAppDto.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                String str4 = searchHistoryRecyclerListFragment.c1;
                Tracker tracker = new Tracker("search", str4, "recommendation");
                String refId = searchSuggestionsAppDto.getRefId();
                js3.o(refId, "getRefId(...)");
                pk5.f(searchHistoryRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, tracker, false, str4, refId, null, null, null, null, null, null, null)));
                if (js3.i(searchHistoryRecyclerListFragment.U0().E.a.getValue(), CommonDataKt.MOVIE_TYPE_MOVIE)) {
                    lw.g(null, "SearchHistoryRecyclerListFragment wrong sourceType in onAppClickListener!", null);
                    return;
                }
                rn6 rn6Var2 = searchHistoryRecyclerListFragment.Y0;
                if (rn6Var2 != null) {
                    rn6Var2.t("app", searchHistoryRecyclerListFragment.c1, searchSuggestionsAppDto.getTitle());
                    return;
                } else {
                    js3.V("searchAnalytics");
                    throw null;
                }
            default:
                SearchHistoryTagData searchHistoryTagData = (SearchHistoryTagData) obj;
                int i13 = SearchHistoryRecyclerListFragment.e1;
                js3.p(view, "<unused var>");
                js3.p((pi7) qg5Var, "<unused var>");
                js3.p(searchHistoryTagData, "recyclerData");
                searchHistoryRecyclerListFragment.W0(searchHistoryTagData.a, searchHistoryTagData.b);
                return;
        }
    }
}
