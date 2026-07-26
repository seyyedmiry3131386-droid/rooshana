package ir.mservices.market.app.schedule.ui.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.bi5;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.le7;
import defpackage.mf8;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ue7;
import defpackage.ve7;
import defpackage.y97;
import defpackage.yw6;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketRadioButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduleTypeBottomDialogFragment extends Hilt_ScheduleTypeBottomDialogFragment {
    public le7 h1;
    public final bi5 i1 = new bi5(g27.a(ve7.class), new yw6(8, this));
    public int j1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((ve7) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "ScheduleTypeBottomDialogFragment";
    }

    public final void V0(String str, int i, boolean z) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i2 = mf8.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        View view = ((mf8) a79.f0(layoutInflaterFrom, js6.template_radio_button, null, false, null)).l;
        js3.n(view, "null cannot be cast to non-null type ir.mservices.market.views.MyketRadioButton");
        MyketRadioButton myketRadioButton = (MyketRadioButton) view;
        myketRadioButton.setTextColor(sj8.b().n);
        myketRadioButton.a(sj8.b(), sj8.b().c);
        myketRadioButton.setChecked(z);
        myketRadioButton.setText(str);
        myketRadioButton.setId(i);
        myketRadioButton.setBackground(y97.B(0.0f, 0, 3));
        if (z) {
            this.j1 = i;
        }
        W0().x.addView(myketRadioButton, new RadioGroup.LayoutParams(-1, -2));
    }

    public final le7 W0() {
        le7 le7Var = this.h1;
        if (le7Var != null) {
            return le7Var;
        }
        js3.V("binding");
        throw null;
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
        a79 a79VarC = fa1.c(layoutInflater, js6.schedule_download_type_dialog, viewGroup, false);
        js3.o(a79VarC, "inflate(...)");
        this.h1 = (le7) a79VarC;
        String string = K().getString(rs6.gprs_wifi);
        js3.o(string, "getString(...)");
        V0(string, 0, ((ve7) this.i1.getValue()).b);
        String string2 = K().getString(rs6.only_wifi);
        js3.o(string2, "getString(...)");
        V0(string2, 1, !((ve7) r5.getValue()).b);
        W0().v.setTitles(L(rs6.choose_txt), null);
        View view = W0().l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        W0().x.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: te7
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                js3.p(radioGroup, "<unused var>");
                this.a.j1 = i;
            }
        });
        W0().v.setOnClickListener(new ue7(0, this));
    }
}
