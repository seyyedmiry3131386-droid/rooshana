package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.ca7;
import defpackage.de;
import defpackage.ea7;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.gz3;
import defpackage.hz3;
import defpackage.js3;
import defpackage.js6;
import defpackage.jz3;
import defpackage.pq6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.u70;
import defpackage.x1;
import defpackage.yu6;
import ir.mservices.market.version2.fragments.dialog.KidsModeDeActiveBottomDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;
import kotlin.random.Random$Default;

/* JADX INFO: loaded from: classes3.dex */
public final class KidsModeDeActiveBottomDialogFragment extends Hilt_KidsModeDeActiveBottomDialogFragment {
    public final bi5 h1 = new bi5(g27.a(hz3.class), new de(23, this));
    public jz3 i1;
    public int j1;
    public int k1;
    public int l1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((hz3) this.h1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "KidsModeDeActiveBottomDialogFragment";
    }

    public final StateListDrawable V0(Context context) {
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.h = K().getDimensionPixelSize(pq6.space_2);
        ea7Var.i = sj8.b().c;
        ea7Var.c(K().getDimensionPixelSize(pq6.space_8));
        return ea7Var.a();
    }

    public final void W0() {
        Random$Default random$Default = yu6.a;
        random$Default.getClass();
        x1 x1Var = yu6.b;
        this.j1 = x1Var.c(4, 9);
        random$Default.getClass();
        int iC = x1Var.c(4, 9);
        this.k1 = iC;
        this.l1 = this.j1 * iC;
        jz3 jz3Var = this.i1;
        js3.m(jz3Var);
        jz3Var.y.setText(M(rs6.kids_mode_function_txt, String.valueOf(this.j1), String.valueOf(this.k1)));
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = true;
    }

    public final void X0() {
        jz3 jz3Var = this.i1;
        js3.m(jz3Var);
        Editable text = jz3Var.x.getText();
        jz3 jz3Var2 = this.i1;
        js3.m(jz3Var2);
        Editable text2 = jz3Var2.B.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        String string = sb.toString();
        if (!f88.n0(string) && Integer.parseInt(string) == this.l1) {
            R0(DialogResult.a, new Bundle());
            return;
        }
        jz3 jz3Var3 = this.i1;
        js3.m(jz3Var3);
        MyketTextView myketTextView = jz3Var3.w;
        myketTextView.setText(L(rs6.kids_mode_dialog_error));
        myketTextView.setVisibility(0);
        jz3 jz3Var4 = this.i1;
        js3.m(jz3Var4);
        jz3Var4.v.setCommitButtonEnable(false, sj8.b().d);
        jz3 jz3Var5 = this.i1;
        js3.m(jz3Var5);
        jz3Var5.x.requestFocus();
        jz3 jz3Var6 = this.i1;
        js3.m(jz3Var6);
        jz3Var6.x.setText("");
        jz3 jz3Var7 = this.i1;
        js3.m(jz3Var7);
        jz3Var7.B.setText("");
        W0();
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = jz3.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        jz3 jz3Var = (jz3) fa1.c(layoutInflater, js6.kids_mode_deactive_dialog, viewGroup, false);
        this.i1 = jz3Var;
        js3.m(jz3Var);
        View view = jz3Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.i1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        jz3 jz3Var = this.i1;
        js3.m(jz3Var);
        MyketTextView myketTextView = jz3Var.A;
        myketTextView.setTextColor(sj8.b().n);
        myketTextView.setText(L(rs6.kids_mode_dialog_message));
        jz3 jz3Var2 = this.i1;
        js3.m(jz3Var2);
        jz3Var2.y.setTextColor(sj8.b().m);
        W0();
        jz3 jz3Var3 = this.i1;
        js3.m(jz3Var3);
        MyketEditText myketEditText = jz3Var3.x;
        myketEditText.requestFocus();
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        myketEditText.setBackground(V0(context));
        myketEditText.setHintTextColor(sj8.b().n);
        myketEditText.setTextColor(sj8.b().m);
        jz3 jz3Var4 = this.i1;
        js3.m(jz3Var4);
        MyketEditText myketEditText2 = jz3Var4.B;
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        myketEditText2.setBackground(V0(context2));
        myketEditText2.setHintTextColor(sj8.b().n);
        myketEditText2.setTextColor(sj8.b().m);
        jz3 jz3Var5 = this.i1;
        js3.m(jz3Var5);
        jz3Var5.v.setCommitButtonEnable(false, sj8.b().d);
        jz3 jz3Var6 = this.i1;
        js3.m(jz3Var6);
        jz3Var6.x.addTextChangedListener(new gz3(this, 0));
        jz3 jz3Var7 = this.i1;
        js3.m(jz3Var7);
        jz3Var7.B.addTextChangedListener(new gz3(this, 1));
        jz3 jz3Var8 = this.i1;
        js3.m(jz3Var8);
        jz3Var8.w.setTextColor(sj8.b().A);
        jz3 jz3Var9 = this.i1;
        js3.m(jz3Var9);
        DialogButtonComponent dialogButtonComponent = jz3Var9.v;
        dialogButtonComponent.setTitles(L(rs6.connect_dialog_continue), null);
        dialogButtonComponent.setOnClickListener(new ca7(26, this));
        jz3 jz3Var10 = this.i1;
        js3.m(jz3Var10);
        final int i = 0;
        jz3Var10.B.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: fz3
            public final /* synthetic */ KidsModeDeActiveBottomDialogFragment b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        if (i2 == 6) {
                            this.b.X0();
                        }
                        break;
                    default:
                        if (i2 == 6) {
                            this.b.X0();
                        }
                        break;
                }
                return false;
            }
        });
        jz3 jz3Var11 = this.i1;
        js3.m(jz3Var11);
        final int i2 = 1;
        jz3Var11.x.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: fz3
            public final /* synthetic */ KidsModeDeActiveBottomDialogFragment b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i22, KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        if (i22 == 6) {
                            this.b.X0();
                        }
                        break;
                    default:
                        if (i22 == 6) {
                            this.b.X0();
                        }
                        break;
                }
                return false;
            }
        });
        Dialog dialog = this.L0;
        if (dialog != null) {
            dialog.setOnKeyListener(new u70(this, 1));
        }
    }
}
