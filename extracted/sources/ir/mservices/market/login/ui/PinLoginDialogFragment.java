package ir.mservices.market.login.ui;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.am2;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.l87;
import defpackage.n15;
import defpackage.o79;
import defpackage.pk5;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.v86;
import defpackage.wd4;
import defpackage.wn2;
import defpackage.x79;
import defpackage.yq6;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.BindData;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class PinLoginDialogFragment extends Hilt_PinLoginDialogFragment {
    public final bi5 m1 = new bi5(g27.a(v86.class), new n15(21, this));
    public wn2 n1;
    public final o79 o1;

    public PinLoginDialogFragment() {
        final PinLoginDialogFragment$special$$inlined$viewModels$default$1 pinLoginDialogFragment$special$$inlined$viewModels$default$1 = new PinLoginDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.login.ui.PinLoginDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) pinLoginDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.o1 = new o79(g27.a(PinViewModel.class), new bp2() { // from class: ir.mservices.market.login.ui.PinLoginDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.login.ui.PinLoginDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.login.ui.PinLoginDialogFragment$special$$inlined$viewModels$default$4
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
        return ((v86) this.m1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "PinLoginDialogFragment";
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final View V0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        js3.p(layoutInflater, "inflater");
        int i = wn2.I;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        wn2 wn2Var = (wn2) fa1.c(layoutInflater, js6.fragment_verify_bind_state, viewGroup, false);
        this.n1 = wn2Var;
        js3.m(wn2Var);
        MyketEditText myketEditText = wn2Var.y;
        myketEditText.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{sj8.b().u, sj8.b().m}));
        myketEditText.setHintTextColor(sj8.b().n);
        myketEditText.setCompoundDrawablesWithIntrinsicBounds(l87.d(myketEditText.getResources(), yq6.ic_key), (Drawable) null, (Drawable) null, (Drawable) null);
        myketEditText.setInputType(N0().c() == 2 ? 0 : 2);
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.enabled}, new int[]{-16842910}}, new int[]{sj8.b().c, sj8.b().n});
        wn2 wn2Var2 = this.n1;
        js3.m(wn2Var2);
        wn2Var2.F.setTextColor(colorStateList);
        wn2 wn2Var3 = this.n1;
        js3.m(wn2Var3);
        wn2Var3.C.setTextColor(colorStateList);
        int paddingLeft = viewGroup != null ? viewGroup.getPaddingLeft() : 0;
        int paddingRight = viewGroup != null ? viewGroup.getPaddingRight() : 0;
        if (viewGroup != null) {
            viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, viewGroup.getPaddingBottom());
        }
        wn2 wn2Var4 = this.n1;
        js3.m(wn2Var4);
        wn2Var4.z.setPadding(paddingLeft, 0, paddingRight, 0);
        wn2 wn2Var5 = this.n1;
        js3.m(wn2Var5);
        wn2Var5.y.requestFocus();
        wn2 wn2Var6 = this.n1;
        js3.m(wn2Var6);
        View view = wn2Var6.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final LoginData W0() {
        return ((v86) this.m1.getValue()).b;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final boolean Y0() {
        bi5 bi5Var = this.m1;
        BindData bindData = ((v86) bi5Var.getValue()).c.a;
        js3.n(bindData, "null cannot be cast to non-null type ir.mservices.market.login.data.PhoneBindData");
        PhoneBindData phoneBindData = (PhoneBindData) bindData;
        PinBindData pinBindData = (PinBindData) f1().v.a.getValue();
        phoneBindData.a = pinBindData != null ? pinBindData.a : null;
        am2 am2VarJ0 = J0();
        if (am2VarJ0 != null) {
            am2VarJ0.q();
        }
        pk5.g(J0(), new NavIntentDirections.Login(new wd4(((v86) bi5Var.getValue()).a, ((v86) bi5Var.getValue()).c)), -1);
        return false;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final boolean Z0() {
        return N0().c() == 2;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final void a1() {
        wn2 wn2Var = this.n1;
        js3.m(wn2Var);
        MyketEditText myketEditText = wn2Var.y;
        Editable text = myketEditText.getText();
        String string = null;
        if (text == null || text.length() == 0) {
            text = null;
        }
        if (text != null) {
            Editable text2 = myketEditText.getText();
            string = text.subSequence(0, text2 != null ? text2.length() - 1 : 0).toString();
        }
        myketEditText.setText(string);
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.n1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final void c1(String str) {
        js3.p(str, "item");
        wn2 wn2Var = this.n1;
        js3.m(wn2Var);
        MyketEditText myketEditText = wn2Var.y;
        Editable text = myketEditText.getText();
        myketEditText.setText(text != null ? text.append((CharSequence) str) : null);
        myketEditText.setSelection(myketEditText.length());
    }

    public final void e1(boolean z) {
        wn2 wn2Var = this.n1;
        js3.m(wn2Var);
        wn2Var.x.setStateCommit(z ? MyketProgressState.c : MyketProgressState.b);
    }

    public final PinViewModel f1() {
        return (PinViewModel) this.o1.getValue();
    }

    public final void g1() {
        wn2 wn2Var = this.n1;
        js3.m(wn2Var);
        String strValueOf = String.valueOf(wn2Var.y.getText());
        if (!f88.n0(strValueOf)) {
            e1(true);
            wn2 wn2Var2 = this.n1;
            js3.m(wn2Var2);
            wn2Var2.v.setVisibility(4);
            f1().e(strValueOf, "");
            T0();
            return;
        }
        wn2 wn2Var3 = this.n1;
        js3.m(wn2Var3);
        MyketTextView myketTextView = wn2Var3.v;
        myketTextView.setVisibility(0);
        myketTextView.setText(rs6.bind_verify_phone_empty_message);
        wn2 wn2Var4 = this.n1;
        js3.m(wn2Var4);
        wn2Var4.w.setErrorEnabled(true);
        T0();
    }

    public final void h1(boolean z, boolean z2) {
        wn2 wn2Var = this.n1;
        js3.m(wn2Var);
        SmallBoldTextButton smallBoldTextButton = wn2Var.F;
        js3.o(smallBoldTextButton, "retryPinText");
        int i = 8;
        smallBoldTextButton.setVisibility(!z ? 0 : 8);
        wn2 wn2Var2 = this.n1;
        js3.m(wn2Var2);
        MyketTextView myketTextView = wn2Var2.G;
        js3.o(myketTextView, "timer");
        if (!z && z2) {
            i = 0;
        }
        myketTextView.setVisibility(i);
        wn2 wn2Var3 = this.n1;
        js3.m(wn2Var3);
        wn2Var3.E.setVisibility(z ? 0 : 4);
        wn2 wn2Var4 = this.n1;
        js3.m(wn2Var4);
        wn2Var4.D.setVisibility((z && ((Boolean) f1().p.a.getValue()).booleanValue()) ? 0 : 4);
        wn2 wn2Var5 = this.n1;
        js3.m(wn2Var5);
        wn2Var5.B.setVisibility(z ? 0 : 4);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void j0() {
        super.j0();
        I0();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f5  */
    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.login.ui.PinLoginDialogFragment.k0(android.view.View, android.os.Bundle):void");
    }
}
