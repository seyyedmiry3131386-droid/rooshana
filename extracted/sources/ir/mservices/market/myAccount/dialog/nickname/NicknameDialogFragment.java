package ir.mservices.market.myAccount.dialog.nickname;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.c5;
import defpackage.d5;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.l87;
import defpackage.lw8;
import defpackage.mb0;
import defpackage.n15;
import defpackage.o79;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tn5;
import defpackage.ut4;
import defpackage.x79;
import defpackage.yq6;
import defpackage.z4;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class NicknameDialogFragment extends Hilt_NicknameDialogFragment {
    public c5 h1;
    public final bi5 i1 = new bi5(g27.a(tn5.class), new n15(9, this));
    public d5 j1;
    public final o79 k1;

    public NicknameDialogFragment() {
        final NicknameDialogFragment$special$$inlined$viewModels$default$1 nicknameDialogFragment$special$$inlined$viewModels$default$1 = new NicknameDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) nicknameDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(NicknameDialogViewModel.class), new bp2() { // from class: ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment$special$$inlined$viewModels$default$4
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
        return ((tn5) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "NicknameDialogFragment";
    }

    public final void V0(MyketProgressState myketProgressState) {
        d5 d5Var = this.j1;
        js3.m(d5Var);
        d5Var.w.setStateCommit(myketProgressState);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = d5.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        d5 d5Var = (d5) fa1.c(layoutInflater, js6.account_nick_name, viewGroup, false);
        this.j1 = d5Var;
        js3.m(d5Var);
        View view = d5Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.j1 = null;
        super.b0();
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
        d5 d5Var = this.j1;
        js3.m(d5Var);
        MyketEditText myketEditText = d5Var.A;
        myketEditText.setHintTextColor(sj8.b().n);
        myketEditText.setTextColor(sj8.b().n);
        myketEditText.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().w, PorterDuff.Mode.MULTIPLY));
        myketEditText.setEditTextDrawable(l87.d(myketEditText.getResources(), yq6.ic_person));
        myketEditText.addTextChangedListener(new mb0(6, this));
        c5 c5Var = this.h1;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        z4 z4Var = c5Var.h;
        myketEditText.setText(z4Var != null ? (String) z4Var.c : null);
        myketEditText.requestFocus();
        d5 d5Var2 = this.j1;
        js3.m(d5Var2);
        d5Var2.y.setTextColor(sj8.b().A);
        d5 d5Var3 = this.j1;
        js3.m(d5Var3);
        MyketTextView myketTextView = d5Var3.v;
        myketTextView.setTextColor(sj8.b().n);
        bi5 bi5Var = this.i1;
        String str = ((tn5) bi5Var.getValue()).b;
        if (str != null && !f88.n0(str)) {
            myketTextView.setText(((tn5) bi5Var.getValue()).b);
        }
        d5 d5Var4 = this.j1;
        js3.m(d5Var4);
        DialogHeaderComponent dialogHeaderComponent = d5Var4.B;
        dialogHeaderComponent.setTitle(L(rs6.name));
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
        d5 d5Var5 = this.j1;
        js3.m(d5Var5);
        DialogButtonComponent dialogButtonComponent = d5Var5.w;
        dialogButtonComponent.setTitles(L(rs6.button_submit), null);
        dialogButtonComponent.setOnClickListener(new ut4(3, this));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new NicknameDialogFragment$onViewCreated$6(this, null));
    }
}
