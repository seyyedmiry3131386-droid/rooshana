package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.e29;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ MaterialCalendar c;

    public /* synthetic */ h(MaterialCalendar materialCalendar, q qVar, int i) {
        this.a = i;
        this.c = materialCalendar;
        this.b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MaterialCalendar materialCalendar = this.c;
                int iT0 = ((LinearLayoutManager) materialCalendar.J0.getLayoutManager()).T0() - 1;
                Calendar calendarD = e29.d(this.b.d.a.a);
                calendarD.add(2, iT0);
                materialCalendar.A0(new Month(calendarD));
                break;
            default:
                MaterialCalendar materialCalendar2 = this.c;
                int iR0 = ((LinearLayoutManager) materialCalendar2.J0.getLayoutManager()).R0() + 1;
                Calendar calendarD2 = e29.d(this.b.d.a.a);
                calendarD2.add(2, iR0);
                materialCalendar2.A0(new Month(calendarD2));
                break;
        }
    }
}
