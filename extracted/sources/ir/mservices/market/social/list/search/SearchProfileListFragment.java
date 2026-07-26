package ir.mservices.market.social.list.search;

import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cj7;
import defpackage.d16;
import defpackage.ds6;
import defpackage.f88;
import defpackage.g27;
import defpackage.gp;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lm;
import defpackage.lw8;
import defpackage.o79;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.x79;
import ir.mservices.market.social.list.common.app.recycler.ProfileAppData;
import ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData;
import ir.mservices.market.social.list.items.SelectedItemsAction;
import ir.mservices.market.social.list.items.SelectedItemsViewModel;
import ir.mservices.market.social.list.search.SearchProfileListAction;
import ir.mservices.market.social.list.search.SearchProfileListFragment;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.MyketTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchProfileListFragment extends Hilt_SearchProfileListFragment {
    public static final /* synthetic */ int b1 = 0;
    public lw8 Y0;
    public final o79 Z0;
    public final o79 a1;

    public SearchProfileListFragment() {
        final cj7 cj7Var = new cj7(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.social.list.search.SearchProfileListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) cj7Var.invoke();
            }
        });
        this.Z0 = new o79(g27.a(SearchProfileListViewModel.class), new bp2() { // from class: ir.mservices.market.social.list.search.SearchProfileListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.list.search.SearchProfileListFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.social.list.search.SearchProfileListFragment$special$$inlined$viewModels$default$3
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
        final cj7 cj7Var2 = new cj7(this, 1);
        final c24 c24VarB2 = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.social.list.search.SearchProfileListFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) cj7Var2.invoke();
            }
        });
        this.a1 = new o79(g27.a(SelectedItemsViewModel.class), new bp2() { // from class: ir.mservices.market.social.list.search.SearchProfileListFragment$special$$inlined$viewModels$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.list.search.SearchProfileListFragment$special$$inlined$viewModels$default$8
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
        }, new bp2() { // from class: ir.mservices.market.social.list.search.SearchProfileListFragment$special$$inlined$viewModels$default$7
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        lm lmVar = new lm(1, 8);
        final int i = 0;
        lmVar.m = new og5(this) { // from class: dj7
            public final /* synthetic */ SearchProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                SearchProfileListFragment searchProfileListFragment = this.b;
                switch (i2) {
                    case 0:
                        ProfileAppData profileAppData = (ProfileAppData) obj;
                        int i3 = SearchProfileListFragment.b1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData, "recyclerData");
                        ((SelectedItemsViewModel) searchProfileListFragment.a1.getValue()).r(new SelectedItemsAction.SelectItemAction(profileAppData));
                        break;
                    default:
                        ProfileMovieData profileMovieData = (ProfileMovieData) obj;
                        int i4 = SearchProfileListFragment.b1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData, "recyclerData");
                        ((SelectedItemsViewModel) searchProfileListFragment.a1.getValue()).r(new SelectedItemsAction.SelectItemAction(profileMovieData));
                        break;
                }
            }
        };
        final int i2 = 1;
        lmVar.n = new og5(this) { // from class: dj7
            public final /* synthetic */ SearchProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                SearchProfileListFragment searchProfileListFragment = this.b;
                switch (i22) {
                    case 0:
                        ProfileAppData profileAppData = (ProfileAppData) obj;
                        int i3 = SearchProfileListFragment.b1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData, "recyclerData");
                        ((SelectedItemsViewModel) searchProfileListFragment.a1.getValue()).r(new SelectedItemsAction.SelectItemAction(profileAppData));
                        break;
                    default:
                        ProfileMovieData profileMovieData = (ProfileMovieData) obj;
                        int i4 = SearchProfileListFragment.b1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData, "recyclerData");
                        ((SelectedItemsViewModel) searchProfileListFragment.a1.getValue()).r(new SelectedItemsAction.SelectItemAction(profileMovieData));
                        break;
                }
            }
        };
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return (SearchProfileListViewModel) this.Z0.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final d16 H0() {
        return new d16(0, 0, 0, K().getDimensionPixelSize(pq6.space_4), I0(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return K().getInteger(ds6.social_search_custom_List_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final void Q0(View view) {
        js3.p(view, "emptyView");
        if (f88.n0((CharSequence) ((SearchProfileListViewModel) this.Z0.getValue()).z.a.getValue())) {
            view.setVisibility(8);
            return;
        }
        super.Q0(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_result);
        MyketTextView myketTextView = (MyketTextView) view.findViewById(rr6.empty_title);
        myketTextView.setVisibility(0);
        myketTextView.setText(rs6.not_found_title);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final boolean S0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        SearchProfileListViewModel searchProfileListViewModel = (SearchProfileListViewModel) this.Z0.getValue();
        Bundle bundle2 = this.g;
        searchProfileListViewModel.r(new SearchProfileListAction.Init(bundle2 != null ? bundle2.getBoolean("BUNDLE_KEY_IS_APP") : true));
        J0().j(new gp(17, this));
    }
}
