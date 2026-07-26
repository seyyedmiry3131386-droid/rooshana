package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.ft6;
import defpackage.jr9;
import defpackage.vp6;
import defpackage.yh0;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new ao6(14);
    public Long a;

    @Override // com.google.android.material.datepicker.DateSelector
    public final String C0(Context context) {
        Resources resources = context.getResources();
        Long l = this.a;
        return resources.getString(ft6.mtrl_picker_announce_current_selection, l == null ? resources.getString(ft6.mtrl_picker_announce_current_selection_none) : jr9.r(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList D() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int F0(Context context) {
        return yh0.J(vp6.materialCalendarTheme, context, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean L0() {
        return this.a != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList N0() {
        ArrayList arrayList = new ArrayList();
        Long l = this.a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View P(android.view.LayoutInflater r11, android.view.ViewGroup r12, com.google.android.material.datepicker.CalendarConstraints r13, defpackage.zj4 r14) {
        /*
            r10 = this;
            int r0 = defpackage.is6.mtrl_picker_text_input_date
            r1 = 0
            android.view.View r11 = r11.inflate(r0, r12, r1)
            int r12 = defpackage.qr6.mtrl_picker_text_input_date
            android.view.View r12 = r11.findViewById(r12)
            r6 = r12
            com.google.android.material.textfield.TextInputLayout r6 = (com.google.android.material.textfield.TextInputLayout) r6
            android.widget.EditText r12 = r6.getEditText()
            android.content.Context r0 = r11.getContext()
            int r2 = defpackage.vp6.colorOnSurfaceVariant
            java.lang.Integer r0 = defpackage.m91.r(r0, r2)
            if (r0 == 0) goto L27
            int r0 = r0.intValue()
            r12.setHintTextColor(r0)
        L27:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r2 = ""
            if (r0 == 0) goto L34
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r3 = r0.toLowerCase(r3)
            goto L35
        L34:
            r3 = r2
        L35:
            java.lang.String r4 = "lge"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4d
            if (r0 == 0) goto L45
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r0.toLowerCase(r2)
        L45:
            java.lang.String r0 = "samsung"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L52
        L4d:
            r0 = 17
            r12.setInputType(r0)
        L52:
            java.text.SimpleDateFormat r5 = defpackage.e29.e()
            android.content.res.Resources r0 = r11.getResources()
            java.lang.String r4 = defpackage.e29.f(r0, r5)
            r6.setPlaceholderText(r4)
            java.lang.Long r0 = r10.a
            if (r0 == 0) goto L6c
            java.lang.String r0 = r5.format(r0)
            r12.setText(r0)
        L6c:
            ax7 r2 = new ax7
            r9 = r6
            r3 = r10
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r12.addTextChangedListener(r2)
            android.content.Context r13 = r11.getContext()
            java.lang.String r14 = "accessibility"
            java.lang.Object r13 = r13.getSystemService(r14)
            android.view.accessibility.AccessibilityManager r13 = (android.view.accessibility.AccessibilityManager) r13
            if (r13 == 0) goto L8d
            boolean r13 = r13.isTouchExplorationEnabled()
            if (r13 == 0) goto L8d
            return r11
        L8d:
            r13 = 1
            android.widget.EditText[] r13 = new android.widget.EditText[r13]
            r13[r1] = r12
            defpackage.o40.P(r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.SingleDateSelector.P(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, zj4):android.view.View");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object U0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void e1(long j) {
        this.a = Long.valueOf(j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String y(Context context) {
        Resources resources = context.getResources();
        Long l = this.a;
        if (l == null) {
            return resources.getString(ft6.mtrl_picker_date_header_unselected);
        }
        return resources.getString(ft6.mtrl_picker_date_header_selected, jr9.r(l.longValue(), Locale.getDefault()));
    }
}
