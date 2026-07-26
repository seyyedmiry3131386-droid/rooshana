package ir.mservices.market.feedback;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.fa2;
import defpackage.g27;
import defpackage.gp;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.v4;
import defpackage.x2;
import defpackage.x79;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackTransactionFragment extends Hilt_FeedbackTransactionFragment {
    public static final /* synthetic */ int Z0 = 0;
    public final o79 Y0;

    public FeedbackTransactionFragment() {
        final x2 x2Var = new x2(22, this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.feedback.FeedbackTransactionFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) x2Var.invoke();
            }
        });
        this.Y0 = new o79(g27.a(FeedbackTransactionViewModel.class), new bp2() { // from class: ir.mservices.market.feedback.FeedbackTransactionFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.feedback.FeedbackTransactionFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.feedback.FeedbackTransactionFragment$special$$inlined$viewModels$default$3
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
        fa2 fa2Var = new fa2(1, 0);
        fa2Var.m = new v4(25, this);
        return fa2Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return (FeedbackTransactionViewModel) this.Y0.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final d16 H0() {
        return new d16(K().getDimensionPixelSize(pq6.space_16), K().getDimensionPixelSize(pq6.actionbar_size) + K().getDimensionPixelSize(pq6.space_16), K().getDimensionPixelSize(pq6.horizontal_space_outer) + K().getDimensionPixelSize(pq6.horizontal_space_inner), K().getDimensionPixelSize(pq6.horizontal_space_outer) + K().getDimensionPixelSize(pq6.horizontal_space_inner), K().getDimensionPixelSize(pq6.space_8), K().getDimensionPixelSize(pq6.space_12) / 2, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return 1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        String strL = L(rs6.page_name_feedback_transaction);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final void Q0(View view) {
        js3.p(view, "emptyView");
        super.Q0(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_downloads);
        TextView textView = (TextView) view.findViewById(rr6.empty_title);
        textView.setVisibility(0);
        textView.setText(rs6.any_transaction_txt);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        J0().setNestedScrollingEnabled(false);
        J0().j(new gp(5, this));
    }
}
