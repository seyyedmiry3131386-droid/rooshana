package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.h76;
import defpackage.zj4;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialTextInputPicker<S> extends h76 {
    public int B0;
    public DateSelector C0;
    public CalendarConstraints D0;

    @Override // androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.B0 = bundle.getInt("THEME_RES_ID_KEY");
        this.C0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.D0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.C0.P(layoutInflater.cloneInContext(new ContextThemeWrapper(H(), this.B0)), viewGroup, this.D0, new zj4(1, this));
    }

    @Override // androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.B0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.C0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.D0);
    }
}
