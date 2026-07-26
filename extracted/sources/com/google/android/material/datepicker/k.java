package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.e29;
import defpackage.uz6;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class k extends uz6 {
    public final /* synthetic */ q a;
    public final /* synthetic */ MaterialCalendar b;

    public k(MaterialCalendar materialCalendar, q qVar) {
        this.b = materialCalendar;
        this.a = qVar;
    }

    @Override // defpackage.uz6
    public final void b(RecyclerView recyclerView, int i, int i2) {
        CalendarConstraints calendarConstraints = this.a.d;
        MaterialCalendar materialCalendar = this.b;
        int iR0 = i < 0 ? ((LinearLayoutManager) materialCalendar.J0.getLayoutManager()).R0() : ((LinearLayoutManager) materialCalendar.J0.getLayoutManager()).T0();
        Calendar calendarD = e29.d(calendarConstraints.a.a);
        calendarD.add(2, iR0);
        Month month = new Month(calendarD);
        materialCalendar.F0 = month;
        MaterialButton materialButton = materialCalendar.O0;
        Calendar calendarD2 = e29.d(calendarConstraints.a.a);
        calendarD2.add(2, iR0);
        materialButton.setText(new Month(calendarD2).c());
        materialCalendar.C0(calendarConstraints.a.d(month));
    }
}
