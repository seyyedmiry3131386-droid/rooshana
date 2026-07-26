package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ao6;
import defpackage.ft6;
import defpackage.h16;
import defpackage.jr9;
import defpackage.oq6;
import defpackage.vp6;
import defpackage.yh0;
import defpackage.zj4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RangeDateSelector implements DateSelector<h16> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new ao6(1);
    public String a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, zj4 zj4Var) {
        Long l = rangeDateSelector.d;
        if (l == null || rangeDateSelector.e == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.a.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            zj4Var.a();
        } else if (l.longValue() <= rangeDateSelector.e.longValue()) {
            Long l2 = rangeDateSelector.d;
            rangeDateSelector.b = l2;
            Long l3 = rangeDateSelector.e;
            rangeDateSelector.c = l3;
            zj4Var.b(new h16(l2, l3));
        } else {
            textInputLayout.setError(rangeDateSelector.a);
            textInputLayout2.setError(" ");
            zj4Var.a();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else {
            if (TextUtils.isEmpty(textInputLayout2.getError())) {
                return;
            }
            textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String C0(Context context) {
        Resources resources = context.getResources();
        h16 h16VarI = jr9.i(this.b, this.c);
        Object obj = h16VarI.a;
        String string = obj == null ? resources.getString(ft6.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = h16VarI.b;
        return resources.getString(ft6.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(ft6.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList D() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h16(this.b, this.c));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int F0(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return yh0.J(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(oq6.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? vp6.materialCalendarTheme : vp6.materialCalendarFullscreenTheme, context, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean L0() {
        Long l = this.b;
        return (l == null || this.c == null || l.longValue() > this.c.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList N0() {
        ArrayList arrayList = new ArrayList();
        Long l = this.b;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.c;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View P(android.view.LayoutInflater r14, android.view.ViewGroup r15, com.google.android.material.datepicker.CalendarConstraints r16, defpackage.zj4 r17) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.RangeDateSelector.P(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, zj4):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object U0() {
        return new h16(this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void e1(long j) {
        Long l = this.b;
        if (l == null) {
            this.b = Long.valueOf(j);
        } else if (this.c == null && l.longValue() <= j) {
            this.c = Long.valueOf(j);
        } else {
            this.c = null;
            this.b = Long.valueOf(j);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String y(Context context) {
        Resources resources = context.getResources();
        Long l = this.b;
        if (l == null && this.c == null) {
            return resources.getString(ft6.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.c;
        if (l2 == null) {
            return resources.getString(ft6.mtrl_picker_range_header_only_start_selected, jr9.j(l.longValue()));
        }
        if (l == null) {
            return resources.getString(ft6.mtrl_picker_range_header_only_end_selected, jr9.j(l2.longValue()));
        }
        h16 h16VarI = jr9.i(l, l2);
        return resources.getString(ft6.mtrl_picker_range_header_selected, h16VarI.a, h16VarI.b);
    }
}
