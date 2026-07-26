package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class r implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public r(s sVar, int i) {
        this.b = sVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.b.d;
        Month monthA = Month.a(this.a, materialCalendar.F0.b);
        CalendarConstraints calendarConstraints = materialCalendar.D0;
        Month month = calendarConstraints.b;
        Month month2 = calendarConstraints.a;
        Calendar calendar = monthA.a;
        if (calendar.compareTo(month2.a) < 0) {
            monthA = month2;
        } else if (calendar.compareTo(month.a) > 0) {
            monthA = month;
        }
        materialCalendar.A0(monthA);
        materialCalendar.B0(MaterialCalendar.CalendarSelector.a);
        MaterialButton materialButton = materialCalendar.O0;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
