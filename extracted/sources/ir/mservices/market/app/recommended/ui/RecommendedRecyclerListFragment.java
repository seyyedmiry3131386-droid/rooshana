package ir.mservices.market.app.recommended.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.h;
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
import defpackage.jy6;
import defpackage.lm;
import defpackage.ms6;
import defpackage.o79;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rm7;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ts5;
import defpackage.x79;
import defpackage.xf5;
import defpackage.yh7;
import defpackage.yw6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendedRecyclerListFragment extends Hilt_RecommendedRecyclerListFragment {
    public static final /* synthetic */ int l1 = 0;
    public xf5 i1;
    public final bi5 j1 = new bi5(g27.a(jy6.class), new yw6(1, this));
    public final o79 k1;

    public RecommendedRecyclerListFragment() {
        final RecommendedRecyclerListFragment$special$$inlined$viewModels$default$1 recommendedRecyclerListFragment$special$$inlined$viewModels$default$1 = new RecommendedRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.recommended.ui.RecommendedRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) recommendedRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(RecommendedViewModel.class), new bp2() { // from class: ir.mservices.market.app.recommended.ui.RecommendedRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.recommended.ui.RecommendedRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.recommended.ui.RecommendedRecyclerListFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_recommended);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        bi5 bi5Var = this.j1;
        String str = ((jy6) bi5Var.getValue()).b;
        String str2 = ((jy6) bi5Var.getValue()).d;
        String str3 = ((jy6) bi5Var.getValue()).a;
        StringBuilder sbT = rm7.t("Recommended for packageName: ", str, ", and type: ", str2, ", accountId: ");
        sbT.append(str3);
        return sbT.toString();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        ((TextView) view.findViewById(rr6.empty_message)).setText(rs6.no_item_in_application_list);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String str = ((jy6) this.j1.getValue()).c;
        if (f88.n0(str)) {
            str = null;
        }
        return str == null ? "" : str;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.list_search, menu);
        MenuItem menuItemFindItem = menu.findItem(rr6.action_search);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        xf5 xf5Var = this.i1;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        xf5.j(xf5Var, this, menuItemFindItem);
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() != rr6.action_search) {
            return false;
        }
        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
        actionBarEventBuilder.b("list_search");
        actionBarEventBuilder.a();
        ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
        actionBarEventBuilder2.b("app_list_search_recommend");
        actionBarEventBuilder2.a();
        pk5.g(this.J0, new NavIntentDirections.Search(new yh7("", "List")), -1);
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        lm lmVar = new lm(v1(), 2);
        lmVar.n = new ts5(11, this);
        lmVar.m = new bn6(F());
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (RecommendedViewModel) this.k1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_4), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_4), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.recommended_max_span);
    }
}
