package ir.mservices.market.app.packages.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import defpackage.d16;
import defpackage.ds6;
import defpackage.f88;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lm;
import defpackage.ms6;
import defpackage.n15;
import defpackage.o79;
import defpackage.ot4;
import defpackage.oy5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rq4;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ts5;
import defpackage.v7;
import defpackage.x79;
import defpackage.xf5;
import defpackage.yh7;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageRecyclerListFragment extends Hilt_PackageRecyclerListFragment {
    public static final /* synthetic */ int o1 = 0;
    public xf5 i1;
    public final o79 j1;
    public final bi5 k1;
    public MenuItem l1;
    public ot4 m1;
    public MenuItem n1;

    public PackageRecyclerListFragment() {
        final PackageRecyclerListFragment$special$$inlined$viewModels$default$1 packageRecyclerListFragment$special$$inlined$viewModels$default$1 = new PackageRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.packages.ui.PackageRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) packageRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(PackageViewModel.class), new bp2() { // from class: ir.mservices.market.app.packages.ui.PackageRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.packages.ui.PackageRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.packages.ui.PackageRecyclerListFragment$special$$inlined$viewModels$default$4
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
        this.k1 = new bi5(g27.a(oy5.class), new n15(12, this));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_package_list);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        String str = ((oy5) this.k1.getValue()).b;
        if (f88.n0(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        ((TextView) view.findViewById(rr6.empty_message)).setText(rs6.no_item_in_application_list);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String str = ((oy5) this.k1.getValue()).a;
        if (str == null) {
            return "";
        }
        if (f88.n0(str)) {
            str = null;
        }
        return str == null ? "" : str;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemFindItem;
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.list_share, menu);
        MenuItem menuItemFindItem2 = menu.findItem(rr6.action_search);
        Drawable icon = menuItemFindItem2.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        xf5 xf5Var = this.i1;
        MenuItem menuItem = null;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        xf5.j(xf5Var, this, menuItemFindItem2);
        MenuItem menuItemFindItem3 = menu.findItem(rr6.action_more);
        this.l1 = menuItemFindItem3;
        ot4 ot4VarS0 = S0(ms6.list_share_more, menuItemFindItem3);
        this.m1 = ot4VarS0;
        if (ot4VarS0 != null && (menuItemFindItem = ot4VarS0.findItem(rr6.action_share)) != null) {
            CharSequence charSequence = (CharSequence) ((PackageViewModel) this.j1.getValue()).y.a.getValue();
            rq4.O(menuItemFindItem, !(charSequence == null || f88.n0(charSequence)), this.m1, this.l1);
            menuItem = menuItemFindItem;
        }
        this.n1 = menuItem;
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == rr6.action_share) {
            ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
            actionBarEventBuilder.b("action_bar_list_by_package_share");
            actionBarEventBuilder.a();
            Context contextH = H();
            String str = (String) ((PackageViewModel) this.j1.getValue()).y.a.getValue();
            au7.a(contextH, str != null ? str : "", new v7(27));
            return false;
        }
        if (itemId == rr6.action_search) {
            ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
            actionBarEventBuilder2.b("list_search");
            actionBarEventBuilder2.a();
            ActionBarEventBuilder actionBarEventBuilder3 = new ActionBarEventBuilder();
            actionBarEventBuilder3.b("app_list_search_package");
            actionBarEventBuilder3.a();
            pk5.g(this.J0, new NavIntentDirections.Search(new yh7("", "List")), -1);
        }
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        int i = 2;
        lm lmVar = new lm(v1(), i);
        lmVar.n = new ts5(i, this);
        lmVar.m = new bn6(F());
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PackageRecyclerListFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (PackageViewModel) this.j1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_4), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_4), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.package_max_span);
    }
}
