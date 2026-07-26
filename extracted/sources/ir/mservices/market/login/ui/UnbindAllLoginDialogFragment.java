package ir.mservices.market.login.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.c5;
import defpackage.fa1;
import defpackage.g27;
import defpackage.hl5;
import defpackage.js3;
import defpackage.js6;
import defpackage.kx8;
import defpackage.lu7;
import defpackage.rs6;
import defpackage.tn2;
import defpackage.yw6;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class UnbindAllLoginDialogFragment extends Hilt_UnbindAllLoginDialogFragment {
    public c5 m1;
    public lu7 n1;
    public tn2 o1;
    public final bi5 p1 = new bi5(g27.a(kx8.class), new yw6(24, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((kx8) this.p1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "UnbindAllLoginDialogFragment";
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final View V0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        js3.p(layoutInflater, "inflater");
        int i = tn2.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        tn2 tn2Var = (tn2) fa1.c(layoutInflater, js6.fragment_unbind_all_bind_state, viewGroup, false);
        this.o1 = tn2Var;
        js3.m(tn2Var);
        DialogButtonComponent dialogButtonComponent = tn2Var.v;
        dialogButtonComponent.setTitles(L(rs6.exit), L(rs6.button_cancel));
        dialogButtonComponent.setOnClickListener(new hl5(15, this));
        T0();
        b1(false);
        tn2 tn2Var2 = this.o1;
        js3.m(tn2Var2);
        View view = tn2Var2.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final LoginData W0() {
        return ((kx8) this.p1.getValue()).b;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final String X0() {
        return ((kx8) this.p1.getValue()).b.b;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        c5 c5Var = this.m1;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        c5Var.e.a("REQUEST_TAG_UNBIND_ALL");
        this.o1 = null;
        super.b0();
    }
}
