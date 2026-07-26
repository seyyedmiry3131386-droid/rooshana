package ir.mservices.market.app.detail.ui.recommendation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import defpackage.bp2;
import defpackage.c24;
import defpackage.c5;
import defpackage.g27;
import defpackage.hp;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.mp;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.ra3;
import defpackage.x2;
import defpackage.x79;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationAction;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationList;
import ir.mservices.market.viewModel.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDetailRecommendationFragment extends Hilt_AppDetailRecommendationFragment {
    public static final /* synthetic */ int c1 = 0;
    public final o79 Y0;
    public final o79 Z0;
    public c5 a1;
    public ra3 b1;

    public AppDetailRecommendationFragment() {
        final AppDetailRecommendationFragment$special$$inlined$viewModels$default$1 appDetailRecommendationFragment$special$$inlined$viewModels$default$1 = new AppDetailRecommendationFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) appDetailRecommendationFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.Y0 = new o79(g27.a(AppDetailRecommendationViewModel.class), new bp2() { // from class: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment$special$$inlined$viewModels$default$4
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
        final x2 x2Var = new x2(5, this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) x2Var.invoke();
            }
        });
        this.Z0 = new o79(g27.a(AppDetailViewModel.class), new bp2() { // from class: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [np] */
    /* JADX WARN: Type inference failed for: r0v3, types: [np] */
    /* JADX WARN: Type inference failed for: r0v4, types: [np] */
    /* JADX WARN: Type inference failed for: r0v5, types: [np] */
    /* JADX WARN: Type inference failed for: r0v6, types: [np] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        mp mpVar = new mp(K().getDimensionPixelSize(pq6.tablet_app_detail_suggestion_width), p3.g(F()), this.F0.f());
        final int i = 0;
        mpVar.p = new og5(this) { // from class: np
            public final /* synthetic */ AppDetailRecommendationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String str;
                String str2;
                int i2 = i;
                AppDetailRecommendationFragment appDetailRecommendationFragment = this.b;
                switch (i2) {
                    case 0:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i3 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appDetailRecommendationFragment.U0(applicationDTO, h95Var.x(), new Tracker("detail", appNestedData.b, "recommendation"));
                            return;
                        }
                        return;
                    case 1:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i4 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str3 = homeMoreTitleRowData.a;
                        List list = homeMoreTitleRowData.f;
                        NavIntentDirections.Recommended recommended = null;
                        recommended = null;
                        recommended = null;
                        recommended = null;
                        if (str3 != null) {
                            ra3 ra3Var = appDetailRecommendationFragment.b1;
                            if (ra3Var == null) {
                                js3.V("homeAnalytics");
                                throw null;
                            }
                            ra3Var.e(str3);
                        }
                        if (list.isEmpty() || !((str2 = homeMoreTitleRowData.b) == null || f88.n0(str2))) {
                            if (str3 != null && !f88.n0(str3) && (str = homeMoreTitleRowData.e) != null && !f88.n0(str)) {
                                c5 c5Var = appDetailRecommendationFragment.a1;
                                if (c5Var == null) {
                                    js3.V("accountManager");
                                    throw null;
                                }
                                String strA = c5Var.a();
                                js3.o(strA, "getAccountId(...)");
                                Bundle bundle = appDetailRecommendationFragment.g;
                                String string = bundle != null ? bundle.getString("packageName") : null;
                                if (string == null) {
                                    string = "";
                                }
                                String str4 = homeMoreTitleRowData.a;
                                recommended = new NavIntentDirections.Recommended(new jy6(strA, string, str4, homeMoreTitleRowData.e, new Tracker("recommendation", str4, "recommendation")));
                            }
                            applicationList = recommended;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str3, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appDetailRecommendationFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 2:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i5 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        String str5 = extHeaderData.a;
                        if (ExtensionPointDto.TYPE_UPDATE_APP_LIST.equalsIgnoreCase(str5)) {
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.Update(), -1);
                            return;
                        } else {
                            String str6 = extHeaderData.c;
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.UrlReceive(new t09(extHeaderData.b, dw1.n("Detail ext - ", str6), str6, m88.T(str5, ExtensionPointDto.TYPE_UPDATE_APP_LIST, false) ? "UpdateApps" : "Apps")), -1);
                            return;
                        }
                    case 3:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO2, mrVar.x(), new Tracker("detail", appNestedData2.b, "recommendation"));
                            return;
                        }
                        return;
                    default:
                        h95 h95Var2 = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        int i7 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var2, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        ApplicationDTO applicationDTO3 = appNestedData3.a;
                        if (applicationDTO3 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO3, h95Var2.x(), new Tracker("detail", appNestedData3.b, "recommendation"));
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        mpVar.o = new og5(this) { // from class: np
            public final /* synthetic */ AppDetailRecommendationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String str;
                String str2;
                int i22 = i2;
                AppDetailRecommendationFragment appDetailRecommendationFragment = this.b;
                switch (i22) {
                    case 0:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i3 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appDetailRecommendationFragment.U0(applicationDTO, h95Var.x(), new Tracker("detail", appNestedData.b, "recommendation"));
                            return;
                        }
                        return;
                    case 1:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i4 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str3 = homeMoreTitleRowData.a;
                        List list = homeMoreTitleRowData.f;
                        NavIntentDirections.Recommended recommended = null;
                        recommended = null;
                        recommended = null;
                        recommended = null;
                        if (str3 != null) {
                            ra3 ra3Var = appDetailRecommendationFragment.b1;
                            if (ra3Var == null) {
                                js3.V("homeAnalytics");
                                throw null;
                            }
                            ra3Var.e(str3);
                        }
                        if (list.isEmpty() || !((str2 = homeMoreTitleRowData.b) == null || f88.n0(str2))) {
                            if (str3 != null && !f88.n0(str3) && (str = homeMoreTitleRowData.e) != null && !f88.n0(str)) {
                                c5 c5Var = appDetailRecommendationFragment.a1;
                                if (c5Var == null) {
                                    js3.V("accountManager");
                                    throw null;
                                }
                                String strA = c5Var.a();
                                js3.o(strA, "getAccountId(...)");
                                Bundle bundle = appDetailRecommendationFragment.g;
                                String string = bundle != null ? bundle.getString("packageName") : null;
                                if (string == null) {
                                    string = "";
                                }
                                String str4 = homeMoreTitleRowData.a;
                                recommended = new NavIntentDirections.Recommended(new jy6(strA, string, str4, homeMoreTitleRowData.e, new Tracker("recommendation", str4, "recommendation")));
                            }
                            applicationList = recommended;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str3, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appDetailRecommendationFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 2:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i5 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        String str5 = extHeaderData.a;
                        if (ExtensionPointDto.TYPE_UPDATE_APP_LIST.equalsIgnoreCase(str5)) {
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.Update(), -1);
                            return;
                        } else {
                            String str6 = extHeaderData.c;
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.UrlReceive(new t09(extHeaderData.b, dw1.n("Detail ext - ", str6), str6, m88.T(str5, ExtensionPointDto.TYPE_UPDATE_APP_LIST, false) ? "UpdateApps" : "Apps")), -1);
                            return;
                        }
                    case 3:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO2, mrVar.x(), new Tracker("detail", appNestedData2.b, "recommendation"));
                            return;
                        }
                        return;
                    default:
                        h95 h95Var2 = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        int i7 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var2, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        ApplicationDTO applicationDTO3 = appNestedData3.a;
                        if (applicationDTO3 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO3, h95Var2.x(), new Tracker("detail", appNestedData3.b, "recommendation"));
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 2;
        mpVar.s = new og5(this) { // from class: np
            public final /* synthetic */ AppDetailRecommendationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String str;
                String str2;
                int i22 = i3;
                AppDetailRecommendationFragment appDetailRecommendationFragment = this.b;
                switch (i22) {
                    case 0:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i32 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appDetailRecommendationFragment.U0(applicationDTO, h95Var.x(), new Tracker("detail", appNestedData.b, "recommendation"));
                            return;
                        }
                        return;
                    case 1:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i4 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str3 = homeMoreTitleRowData.a;
                        List list = homeMoreTitleRowData.f;
                        NavIntentDirections.Recommended recommended = null;
                        recommended = null;
                        recommended = null;
                        recommended = null;
                        if (str3 != null) {
                            ra3 ra3Var = appDetailRecommendationFragment.b1;
                            if (ra3Var == null) {
                                js3.V("homeAnalytics");
                                throw null;
                            }
                            ra3Var.e(str3);
                        }
                        if (list.isEmpty() || !((str2 = homeMoreTitleRowData.b) == null || f88.n0(str2))) {
                            if (str3 != null && !f88.n0(str3) && (str = homeMoreTitleRowData.e) != null && !f88.n0(str)) {
                                c5 c5Var = appDetailRecommendationFragment.a1;
                                if (c5Var == null) {
                                    js3.V("accountManager");
                                    throw null;
                                }
                                String strA = c5Var.a();
                                js3.o(strA, "getAccountId(...)");
                                Bundle bundle = appDetailRecommendationFragment.g;
                                String string = bundle != null ? bundle.getString("packageName") : null;
                                if (string == null) {
                                    string = "";
                                }
                                String str4 = homeMoreTitleRowData.a;
                                recommended = new NavIntentDirections.Recommended(new jy6(strA, string, str4, homeMoreTitleRowData.e, new Tracker("recommendation", str4, "recommendation")));
                            }
                            applicationList = recommended;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str3, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appDetailRecommendationFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 2:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i5 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        String str5 = extHeaderData.a;
                        if (ExtensionPointDto.TYPE_UPDATE_APP_LIST.equalsIgnoreCase(str5)) {
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.Update(), -1);
                            return;
                        } else {
                            String str6 = extHeaderData.c;
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.UrlReceive(new t09(extHeaderData.b, dw1.n("Detail ext - ", str6), str6, m88.T(str5, ExtensionPointDto.TYPE_UPDATE_APP_LIST, false) ? "UpdateApps" : "Apps")), -1);
                            return;
                        }
                    case 3:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO2, mrVar.x(), new Tracker("detail", appNestedData2.b, "recommendation"));
                            return;
                        }
                        return;
                    default:
                        h95 h95Var2 = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        int i7 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var2, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        ApplicationDTO applicationDTO3 = appNestedData3.a;
                        if (applicationDTO3 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO3, h95Var2.x(), new Tracker("detail", appNestedData3.b, "recommendation"));
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 3;
        mpVar.q = new og5(this) { // from class: np
            public final /* synthetic */ AppDetailRecommendationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String str;
                String str2;
                int i22 = i4;
                AppDetailRecommendationFragment appDetailRecommendationFragment = this.b;
                switch (i22) {
                    case 0:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i32 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appDetailRecommendationFragment.U0(applicationDTO, h95Var.x(), new Tracker("detail", appNestedData.b, "recommendation"));
                            return;
                        }
                        return;
                    case 1:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i42 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str3 = homeMoreTitleRowData.a;
                        List list = homeMoreTitleRowData.f;
                        NavIntentDirections.Recommended recommended = null;
                        recommended = null;
                        recommended = null;
                        recommended = null;
                        if (str3 != null) {
                            ra3 ra3Var = appDetailRecommendationFragment.b1;
                            if (ra3Var == null) {
                                js3.V("homeAnalytics");
                                throw null;
                            }
                            ra3Var.e(str3);
                        }
                        if (list.isEmpty() || !((str2 = homeMoreTitleRowData.b) == null || f88.n0(str2))) {
                            if (str3 != null && !f88.n0(str3) && (str = homeMoreTitleRowData.e) != null && !f88.n0(str)) {
                                c5 c5Var = appDetailRecommendationFragment.a1;
                                if (c5Var == null) {
                                    js3.V("accountManager");
                                    throw null;
                                }
                                String strA = c5Var.a();
                                js3.o(strA, "getAccountId(...)");
                                Bundle bundle = appDetailRecommendationFragment.g;
                                String string = bundle != null ? bundle.getString("packageName") : null;
                                if (string == null) {
                                    string = "";
                                }
                                String str4 = homeMoreTitleRowData.a;
                                recommended = new NavIntentDirections.Recommended(new jy6(strA, string, str4, homeMoreTitleRowData.e, new Tracker("recommendation", str4, "recommendation")));
                            }
                            applicationList = recommended;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str3, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appDetailRecommendationFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 2:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i5 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        String str5 = extHeaderData.a;
                        if (ExtensionPointDto.TYPE_UPDATE_APP_LIST.equalsIgnoreCase(str5)) {
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.Update(), -1);
                            return;
                        } else {
                            String str6 = extHeaderData.c;
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.UrlReceive(new t09(extHeaderData.b, dw1.n("Detail ext - ", str6), str6, m88.T(str5, ExtensionPointDto.TYPE_UPDATE_APP_LIST, false) ? "UpdateApps" : "Apps")), -1);
                            return;
                        }
                    case 3:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO2, mrVar.x(), new Tracker("detail", appNestedData2.b, "recommendation"));
                            return;
                        }
                        return;
                    default:
                        h95 h95Var2 = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        int i7 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var2, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        ApplicationDTO applicationDTO3 = appNestedData3.a;
                        if (applicationDTO3 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO3, h95Var2.x(), new Tracker("detail", appNestedData3.b, "recommendation"));
                            return;
                        }
                        return;
                }
            }
        };
        final int i5 = 4;
        mpVar.r = new og5(this) { // from class: np
            public final /* synthetic */ AppDetailRecommendationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                yi5 applicationList;
                String str;
                String str2;
                int i22 = i5;
                AppDetailRecommendationFragment appDetailRecommendationFragment = this.b;
                switch (i22) {
                    case 0:
                        h95 h95Var = (h95) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i32 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            appDetailRecommendationFragment.U0(applicationDTO, h95Var.x(), new Tracker("detail", appNestedData.b, "recommendation"));
                            return;
                        }
                        return;
                    case 1:
                        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
                        int i42 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((tb3) qg5Var, "<unused var>");
                        js3.p(homeMoreTitleRowData, "recyclerData");
                        String str3 = homeMoreTitleRowData.a;
                        List list = homeMoreTitleRowData.f;
                        NavIntentDirections.Recommended recommended = null;
                        recommended = null;
                        recommended = null;
                        recommended = null;
                        if (str3 != null) {
                            ra3 ra3Var = appDetailRecommendationFragment.b1;
                            if (ra3Var == null) {
                                js3.V("homeAnalytics");
                                throw null;
                            }
                            ra3Var.e(str3);
                        }
                        if (list.isEmpty() || !((str2 = homeMoreTitleRowData.b) == null || f88.n0(str2))) {
                            if (str3 != null && !f88.n0(str3) && (str = homeMoreTitleRowData.e) != null && !f88.n0(str)) {
                                c5 c5Var = appDetailRecommendationFragment.a1;
                                if (c5Var == null) {
                                    js3.V("accountManager");
                                    throw null;
                                }
                                String strA = c5Var.a();
                                js3.o(strA, "getAccountId(...)");
                                Bundle bundle = appDetailRecommendationFragment.g;
                                String string = bundle != null ? bundle.getString("packageName") : null;
                                if (string == null) {
                                    string = "";
                                }
                                String str4 = homeMoreTitleRowData.a;
                                recommended = new NavIntentDirections.Recommended(new jy6(strA, string, str4, homeMoreTitleRowData.e, new Tracker("recommendation", str4, "recommendation")));
                            }
                            applicationList = recommended;
                        } else {
                            ApplicationList applicationList2 = new ApplicationList(new ArrayList(list));
                            List list2 = homeMoreTitleRowData.g;
                            applicationList = new NavIntentDirections.ApplicationList(new tq(applicationList2, str3, list2 != null ? (String[]) list2.toArray(new String[0]) : null));
                        }
                        if (applicationList != null) {
                            pk5.g(appDetailRecommendationFragment.J0, applicationList, -1);
                            return;
                        }
                        return;
                    case 2:
                        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
                        int i52 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p((v62) qg5Var, "<unused var>");
                        js3.p(extHeaderData, "recyclerData");
                        String str5 = extHeaderData.a;
                        if (ExtensionPointDto.TYPE_UPDATE_APP_LIST.equalsIgnoreCase(str5)) {
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.Update(), -1);
                            return;
                        } else {
                            String str6 = extHeaderData.c;
                            pk5.g(appDetailRecommendationFragment.J0, new NavIntentDirections.UrlReceive(new t09(extHeaderData.b, dw1.n("Detail ext - ", str6), str6, m88.T(str5, ExtensionPointDto.TYPE_UPDATE_APP_LIST, false) ? "UpdateApps" : "Apps")), -1);
                            return;
                        }
                    case 3:
                        mr mrVar = (mr) qg5Var;
                        AppNestedData appNestedData2 = (AppNestedData) obj;
                        int i6 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(mrVar, "viewHolder");
                        js3.p(appNestedData2, "recyclerData");
                        ApplicationDTO applicationDTO2 = appNestedData2.a;
                        if (applicationDTO2 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO2, mrVar.x(), new Tracker("detail", appNestedData2.b, "recommendation"));
                            return;
                        }
                        return;
                    default:
                        h95 h95Var2 = (h95) qg5Var;
                        AppNestedData appNestedData3 = (AppNestedData) obj;
                        int i7 = AppDetailRecommendationFragment.c1;
                        js3.p(view, "<unused var>");
                        js3.p(h95Var2, "viewHolder");
                        js3.p(appNestedData3, "recyclerData");
                        ApplicationDTO applicationDTO3 = appNestedData3.a;
                        if (applicationDTO3 != null) {
                            appDetailRecommendationFragment.U0(applicationDTO3, h95Var2.x(), new Tracker("detail", appNestedData3.b, "recommendation"));
                            return;
                        }
                        return;
                }
            }
        };
        return mpVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return (AppDetailRecommendationViewModel) this.Y0.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return 1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        return null;
    }

    public final void U0(ApplicationDTO applicationDTO, ImageView imageView, Tracker tracker) {
        String packageName = applicationDTO.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        boolean z = G0().b(imageView.getDrawable()) != null;
        String refId = applicationDTO.getRefId();
        js3.o(refId, "getRefId(...)");
        String callbackUrl = applicationDTO.getCallbackUrl();
        String iconPath = applicationDTO.getIconPath();
        js3.o(iconPath, "getIconPath(...)");
        String title = applicationDTO.getTitle();
        js3.o(title, "getTitle(...)");
        String packageName2 = applicationDTO.getPackageName();
        js3.o(packageName2, "getPackageName(...)");
        pk5.f(this.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, tracker, z, null, refId, callbackUrl, null, new StartApplicationData(new AppBarSampleData(iconPath, title, packageName2, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback()), null, null, null, null)));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ((AppDetailRecommendationViewModel) this.Y0.getValue()).r(new AppDetailRecommendationAction.UpdateListDataAction(((AppDetailViewModel) this.Z0.getValue()).X0));
        J0().setVerticalScrollBarEnabled(false);
    }
}
