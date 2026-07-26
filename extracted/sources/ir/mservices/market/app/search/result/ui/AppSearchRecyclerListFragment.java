package ir.mservices.market.app.search.result.ui;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import defpackage.am2;
import defpackage.b77;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.cd;
import defpackage.cs;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dw1;
import defpackage.ee;
import defpackage.fa1;
import defpackage.g27;
import defpackage.gp;
import defpackage.hp;
import defpackage.hs;
import defpackage.is;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k7;
import defpackage.li1;
import defpackage.lw8;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pj7;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rn6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x79;
import defpackage.xz7;
import defpackage.yq6;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.search.result.data.SearchItemDto;
import ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment;
import ir.mservices.market.app.search.result.ui.recycler.SearchApplicationData;
import ir.mservices.market.app.search.result.ui.recycler.a;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.movie.ui.home.recycler.b;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationList;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class AppSearchRecyclerListFragment extends Hilt_AppSearchRecyclerListFragment {
    public static final /* synthetic */ int e1 = 0;
    public lw8 Y0;
    public rn6 Z0;
    public xz7 a1;
    public int b1;
    public li1 c1;
    public final o79 d1;

    public AppSearchRecyclerListFragment() {
        final AppSearchRecyclerListFragment$special$$inlined$viewModels$default$1 appSearchRecyclerListFragment$special$$inlined$viewModels$default$1 = new AppSearchRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) appSearchRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.d1 = new o79(g27.a(SearchResultViewModel.class), new bp2() { // from class: ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gs] */
    /* JADX WARN: Type inference failed for: r0v2, types: [gs] */
    /* JADX WARN: Type inference failed for: r0v3, types: [gs] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gs] */
    /* JADX WARN: Type inference failed for: r2v10, types: [gs] */
    /* JADX WARN: Type inference failed for: r2v11, types: [gs] */
    /* JADX WARN: Type inference failed for: r2v7, types: [gs] */
    /* JADX WARN: Type inference failed for: r2v8, types: [gs] */
    /* JADX WARN: Type inference failed for: r2v9, types: [gs] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        bn6 bn6Var = new bn6(F());
        cs csVar = new cs(I0(), p3.g(F()), this.F0.f());
        final int i = 1;
        csVar.n = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i2 = i;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i3 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i4 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i5 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i7 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i8 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i9 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        csVar.o = new hs(bn6Var, this, i);
        csVar.p = new hs(bn6Var, this, 2);
        csVar.r = new hs(bn6Var, this, 3);
        csVar.q = new hs(bn6Var, this, 4);
        csVar.s = new a(this);
        final int i2 = 2;
        csVar.u = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i22 = i2;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i3 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i4 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i5 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i7 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i8 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i9 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 3;
        csVar.v = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i22 = i3;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i32 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i4 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i5 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i7 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i8 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i9 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 4;
        csVar.w = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i22 = i4;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i32 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i42 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i5 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i7 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i8 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i9 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        final int i5 = 5;
        csVar.x = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i22 = i5;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i32 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i42 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i52 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i7 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i8 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i9 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        final int i6 = 6;
        csVar.y = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i22 = i6;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i32 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i42 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i52 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i62 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i7 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i8 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i9 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        csVar.t = new hs(bn6Var, this, 0);
        final int i7 = 7;
        csVar.z = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i22 = i7;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i32 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i42 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i52 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i62 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i72 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i8 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i9 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        final int i8 = 8;
        csVar.A = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i22 = i8;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i32 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i42 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i52 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i62 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i72 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i82 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i9 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        final int i9 = 0;
        csVar.B = new og5(this) { // from class: gs
            public final /* synthetic */ AppSearchRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String listKey;
                String headerTitle;
                String host;
                int i22 = i9;
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) obj;
                        int i32 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b45) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData, "recyclerData");
                        FragmentActivity fragmentActivityF = appSearchRecyclerListFragment.F();
                        String action = movieHomeBannerData.a.getAction();
                        if (action != null) {
                            t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                    case 1:
                        a aVar = (a) qg5Var;
                        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
                        int i42 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(searchApplicationData, "recyclerData");
                        appSearchRecyclerListFragment.X0(searchApplicationData.c, aVar.B, searchApplicationData.g);
                        return;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i52 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO, (AppIconView) mrVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i62 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appSearchRecyclerListFragment.X0(applicationDTO2, (AppIconView) bqVar.x(), SearchItemDto.APP_LIST);
                            return;
                        }
                        return;
                    case 4:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i72 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str = homeMoreTitleRowData.a;
                        String str2 = homeMoreTitleRowData.b;
                        List list = homeMoreTitleRowData.f;
                        if (str != null) {
                            rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                            if (rn6Var == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                        }
                        if (list.isEmpty()) {
                            applicationList = str2 != null ? new NavIntentDirections.Package(new oy5(str, str2, "Search Apps - ".concat(str2), null)) : null;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appSearchRecyclerListFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 5:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i82 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "data");
                        MovieDto movieDto = movieHomeMovieData.a;
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        return;
                    case 6:
                        MovieHomeMoviesRowData movieHomeMoviesRowData = (MovieHomeMoviesRowData) obj;
                        int i92 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(movieHomeMoviesRowData, "data");
                        HomeMovieListDto homeMovieListDto = movieHomeMoviesRowData.g;
                        if (homeMovieListDto != null && (headerTitle = homeMovieListDto.getHeaderTitle()) != null) {
                            rn6 rn6Var2 = appSearchRecyclerListFragment.Z0;
                            if (rn6Var2 == null) {
                                js3.V("searchAnalytics");
                                throw null;
                            }
                            ((ee) rn6Var2.b).b("search_list_more", AppMeasurementSdk.ConditionalUserProperty.NAME, headerTitle);
                        }
                        if (homeMovieListDto == null || (listKey = homeMovieListDto.getListKey()) == null) {
                            return;
                        }
                        String headerTitle2 = homeMovieListDto.getHeaderTitle();
                        String analyticsName = homeMovieListDto.getAnalyticsName();
                        if (headerTitle2 == null) {
                            headerTitle2 = "";
                        }
                        pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.MovieMoreList(new o45(listKey, headerTitle2, analyticsName != null ? analyticsName : "", true)), -1);
                        return;
                    case 7:
                        HomeBannerData homeBannerData = (HomeBannerData) obj;
                        int i10 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((ib3) qg5Var, "<unused var>");
                        js3.p(homeBannerData, "recyclerData");
                        HomeBannerDto homeBannerDto = homeBannerData.a;
                        String action2 = homeBannerDto.getAction();
                        if (action2 == null || f88.n0(action2)) {
                            lw.g(null, "Home Banner action is null or empty", null);
                            return;
                        }
                        Uri uri = Uri.parse(homeBannerDto.getAction());
                        String scheme = uri.getScheme();
                        if (scheme == null || f88.n0(scheme) || (host = uri.getHost()) == null || f88.n0(host)) {
                            lw.g(null, "Home Banner action is malformed", homeBannerDto.getAction());
                            return;
                        }
                        boolean zT = m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true);
                        boolean zT2 = m88.T(uri.getHost(), CommonDataKt.HOME_MOVIE_TYPE_LIST, true);
                        List<String> pathSegments = uri.getPathSegments();
                        js3.o(pathSegments, "getPathSegments(...)");
                        String str3 = pathSegments.isEmpty() ? "" : uri.getPathSegments().get(0);
                        String queryParameter = uri.getQueryParameter("title");
                        if (zT && zT2) {
                            js3.m(str3);
                            if (!f88.n0(str3) && queryParameter != null && !f88.n0(queryParameter)) {
                                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Package(new oy5(queryParameter, str3, "Home Apps - ".concat(str3), js8.p(uri, "refId"))), -1);
                                return;
                            }
                        }
                        js8.s(appSearchRecyclerListFragment.F(), homeBannerDto.getAction());
                        return;
                    default:
                        MovieHomeBannerData movieHomeBannerData2 = (MovieHomeBannerData) obj;
                        int i11 = AppSearchRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((e35) qg5Var, "<unused var>");
                        js3.p(movieHomeBannerData2, "recyclerData");
                        FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                        String action3 = movieHomeBannerData2.a.getAction();
                        if (action3 != null) {
                            t61.w(action3, "parse(...)", fragmentActivityF2, NearbyRepository.SERVICE_ID, null);
                            return;
                        }
                        return;
                }
            }
        };
        return csVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return U0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final d16 H0() {
        return new d16(K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.space_4), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.horizontal_space_outer), I0(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return K().getInteger(ds6.search_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        String strL = L(rs6.page_name_app_search);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final void Q0(View view) {
        js3.p(view, "emptyView");
        super.Q0(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_result);
        MyketTextView myketTextView = (MyketTextView) view.findViewById(rr6.empty_title);
        myketTextView.setVisibility(0);
        myketTextView.setText(rs6.not_found_title);
    }

    public final SearchResultViewModel U0() {
        return (SearchResultViewModel) this.d1.getValue();
    }

    public final void V0() {
        xz7 xz7Var = this.a1;
        if (xz7Var != null && xz7Var.h()) {
            xz7Var.a(3);
        }
        this.a1 = null;
    }

    public final void W0(String str, String str2) {
        rn6 rn6Var = this.Z0;
        if (rn6Var == null) {
            js3.V("searchAnalytics");
            throw null;
        }
        String string = p0().getString("BUNDLE_KEY_QUERY");
        if (TextUtils.isEmpty(string)) {
            string = (String) rn6Var.c;
        }
        ((ee) rn6Var.b).b("search_result", "query", string, AppMeasurementSdk.ConditionalUserProperty.NAME, dw1.n("app:", str2), "type", str);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.b1 = (int) G0().a(220.0f);
    }

    public final void X0(ApplicationDTO applicationDTO, AppIconView appIconView, String str) {
        js3.p(applicationDTO, "app");
        String iconPath = applicationDTO.getIconPath();
        js3.o(iconPath, "getIconPath(...)");
        String title = applicationDTO.getTitle();
        js3.o(title, "getTitle(...)");
        String packageName = applicationDTO.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
        String string = p0().getString("BUNDLE_KEY_QUERY");
        String packageName2 = applicationDTO.getPackageName();
        js3.o(packageName2, "getPackageName(...)");
        Tracker tracker = new Tracker("search", string, "verticalList");
        boolean z = G0().b(appIconView.getDrawable()) != null;
        String refId = applicationDTO.getRefId();
        js3.o(refId, "getRefId(...)");
        NavIntentDirections.AppDetail appDetail = new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, string, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null));
        am2 am2Var = this.J0;
        if (am2Var != null) {
            pk5.g(am2Var, appDetail, -1);
        }
        String packageName3 = applicationDTO.getPackageName();
        js3.o(packageName3, "getPackageName(...)");
        W0(str, packageName3);
    }

    public final void Y0() {
        Drawable drawable;
        if (Q() && !this.D && U0().G) {
            if (this.a1 == null && this.J != null) {
                xz7 xz7VarI = xz7.i(s0());
                is isVar = new is(this);
                if (xz7VarI.v == null) {
                    xz7VarI.v = new ArrayList();
                }
                xz7VarI.v.add(isVar);
                LayoutInflater layoutInflaterD0 = this.Q;
                if (layoutInflaterD0 == null) {
                    layoutInflaterD0 = d0(null);
                    this.Q = layoutInflaterD0;
                }
                int i = pj7.A;
                DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
                pj7 pj7Var = (pj7) fa1.c(layoutInflaterD0, js6.search_snackbar, null, false);
                BigTextButton bigTextButton = pj7Var.v;
                MyketTextView myketTextView = pj7Var.w;
                bigTextButton.setOnClickListener(new cd(2, this));
                Resources resourcesK = K();
                js3.o(resourcesK, "getResources(...)");
                int i2 = yq6.ic_action_search;
                try {
                    drawable = q39.a(resourcesK, i2, null);
                    if (drawable == null) {
                        ThreadLocal threadLocal = b77.a;
                        drawable = resourcesK.getDrawable(i2, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused) {
                    ThreadLocal threadLocal2 = b77.a;
                    drawable = resourcesK.getDrawable(i2, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().m, PorterDuff.Mode.MULTIPLY));
                int dimensionPixelSize = K().getDimensionPixelSize(pq6.verify_icon_size);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                if (this.F0.f()) {
                    myketTextView.setCompoundDrawables(null, null, drawable, null);
                } else {
                    myketTextView.setCompoundDrawables(drawable, null, null, null);
                }
                BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = xz7VarI.i;
                js3.n(baseTransientBottomBar$SnackbarBaseLayout, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
                Snackbar$SnackbarLayout snackbar$SnackbarLayout = (Snackbar$SnackbarLayout) baseTransientBottomBar$SnackbarBaseLayout;
                snackbar$SnackbarLayout.removeAllViews();
                snackbar$SnackbarLayout.setBackground(null);
                snackbar$SnackbarLayout.setPadding(0, 0, 0, 0);
                snackbar$SnackbarLayout.addView(pj7Var.l, 0);
                xz7VarI.l = true;
                this.a1 = xz7VarI;
            }
            xz7 xz7Var = this.a1;
            if (xz7Var == null || xz7Var.h()) {
                return;
            }
            xz7Var.j();
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        li1 li1Var = this.c1;
        if (li1Var != null) {
            li1Var.g(null);
        }
        V0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        J0().j(new gp(3, this));
        ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.P0;
        if (aVar != null) {
            aVar.y(new k7(this));
        }
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new AppSearchRecyclerListFragment$onViewCreated$3(this, null));
        this.c1 = bt2.G(androidx.lifecycle.b.a(this), null, null, new AppSearchRecyclerListFragment$onViewCreated$4(this, null), 3);
    }
}
