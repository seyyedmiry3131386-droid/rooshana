package ir.mservices.market.version2.fragments.dialog;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import defpackage.a79;
import defpackage.bi5;
import defpackage.c24;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.g47;
import defpackage.hh2;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw8;
import defpackage.mf8;
import defpackage.o06;
import defpackage.pq6;
import defpackage.rs6;
import defpackage.vy2;
import defpackage.y97;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.yw6;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketRadioButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportDialogFragment extends Hilt_ReportDialogFragment {
    public g47 h1;
    public int i1 = -1;
    public final bi5 j1 = new bi5(g27.a(f.class), new yw6(3, this));
    public final c24 k1 = kotlin.a.a(new o06(11, this));

    public static final class Option implements Parcelable {
        public static final Parcelable.Creator<Option> CREATOR = new d();
        public String a;
        public String b = null;
        public int c = 0;

        public Option(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            js3.p(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String K0() {
        String str = W0().b;
        return str == null ? "" : str;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return W0().a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "ReportDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final ThemeData O0() {
        return X0();
    }

    public final void V0(boolean z, Option[] optionArr) {
        P0();
        FragmentActivity fragmentActivityF = F();
        lw8.a(fragmentActivityF != null ? fragmentActivityF.getCurrentFocus() : null);
        g47 g47Var = this.h1;
        js3.m(g47Var);
        String strValueOf = String.valueOf(g47Var.z.getText());
        if (z) {
            int i = this.i1;
            g47 g47Var2 = this.h1;
            js3.m(g47Var2);
            if (i == g47Var2.A.getChildCount() - 1) {
                P0();
                if (lw8.g(strValueOf) < 4) {
                    hh2 hh2Var = new hh2(H(), M(rs6.feedback_small_text, 4));
                    hh2Var.G();
                    hh2.H(hh2Var);
                    return;
                }
            }
        }
        Y0(MyketProgressState.c);
        int i2 = this.i1;
        Option option = optionArr[i2];
        if (i2 < 0) {
            Context contextH = H();
            hh2.H(new hh2(contextH, contextH != null ? contextH.getString(rs6.select_one_of_options) : null));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SELECT_INDEX", i2);
        bundle.putString("BUNDLE_KEY_DESCRIPTION", strValueOf);
        bundle.putParcelable("option", option);
        R0(DialogResult.a, bundle);
    }

    public final f W0() {
        return (f) this.j1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.b1 = false;
        this.Y0 = true;
        this.a1 = true;
        this.Z0 = true;
    }

    public final ThemeData X0() {
        return (ThemeData) this.k1.getValue();
    }

    public final void Y0(MyketProgressState myketProgressState) {
        g47 g47Var = this.h1;
        js3.m(g47Var);
        g47Var.w.setStateCommit(myketProgressState);
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = g47.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        g47 g47Var = (g47) fa1.c(layoutInflater, js6.report_dialog, null, false);
        this.h1 = g47Var;
        js3.m(g47Var);
        View view = g47Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.h1 = null;
        super.b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        final Option[] optionArr = W0().i;
        int i = W0().e;
        final int i2 = W0().f;
        g47 g47Var = this.h1;
        js3.m(g47Var);
        g47Var.z.setBackgroundResource(yq6.shape_edittext_tag);
        g47 g47Var2 = this.h1;
        js3.m(g47Var2);
        g47Var2.z.getBackground().setColorFilter(new PorterDuffColorFilter(X0().w, PorterDuff.Mode.MULTIPLY));
        g47 g47Var3 = this.h1;
        js3.m(g47Var3);
        g47Var3.z.setHintTextColor(X0().n);
        g47 g47Var4 = this.h1;
        js3.m(g47Var4);
        g47Var4.z.setTextColor(X0().m);
        String str = W0().b;
        String str2 = W0().c;
        final boolean z = W0().h;
        g47 g47Var5 = this.h1;
        js3.m(g47Var5);
        g47Var5.v.setTextColor(X0().n);
        g47 g47Var6 = this.h1;
        js3.m(g47Var6);
        g47Var6.v.setText(str2);
        g47 g47Var7 = this.h1;
        js3.m(g47Var7);
        ?? r11 = 0;
        g47Var7.v.setVisibility((str2 == null || f88.n0(str2)) ? 8 : 0);
        g47 g47Var8 = this.h1;
        js3.m(g47Var8);
        g47Var8.x.setBackgroundColor(X0().v);
        g47 g47Var9 = this.h1;
        js3.m(g47Var9);
        g47Var9.B.setTheme(X0());
        if (str == null || f88.n0(str)) {
            g47 g47Var10 = this.h1;
            js3.m(g47Var10);
            g47Var10.B.setVisibility(8);
            g47 g47Var11 = this.h1;
            js3.m(g47Var11);
            g47Var11.x.setVisibility(8);
        } else {
            g47 g47Var12 = this.h1;
            js3.m(g47Var12);
            g47Var12.B.setTitle(str);
            g47 g47Var13 = this.h1;
            js3.m(g47Var13);
            g47Var13.B.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
            g47 g47Var14 = this.h1;
            js3.m(g47Var14);
            g47Var14.B.setVisibility(0);
            g47 g47Var15 = this.h1;
            js3.m(g47Var15);
            g47Var15.x.setVisibility(0);
        }
        g47 g47Var16 = this.h1;
        js3.m(g47Var16);
        g47Var16.A.setVisibility(0);
        int length = optionArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            Option option = optionArr[i3];
            int i5 = i4 + 1;
            int i6 = mf8.x;
            DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
            View view2 = ((mf8) a79.f0(layoutInflaterFrom, js6.template_radio_button, null, r11, null)).l;
            js3.n(view2, "null cannot be cast to non-null type ir.mservices.market.views.MyketRadioButton");
            MyketRadioButton myketRadioButton = (MyketRadioButton) view2;
            myketRadioButton.setTextColor(X0().n);
            myketRadioButton.setId(i4);
            myketRadioButton.a(X0(), i);
            myketRadioButton.setTextSize(r11, K().getDimension(pq6.font_size_large));
            String str3 = option.a;
            SpannableString spannableString = new SpannableString(str3);
            LayoutInflater layoutInflater = layoutInflaterFrom;
            spannableString.setSpan(new ForegroundColorSpan(X0().m), 0, str3.length(), 17);
            spannableString.setSpan(new AbsoluteSizeSpan((int) K().getDimension(pq6.font_size_large)), 0, str3.length(), 17);
            String str4 = option.b;
            if (str4 != null && !f88.n0(str4)) {
                spannableString.setSpan(new ForegroundColorSpan(X0().n), str3.length(), str3.length(), 17);
                spannableString.setSpan(new AbsoluteSizeSpan((int) K().getDimension(pq6.font_size_medium)), str3.length(), str3.length(), 17);
            }
            myketRadioButton.setText(TextUtils.concat(spannableString));
            if (yq2.o0(H())) {
                myketRadioButton.setPaddingRelative(myketRadioButton.getResources().getDimensionPixelSize(pq6.space_8), 0, 0, 0);
                myketRadioButton.setBackground(vy2.h(myketRadioButton.getContext(), X0()));
            } else {
                myketRadioButton.setBackground(y97.B(0.0f, X0().O.c, 1));
            }
            g47 g47Var17 = this.h1;
            js3.m(g47Var17);
            g47Var17.A.addView(myketRadioButton, new RadioGroup.LayoutParams(-1, -2));
            i3++;
            i4 = i5;
            layoutInflaterFrom = layoutInflater;
            r11 = 0;
        }
        this.i1 = W0().d;
        g47 g47Var18 = this.h1;
        js3.m(g47Var18);
        g47Var18.w.setTheme(X0());
        g47 g47Var19 = this.h1;
        js3.m(g47Var19);
        g47Var19.w.setPrimaryColor(i, i2);
        g47 g47Var20 = this.h1;
        js3.m(g47Var20);
        g47Var20.A.check(this.i1);
        g47 g47Var21 = this.h1;
        js3.m(g47Var21);
        g47Var21.w.setCommitButtonEnable(false, i2);
        g47 g47Var22 = this.h1;
        js3.m(g47Var22);
        g47Var22.w.setTitles(K().getString(rs6.report_error), K().getString(rs6.button_cancel));
        g47 g47Var23 = this.h1;
        js3.m(g47Var23);
        g47Var23.A.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: i47
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i7) {
                int i8;
                js3.p(radioGroup, "group");
                ReportDialogFragment reportDialogFragment = this.a;
                reportDialogFragment.i1 = i7;
                g47 g47Var24 = reportDialogFragment.h1;
                js3.m(g47Var24);
                g47Var24.w.setCommitButtonEnable(true, i2);
                g47 g47Var25 = reportDialogFragment.h1;
                js3.m(g47Var25);
                MyketEditText myketEditText = g47Var25.z;
                boolean z2 = z;
                if (z2 && reportDialogFragment.i1 == radioGroup.getChildCount() - 1) {
                    i8 = 0;
                } else {
                    g47 g47Var26 = reportDialogFragment.h1;
                    js3.m(g47Var26);
                    g47Var26.z.setText("");
                    i8 = 8;
                }
                myketEditText.setVisibility(i8);
                if (yq2.o0(reportDialogFragment.H())) {
                    reportDialogFragment.V0(z2, optionArr);
                }
            }
        });
        g47 g47Var24 = this.h1;
        js3.m(g47Var24);
        g47Var24.w.setOnClickListener(new e(this, z, optionArr));
        if (yq2.o0(H())) {
            g47 g47Var25 = this.h1;
            js3.m(g47Var25);
            DialogButtonComponent dialogButtonComponent = g47Var25.w;
            js3.o(dialogButtonComponent, "dialogButton");
            dialogButtonComponent.setVisibility(8);
        }
        view.getBackground().setColorFilter(new PorterDuffColorFilter(X0().l, PorterDuff.Mode.MULTIPLY));
    }
}
