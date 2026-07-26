package ir.mservices.market.app.suggest.detail.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.g27;
import defpackage.ga4;
import defpackage.ha4;
import defpackage.j71;
import defpackage.ja4;
import defpackage.js3;
import defpackage.jx2;
import defpackage.la6;
import defpackage.n15;
import defpackage.o79;
import defpackage.og5;
import defpackage.ox5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.x79;
import defpackage.xf5;
import defpackage.y97;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.detail.data.CategorySummaryDto;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.suggest.detail.recycler.PlayAppInfoData;
import ir.mservices.market.app.suggest.detail.recycler.PlayAppSuggestData;
import ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.model.paging.MyketPagingError;
import ir.mservices.market.screenshots.ScreenshotData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.viewModel.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayDetailFragment extends Hilt_PlayDetailFragment {
    public static final /* synthetic */ int l1 = 0;
    public xf5 i1;
    public final bi5 j1 = new bi5(g27.a(la6.class), new n15(22, this));
    public final o79 k1;

    public PlayDetailFragment() {
        final PlayDetailFragment$special$$inlined$viewModels$default$1 playDetailFragment$special$$inlined$viewModels$default$1 = new PlayDetailFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) playDetailFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(PlayDetailViewModel.class), new bp2() { // from class: ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(R1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_SUGGEST_INFO".equals(dialogDataModel.b) && dialogDataModel.d == DialogResult.b) {
                if (bundle.getBoolean("BUNDLE_KEY_CANCEL_TEXT")) {
                    dw1.y("search_google_request_ok");
                } else {
                    dw1.y("search_google_request_cancel");
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_play_detail);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void L1(ja4 ja4Var) {
        ErrorDTO errorDTO;
        js3.p(ja4Var, "state");
        if (!(ja4Var instanceof ga4)) {
            if (ja4Var instanceof ha4) {
                return;
            }
            super.L1(ja4Var);
        } else {
            Throwable th = ((ga4) ja4Var).b;
            MyketPagingError myketPagingError = th instanceof MyketPagingError ? (MyketPagingError) th : null;
            if (myketPagingError == null || (errorDTO = myketPagingError.a) == null) {
                return;
            }
            Q1().r(errorDTO);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String strL = L(rs6.play_detail_title);
        js3.o(strL, "getString(...)");
        return strL;
    }

    public final PlayDetailViewModel Q1() {
        return (PlayDetailViewModel) this.k1.getValue();
    }

    public final String R1() {
        return dw1.n("PlayDetailFragment_", this.H0);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(R1());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        ox5 ox5Var = new ox5(v1(), 1);
        final int i = 0;
        ox5Var.n = new og5(this) { // from class: ia6
            public final /* synthetic */ PlayDetailFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                PlayDetailFragment playDetailFragment = this.b;
                switch (i2) {
                    case 0:
                        PlayAppInfoData playAppInfoData = (PlayAppInfoData) obj;
                        int i3 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ga6) qg5Var, "<unused var>");
                        js3.p(playAppInfoData, "data");
                        CategorySummaryDto categorySummaryDto = playAppInfoData.e;
                        String title = categorySummaryDto != null ? categorySummaryDto.getTitle() : null;
                        if (title == null) {
                            title = "";
                        }
                        String layoutKey = categorySummaryDto != null ? categorySummaryDto.getLayoutKey() : null;
                        pk5.g(playDetailFragment.J0, new NavIntentDirections.OtherFeature(new ow5(title, layoutKey != null ? layoutKey : "")), -1);
                        return;
                    case 1:
                        AppDeveloperInfoModuleData appDeveloperInfoModuleData = (AppDeveloperInfoModuleData) obj;
                        int i4 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((aq) qg5Var, "<unused var>");
                        js3.p(appDeveloperInfoModuleData, "data");
                        hl1 hl1Var = appDeveloperInfoModuleData.a;
                        if (hl1Var instanceof dl1) {
                            FragmentActivity fragmentActivityF = playDetailFragment.F();
                            if (fragmentActivityF != null) {
                                Object obj2 = lw8.b;
                                String str = hl1Var.c;
                                String strL = playDetailFragment.L(rs6.sending_email);
                                js3.o(strL, "getString(...)");
                                js8.v(fragmentActivityF, str, strL);
                                return;
                            }
                            return;
                        }
                        xf5 xf5Var = playDetailFragment.i1;
                        if (xf5Var == null) {
                            js3.V("myketUIUtils");
                            throw null;
                        }
                        FragmentActivity fragmentActivityF2 = playDetailFragment.F();
                        am2 am2Var = playDetailFragment.J0;
                        String str2 = hl1Var.c;
                        String strL2 = playDetailFragment.L(rs6.website_developer_link);
                        js3.o(strL2, "getString(...)");
                        xf5Var.k(fragmentActivityF2, am2Var, str2, strL2, false, false, false, false, true, false);
                        return;
                    default:
                        pa6 pa6Var = (pa6) qg5Var;
                        tf7 tf7Var = (tf7) obj;
                        int i5 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p(pa6Var, "viewHolder");
                        js3.p(tf7Var, "data");
                        am2 am2Var2 = playDetailFragment.J0;
                        List<ScreenshotDto> list = tf7Var.b;
                        int iIndexOf = list.indexOf(tf7Var.a);
                        String strN = dw1.n("play screenshot:", ((la6) playDetailFragment.j1.getValue()).a);
                        String str3 = tf7Var.c;
                        String str4 = str3 == null ? "" : str3;
                        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                        for (ScreenshotDto screenshotDto : list) {
                            arrayList.add(new ScreenshotData(screenshotDto.getMainUrl(), screenshotDto.getThumbnailUrl()));
                        }
                        ScreenshotData[] screenshotDataArr = (ScreenshotData[]) arrayList.toArray(new ScreenshotData[0]);
                        j73 j73Var = pa6Var.x;
                        if (j73Var == null) {
                            js3.V("binding");
                            throw null;
                        }
                        ImageView imageView = j73Var.v;
                        js3.o(imageView, "screenshot");
                        js3.p(strN, "contextInfo");
                        js3.p(screenshotDataArr, "images");
                        int[] iArr = {(imageView.getWidth() / 2) + i, (imageView.getHeight() / 2) + i};
                        imageView.getLocationOnScreen(iArr);
                        int i6 = iArr[0];
                        int i7 = iArr[1];
                        pk5.g(am2Var2, new NavIntentDirections.DraggableScreenshot(new bv1(iIndexOf, strN, str4, screenshotDataArr, iArr)), -1);
                        return;
                }
            }
        };
        final int i2 = 1;
        ox5Var.o = new og5(this) { // from class: ia6
            public final /* synthetic */ PlayDetailFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                PlayDetailFragment playDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        PlayAppInfoData playAppInfoData = (PlayAppInfoData) obj;
                        int i3 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ga6) qg5Var, "<unused var>");
                        js3.p(playAppInfoData, "data");
                        CategorySummaryDto categorySummaryDto = playAppInfoData.e;
                        String title = categorySummaryDto != null ? categorySummaryDto.getTitle() : null;
                        if (title == null) {
                            title = "";
                        }
                        String layoutKey = categorySummaryDto != null ? categorySummaryDto.getLayoutKey() : null;
                        pk5.g(playDetailFragment.J0, new NavIntentDirections.OtherFeature(new ow5(title, layoutKey != null ? layoutKey : "")), -1);
                        return;
                    case 1:
                        AppDeveloperInfoModuleData appDeveloperInfoModuleData = (AppDeveloperInfoModuleData) obj;
                        int i4 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((aq) qg5Var, "<unused var>");
                        js3.p(appDeveloperInfoModuleData, "data");
                        hl1 hl1Var = appDeveloperInfoModuleData.a;
                        if (hl1Var instanceof dl1) {
                            FragmentActivity fragmentActivityF = playDetailFragment.F();
                            if (fragmentActivityF != null) {
                                Object obj2 = lw8.b;
                                String str = hl1Var.c;
                                String strL = playDetailFragment.L(rs6.sending_email);
                                js3.o(strL, "getString(...)");
                                js8.v(fragmentActivityF, str, strL);
                                return;
                            }
                            return;
                        }
                        xf5 xf5Var = playDetailFragment.i1;
                        if (xf5Var == null) {
                            js3.V("myketUIUtils");
                            throw null;
                        }
                        FragmentActivity fragmentActivityF2 = playDetailFragment.F();
                        am2 am2Var = playDetailFragment.J0;
                        String str2 = hl1Var.c;
                        String strL2 = playDetailFragment.L(rs6.website_developer_link);
                        js3.o(strL2, "getString(...)");
                        xf5Var.k(fragmentActivityF2, am2Var, str2, strL2, false, false, false, false, true, false);
                        return;
                    default:
                        pa6 pa6Var = (pa6) qg5Var;
                        tf7 tf7Var = (tf7) obj;
                        int i5 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p(pa6Var, "viewHolder");
                        js3.p(tf7Var, "data");
                        am2 am2Var2 = playDetailFragment.J0;
                        List<ScreenshotDto> list = tf7Var.b;
                        int iIndexOf = list.indexOf(tf7Var.a);
                        String strN = dw1.n("play screenshot:", ((la6) playDetailFragment.j1.getValue()).a);
                        String str3 = tf7Var.c;
                        String str4 = str3 == null ? "" : str3;
                        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                        for (ScreenshotDto screenshotDto : list) {
                            arrayList.add(new ScreenshotData(screenshotDto.getMainUrl(), screenshotDto.getThumbnailUrl()));
                        }
                        ScreenshotData[] screenshotDataArr = (ScreenshotData[]) arrayList.toArray(new ScreenshotData[0]);
                        j73 j73Var = pa6Var.x;
                        if (j73Var == null) {
                            js3.V("binding");
                            throw null;
                        }
                        ImageView imageView = j73Var.v;
                        js3.o(imageView, "screenshot");
                        js3.p(strN, "contextInfo");
                        js3.p(screenshotDataArr, "images");
                        int[] iArr = {(imageView.getWidth() / 2) + i6, (imageView.getHeight() / 2) + i7};
                        imageView.getLocationOnScreen(iArr);
                        int i6 = iArr[0];
                        int i7 = iArr[1];
                        pk5.g(am2Var2, new NavIntentDirections.DraggableScreenshot(new bv1(iIndexOf, strN, str4, screenshotDataArr, iArr)), -1);
                        return;
                }
            }
        };
        final int i3 = 2;
        ox5Var.p = new og5(this) { // from class: ia6
            public final /* synthetic */ PlayDetailFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                PlayDetailFragment playDetailFragment = this.b;
                switch (i22) {
                    case 0:
                        PlayAppInfoData playAppInfoData = (PlayAppInfoData) obj;
                        int i32 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ga6) qg5Var, "<unused var>");
                        js3.p(playAppInfoData, "data");
                        CategorySummaryDto categorySummaryDto = playAppInfoData.e;
                        String title = categorySummaryDto != null ? categorySummaryDto.getTitle() : null;
                        if (title == null) {
                            title = "";
                        }
                        String layoutKey = categorySummaryDto != null ? categorySummaryDto.getLayoutKey() : null;
                        pk5.g(playDetailFragment.J0, new NavIntentDirections.OtherFeature(new ow5(title, layoutKey != null ? layoutKey : "")), -1);
                        return;
                    case 1:
                        AppDeveloperInfoModuleData appDeveloperInfoModuleData = (AppDeveloperInfoModuleData) obj;
                        int i4 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((aq) qg5Var, "<unused var>");
                        js3.p(appDeveloperInfoModuleData, "data");
                        hl1 hl1Var = appDeveloperInfoModuleData.a;
                        if (hl1Var instanceof dl1) {
                            FragmentActivity fragmentActivityF = playDetailFragment.F();
                            if (fragmentActivityF != null) {
                                Object obj2 = lw8.b;
                                String str = hl1Var.c;
                                String strL = playDetailFragment.L(rs6.sending_email);
                                js3.o(strL, "getString(...)");
                                js8.v(fragmentActivityF, str, strL);
                                return;
                            }
                            return;
                        }
                        xf5 xf5Var = playDetailFragment.i1;
                        if (xf5Var == null) {
                            js3.V("myketUIUtils");
                            throw null;
                        }
                        FragmentActivity fragmentActivityF2 = playDetailFragment.F();
                        am2 am2Var = playDetailFragment.J0;
                        String str2 = hl1Var.c;
                        String strL2 = playDetailFragment.L(rs6.website_developer_link);
                        js3.o(strL2, "getString(...)");
                        xf5Var.k(fragmentActivityF2, am2Var, str2, strL2, false, false, false, false, true, false);
                        return;
                    default:
                        pa6 pa6Var = (pa6) qg5Var;
                        tf7 tf7Var = (tf7) obj;
                        int i5 = PlayDetailFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p(pa6Var, "viewHolder");
                        js3.p(tf7Var, "data");
                        am2 am2Var2 = playDetailFragment.J0;
                        List<ScreenshotDto> list = tf7Var.b;
                        int iIndexOf = list.indexOf(tf7Var.a);
                        String strN = dw1.n("play screenshot:", ((la6) playDetailFragment.j1.getValue()).a);
                        String str3 = tf7Var.c;
                        String str4 = str3 == null ? "" : str3;
                        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                        for (ScreenshotDto screenshotDto : list) {
                            arrayList.add(new ScreenshotData(screenshotDto.getMainUrl(), screenshotDto.getThumbnailUrl()));
                        }
                        ScreenshotData[] screenshotDataArr = (ScreenshotData[]) arrayList.toArray(new ScreenshotData[0]);
                        j73 j73Var = pa6Var.x;
                        if (j73Var == null) {
                            js3.V("binding");
                            throw null;
                        }
                        ImageView imageView = j73Var.v;
                        js3.o(imageView, "screenshot");
                        js3.p(strN, "contextInfo");
                        js3.p(screenshotDataArr, "images");
                        int[] iArr = {(imageView.getWidth() / 2) + i6, (imageView.getHeight() / 2) + i7};
                        imageView.getLocationOnScreen(iArr);
                        int i6 = iArr[0];
                        int i7 = iArr[1];
                        pk5.g(am2Var2, new NavIntentDirections.DraggableScreenshot(new bv1(iIndexOf, strN, str4, screenshotDataArr, iArr)), -1);
                        return;
                }
            }
        };
        ox5Var.m = new og5() { // from class: ir.mservices.market.app.suggest.detail.ui.a
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i4 = PlayDetailFragment.l1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.app.suggest.detail.recycler.a) qg5Var, "<unused var>");
                js3.p((PlayAppSuggestData) obj, "<unused var>");
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("search_google_request");
                clickEventBuilder.a();
                PlayDetailViewModel playDetailViewModelQ1 = this.a.Q1();
                bt2.G(y97.G(playDetailViewModelQ1), null, null, new PlayDetailViewModel$suggestApplication$1(playDetailViewModelQ1, null), 3);
            }
        };
        return ox5Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(R1(), this);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PlayDetailFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PlayDetailFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PlayDetailFragment$onViewCreated$3(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return Q1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final View p1(ViewGroup viewGroup) {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return -1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_8), K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding), 0, 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.play_detail_max_span);
    }
}
