package ir.mservices.market.app.schedule.ui.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.cd;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.mp6;
import defpackage.pe7;
import defpackage.re7;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.yw6;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.NumberPickerView;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduleTimeBottomDialogFragment extends Hilt_ScheduleTimeBottomDialogFragment {
    public re7 h1;
    public final bi5 i1 = new bi5(g27.a(pe7.class), new yw6(7, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((pe7) this.i1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "ScheduleTimeBottomDialogFragment";
    }

    public final re7 V0() {
        re7 re7Var = this.h1;
        if (re7Var != null) {
            return re7Var;
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
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = re7.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        re7 re7Var = (re7) fa1.c(layoutInflaterFrom, js6.schedule_time_dialog, null, false);
        js3.o(re7Var, "inflate(...)");
        this.h1 = re7Var;
        V0().v.setNormalTextColor(sj8.b().n);
        V0().v.setSelectedTextColor(sj8.b().m);
        V0().v.setDividerColor(sj8.b().v);
        V0().z.setTitle(((pe7) this.i1.getValue()).c);
        V0().z.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
        V0().w.setTitles(L(rs6.button_submit), null);
        View view = V0().l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        String[] stringArray = K().getStringArray(mp6.schedule_times);
        js3.o(stringArray, "getStringArray(...)");
        NumberPickerView numberPickerView = V0().v;
        numberPickerView.setDisplayedValues(stringArray);
        numberPickerView.setMinValue(0);
        numberPickerView.setMaxValue(23);
        numberPickerView.setValue(Integer.parseInt(((pe7) this.i1.getValue()).b));
        V0().w.setOnClickListener(new cd(29, this));
    }
}
