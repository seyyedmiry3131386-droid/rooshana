package ir.mservices.market.login.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.gms.common.Feature;
import defpackage.a67;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.cf0;
import defpackage.de;
import defpackage.df8;
import defpackage.eu2;
import defpackage.f88;
import defpackage.fa1;
import defpackage.fm8;
import defpackage.g27;
import defpackage.gu2;
import defpackage.j71;
import defpackage.j99;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.kh2;
import defpackage.l87;
import defpackage.l99;
import defpackage.ln1;
import defpackage.lw;
import defpackage.lw8;
import defpackage.m88;
import defpackage.mb0;
import defpackage.ml2;
import defpackage.o79;
import defpackage.ox9;
import defpackage.pq6;
import defpackage.q79;
import defpackage.ql;
import defpackage.ql4;
import defpackage.rf0;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ts5;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vz7;
import defpackage.wd4;
import defpackage.x;
import defpackage.x79;
import defpackage.xs8;
import defpackage.y97;
import defpackage.yi9;
import defpackage.yq2;
import defpackage.yq6;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import ir.mservices.market.login.data.BindData;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.AccountInfoDto;
import ir.mservices.market.views.BindAutoCompleteView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketInputLayout;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.l;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginDialogFragment extends Hilt_LoginDialogFragment {
    public final bi5 m1 = new bi5(g27.a(wd4.class), new de(24, this));
    public ml2 n1;
    public final o79 o1;

    public LoginDialogFragment() {
        final LoginDialogFragment$special$$inlined$viewModels$default$1 loginDialogFragment$special$$inlined$viewModels$default$1 = new LoginDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.login.ui.LoginDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) loginDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.o1 = new o79(g27.a(LoginViewModel.class), new bp2() { // from class: ir.mservices.market.login.ui.LoginDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.login.ui.LoginDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.login.ui.LoginDialogFragment$special$$inlined$viewModels$default$4
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
        return e1().a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "LoginDialogFragment";
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final View V0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        js3.p(layoutInflater, "inflater");
        int i = ml2.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ml2 ml2Var = (ml2) fa1.c(layoutInflater, js6.fragment_login, viewGroup, false);
        this.n1 = ml2Var;
        js3.m(ml2Var);
        BindAutoCompleteView bindAutoCompleteView = ml2Var.y;
        bindAutoCompleteView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{sj8.b().u, sj8.b().m}));
        bindAutoCompleteView.setHintTextColor(sj8.b().n);
        bindAutoCompleteView.setCompoundDrawablesWithIntrinsicBounds(l87.d(bindAutoCompleteView.getResources(), yq6.ic_phone), (Drawable) null, (Drawable) null, (Drawable) null);
        bindAutoCompleteView.setInputType(N0().c() == 2 ? 0 : 2);
        bindAutoCompleteView.setTextIsSelectable(true);
        bindAutoCompleteView.setCursorVisible(true);
        bindAutoCompleteView.requestFocus();
        ml2 ml2Var2 = this.n1;
        js3.m(ml2Var2);
        MyketTextView myketTextView = ml2Var2.z;
        js3.o(myketTextView, "privacy");
        myketTextView.setVisibility(0);
        ml2 ml2Var3 = this.n1;
        js3.m(ml2Var3);
        MyketTextView myketTextView2 = ml2Var3.z;
        js3.o(myketTextView2, "privacy");
        MyketTextView.setTextFromHtml$default(myketTextView2, K().getString(rs6.login_privacy), 0, null, null, false, 28, null);
        ml2 ml2Var4 = this.n1;
        js3.m(ml2Var4);
        View view = ml2Var4.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final LoginData W0() {
        return e1().b;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final String X0() {
        return e1().b.b;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final boolean Z0() {
        return N0().c() == 2;
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final void a1() {
        ml2 ml2Var = this.n1;
        js3.m(ml2Var);
        BindAutoCompleteView bindAutoCompleteView = ml2Var.y;
        Editable text = bindAutoCompleteView.getText();
        js3.m(text);
        if (!(text.length() > 0)) {
            text = null;
        }
        bindAutoCompleteView.setText(text != null ? text.subSequence(0, bindAutoCompleteView.getText().length() - 1).toString() : null);
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        ml2 ml2Var = this.n1;
        js3.m(ml2Var);
        BindAutoCompleteView bindAutoCompleteView = ml2Var.y;
        for (x xVar : (ArrayList) bindAutoCompleteView.o.b) {
            if (xVar.l.equals(bindAutoCompleteView)) {
                xVar.d.set(true);
                xVar.b.cancel(false);
            }
        }
        this.n1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment
    public final void c1(String str) {
        js3.p(str, "item");
        ml2 ml2Var = this.n1;
        js3.m(ml2Var);
        BindAutoCompleteView bindAutoCompleteView = ml2Var.y;
        Editable text = bindAutoCompleteView.getText();
        bindAutoCompleteView.setText(text != null ? text.append((CharSequence) str) : null);
        bindAutoCompleteView.setSelection(bindAutoCompleteView.length());
    }

    public final wd4 e1() {
        return (wd4) this.m1.getValue();
    }

    public final void f1() {
        String strSubstring;
        LoginData loginData = e1().b;
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b("login_next_" + loginData.c);
        clickEventBuilder.a();
        P0();
        ml2 ml2Var = this.n1;
        js3.m(ml2Var);
        String strJ = lw8.j(f88.J0(ml2Var.y.getText().toString()).toString());
        ml2 ml2Var2 = this.n1;
        js3.m(ml2Var2);
        MyketInputLayout myketInputLayout = ml2Var2.w;
        boolean z = true;
        if (f88.n0(strJ) || strJ.equalsIgnoreCase(Marker.ANY_NON_NULL_MARKER)) {
            ml2 ml2Var3 = this.n1;
            js3.m(ml2Var3);
            MyketTextView myketTextView = ml2Var3.v;
            myketTextView.setVisibility(0);
            myketTextView.setText(rs6.bind_email_or_phone_empty_message);
        } else {
            LoginViewModel loginViewModel = (LoginViewModel) this.o1.getValue();
            l lVar = loginViewModel.x;
            fm8 fm8Var = loginViewModel.u;
            fm8Var.getClass();
            AccountInfoDto accountInfoDto = fm8Var.d;
            if (accountInfoDto == null || !js3.i(fm8Var.e, strJ) || (System.currentTimeMillis() - fm8Var.a) / ((long) 1000) > fm8Var.b) {
                accountInfoDto = null;
            }
            if (accountInfoDto != null) {
                l99 l99Var = new l99(accountInfoDto);
                lVar.getClass();
                lVar.p(null, l99Var);
            } else {
                fm8Var.b = 0;
                fm8Var.a = 0L;
                fm8Var.c = 0;
                fm8Var.e = null;
                fm8Var.d = null;
                j99 j99Var = new j99(null);
                lVar.getClass();
                lVar.p(null, j99Var);
                if (m88.Z(strJ, Marker.ANY_NON_NULL_MARKER, false) || m88.Z(strJ, Marker.ANY_NON_NULL_MARKER, false)) {
                    strSubstring = strJ.substring(1);
                    js3.o(strSubstring, "substring(...)");
                } else {
                    strSubstring = strJ;
                }
                if (TextUtils.isDigitsOnly(strSubstring)) {
                    vz7 vz7Var = loginViewModel.v;
                    Context context = vz7Var.a;
                    try {
                        if (gu2.e.b(context, 10291000) == 0) {
                            yi9 yi9Var = new yi9(context, yi9.n, ql.a0, eu2.c);
                            cf0 cf0VarB = cf0.b();
                            cf0VarB.d = new xs8();
                            cf0VarB.e = new Feature[]{rf0.f};
                            cf0VarB.b = 1567;
                            ox9 ox9VarF = yi9Var.f(1, cf0VarB.a());
                            ts5 ts5Var = new ts5(17, new a67(13, vz7Var));
                            ox9VarF.getClass();
                            ox9VarF.b(df8.a, ts5Var);
                            ox9VarF.i(new ts5(18, vz7Var));
                        }
                    } catch (Exception e) {
                        lw.g(e, "Cannot register for sms retriever", null);
                    }
                }
                fm8Var.e = strJ;
                bt2.G(y97.G(loginViewModel), null, null, new LoginViewModel$login$1(loginViewModel, strJ, null), 3);
            }
            z = false;
        }
        myketInputLayout.setErrorEnabled(z);
        T0();
    }

    public final void g1() {
        ml2 ml2Var = this.n1;
        js3.m(ml2Var);
        ml2Var.x.setStateCommit(MyketProgressState.b);
    }

    @Override // ir.mservices.market.login.ui.BaseLoginDialogFragment, ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        g1();
        boolean z = false;
        b1(false);
        String strX0 = X0();
        ln1 ln1Var = this.i1;
        js3.m(ln1Var);
        ln1Var.A.setTitleText(strX0);
        SpannableString spannableString = new SpannableString(K().getString(rs6.login_place_holder));
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.a.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(K().getDimensionPixelSize(pq6.font_size_large)), 0, spannableString.length(), 33);
        ml2 ml2Var = this.n1;
        js3.m(ml2Var);
        ml2Var.w.setPlaceholderText(spannableString);
        ml2 ml2Var2 = this.n1;
        js3.m(ml2Var2);
        DialogButtonComponent dialogButtonComponent = ml2Var2.x;
        js3.o(dialogButtonComponent, "login");
        DialogButtonComponent.setTitles$default(dialogButtonComponent, K().getString(rs6.connect_dialog_continue), null, 2, null);
        String str = e1().b.c;
        js3.p(str, "label");
        if (!f88.n0(str)) {
            ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
            viewEventBuilder.b("login_".concat(str));
            viewEventBuilder.a();
        }
        if (e1().b.a != null) {
            ml2 ml2Var3 = this.n1;
            js3.m(ml2Var3);
            BindAutoCompleteView bindAutoCompleteView = ml2Var3.y;
            BindData bindData = e1().b.a;
            js3.n(bindData, "null cannot be cast to non-null type ir.mservices.market.login.data.PhoneBindData");
            bindAutoCompleteView.setText(((PhoneBindData) bindData).a);
        }
        ml2 ml2Var4 = this.n1;
        js3.m(ml2Var4);
        BindAutoCompleteView bindAutoCompleteView2 = ml2Var4.y;
        bindAutoCompleteView2.setCustomSelectionActionModeCallback(new vd4());
        bindAutoCompleteView2.setImeActionLabel(L(rs6.next), 5);
        bindAutoCompleteView2.setOnEditorActionListener(new ud4(0, this));
        bindAutoCompleteView2.addTextChangedListener(new mb0(4, this));
        ml2 ml2Var5 = this.n1;
        js3.m(ml2Var5);
        ml2Var5.x.setOnClickListener(new ql4(25, this));
        T0();
        if (!yq2.n0(H()) && N0().c() != 1) {
            z = true;
        }
        ml2 ml2Var6 = this.n1;
        js3.m(ml2Var6);
        ml2Var6.l.setFocusable(z);
        ml2 ml2Var7 = this.n1;
        js3.m(ml2Var7);
        ml2Var7.l.setFocusableInTouchMode(z);
        ml2 ml2Var8 = this.n1;
        js3.m(ml2Var8);
        String string = ml2Var8.y.getText().toString();
        ml2 ml2Var9 = this.n1;
        js3.m(ml2Var9);
        ml2Var9.x.setCommitButtonEnable(!f88.n0(string), sj8.b().d);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new LoginDialogFragment$onViewCreated$5(this, null));
    }
}
