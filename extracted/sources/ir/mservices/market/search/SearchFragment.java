package ir.mservices.market.search;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$State;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.am2;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.c24;
import defpackage.ei7;
import defpackage.f65;
import defpackage.fa1;
import defpackage.fj5;
import defpackage.g27;
import defpackage.g6;
import defpackage.g64;
import defpackage.ij5;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.mm2;
import defpackage.nm2;
import defpackage.ns6;
import defpackage.o79;
import defpackage.p3;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rn6;
import defpackage.rr6;
import defpackage.x79;
import defpackage.xt3;
import defpackage.yi5;
import defpackage.zk8;
import ir.mservices.market.common.search.b;
import ir.mservices.market.search.history.ui.SearchAction;
import ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment;
import ir.mservices.market.search.history.ui.SearchViewModel;
import ir.mservices.market.version2.fragments.a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchFragment extends Hilt_SearchFragment implements am2 {
    public static final /* synthetic */ int b1 = 0;
    public rn6 N0;
    public f65 O0;
    public nm2 P0;
    public a Q0;
    public b S0;
    public int T0;
    public ValueAnimator U0;
    public ValueAnimator V0;
    public ValueAnimator W0;
    public ViewPropertyAnimator X0;
    public ij5 Y0;
    public final o79 a1;
    public final g6 R0 = new g6(this);
    public boolean Z0 = true;

    public SearchFragment() {
        final SearchFragment$special$$inlined$viewModels$default$1 searchFragment$special$$inlined$viewModels$default$1 = new SearchFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.search.SearchFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) searchFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.a1 = new o79(g27.a(SearchViewModel.class), new bp2() { // from class: ir.mservices.market.search.SearchFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.search.SearchFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.search.SearchFragment$special$$inlined$viewModels$default$4
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

    @Override // defpackage.am2
    public final void E() {
    }

    public final void E0() {
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.W0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.V0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            valueAnimator3.removeAllUpdateListeners();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.X0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.V0 = null;
        this.W0 = null;
        this.U0 = null;
        this.X0 = null;
    }

    public final void F0() {
        a aVar = this.Q0;
        g64 g64VarB = aVar != null ? aVar.b() : null;
        ei7 ei7Var = g64VarB instanceof ei7 ? (ei7) g64VarB : null;
        if (ei7Var != null) {
            if (this.Z0) {
                ((SearchHistoryRecyclerListFragment) ei7Var).X0("");
            }
            SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = (SearchHistoryRecyclerListFragment) ei7Var;
            searchHistoryRecyclerListFragment.J0().getRecycledViewPool().a();
            SearchViewModel searchViewModelU0 = searchHistoryRecyclerListFragment.U0();
            String str = searchViewModelU0.F;
            if (str == null || str.length() == 0) {
                l lVar = searchViewModelU0.d;
                bz6 bz6Var = new bz6();
                lVar.getClass();
                lVar.p(null, bz6Var);
                searchViewModelU0.k = false;
            }
            xt3 xt3Var = searchViewModelU0.H;
            if (xt3Var != null) {
                xt3Var.g(null);
            }
            searchViewModelU0.H = null;
        }
        this.Z0 = true;
    }

    public final SearchViewModel G0() {
        return (SearchViewModel) this.a1.getValue();
    }

    public final void H0(boolean z, boolean z2) {
        int i;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (z) {
            dimensionPixelSize = K().getDimensionPixelSize(pq6.space_l) + K().getDimensionPixelSize(pq6.dynamic_icon_size);
            dimensionPixelSize2 = K().getDimensionPixelSize(pq6.space_s);
        } else {
            if (!z2) {
                i = 0;
                this.T0 = K().getDimensionPixelSize(pq6.space_8) + K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer) + K().getDimensionPixelSize(pq6.root_icon_size) + i;
            }
            dimensionPixelSize = K().getDimensionPixelSize(pq6.space_l) + K().getDimensionPixelSize(pq6.recent_download_layout_size);
            dimensionPixelSize2 = K().getDimensionPixelSize(pq6.space_s);
        }
        i = dimensionPixelSize2 + dimensionPixelSize;
        this.T0 = K().getDimensionPixelSize(pq6.space_8) + K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer) + K().getDimensionPixelSize(pq6.root_icon_size) + i;
    }

    public final void I0() {
        int i = 0;
        if (((Boolean) G0().K.a.getValue()).booleanValue()) {
            nm2 nm2Var = this.P0;
            js3.m(nm2Var);
            ViewGroup.LayoutParams layoutParams = nm2Var.w.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.height = p3.g(F()).b;
            nm2 nm2Var2 = this.P0;
            js3.m(nm2Var2);
            nm2Var2.w.requestLayout();
        } else {
            int dimensionPixelSize = K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding);
            nm2 nm2Var3 = this.P0;
            js3.m(nm2Var3);
            ViewGroup.LayoutParams layoutParams2 = nm2Var3.w.getLayoutParams();
            js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.rightMargin = dimensionPixelSize;
            marginLayoutParams2.leftMargin = dimensionPixelSize;
            marginLayoutParams2.height = 0;
            nm2 nm2Var4 = this.P0;
            js3.m(nm2Var4);
            nm2Var4.w.requestLayout();
            i = 8;
        }
        nm2 nm2Var5 = this.P0;
        js3.m(nm2Var5);
        nm2Var5.x.setVisibility(i);
        nm2 nm2Var6 = this.P0;
        js3.m(nm2Var6);
        nm2Var6.w.setVisibility(i);
        nm2 nm2Var7 = this.P0;
        js3.m(nm2Var7);
        nm2Var7.v.setVisibility(i);
    }

    public final void J0() {
        if (true != ((Boolean) G0().K.a.getValue()).booleanValue()) {
            G0().r(new SearchAction.OpenAction(true));
        }
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = nm2.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        this.P0 = (nm2) fa1.c(layoutInflater, js6.fragment_search, viewGroup, false);
        if (this.Y0 == null) {
            this.Q0 = new a(null);
            d dVarF = G().F(rr6.content);
            js3.n(dVarF, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            NavHostFragment navHostFragment = (NavHostFragment) dVarF;
            ij5 ij5VarZ0 = navHostFragment.z0();
            js3.p(ij5VarZ0, "<set-?>");
            this.Y0 = ij5VarZ0;
            a aVar = this.Q0;
            if (aVar != null) {
                aVar.h(navHostFragment);
            }
            ij5 ij5Var = this.Y0;
            if (ij5Var == null) {
                js3.V("navController");
                throw null;
            }
            fj5 fj5VarB = ij5Var.b().b(ns6.nav_graph_search);
            fj5VarB.g.t(rr6.searchAppHistory);
            ij5 ij5Var2 = this.Y0;
            if (ij5Var2 == null) {
                js3.V("navController");
                throw null;
            }
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = this.g;
            bundle2.putString("source", bundle3 != null ? bundle3.getString("source") : null);
            Bundle bundle4 = this.g;
            bundle2.putString("sourceType", bundle4 != null ? bundle4.getString("sourceType") : null);
            ij5Var2.b.q(fj5VarB, bundle2);
        }
        nm2 nm2Var = this.P0;
        js3.m(nm2Var);
        View view = nm2Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() {
        Handler handler;
        super.b0();
        nm2 nm2Var = this.P0;
        js3.m(nm2Var);
        nm2Var.x.clearAnimation();
        E0();
        this.P0 = null;
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        handler.removeCallbacks(this.R0);
    }

    @Override // defpackage.am2
    public final void d(String str, mm2 mm2Var) {
        js3.p(str, "requestKey");
        js3.p(mm2Var, "listener");
    }

    @Override // defpackage.am2
    public final d g() {
        a aVar = this.Q0;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    @Override // defpackage.am2
    public final void k(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "bundle");
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        I0();
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new SearchFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SearchFragment$onViewCreated$2(this, null));
    }

    @Override // defpackage.am2
    public final void p() {
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // defpackage.am2
    public final void q() {
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // defpackage.am2
    public final void r(Integer num) {
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.a(num);
        }
        F0();
    }

    @Override // defpackage.am2
    public final d s() {
        a aVar = this.Q0;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    @Override // defpackage.am2
    public final void x(String str) {
        js3.p(str, "requestKey");
    }

    @Override // defpackage.am2
    public final void y(yi5 yi5Var, Integer num) {
        js3.p(yi5Var, "navDirections");
        nm2 nm2Var = this.P0;
        js3.m(nm2Var);
        nm2Var.x.setVisibility(8);
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.g(yi5Var);
        }
    }

    @Override // defpackage.am2
    public final void clearAll() {
    }
}
