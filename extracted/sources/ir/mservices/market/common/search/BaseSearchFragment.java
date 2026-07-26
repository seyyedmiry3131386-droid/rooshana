package ir.mservices.market.common.search;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import defpackage.ba7;
import defpackage.bp2;
import defpackage.bt5;
import defpackage.c24;
import defpackage.g27;
import defpackage.ij5;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lk2;
import defpackage.lw;
import defpackage.lw8;
import defpackage.n04;
import defpackage.o04;
import defpackage.o79;
import defpackage.p40;
import defpackage.q79;
import defpackage.rn6;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.s40;
import defpackage.s7;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.t40;
import defpackage.uh7;
import defpackage.v4;
import defpackage.wi5;
import defpackage.x79;
import defpackage.xb5;
import defpackage.yq2;
import defpackage.zk8;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.home.GameHomeFragment;
import ir.mservices.market.common.search.SearchAction;
import ir.mservices.market.common.search.SearchState;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.views.MyketRecentDownloadView;
import ir.mservices.market.views.SearchView;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSearchFragment extends Hilt_BaseSearchFragment {
    public static final int q1 = View.generateViewId();
    public lw8 i1;
    public rn6 j1;
    public final boolean k1 = true;
    public SearchView l1;
    public lk2 m1;
    public final o79 n1;
    public final b o1;
    public final a p1;

    public BaseSearchFragment() {
        final BaseSearchFragment$special$$inlined$viewModels$default$1 baseSearchFragment$special$$inlined$viewModels$default$1 = new BaseSearchFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.common.search.BaseSearchFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) baseSearchFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.n1 = new o79(g27.a(BaseSearchViewModel.class), new bp2() { // from class: ir.mservices.market.common.search.BaseSearchFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.common.search.BaseSearchFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.common.search.BaseSearchFragment$special$$inlined$viewModels$default$4
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
        this.o1 = new b(this);
        this.p1 = new a(this);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean E0() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int O0() {
        return 4;
    }

    public final boolean Q1() {
        sb7.p("SearchView", "Tab click, search cleared", null);
        S1().r(new SearchAction.OpenSearchBoxAction(false), new SearchAction.UpdateSearchStateAction(new SearchState.Normal(0)));
        SearchFragment searchFragmentV1 = V1(true);
        if (searchFragmentV1 != null) {
            searchFragmentV1.r(null);
        }
        SearchView searchView = this.l1;
        if (searchView != null) {
            return searchView.i(false, false);
        }
        return false;
    }

    public abstract SearchFragment R1();

    public final BaseSearchViewModel S1() {
        return (BaseSearchViewModel) this.n1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            rn8Var.z(this.l1);
        }
    }

    public boolean T1() {
        return this.k1;
    }

    public abstract String U1();

    public final SearchFragment V1(boolean z) {
        SearchFragment searchFragmentR1;
        uh7 binding;
        MyketRecentDownloadView myketRecentDownloadView;
        uh7 binding2;
        FrameLayout frameLayout;
        try {
            g gVarG = G();
            int i = q1;
            d dVarF = gVarG.F(i);
            if (dVarF instanceof SearchFragment) {
                return (SearchFragment) dVarF;
            }
            if (z) {
                boolean z2 = false;
                if ((this.a >= 7) && (searchFragmentR1 = R1()) != null) {
                    g gVarG2 = G();
                    gVarG2.getClass();
                    p40 p40Var = new p40(gVarG2);
                    p40Var.k(i, searchFragmentR1, null);
                    p40Var.g();
                    searchFragmentR1.S0 = this.o1;
                    SearchView searchView = this.l1;
                    boolean z3 = (searchView == null || (binding2 = searchView.getBinding()) == null || (frameLayout = binding2.A) == null || frameLayout.getVisibility() != 0) ? false : true;
                    SearchView searchView2 = this.l1;
                    if (searchView2 != null && (binding = searchView2.getBinding()) != null && (myketRecentDownloadView = binding.F) != null && myketRecentDownloadView.getVisibility() == 0) {
                        z2 = true;
                    }
                    searchFragmentR1.H0(z3, z2);
                    return searchFragmentR1;
                }
            }
            return null;
        } catch (Exception e) {
            zk8.X(e, true);
            return null;
        }
    }

    public abstract boolean W1(int i);

    public abstract boolean X1();

    public yq2 Y1() {
        return t40.g;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        this.m1 = (lk2) n0(new v4(8, this), new s7(2));
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        js3.n(viewZ, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewZ;
        FrameLayout frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setId(q1);
        constraintLayout.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return viewZ;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public boolean Z0() {
        return !(this instanceof GameHomeFragment);
    }

    public abstract void Z1();

    public abstract void a2();

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public void b0() throws Exception {
        SearchView searchView = this.l1;
        if (searchView != null) {
            searchView.i = null;
            ValueAnimator valueAnimator = searchView.q;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = searchView.q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        lk2 lk2Var = this.m1;
        if (lk2Var != null) {
            lk2Var.b();
        }
        this.m1 = null;
        super.b0();
    }

    public abstract void b2();

    public final void c2() {
        boolean zBooleanValue = ((Boolean) S1().B.a.getValue()).booleanValue();
        FragmentActivity fragmentActivityF = F();
        LaunchContentActivity launchContentActivity = fragmentActivityF instanceof LaunchContentActivity ? (LaunchContentActivity) fragmentActivityF : null;
        if (launchContentActivity != null) {
            launchContentActivity.l0(sj8.b().F, !zBooleanValue && (this instanceof ba7));
        }
        SearchView searchView = this.l1;
        if (searchView != null) {
            searchView.i(zBooleanValue, false);
            searchView.j();
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        s40 s40Var = s40.g;
        t40 t40Var = t40.g;
        SearchFragment searchFragmentV1 = V1(true);
        if (searchFragmentV1 == null) {
            return t40Var;
        }
        SearchView searchView = this.l1;
        Boolean bool = null;
        if (searchView == null) {
            lw.g(null, "searchView is null", "isOpen: " + S1().B.a.getValue());
            return t40Var;
        }
        boolean animationEnabled = searchView.getAnimationEnabled();
        if (searchFragmentV1.P0 == null) {
            bool = Boolean.FALSE;
        } else {
            ij5 ij5Var = searchFragmentV1.Y0;
            if (ij5Var == null) {
                js3.V("navController");
                throw null;
            }
            wi5 wi5VarF = ij5Var.b.f();
            if (wi5VarF == null || wi5VarF.b.a != rr6.searchAppHistory) {
                searchFragmentV1.q();
                bool = Boolean.TRUE;
            } else if (!animationEnabled) {
                bool = Boolean.FALSE;
            }
        }
        int i = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                return Y1();
            }
            S1().r(new SearchAction.OpenSearchBoxAction(true), new SearchAction.UpdateSearchStateAction(new SearchState.Home(i)));
            return s40Var;
        }
        SearchView searchView2 = this.l1;
        boolean zI = searchView2 != null ? searchView2.i(false, true) : false;
        S1().r(new SearchAction.OpenSearchBoxAction(false), new SearchAction.UpdateSearchStateAction(new SearchState.Normal(i)));
        if (!zI) {
            return Y1();
        }
        SearchView searchView3 = this.l1;
        if (searchView3 != null) {
            searchView3.k("");
        }
        return s40Var;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void f0() {
        this.p1.a();
        super.f0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        l lVar;
        Object value;
        js3.p(view, "view");
        super.k0(view, bundle);
        if (T1()) {
            Context context = view.getContext();
            js3.o(context, "getContext(...)");
            SearchView searchView = new SearchView(context, null);
            searchView.setSearchCallback(this.p1);
            xb5 xb5Var = searchView.j;
            do {
                lVar = (l) xb5Var;
                value = lVar.getValue();
                ((Boolean) value).getClass();
            } while (!lVar.n(value, Boolean.valueOf(X1())));
            searchView.setHint(U1());
            this.l1 = searchView;
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseSearchFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseSearchFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.e, new BaseSearchFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseSearchFragment$onViewCreated$5(this, null));
    }

    @Override // androidx.fragment.app.d
    public void l0(Bundle bundle) {
        this.H = true;
        SearchFragment searchFragmentV1 = V1(((Boolean) S1().B.a.getValue()).booleanValue());
        if (searchFragmentV1 != null) {
            searchFragmentV1.S0 = this.o1;
        }
        c2();
    }

    public final void onEvent(o04 o04Var) {
        js3.p(o04Var, "event");
        if (!W1(o04Var.a) || Q1()) {
            return;
        }
        J1(0, 100L);
    }

    public void onEvent(n04 n04Var) {
        js3.p(n04Var, "event");
        if (W1(n04Var.a)) {
            Q1();
        }
    }
}
