package ir.mservices.market.search.history.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.am2;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.d16;
import defpackage.di7;
import defpackage.dw1;
import defpackage.ei7;
import defpackage.f65;
import defpackage.g27;
import defpackage.gi7;
import defpackage.gp;
import defpackage.hi7;
import defpackage.hp;
import defpackage.ii7;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.o06;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qg5;
import defpackage.qi7;
import defpackage.rn6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x79;
import defpackage.y97;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.common.search.b;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryListTitleData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchHistoryRecyclerListFragment extends Hilt_SearchHistoryRecyclerListFragment implements ei7 {
    public static final /* synthetic */ int e1 = 0;
    public rn6 Y0;
    public f65 Z0;
    public lw8 a1;
    public final o79 b1;
    public String c1;
    public b d1;

    public SearchHistoryRecyclerListFragment() {
        final o06 o06Var = new o06(21, this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) o06Var.invoke();
            }
        });
        this.b1 = new o79(g27.a(SearchViewModel.class), new bp2() { // from class: ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment$special$$inlined$viewModels$default$3
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
        this.c1 = "";
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ir.mservices.market.search.history.ui.a] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ir.mservices.market.search.history.ui.a] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        di7 di7Var = new di7(p3.g(F()), this.F0.f());
        di7Var.o = new hi7(this, 4);
        di7Var.q = new hi7(this, 8);
        di7Var.r = new hi7(this, 9);
        final int i = 0;
        di7Var.p = new og5(this) { // from class: ir.mservices.market.search.history.ui.a
            public final /* synthetic */ SearchHistoryRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        SearchHistoryData searchHistoryData = (SearchHistoryData) obj;
                        int i3 = SearchHistoryRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((qi7) qg5Var, "<unused var>");
                        js3.p(searchHistoryData, "recyclerData");
                        SearchViewModel searchViewModelU0 = searchHistoryRecyclerListFragment.U0();
                        String str = searchHistoryData.b;
                        js3.p(str, "title");
                        bt2.G(y97.G(searchViewModelU0), null, null, new SearchViewModel$removeFromDb$1(searchViewModelU0, str, null), 3);
                        break;
                    default:
                        SearchHistoryListTitleData searchHistoryListTitleData = (SearchHistoryListTitleData) obj;
                        int i4 = SearchHistoryRecyclerListFragment.e1;
                        js3.p(view, "view");
                        js3.p((gi7) qg5Var, "<unused var>");
                        js3.p(searchHistoryListTitleData, "recyclerData");
                        ir.mservices.market.version2.core.utils.a.d(searchHistoryRecyclerListFragment, Lifecycle$State.d, new SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1(searchHistoryRecyclerListFragment, view, null));
                        SearchViewModel searchViewModelU02 = searchHistoryRecyclerListFragment.U0();
                        bt2.G(y97.G(searchViewModelU02), null, null, new SearchViewModel$removeAllFromDb$1(searchViewModelU02, searchHistoryListTitleData.a, null), 3);
                        break;
                }
            }
        };
        final int i2 = 1;
        di7Var.x = new og5(this) { // from class: ir.mservices.market.search.history.ui.a
            public final /* synthetic */ SearchHistoryRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        SearchHistoryData searchHistoryData = (SearchHistoryData) obj;
                        int i3 = SearchHistoryRecyclerListFragment.e1;
                        js3.p(view, "<unused var>");
                        js3.p((qi7) qg5Var, "<unused var>");
                        js3.p(searchHistoryData, "recyclerData");
                        SearchViewModel searchViewModelU0 = searchHistoryRecyclerListFragment.U0();
                        String str = searchHistoryData.b;
                        js3.p(str, "title");
                        bt2.G(y97.G(searchViewModelU0), null, null, new SearchViewModel$removeFromDb$1(searchViewModelU0, str, null), 3);
                        break;
                    default:
                        SearchHistoryListTitleData searchHistoryListTitleData = (SearchHistoryListTitleData) obj;
                        int i4 = SearchHistoryRecyclerListFragment.e1;
                        js3.p(view, "view");
                        js3.p((gi7) qg5Var, "<unused var>");
                        js3.p(searchHistoryListTitleData, "recyclerData");
                        ir.mservices.market.version2.core.utils.a.d(searchHistoryRecyclerListFragment, Lifecycle$State.d, new SearchHistoryRecyclerListFragment$createDataAdapter$1$5$1(searchHistoryRecyclerListFragment, view, null));
                        SearchViewModel searchViewModelU02 = searchHistoryRecyclerListFragment.U0();
                        bt2.G(y97.G(searchViewModelU02), null, null, new SearchViewModel$removeAllFromDb$1(searchViewModelU02, searchHistoryListTitleData.a, null), 3);
                        break;
                }
            }
        };
        di7Var.w = new hi7(this, 10);
        di7Var.t = new hi7(this, 0);
        di7Var.v = new hi7(this, 1);
        di7Var.u = new hi7(this, 2);
        di7Var.y = new hi7(this, 3);
        di7Var.z = new hi7(this, 5);
        di7Var.A = new hi7(this, 6);
        di7Var.B = new hi7(this, 7);
        di7Var.s = new bn6(F());
        return di7Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return U0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final View F0(ViewGroup viewGroup) {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final d16 H0() {
        return new d16(0, K().getDimensionPixelSize(pq6.space_16), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), 0, 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return 1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        String strL = L(rs6.page_name_search_history);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final boolean O0() {
        return false;
    }

    public final SearchViewModel U0() {
        return (SearchViewModel) this.b1.getValue();
    }

    public final void V0(ApplicationDTO applicationDTO, ImageView imageView, Tracker tracker) {
        js3.p(applicationDTO, "app");
        String iconPath = applicationDTO.getIconPath();
        js3.o(iconPath, "getIconPath(...)");
        String title = applicationDTO.getTitle();
        js3.o(title, "getTitle(...)");
        String packageName = applicationDTO.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
        String packageName2 = applicationDTO.getPackageName();
        js3.o(packageName2, "getPackageName(...)");
        boolean z = G0().b(imageView.getDrawable()) != null;
        String refId = applicationDTO.getRefId();
        js3.o(refId, "getRefId(...)");
        NavIntentDirections.AppDetail appDetail = new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null));
        am2 am2Var = this.J0;
        if (am2Var == null) {
            return;
        }
        pk5.g(am2Var, appDetail, -1);
    }

    public final void W0(int i, String str) {
        String str2;
        b bVar;
        if (str != null && (bVar = this.d1) != null) {
            bVar.a(str, "History");
        }
        am2 am2VarC0 = C0();
        if (am2VarC0 != null) {
            if (js3.i(U0().E.a.getValue(), CommonDataKt.MOVIE_TYPE_MOVIE)) {
                f65 f65Var = this.Z0;
                if (f65Var == null) {
                    js3.V("movieSearchAnalytics");
                    throw null;
                }
                String str3 = this.c1;
                js3.p(str3, "query");
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                f65Var.a().b("movie_search_suggest_term", AppMeasurementSdk.ConditionalUserProperty.NAME, str, "query", str3);
                str2 = "MOVIE";
            } else {
                rn6 rn6Var = this.Y0;
                if (rn6Var == null) {
                    js3.V("searchAnalytics");
                    throw null;
                }
                rn6Var.t("history", this.c1, str);
                str2 = "APP";
            }
            js3.p(str, "query");
            dw1.C(am2VarC0, new ii7(str, "History", str2, i), null, 6);
        }
    }

    public final void X0(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.c1 = str;
        SearchViewModel searchViewModelU0 = U0();
        searchViewModelU0.F = str;
        searchViewModelU0.v.d(str, "BUNDLE_KEY_QUERY");
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        view.setBackgroundColor(sj8.b().l);
        J0().setItemAnimator(null);
        J0().j(new gp(16, this));
    }
}
