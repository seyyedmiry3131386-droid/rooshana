package ir.mservices.market.movie.ui.detail.review.all;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.a65;
import defpackage.a79;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.c55;
import defpackage.cc7;
import defpackage.d16;
import defpackage.d25;
import defpackage.d75;
import defpackage.ds6;
import defpackage.dw1;
import defpackage.f57;
import defpackage.f88;
import defpackage.fa1;
import defpackage.fw0;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.n15;
import defpackage.n45;
import defpackage.na7;
import defpackage.o79;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rn8;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.uv1;
import defpackage.v55;
import defpackage.x79;
import defpackage.yq2;
import defpackage.z45;
import defpackage.z55;
import defpackage.zk8;
import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewAction;
import ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewsRecyclerListFragment extends Hilt_MovieReviewsRecyclerListFragment {
    public static final /* synthetic */ int s1 = 0;
    public fw0 i1;
    public lw8 j1;
    public n45 k1;
    public final bi5 l1 = new bi5(g27.a(a65.class), new n15(3, this));
    public d25 m1;
    public final o79 n1;
    public d75 o1;
    public ir.mservices.market.movie.ui.detail.review.a p1;
    public boolean q1;
    public final ut4 r1;

    public MovieReviewsRecyclerListFragment() {
        final MovieReviewsRecyclerListFragment$special$$inlined$viewModels$default$1 movieReviewsRecyclerListFragment$special$$inlined$viewModels$default$1 = new MovieReviewsRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) movieReviewsRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.n1 = new o79(g27.a(MovieReviewsViewModel.class), new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment$special$$inlined$viewModels$default$4
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
        this.r1 = new ut4(2, this);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        n45 n45Var;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (!str.equalsIgnoreCase(Q1()) || (n45Var = this.k1) == null) {
            return;
        }
        n45Var.a(bundle, "MovieReviewsRecyclerListFragment_" + this.H0);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_movie_reviews);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    public final String Q1() {
        return t61.i(dw1.n("MovieReviewsRecyclerListFragment_", this.H0), "_DIALOG_KEY_LINE_MENU_MOVIE");
    }

    public final MovieReviewsViewModel R1() {
        return (MovieReviewsViewModel) this.n1.getValue();
    }

    public final void S1(boolean z, Boolean bool, String str) {
        if (Boolean.valueOf(z).equals(bool)) {
            return;
        }
        pk5.d(F(), new SubmitMovieReviewData(((a65) this.l1.getValue()).a, z, str, v55.c, this));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        rn8 rn8Var = (rn8) F();
        if (rn8Var != null) {
            d25 d25Var = this.m1;
            if (d25Var == null) {
                js3.V("toolbarBinding");
                throw null;
            }
            rn8Var.z(d25Var.l);
        }
        rn8 rn8Var2 = (rn8) F();
        if (rn8Var2 != null) {
            ((BaseContentActivity) rn8Var2).a0(sj8.b().N);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        int i = d75.O;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        d75 d75Var = (d75) fa1.c(layoutInflater, js6.movie_submit_review_item, viewGroup, false);
        cc7.c(K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_8), 10, d75Var.l);
        this.o1 = d75Var;
        js3.n(viewZ, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        d75 d75Var2 = this.o1;
        js3.m(d75Var2);
        View view = d75Var2.l;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.l = 0;
        ((ConstraintLayout) viewZ).addView(view, layoutParams);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i2 = d25.C;
        d25 d25Var = (d25) a79.f0(layoutInflaterFrom, js6.movie_detail_toolbar_view, null, false, null);
        js3.o(d25Var, "inflate(...)");
        this.m1 = d25Var;
        d25Var.z.setVisibility(8);
        d25 d25Var2 = this.m1;
        if (d25Var2 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var2.x.setVisibility(8);
        d25 d25Var3 = this.m1;
        if (d25Var3 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var3.w.setVisibility(8);
        d25 d25Var4 = this.m1;
        if (d25Var4 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var4.v.setVisibility(4);
        bi5 bi5Var = this.l1;
        String str = ((a65) bi5Var.getValue()).c.b;
        if (f88.n0(str)) {
            str = null;
        }
        if (str != null) {
            f57 f57VarW = ((f57) zk8.Q(this, str).G(new na7(K().getDimensionPixelSize(pq6.space_4)))).W(uv1.b());
            d25 d25Var5 = this.m1;
            if (d25Var5 == null) {
                js3.V("toolbarBinding");
                throw null;
            }
            f57VarW.P(d25Var5.y);
        }
        d25 d25Var6 = this.m1;
        if (d25Var6 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var6.B.setText(((a65) bi5Var.getValue()).c.a);
        d25 d25Var7 = this.m1;
        if (d25Var7 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        d25Var7.A.setVisibility(0);
        d25 d25Var8 = this.m1;
        if (d25Var8 != null) {
            d25Var8.A.setText(K().getString(rs6.movie_reviews_and_ratings));
            return viewZ;
        }
        js3.V("toolbarBinding");
        throw null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        this.J0.x(Q1());
        this.k1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void f0() {
        if (this.j1 == null) {
            js3.V("uiUtils");
            throw null;
        }
        lw8.b(F());
        super.f0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        c55 c55Var = new c55(v1());
        c55Var.l = new z55(this, 11);
        c55Var.m = new z55(this, 12);
        c55Var.n = new z55(this, 13);
        c55Var.o = new z55(this, 0);
        c55Var.p = new z55(this, 1);
        c55Var.q = new z55(this, 2);
        c55Var.r = new z55(this, 3);
        c55Var.s = new z55(this, 4);
        c55Var.t = new z55(this, 5);
        return c55Var;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [ir.mservices.market.movie.ui.detail.review.all.a] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
        int i = 1;
        if (aVar != null) {
            aVar.y(new z45(i, this));
        }
        d75 d75Var = this.o1;
        js3.m(d75Var);
        View view2 = d75Var.l;
        js3.o(view2, "getRoot(...)");
        int i2 = 8;
        view2.setVisibility(!((Boolean) R1().E.a.getValue()).booleanValue() ? 0 : 8);
        d75 d75Var2 = this.o1;
        js3.m(d75Var2);
        View view3 = d75Var2.l;
        js3.o(view3, "getRoot(...)");
        ir.mservices.market.movie.ui.detail.review.a aVar2 = new ir.mservices.market.movie.ui.detail.review.a(view3, new z55(this, 6), new z55(this, 7), new z55(this, i2), new z55(this, 9), new z55(this, 10));
        d75 d75Var3 = this.o1;
        js3.m(d75Var3);
        aVar2.w(d75Var3);
        this.p1 = aVar2;
        this.J0.d(Q1(), this);
        MovieReviewsViewModel movieReviewsViewModelR1 = R1();
        boolean zO0 = yq2.o0(H());
        int iV1 = v1();
        String strL = L(rs6.minutes_ago);
        js3.o(strL, "getString(...)");
        movieReviewsViewModelR1.r(new MovieReviewAction.InitAction(zO0, iV1, strL));
        MovieUserSubmitReviewData movieUserSubmitReviewData = new MovieUserSubmitReviewData(R1().S, R1().K, null, false, false, new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.all.a
            @Override // defpackage.bp2
            public final Object invoke() {
                int i3 = MovieReviewsRecyclerListFragment.s1;
                MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment = this.a;
                ir.mservices.market.version2.core.utils.a.c(movieReviewsRecyclerListFragment, 100L, new MovieReviewsRecyclerListFragment$onViewCreated$userReviewData$1$1(movieReviewsRecyclerListFragment, null));
                return tx8.a;
            }
        }, 28);
        ir.mservices.market.movie.ui.detail.review.a aVar3 = this.p1;
        if (aVar3 != null) {
            aVar3.s(movieUserSubmitReviewData);
        }
        ir.mservices.market.movie.ui.detail.review.a aVar4 = this.p1;
        if (aVar4 != null) {
            aVar4.t(movieUserSubmitReviewData);
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieReviewsRecyclerListFragment$onViewCreated$8(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieReviewsRecyclerListFragment$onViewCreated$9(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new MovieReviewsRecyclerListFragment$onViewCreated$10(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return R1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        View view;
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        d75 d75Var = this.o1;
        int height = 0;
        if (d75Var != null && (view = d75Var.l) != null && view.getVisibility() == 0 && this.q1) {
            height = view.getHeight();
        }
        return new d16(0, height, dimensionPixelSize, dimensionPixelSize, 0, K().getDimensionPixelSize(pq6.space_4), v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        return new PaddingLayoutManager$Padding(0, K().getDimensionPixelSize(pq6.space_16), 0, K().getDimensionPixelSize(pq6.space_16));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.movie_review_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int w1() {
        return sj8.b().j;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int x1() {
        return sj8.b().k;
    }
}
