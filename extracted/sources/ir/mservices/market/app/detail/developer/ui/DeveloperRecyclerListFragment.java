package ir.mservices.market.app.detail.developer.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.au7;
import defpackage.bi5;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cl1;
import defpackage.d16;
import defpackage.de;
import defpackage.ds6;
import defpackage.f88;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.ml1;
import defpackage.ms6;
import defpackage.o79;
import defpackage.og5;
import defpackage.ot4;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rq4;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.v7;
import defpackage.x79;
import defpackage.xf5;
import defpackage.yh7;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.detail.developer.ui.DeveloperRecyclerListFragment;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.AppIconView;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class DeveloperRecyclerListFragment extends Hilt_DeveloperRecyclerListFragment {
    public static final /* synthetic */ int o1 = 0;
    public xf5 i1;
    public final o79 j1;
    public final bi5 k1;
    public MenuItem l1;
    public ot4 m1;
    public MenuItem n1;

    public DeveloperRecyclerListFragment() {
        final DeveloperRecyclerListFragment$special$$inlined$viewModels$default$1 developerRecyclerListFragment$special$$inlined$viewModels$default$1 = new DeveloperRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.detail.developer.ui.DeveloperRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) developerRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(DeveloperViewModel.class), new bp2() { // from class: ir.mservices.market.app.detail.developer.ui.DeveloperRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.developer.ui.DeveloperRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.detail.developer.ui.DeveloperRecyclerListFragment$special$$inlined$viewModels$default$4
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
        this.k1 = new bi5(g27.a(ml1.class), new de(14, this));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_developer_apps);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        String strConcat;
        String str = ((ml1) this.k1.getValue()).a;
        if (str == null || f88.n0(str)) {
            str = null;
        }
        if (str == null || (strConcat = "Developer for accountId: ".concat(str)) == null) {
            return null;
        }
        return strConcat;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        TextView textView = (TextView) view.findViewById(rr6.empty_message);
        textView.setText(textView.getResources().getString(rs6.no_item_in_developer_list));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String str = ((ml1) this.k1.getValue()).c;
        if (str == null || f88.n0(str)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String strL = L(rs6.developer_page_title);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemFindItem;
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.list_share, menu);
        MenuItem menuItemFindItem2 = menu.findItem(rr6.action_more);
        this.l1 = menuItemFindItem2;
        ot4 ot4VarS0 = S0(ms6.list_share_more, menuItemFindItem2);
        this.m1 = ot4VarS0;
        if (ot4VarS0 == null || (menuItemFindItem = ot4VarS0.findItem(rr6.action_share)) == null) {
            menuItemFindItem = null;
        } else {
            CharSequence charSequence = (CharSequence) ((DeveloperViewModel) this.j1.getValue()).y.a.getValue();
            rq4.O(menuItemFindItem, !(charSequence == null || f88.n0(charSequence)), this.m1, this.l1);
        }
        this.n1 = menuItemFindItem;
        MenuItem menuItemFindItem3 = menu.findItem(rr6.action_search);
        Drawable icon = menuItemFindItem3.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        xf5 xf5Var = this.i1;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        xf5.j(xf5Var, this, menuItemFindItem3);
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == rr6.action_share) {
            ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
            actionBarEventBuilder.b("action_bar_developer_share");
            actionBarEventBuilder.a();
            Context contextH = H();
            String str = (String) ((DeveloperViewModel) this.j1.getValue()).y.a.getValue();
            au7.a(contextH, str != null ? str : "", new v7(27));
            return true;
        }
        if (itemId == rr6.action_search) {
            ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
            actionBarEventBuilder2.b("list_search");
            actionBarEventBuilder2.a();
            ActionBarEventBuilder actionBarEventBuilder3 = new ActionBarEventBuilder();
            actionBarEventBuilder3.b("app_list_search_developer");
            actionBarEventBuilder3.a();
            pk5.g(this.J0, new NavIntentDirections.Search(new yh7("", "List")), -1);
        }
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        cl1 cl1Var = new cl1(v1(), 0);
        cl1Var.m = new bn6(F());
        final int i = 0;
        cl1Var.n = new og5(this) { // from class: ll1
            public final /* synthetic */ DeveloperRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                DeveloperRecyclerListFragment developerRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        ir.mservices.market.app.common.recycler.a aVar = (ir.mservices.market.app.common.recycler.a) qg5Var;
                        AppData appData = (AppData) obj;
                        int i3 = DeveloperRecyclerListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(appData, "recyclerData");
                        AppIconView appIconViewX = aVar.x();
                        ApplicationDTO applicationDTO = appData.c;
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
                        Tracker tracker = ((ml1) developerRecyclerListFragment.k1.getValue()).d;
                        boolean z = developerRecyclerListFragment.s1().b(appIconViewX.getDrawable()) != null;
                        String refId = applicationDTO.getRefId();
                        js3.o(refId, "getRefId(...)");
                        pk5.f(developerRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        return;
                    default:
                        AppDeveloperInfoModuleData appDeveloperInfoModuleData = (AppDeveloperInfoModuleData) obj;
                        int i4 = DeveloperRecyclerListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((aq) qg5Var, "<unused var>");
                        js3.p(appDeveloperInfoModuleData, "recyclerData");
                        hl1 hl1Var = appDeveloperInfoModuleData.a;
                        if (hl1Var instanceof dl1) {
                            String str = hl1Var.c;
                            Context contextH = developerRecyclerListFragment.H();
                            if (contextH != null) {
                                Object obj2 = lw8.b;
                                String string = developerRecyclerListFragment.K().getString(rs6.sending_email);
                                js3.o(string, "getString(...)");
                                js8.v((ContextWrapper) contextH, str, string);
                                return;
                            }
                            return;
                        }
                        if (hl1Var instanceof gl1) {
                            String str2 = hl1Var.c;
                            String strL = developerRecyclerListFragment.L(rs6.website_developer_link);
                            js3.o(strL, "getString(...)");
                            xf5 xf5Var = developerRecyclerListFragment.i1;
                            if (xf5Var != null) {
                                xf5Var.k(developerRecyclerListFragment.F(), developerRecyclerListFragment.J0, str2, strL, false, false, false, false, true, false);
                                return;
                            } else {
                                js3.V("myketUIUtils");
                                throw null;
                            }
                        }
                        if (!(hl1Var instanceof fl1)) {
                            if (!(hl1Var instanceof el1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        }
                        String str3 = hl1Var.c;
                        Context contextH2 = developerRecyclerListFragment.H();
                        if (contextH2 != null) {
                            Object obj3 = lw8.b;
                            r69 r69Var = (r69) contextH2;
                            ContextWrapper contextWrapper = (ContextWrapper) contextH2;
                            Intent intent = new Intent("android.intent.action.DIAL");
                            intent.setData(Uri.parse("tel:".concat(str3)));
                            intent.setData(Uri.fromParts("tel", str3, "#"));
                            if (intent.resolveActivity(contextWrapper.getPackageManager()) != null) {
                                contextWrapper.startActivity(intent);
                                return;
                            } else {
                                hh2.H(new hh2(r69Var, r69Var.getString(rs6.uncatchable_intent)));
                                return;
                            }
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        cl1Var.o = new og5(this) { // from class: ll1
            public final /* synthetic */ DeveloperRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                DeveloperRecyclerListFragment developerRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        ir.mservices.market.app.common.recycler.a aVar = (ir.mservices.market.app.common.recycler.a) qg5Var;
                        AppData appData = (AppData) obj;
                        int i3 = DeveloperRecyclerListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p(aVar, "viewHolder");
                        js3.p(appData, "recyclerData");
                        AppIconView appIconViewX = aVar.x();
                        ApplicationDTO applicationDTO = appData.c;
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
                        Tracker tracker = ((ml1) developerRecyclerListFragment.k1.getValue()).d;
                        boolean z = developerRecyclerListFragment.s1().b(appIconViewX.getDrawable()) != null;
                        String refId = applicationDTO.getRefId();
                        js3.o(refId, "getRefId(...)");
                        pk5.f(developerRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        return;
                    default:
                        AppDeveloperInfoModuleData appDeveloperInfoModuleData = (AppDeveloperInfoModuleData) obj;
                        int i4 = DeveloperRecyclerListFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((aq) qg5Var, "<unused var>");
                        js3.p(appDeveloperInfoModuleData, "recyclerData");
                        hl1 hl1Var = appDeveloperInfoModuleData.a;
                        if (hl1Var instanceof dl1) {
                            String str = hl1Var.c;
                            Context contextH = developerRecyclerListFragment.H();
                            if (contextH != null) {
                                Object obj2 = lw8.b;
                                String string = developerRecyclerListFragment.K().getString(rs6.sending_email);
                                js3.o(string, "getString(...)");
                                js8.v((ContextWrapper) contextH, str, string);
                                return;
                            }
                            return;
                        }
                        if (hl1Var instanceof gl1) {
                            String str2 = hl1Var.c;
                            String strL = developerRecyclerListFragment.L(rs6.website_developer_link);
                            js3.o(strL, "getString(...)");
                            xf5 xf5Var = developerRecyclerListFragment.i1;
                            if (xf5Var != null) {
                                xf5Var.k(developerRecyclerListFragment.F(), developerRecyclerListFragment.J0, str2, strL, false, false, false, false, true, false);
                                return;
                            } else {
                                js3.V("myketUIUtils");
                                throw null;
                            }
                        }
                        if (!(hl1Var instanceof fl1)) {
                            if (!(hl1Var instanceof el1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        }
                        String str3 = hl1Var.c;
                        Context contextH2 = developerRecyclerListFragment.H();
                        if (contextH2 != null) {
                            Object obj3 = lw8.b;
                            r69 r69Var = (r69) contextH2;
                            ContextWrapper contextWrapper = (ContextWrapper) contextH2;
                            Intent intent = new Intent("android.intent.action.DIAL");
                            intent.setData(Uri.parse("tel:".concat(str3)));
                            intent.setData(Uri.fromParts("tel", str3, "#"));
                            if (intent.resolveActivity(contextWrapper.getPackageManager()) != null) {
                                contextWrapper.startActivity(intent);
                                return;
                            } else {
                                hh2.H(new hh2(r69Var, r69Var.getString(rs6.uncatchable_intent)));
                                return;
                            }
                        }
                        return;
                }
            }
        };
        return cl1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DeveloperRecyclerListFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (DeveloperViewModel) this.j1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_12), K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer), 0, K().getDimensionPixelSize(pq6.space_4), v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.developer_max_span);
    }
}
