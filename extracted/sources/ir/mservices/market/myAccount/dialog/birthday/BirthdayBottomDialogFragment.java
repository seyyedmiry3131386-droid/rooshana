package ir.mservices.market.myAccount.dialog.birthday;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.de;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.o79;
import defpackage.q79;
import defpackage.rs6;
import defpackage.x79;
import defpackage.xb0;
import defpackage.zb0;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketProgressState;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class BirthdayBottomDialogFragment extends Hilt_BirthdayBottomDialogFragment {
    public zb0 h1;
    public final bi5 i1 = new bi5(g27.a(xb0.class), new de(10, this));
    public final o79 j1;

    public BirthdayBottomDialogFragment() {
        final BirthdayBottomDialogFragment$special$$inlined$viewModels$default$1 birthdayBottomDialogFragment$special$$inlined$viewModels$default$1 = new BirthdayBottomDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myAccount.dialog.birthday.BirthdayBottomDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) birthdayBottomDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(BirthdayDialogViewModel.class), new bp2() { // from class: ir.mservices.market.myAccount.dialog.birthday.BirthdayBottomDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myAccount.dialog.birthday.BirthdayBottomDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myAccount.dialog.birthday.BirthdayBottomDialogFragment$special$$inlined$viewModels$default$4
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
        return ((xb0) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "BirthdayBottomDialogFragment";
    }

    public final void V0(MyketProgressState myketProgressState) {
        zb0 zb0Var = this.h1;
        js3.m(zb0Var);
        zb0Var.w.setStateCommit(myketProgressState);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.Z0 = true;
        this.a1 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = zb0.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        zb0 zb0Var = (zb0) fa1.c(layoutInflater, js6.birthday_dialog, viewGroup, false);
        this.h1 = zb0Var;
        js3.m(zb0Var);
        DialogHeaderComponent dialogHeaderComponent = zb0Var.z;
        dialogHeaderComponent.setTitle(L(rs6.birthday));
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
        zb0 zb0Var2 = this.h1;
        js3.m(zb0Var2);
        zb0Var2.w.setTitles(L(rs6.choose_txt), null);
        zb0 zb0Var3 = this.h1;
        js3.m(zb0Var3);
        View view = zb0Var3.l;
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
        zb0 zb0Var = this.h1;
        js3.m(zb0Var);
        zb0Var.v.setDate(((xb0) this.i1.getValue()).b);
        zb0 zb0Var2 = this.h1;
        js3.m(zb0Var2);
        zb0Var2.w.setOnClickListener(new a(this));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new BirthdayBottomDialogFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new BirthdayBottomDialogFragment$onViewCreated$3(this, null));
    }
}
