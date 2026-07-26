package ir.mservices.market.version2.fragments.dialog;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.bi5;
import defpackage.d04;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.mf8;
import defpackage.pq6;
import defpackage.sj8;
import defpackage.sk6;
import defpackage.um1;
import defpackage.y97;
import defpackage.yw6;
import defpackage.yw7;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketRadioButton;
import ir.mservices.market.views.MyketTextView;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
public class SingleChoiceDialogFragment extends Hilt_SingleChoiceDialogFragment {
    public d04 h1;
    public um1 i1;
    public final bi5 j1 = new bi5(g27.a(yw7.class), new yw6(17, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return V0().a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return getClass().getSimpleName();
    }

    public final yw7 V0() {
        return (yw7) this.j1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.b1 = V0().g;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = um1.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        um1 um1Var = (um1) fa1.c(layoutInflater, js6.dialog_credit, viewGroup, false);
        this.i1 = um1Var;
        js3.m(um1Var);
        um1Var.x.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        um1 um1Var2 = this.i1;
        js3.m(um1Var2);
        View view = um1Var2.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.i1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.a = V0().e;
        um1 um1Var = this.i1;
        js3.m(um1Var);
        View view2 = um1Var.l;
        d04 d04Var = this.h1;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        view2.setLayoutDirection(d04Var.c());
        um1 um1Var2 = this.i1;
        js3.m(um1Var2);
        DialogHeaderComponent dialogHeaderComponent = um1Var2.z;
        dialogHeaderComponent.setTitle(V0().b);
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
        String[] strArr = V0().d;
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = strArr[i];
            int i3 = i2 + 1;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
            int i4 = mf8.x;
            DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
            View view3 = ((mf8) a79.f0(layoutInflaterFrom, js6.template_radio_button, null, false, null)).l;
            js3.n(view3, "null cannot be cast to non-null type ir.mservices.market.views.MyketRadioButton");
            MyketRadioButton myketRadioButton = (MyketRadioButton) view3;
            myketRadioButton.setTextColor(sj8.b().n);
            myketRadioButton.a(sj8.b(), sj8.b().c);
            myketRadioButton.setId(i2);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(sj8.b().m), 0, str.length(), 17);
            spannableString.setSpan(new AbsoluteSizeSpan((int) K().getDimension(pq6.font_size_large)), 0, str.length(), 17);
            myketRadioButton.setText(TextUtils.concat(spannableString));
            myketRadioButton.setBackground(y97.B(0.0f, 0, 3));
            um1 um1Var3 = this.i1;
            js3.m(um1Var3);
            um1Var3.y.addView(myketRadioButton, new RadioGroup.LayoutParams(-1, -2));
            i++;
            i2 = i3;
        }
        um1 um1Var4 = this.i1;
        js3.m(um1Var4);
        RadioGroup radioGroup = um1Var4.y;
        um1 um1Var5 = this.i1;
        js3.m(um1Var5);
        um1Var5.y.setVisibility(0);
        radioGroup.check(ref$IntRef.a);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: xw7
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i5) {
                js3.p(radioGroup2, "<unused var>");
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                ref$IntRef2.a = i5;
                um1 um1Var6 = this.i1;
                js3.m(um1Var6);
                um1Var6.v.setCommitButtonEnable(ref$IntRef2.a >= 0, sj8.b().d);
            }
        });
        um1 um1Var6 = this.i1;
        js3.m(um1Var6);
        DialogButtonComponent dialogButtonComponent = um1Var6.v;
        dialogButtonComponent.setCommitButtonEnable(ref$IntRef.a >= 0, sj8.b().d);
        dialogButtonComponent.setTitles(V0().c, null);
        dialogButtonComponent.setOnClickListener(new sk6(this, ref$IntRef, dialogButtonComponent));
        um1 um1Var7 = this.i1;
        js3.m(um1Var7);
        MyketTextView myketTextView = um1Var7.w;
        js3.o(myketTextView, "hint");
        String str2 = V0().f;
        myketTextView.setVisibility((str2 == null || f88.n0(str2)) ? 8 : 0);
        um1 um1Var8 = this.i1;
        js3.m(um1Var8);
        um1Var8.w.setText(V0().f);
    }
}
