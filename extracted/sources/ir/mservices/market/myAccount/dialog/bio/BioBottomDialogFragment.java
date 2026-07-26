package ir.mservices.market.myAccount.dialog.bio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.c5;
import defpackage.de;
import defpackage.fa1;
import defpackage.g27;
import defpackage.h4;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.mb0;
import defpackage.o79;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sb0;
import defpackage.sj8;
import defpackage.x79;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketEditText;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class BioBottomDialogFragment extends Hilt_BioBottomDialogFragment {
    public h4 h1;
    public final bi5 i1 = new bi5(g27.a(sb0.class), new de(9, this));
    public final o79 j1;
    public c5 k1;

    public BioBottomDialogFragment() {
        final BioBottomDialogFragment$special$$inlined$viewModels$default$1 bioBottomDialogFragment$special$$inlined$viewModels$default$1 = new BioBottomDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) bioBottomDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(BioDialogViewModel.class), new bp2() { // from class: ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment$special$$inlined$viewModels$default$4
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
        return ((sb0) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "BioBottomDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = h4.D;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        h4 h4Var = (h4) fa1.c(layoutInflaterFrom, js6.account_change_info_bottom, viewGroup, false);
        this.h1 = h4Var;
        js3.m(h4Var);
        View view = h4Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.h1 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void j0() {
        super.j0();
        P0();
        lw8.b(F());
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        h4 h4Var = this.h1;
        js3.m(h4Var);
        DialogHeaderComponent dialogHeaderComponent = h4Var.A;
        bi5 bi5Var = this.i1;
        dialogHeaderComponent.setTitle(((sb0) bi5Var.getValue()).b);
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
        h4 h4Var2 = this.h1;
        js3.m(h4Var2);
        MyketEditText myketEditText = h4Var2.x;
        myketEditText.setText(((sb0) bi5Var.getValue()).c);
        myketEditText.setHint(myketEditText.getResources().getString(rs6.enter_info, ((sb0) bi5Var.getValue()).b));
        myketEditText.setTextColor(sj8.b().n);
        myketEditText.setHintTextColor(sj8.b().n);
        myketEditText.setLayerType(1, null);
        myketEditText.requestFocus();
        myketEditText.addTextChangedListener(new mb0(1, this));
        h4 h4Var3 = this.h1;
        js3.m(h4Var3);
        h4Var3.B.setTextColor(sj8.b().A);
        h4 h4Var4 = this.h1;
        js3.m(h4Var4);
        DialogButtonComponent dialogButtonComponent = h4Var4.v;
        dialogButtonComponent.setTitles(L(rs6.button_submit), null);
        dialogButtonComponent.setOnClickListener(new a(dialogButtonComponent, this));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new BioBottomDialogFragment$onViewCreated$4(this, null));
    }
}
