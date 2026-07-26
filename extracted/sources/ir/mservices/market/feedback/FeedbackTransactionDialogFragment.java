package ir.mservices.market.feedback;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cd;
import defpackage.da2;
import defpackage.de;
import defpackage.fa1;
import defpackage.g27;
import defpackage.ga2;
import defpackage.gf0;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.o79;
import defpackage.p40;
import defpackage.q79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x79;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackTransactionDialogFragment extends Hilt_FeedbackTransactionDialogFragment {
    public da2 h1;
    public final bi5 i1 = new bi5(g27.a(ga2.class), new de(18, this));
    public final o79 j1;

    public FeedbackTransactionDialogFragment() {
        final FeedbackTransactionDialogFragment$special$$inlined$viewModels$default$1 feedbackTransactionDialogFragment$special$$inlined$viewModels$default$1 = new FeedbackTransactionDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.feedback.FeedbackTransactionDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) feedbackTransactionDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(FeedbackTransactionViewModel.class), new bp2() { // from class: ir.mservices.market.feedback.FeedbackTransactionDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.feedback.FeedbackTransactionDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.feedback.FeedbackTransactionDialogFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((ga2) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "FeedbackTransactionDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final void Q0() {
        BottomSheetBehavior bottomSheetBehavior = this.d1;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.O(4);
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.d1;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.y(new gf0(2, this));
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        if (G().F(rr6.content) instanceof FeedbackTransactionFragment) {
            return;
        }
        FeedbackTransactionFragment feedbackTransactionFragment = new FeedbackTransactionFragment();
        feedbackTransactionFragment.u0(new Bundle());
        g gVarG = G();
        gVarG.getClass();
        p40 p40Var = new p40(gVarG);
        p40Var.k(rr6.content, feedbackTransactionFragment, null);
        p40Var.e();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.b1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = da2.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        da2 da2Var = (da2) fa1.c(layoutInflater, js6.feedback_transaction_content_fragment, viewGroup, false);
        this.h1 = da2Var;
        js3.m(da2Var);
        da2Var.x.setTitle(L(rs6.menu_item_transitions));
        da2 da2Var2 = this.h1;
        js3.m(da2Var2);
        ImageView imageView = da2Var2.v;
        imageView.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new cd(12, this));
        da2 da2Var3 = this.h1;
        js3.m(da2Var3);
        View view = da2Var3.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.h1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new FeedbackTransactionDialogFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new FeedbackTransactionDialogFragment$onViewCreated$2(this, null));
    }
}
