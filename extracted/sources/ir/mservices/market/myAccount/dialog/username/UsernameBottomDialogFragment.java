package ir.mservices.market.myAccount.dialog.username;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.au7;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.c29;
import defpackage.c5;
import defpackage.f09;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j5;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.kh2;
import defpackage.lw8;
import defpackage.o79;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.v7;
import defpackage.x79;
import defpackage.yq6;
import defpackage.yw6;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class UsernameBottomDialogFragment extends Hilt_UsernameBottomDialogFragment {
    public c5 h1;
    public final bi5 i1 = new bi5(g27.a(c29.class), new yw6(28, this));
    public j5 j1;
    public final o79 k1;

    public UsernameBottomDialogFragment() {
        final UsernameBottomDialogFragment$special$$inlined$viewModels$default$1 usernameBottomDialogFragment$special$$inlined$viewModels$default$1 = new UsernameBottomDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) usernameBottomDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(UsernameDialogViewModel.class), new bp2() { // from class: ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment$special$$inlined$viewModels$default$4
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
        return ((c29) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "UsernameBottomDialogFragment";
    }

    public final void V0() {
        Context contextH = H();
        Context contextH2 = H();
        String strI = null;
        if (contextH2 != null) {
            c5 c5Var = this.h1;
            if (c5Var == null) {
                js3.V("accountManager");
                throw null;
            }
            if (c5Var == null) {
                js3.V("accountManager");
                throw null;
            }
            String strE = c5Var.h.e();
            j5 j5Var = this.j1;
            js3.m(j5Var);
            String string = j5Var.C.getEditableText().toString();
            c5 c5Var2 = this.h1;
            if (c5Var2 == null) {
                js3.V("accountManager");
                throw null;
            }
            strI = c5.i(contextH2, strE, string, (String) c5Var2.h.c);
        }
        if (strI == null) {
            strI = "";
        }
        au7.a(contextH, strI, new v7(27));
        z0();
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
        int i = j5.D;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        j5 j5Var = (j5) fa1.c(layoutInflater, js6.account_username, viewGroup, false);
        this.j1 = j5Var;
        js3.m(j5Var);
        View view = j5Var.l;
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
        int i;
        js3.p(view, "view");
        super.k0(view, bundle);
        j5 j5Var = this.j1;
        js3.m(j5Var);
        MyketEditText myketEditText = j5Var.C;
        myketEditText.setText(((c29) this.i1.getValue()).b);
        myketEditText.setBackgroundResource(yq6.shape_empty_border);
        Drawable background = myketEditText.getBackground();
        int i2 = sj8.b().l;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(i2, mode));
        myketEditText.setTypeface((Typeface) kh2.b.b.b);
        myketEditText.requestFocus();
        j5 j5Var2 = this.j1;
        js3.m(j5Var2);
        ConstraintLayout constraintLayout = j5Var2.z;
        constraintLayout.setBackgroundResource(yq6.shape_edittext_tag);
        constraintLayout.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().c, mode));
        String strL = L(rs6.account_change_username_description);
        js3.o(strL, "getString(...)");
        j5 j5Var3 = this.j1;
        js3.m(j5Var3);
        MyketTextView myketTextView = j5Var3.x;
        js3.o(myketTextView, "description2");
        if (f88.n0(strL)) {
            i = 8;
        } else {
            j5 j5Var4 = this.j1;
            js3.m(j5Var4);
            MyketTextView myketTextView2 = j5Var4.x;
            js3.m(myketTextView2);
            MyketTextView.setTextFromHtml$default(myketTextView2, strL, 0, null, new f09(3, this), false, 4, null);
            myketTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            i = 0;
        }
        myketTextView.setVisibility(i);
        j5 j5Var5 = this.j1;
        js3.m(j5Var5);
        j5Var5.w.setTextColor(sj8.b().n);
        j5 j5Var6 = this.j1;
        js3.m(j5Var6);
        j5Var6.B.setTextColor(sj8.b().n);
        j5 j5Var7 = this.j1;
        js3.m(j5Var7);
        j5Var7.x.setTextColor(sj8.b().n);
        j5 j5Var8 = this.j1;
        js3.m(j5Var8);
        j5Var8.C.setTextColor(sj8.b().n);
        j5 j5Var9 = this.j1;
        js3.m(j5Var9);
        j5Var9.y.setTextColor(sj8.b().A);
        j5 j5Var10 = this.j1;
        js3.m(j5Var10);
        j5Var10.v.setTitles(L(rs6.connect_dialog_continue), null);
        j5 j5Var11 = this.j1;
        js3.m(j5Var11);
        j5Var11.v.setOnClickListener(new a(this));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new UsernameBottomDialogFragment$onViewCreated$5(this, null));
    }
}
