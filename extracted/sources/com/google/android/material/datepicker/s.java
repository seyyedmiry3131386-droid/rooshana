package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.bl0;
import defpackage.e29;
import defpackage.ft6;
import defpackage.is6;
import defpackage.vg9;
import defpackage.yb;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.recyclerview.widget.g {
    public final MaterialCalendar d;

    public s(MaterialCalendar materialCalendar) {
        this.d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        return this.d.D0.f;
    }

    @Override // androidx.recyclerview.widget.g
    public final void l(androidx.recyclerview.widget.o oVar, int i) {
        MaterialCalendar materialCalendar = this.d;
        int i2 = materialCalendar.D0.a.c + i;
        TextView textView = ((vg9) oVar).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(e29.h().get(1) == i2 ? String.format(context.getString(ft6.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(ft6.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        bl0 bl0Var = materialCalendar.H0;
        Calendar calendarH = e29.h();
        yb ybVar = (yb) (calendarH.get(1) == i2 ? bl0Var.f : bl0Var.d);
        Iterator it = materialCalendar.C0.N0().iterator();
        while (it.hasNext()) {
            calendarH.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarH.get(1) == i2) {
                ybVar = (yb) bl0Var.e;
            }
        }
        ybVar.z(textView);
        textView.setSelected(ybVar == ((yb) bl0Var.e));
        textView.setOnClickListener(new r(this, i2));
    }

    @Override // androidx.recyclerview.widget.g
    public final androidx.recyclerview.widget.o n(ViewGroup viewGroup, int i) {
        return new vg9((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(is6.mtrl_calendar_year, viewGroup, false));
    }
}
