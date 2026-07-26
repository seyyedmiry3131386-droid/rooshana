package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;
import defpackage.ft6;

/* JADX INFO: loaded from: classes.dex */
public final class l implements View.OnClickListener {
    public final /* synthetic */ MaterialCalendar a;

    public l(MaterialCalendar materialCalendar) {
        this.a = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.a;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.G0;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.a;
        MaterialCalendar.CalendarSelector calendarSelector3 = MaterialCalendar.CalendarSelector.b;
        if (calendarSelector == calendarSelector3) {
            materialCalendar.B0(calendarSelector2);
            materialCalendar.J0.announceForAccessibility(materialCalendar.L(ft6.mtrl_picker_toggled_to_day_selection));
        } else if (calendarSelector == calendarSelector2) {
            materialCalendar.B0(calendarSelector3);
            materialCalendar.I0.announceForAccessibility(materialCalendar.L(ft6.mtrl_picker_toggled_to_year_selection));
        }
    }
}
