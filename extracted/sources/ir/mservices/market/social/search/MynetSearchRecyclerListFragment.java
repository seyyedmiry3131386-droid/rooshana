package ir.mservices.market.social.search;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dy4;
import defpackage.g27;
import defpackage.gp;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.o79;
import defpackage.p3;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs3;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.t61;
import defpackage.x79;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class MynetSearchRecyclerListFragment extends Hilt_MynetSearchRecyclerListFragment {
    public static final /* synthetic */ int a1 = 0;
    public lw8 Y0;
    public final o79 Z0;

    public MynetSearchRecyclerListFragment() {
        final MynetSearchRecyclerListFragment$special$$inlined$viewModels$default$1 mynetSearchRecyclerListFragment$special$$inlined$viewModels$default$1 = new MynetSearchRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.search.MynetSearchRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) mynetSearchRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.Z0 = new o79(g27.a(UserSearchResultViewModel.class), new bp2() { // from class: ir.mservices.market.social.search.MynetSearchRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.search.MynetSearchRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.social.search.MynetSearchRecyclerListFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        int iE = t61.e(K(), pq6.horizontal_space_outer, 2, p3.g(F()).a);
        dy4 dy4Var = new dy4(I0(), iE, 2);
        dy4Var.n = new qs3(25, this);
        return dy4Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return (UserSearchResultViewModel) this.Z0.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final d16 H0() {
        return new d16(K().getDimensionPixelSize(pq6.space_s) + K().getDimensionPixelSize(pq6.space_8), K().getDimensionPixelSize(pq6.space_4), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_s), 0, I0(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return K().getInteger(ds6.search_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        String strL = L(rs6.page_name_user_search);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final void Q0(View view) {
        js3.p(view, "emptyView");
        super.Q0(view);
        TextView textView = (TextView) view.findViewById(rr6.empty_title);
        textView.setVisibility(0);
        textView.setText(rs6.no_item_in_user_suggestion_list);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_result);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        J0().j(new gp(11, this));
    }
}
