package ir.mservices.market.app.suggest.search.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.ee;
import defpackage.g27;
import defpackage.hh2;
import defpackage.hp;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.kb8;
import defpackage.la6;
import defpackage.mb8;
import defpackage.nb8;
import defpackage.o79;
import defpackage.og5;
import defpackage.ox5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rn6;
import defpackage.rs6;
import defpackage.t15;
import defpackage.x79;
import defpackage.yw6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.common.recycler.a;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.search.result.data.GoogleSearchConfigDto;
import ir.mservices.market.app.suggest.search.ui.SuggestListFragment;
import ir.mservices.market.app.suggest.search.ui.recycler.SuggestData;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.AppIconView;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SuggestListFragment extends Hilt_SuggestListFragment {
    public static final /* synthetic */ int o1 = 0;
    public rn6 i1;
    public final bi5 j1 = new bi5(g27.a(nb8.class), new yw6(20, this));
    public final o79 k1;
    public WebView l1;
    public kb8 m1;
    public final mb8 n1;

    public SuggestListFragment() {
        final SuggestListFragment$special$$inlined$viewModels$default$1 suggestListFragment$special$$inlined$viewModels$default$1 = new SuggestListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.suggest.search.ui.SuggestListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) suggestListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(SuggestListViewModel.class), new bp2() { // from class: ir.mservices.market.app.suggest.search.ui.SuggestListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.suggest.search.ui.SuggestListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.suggest.search.ui.SuggestListFragment$special$$inlined$viewModels$default$4
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
        this.n1 = new mb8();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equals(R1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("FRAGMENT_RESULT_NOT_FOUND".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a) {
                Context contextH = H();
                hh2.H(new hh2(contextH, contextH != null ? contextH.getString(rs6.suggest_request_failed) : null));
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_suggest);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        return Q1().a;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        return Q1().a;
    }

    public final nb8 Q1() {
        return (nb8) this.j1.getValue();
    }

    public final String R1() {
        return dw1.n("SuggestListFragment_", this.H0);
    }

    public final void S1(SuggestData suggestData) {
        rn6 rn6Var = this.i1;
        if (rn6Var == null) {
            js3.V("searchAnalytics");
            throw null;
        }
        String str = Q1().a;
        String str2 = suggestData.a;
        String str3 = suggestData.a;
        if (TextUtils.isEmpty(str)) {
            str = (String) rn6Var.c;
        }
        ((ee) rn6Var.b).b("search_google_result", "query", str, AppMeasurementSdk.ConditionalUserProperty.NAME, "app:".concat(str2));
        if (suggestData.d) {
            pk5.f(this.J0, new NavIntentDirections.AppDetail(new hp(str3, false, new Tracker("search", Q1().a, "googleSearchSuggest"), false, Q1().a, suggestData.e, null, null, null, null, null, null, null)));
        } else {
            pk5.g(this.J0, new NavIntentDirections.PlayDetail(new la6(new DialogDataModel(R1(), "FRAGMENT_RESULT_NOT_FOUND", null, 12), str3, suggestData.b)), -1);
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        if (viewZ == null) {
            return null;
        }
        GoogleSearchConfigDto googleSearchConfigDto = Q1().b;
        if (googleSearchConfigDto != null) {
            if ((googleSearchConfigDto.getWebViewEnable() ? googleSearchConfigDto : null) != null) {
                WebView webView = new WebView(viewZ.getContext());
                webView.setWebViewClient(this.n1);
                webView.setWebChromeClient(new WebChromeClient());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.addJavascriptInterface(new a(this), "AndroidContentObserver");
                webView.setVisibility(4);
                this.l1 = webView;
                ((ConstraintLayout) viewZ).addView(webView, 0);
            }
        }
        return viewZ;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(R1());
        WebView webView = this.l1;
        if (webView != null) {
            webView.removeCallbacks(this.m1);
        }
        this.m1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        ox5 ox5Var = new ox5(v1(), 4);
        final int i = 0;
        ox5Var.p = new og5(this) { // from class: jb8
            public final /* synthetic */ SuggestListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                SuggestListFragment suggestListFragment = this.b;
                switch (i2) {
                    case 0:
                        a aVar = (a) qg5Var;
                        AppData appData = (AppData) obj;
                        int i3 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(appData, "appData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("search_google_app");
                        clickEventBuilder.a();
                        ApplicationDTO applicationDTO = appData.c;
                        AppIconView appIconViewX = aVar.x();
                        String packageName = applicationDTO.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        Tracker tracker = new Tracker("package", suggestListFragment.Q1().a, "verticalList");
                        boolean z = suggestListFragment.s1().b(appIconViewX.getDrawable()) != null;
                        String refId = applicationDTO.getRefId();
                        js3.o(refId, "getRefId(...)");
                        String callbackUrl = applicationDTO.getCallbackUrl();
                        String iconPath = applicationDTO.getIconPath();
                        js3.o(iconPath, "getIconPath(...)");
                        String title = applicationDTO.getTitle();
                        js3.o(title, "getTitle(...)");
                        String packageName2 = applicationDTO.getPackageName();
                        js3.o(packageName2, "getPackageName(...)");
                        pk5.f(suggestListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, tracker, z, null, refId, callbackUrl, null, new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback()), null, null, null, null)));
                        break;
                    case 1:
                        SuggestData suggestData = (SuggestData) obj;
                        int i4 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((rb8) qg5Var, "<unused var>");
                        js3.p(suggestData, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("search_google_view");
                        clickEventBuilder2.a();
                        suggestListFragment.S1(suggestData);
                        break;
                    default:
                        SuggestData suggestData2 = (SuggestData) obj;
                        int i5 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((rb8) qg5Var, "<unused var>");
                        js3.p(suggestData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("search_google_view_app");
                        clickEventBuilder3.a();
                        suggestListFragment.S1(suggestData2);
                        break;
                }
            }
        };
        final int i2 = 1;
        ox5Var.n = new og5(this) { // from class: jb8
            public final /* synthetic */ SuggestListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                SuggestListFragment suggestListFragment = this.b;
                switch (i22) {
                    case 0:
                        a aVar = (a) qg5Var;
                        AppData appData = (AppData) obj;
                        int i3 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(appData, "appData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("search_google_app");
                        clickEventBuilder.a();
                        ApplicationDTO applicationDTO = appData.c;
                        AppIconView appIconViewX = aVar.x();
                        String packageName = applicationDTO.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        Tracker tracker = new Tracker("package", suggestListFragment.Q1().a, "verticalList");
                        boolean z = suggestListFragment.s1().b(appIconViewX.getDrawable()) != null;
                        String refId = applicationDTO.getRefId();
                        js3.o(refId, "getRefId(...)");
                        String callbackUrl = applicationDTO.getCallbackUrl();
                        String iconPath = applicationDTO.getIconPath();
                        js3.o(iconPath, "getIconPath(...)");
                        String title = applicationDTO.getTitle();
                        js3.o(title, "getTitle(...)");
                        String packageName2 = applicationDTO.getPackageName();
                        js3.o(packageName2, "getPackageName(...)");
                        pk5.f(suggestListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, tracker, z, null, refId, callbackUrl, null, new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback()), null, null, null, null)));
                        break;
                    case 1:
                        SuggestData suggestData = (SuggestData) obj;
                        int i4 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((rb8) qg5Var, "<unused var>");
                        js3.p(suggestData, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("search_google_view");
                        clickEventBuilder2.a();
                        suggestListFragment.S1(suggestData);
                        break;
                    default:
                        SuggestData suggestData2 = (SuggestData) obj;
                        int i5 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((rb8) qg5Var, "<unused var>");
                        js3.p(suggestData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("search_google_view_app");
                        clickEventBuilder3.a();
                        suggestListFragment.S1(suggestData2);
                        break;
                }
            }
        };
        final int i3 = 2;
        ox5Var.m = new og5(this) { // from class: jb8
            public final /* synthetic */ SuggestListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                SuggestListFragment suggestListFragment = this.b;
                switch (i22) {
                    case 0:
                        a aVar = (a) qg5Var;
                        AppData appData = (AppData) obj;
                        int i32 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(appData, "appData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("search_google_app");
                        clickEventBuilder.a();
                        ApplicationDTO applicationDTO = appData.c;
                        AppIconView appIconViewX = aVar.x();
                        String packageName = applicationDTO.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        Tracker tracker = new Tracker("package", suggestListFragment.Q1().a, "verticalList");
                        boolean z = suggestListFragment.s1().b(appIconViewX.getDrawable()) != null;
                        String refId = applicationDTO.getRefId();
                        js3.o(refId, "getRefId(...)");
                        String callbackUrl = applicationDTO.getCallbackUrl();
                        String iconPath = applicationDTO.getIconPath();
                        js3.o(iconPath, "getIconPath(...)");
                        String title = applicationDTO.getTitle();
                        js3.o(title, "getTitle(...)");
                        String packageName2 = applicationDTO.getPackageName();
                        js3.o(packageName2, "getPackageName(...)");
                        pk5.f(suggestListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, tracker, z, null, refId, callbackUrl, null, new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback()), null, null, null, null)));
                        break;
                    case 1:
                        SuggestData suggestData = (SuggestData) obj;
                        int i4 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((rb8) qg5Var, "<unused var>");
                        js3.p(suggestData, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("search_google_view");
                        clickEventBuilder2.a();
                        suggestListFragment.S1(suggestData);
                        break;
                    default:
                        SuggestData suggestData2 = (SuggestData) obj;
                        int i5 = SuggestListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((rb8) qg5Var, "<unused var>");
                        js3.p(suggestData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("search_google_view_app");
                        clickEventBuilder3.a();
                        suggestListFragment.S1(suggestData2);
                        break;
                }
            }
        };
        ox5Var.o = new t15(13, this);
        return ox5Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(R1(), this);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SuggestListFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (SuggestListViewModel) this.k1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_4), K().getDimensionPixelSize(pq6.horizontal_space_outer), 0, 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.suggest_max_span);
    }
}
