package ir.mservices.market.social.search;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.dw1;
import defpackage.f12;
import defpackage.f88;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.o79;
import defpackage.q79;
import defpackage.rs6;
import defpackage.t61;
import defpackage.x79;
import defpackage.xh7;
import defpackage.yw6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.search.BaseSearchFragment;
import ir.mservices.market.common.search.SearchAction;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.SearchView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchContentFragment extends BaseSearchFragment {
    public static final /* synthetic */ int t1 = 0;
    public final bi5 r1 = new bi5(g27.a(xh7.class), new yw6(10, this));
    public final o79 s1;

    public SearchContentFragment() {
        final SearchContentFragment$special$$inlined$viewModels$default$1 searchContentFragment$special$$inlined$viewModels$default$1 = new SearchContentFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.search.SearchContentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) searchContentFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.s1 = new o79(g27.a(MynetSearchViewModel.class), new bp2() { // from class: ir.mservices.market.social.search.SearchContentFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.search.SearchContentFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.social.search.SearchContentFragment$special$$inlined$viewModels$default$4
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
        String strL = L(rs6.page_name_user_search);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean G1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String strConcat;
        String string = baseFragmentContentActivity.getResources().getString(rs6.page_name_user_search);
        String str = ((xh7) this.r1.getValue()).a;
        if (f88.n0(str)) {
            str = null;
        }
        if (str == null || (strConcat = ": ".concat(str)) == null) {
            strConcat = "";
        }
        return t61.i(string, strConcat);
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final SearchFragment R1() {
        SearchFragment searchFragment = new SearchFragment();
        Bundle bundle = new Bundle();
        bundle.putString("source", "");
        bundle.putString("sourceType", "user");
        bundle.putBoolean("BUNDLE_KEY_OPEN_STATE", true);
        searchFragment.u0(bundle);
        return searchFragment;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final String U1() {
        String strL = L(rs6.search_user_txt);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean W1(int i) {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        S1().r(new SearchAction.OpenSearchBoxAction(true));
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean X1() {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void Z1() {
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean a1() {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void a2() {
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.p1.a();
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void b2() {
        dw1.y("search_speech_mynet_intent");
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        return new f12(1, 0);
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        SearchView searchView = this.l1;
        if (searchView != null) {
            searchView.setAnimationEnabled(false);
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.e, new SearchContentFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return new c(false);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
