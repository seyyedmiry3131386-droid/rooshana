package ir.mservices.market.download.app;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.br9;
import defpackage.c24;
import defpackage.ca7;
import defpackage.cx;
import defpackage.d16;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.g27;
import defpackage.hp;
import defpackage.ht1;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pj9;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs6;
import defpackage.qz6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.vr1;
import defpackage.x79;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.download.app.DownloadRecyclerListFragment;
import ir.mservices.market.download.app.RecentDownloadAction;
import ir.mservices.market.download.app.recycler.AppDownloadData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadRecyclerListFragment extends Hilt_DownloadRecyclerListFragment {
    public static final /* synthetic */ int j1 = 0;
    public final o79 i1;

    public DownloadRecyclerListFragment() {
        final ht1 ht1Var = new ht1(this, 0);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.download.app.DownloadRecyclerListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) ht1Var.invoke();
            }
        });
        this.i1 = new o79(g27.a(DownloadViewModel.class), new bp2() { // from class: ir.mservices.market.download.app.DownloadRecyclerListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.download.app.DownloadRecyclerListFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.download.app.DownloadRecyclerListFragment$special$$inlined$viewModels$default$3
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
        if (str.equalsIgnoreCase(Q1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_DELETE_FILES".equalsIgnoreCase(dialogDataModel.b)) {
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult == DialogResult.a) {
                    R1().r(RecentDownloadAction.RemoveAllMultiSelectedItems.INSTANCE);
                } else if (dialogResult == DialogResult.b) {
                    R1().s();
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        return "";
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void F1() {
        R1().e();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_downloads);
        MyketTextView myketTextView = (MyketTextView) view.findViewById(rr6.empty_title);
        myketTextView.setVisibility(0);
        myketTextView.setText(rs6.any_apps_title);
        TextView textView = (TextView) view.findViewById(rr6.empty_message);
        textView.setVisibility(0);
        textView.setText(rs6.any_apps_txt);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final List L0() {
        return br9.B(R1());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String N0() {
        String strL = L(rs6.page_name_recent_download);
        js3.o(strL, "getString(...)");
        return strL;
    }

    public final String Q1() {
        return dw1.n("DownloadRecyclerListFragment_", this.H0);
    }

    public final DownloadViewModel R1() {
        return (DownloadViewModel) this.i1.getValue();
    }

    public final void S1(StartApplicationData startApplicationData, String str, String str2, AppIconView appIconView, Tracker tracker) {
        pk5.f(this.J0, new NavIntentDirections.AppDetail(new hp(startApplicationData.getAppBarSampleData().getPackageName(), false, tracker, s1().b(appIconView.getDrawable()) != null, null, str, str2, null, startApplicationData, null, null, null, null)));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean X0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(Q1());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        vr1 vr1Var = new vr1(p3.g(F()), this.F0.f(), 0);
        vr1Var.p = new bn6(F());
        final int i = 0;
        vr1Var.o = new og5(this) { // from class: it1
            public final /* synthetic */ DownloadRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                DownloadRecyclerListFragment downloadRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i3 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.download.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(appDownloadData.m, false, new Tracker("downloads", null, "verticalList"), false, null, appDownloadData.u, null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i4 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("downloading_recomm_app");
                        clickEventBuilder.a();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            String callbackUrl = applicationDTO.getCallbackUrl();
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("downloads", null, "recommendation");
                            this.b.S1(startApplicationData, refId, callbackUrl, (AppIconView) imageViewX, tracker);
                        }
                        break;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i5 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("downloading_recomm_app");
                        clickEventBuilder2.a();
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            String iconPath2 = applicationDTO2.getIconPath();
                            js3.o(iconPath2, "getIconPath(...)");
                            String title2 = applicationDTO2.getTitle();
                            js3.o(title2, "getTitle(...)");
                            String packageName2 = applicationDTO2.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData2 = new StartApplicationData(new AppBarSampleData(iconPath2, title2, packageName2, null, applicationDTO2.getTagline(), null, null, null, 232, null), applicationDTO2.getInstallCallbackUrl(), applicationDTO2.getClickCallback());
                            String refId2 = applicationDTO2.getRefId();
                            js3.o(refId2, "getRefId(...)");
                            String callbackUrl2 = applicationDTO2.getCallbackUrl();
                            ImageView imageViewX2 = mrVar.x();
                            Tracker tracker2 = new Tracker("downloads", null, "recommendation");
                            this.b.S1(startApplicationData2, refId2, callbackUrl2, (AppIconView) imageViewX2, tracker2);
                        }
                        break;
                    default:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i6 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("downloading_recomm_more");
                        clickEventBuilder3.a();
                        String str = extHeaderData.b;
                        String str2 = extHeaderData.c;
                        pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.UrlReceive(new t09(str, dw1.n("Download ext - ", str2), str2, "Apps")), -1);
                        break;
                }
            }
        };
        vr1Var.k = new pj9(this);
        final int i2 = 1;
        vr1Var.q = new og5(this) { // from class: it1
            public final /* synthetic */ DownloadRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                DownloadRecyclerListFragment downloadRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i3 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.download.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(appDownloadData.m, false, new Tracker("downloads", null, "verticalList"), false, null, appDownloadData.u, null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i4 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("downloading_recomm_app");
                        clickEventBuilder.a();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            String callbackUrl = applicationDTO.getCallbackUrl();
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("downloads", null, "recommendation");
                            this.b.S1(startApplicationData, refId, callbackUrl, (AppIconView) imageViewX, tracker);
                        }
                        break;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i5 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("downloading_recomm_app");
                        clickEventBuilder2.a();
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            String iconPath2 = applicationDTO2.getIconPath();
                            js3.o(iconPath2, "getIconPath(...)");
                            String title2 = applicationDTO2.getTitle();
                            js3.o(title2, "getTitle(...)");
                            String packageName2 = applicationDTO2.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData2 = new StartApplicationData(new AppBarSampleData(iconPath2, title2, packageName2, null, applicationDTO2.getTagline(), null, null, null, 232, null), applicationDTO2.getInstallCallbackUrl(), applicationDTO2.getClickCallback());
                            String refId2 = applicationDTO2.getRefId();
                            js3.o(refId2, "getRefId(...)");
                            String callbackUrl2 = applicationDTO2.getCallbackUrl();
                            ImageView imageViewX2 = mrVar.x();
                            Tracker tracker2 = new Tracker("downloads", null, "recommendation");
                            this.b.S1(startApplicationData2, refId2, callbackUrl2, (AppIconView) imageViewX2, tracker2);
                        }
                        break;
                    default:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i6 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("downloading_recomm_more");
                        clickEventBuilder3.a();
                        String str = extHeaderData.b;
                        String str2 = extHeaderData.c;
                        pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.UrlReceive(new t09(str, dw1.n("Download ext - ", str2), str2, "Apps")), -1);
                        break;
                }
            }
        };
        vr1Var.r = new ca7(20, vr1Var);
        final int i3 = 2;
        vr1Var.s = new og5(this) { // from class: it1
            public final /* synthetic */ DownloadRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                DownloadRecyclerListFragment downloadRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i32 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.download.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(appDownloadData.m, false, new Tracker("downloads", null, "verticalList"), false, null, appDownloadData.u, null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i4 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("downloading_recomm_app");
                        clickEventBuilder.a();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            String callbackUrl = applicationDTO.getCallbackUrl();
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("downloads", null, "recommendation");
                            this.b.S1(startApplicationData, refId, callbackUrl, (AppIconView) imageViewX, tracker);
                        }
                        break;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i5 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("downloading_recomm_app");
                        clickEventBuilder2.a();
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            String iconPath2 = applicationDTO2.getIconPath();
                            js3.o(iconPath2, "getIconPath(...)");
                            String title2 = applicationDTO2.getTitle();
                            js3.o(title2, "getTitle(...)");
                            String packageName2 = applicationDTO2.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData2 = new StartApplicationData(new AppBarSampleData(iconPath2, title2, packageName2, null, applicationDTO2.getTagline(), null, null, null, 232, null), applicationDTO2.getInstallCallbackUrl(), applicationDTO2.getClickCallback());
                            String refId2 = applicationDTO2.getRefId();
                            js3.o(refId2, "getRefId(...)");
                            String callbackUrl2 = applicationDTO2.getCallbackUrl();
                            ImageView imageViewX2 = mrVar.x();
                            Tracker tracker2 = new Tracker("downloads", null, "recommendation");
                            this.b.S1(startApplicationData2, refId2, callbackUrl2, (AppIconView) imageViewX2, tracker2);
                        }
                        break;
                    default:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i6 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("downloading_recomm_more");
                        clickEventBuilder3.a();
                        String str = extHeaderData.b;
                        String str2 = extHeaderData.c;
                        pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.UrlReceive(new t09(str, dw1.n("Download ext - ", str2), str2, "Apps")), -1);
                        break;
                }
            }
        };
        final int i4 = 3;
        vr1Var.t = new og5(this) { // from class: it1
            public final /* synthetic */ DownloadRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i4;
                DownloadRecyclerListFragment downloadRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        AppDownloadData appDownloadData = (AppDownloadData) obj;
                        int i32 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.download.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(appDownloadData.m, false, new Tracker("downloads", null, "verticalList"), false, null, appDownloadData.u, null, null, null, null, null, null, null)), -1);
                        break;
                    case 1:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i42 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("downloading_recomm_app");
                        clickEventBuilder.a();
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            String callbackUrl = applicationDTO.getCallbackUrl();
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("downloads", null, "recommendation");
                            this.b.S1(startApplicationData, refId, callbackUrl, (AppIconView) imageViewX, tracker);
                        }
                        break;
                    case 2:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i5 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("downloading_recomm_app");
                        clickEventBuilder2.a();
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            String iconPath2 = applicationDTO2.getIconPath();
                            js3.o(iconPath2, "getIconPath(...)");
                            String title2 = applicationDTO2.getTitle();
                            js3.o(title2, "getTitle(...)");
                            String packageName2 = applicationDTO2.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            StartApplicationData startApplicationData2 = new StartApplicationData(new AppBarSampleData(iconPath2, title2, packageName2, null, applicationDTO2.getTagline(), null, null, null, 232, null), applicationDTO2.getInstallCallbackUrl(), applicationDTO2.getClickCallback());
                            String refId2 = applicationDTO2.getRefId();
                            js3.o(refId2, "getRefId(...)");
                            String callbackUrl2 = applicationDTO2.getCallbackUrl();
                            ImageView imageViewX2 = mrVar.x();
                            Tracker tracker2 = new Tracker("downloads", null, "recommendation");
                            this.b.S1(startApplicationData2, refId2, callbackUrl2, (AppIconView) imageViewX2, tracker2);
                        }
                        break;
                    default:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i6 = DownloadRecyclerListFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("downloading_recomm_more");
                        clickEventBuilder3.a();
                        String str = extHeaderData.b;
                        String str2 = extHeaderData.c;
                        pk5.g(downloadRecyclerListFragment.J0, new NavIntentDirections.UrlReceive(new t09(str, dw1.n("Download ext - ", str2), str2, "Apps")), -1);
                        break;
                }
            }
        };
        return vr1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        qz6 itemAnimator = y1().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f = 0L;
        }
        this.J0.d(Q1(), this);
        ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
        if (aVar != null) {
            ht1 ht1Var = new ht1(this, 1);
            cx cxVar = aVar.e;
            cxVar.getClass();
            ((CopyOnWriteArrayList) cxVar.f.f.b).add(ht1Var);
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadRecyclerListFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadRecyclerListFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new DownloadRecyclerListFragment$onViewCreated$4(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return R1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return -1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.horizontal_space_outer) + K().getDimensionPixelSize(pq6.horizontal_space_inner), 0, 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
