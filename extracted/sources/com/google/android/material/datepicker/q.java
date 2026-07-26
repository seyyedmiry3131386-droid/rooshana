package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.e29;
import defpackage.is6;
import defpackage.oq6;
import defpackage.qr6;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.recyclerview.widget.g {
    public final CalendarConstraints d;
    public final DateSelector e;
    public final DayViewDecorator f;
    public final i g;
    public final int h;

    public q(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, i iVar) {
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.d;
        if (month.a.compareTo(month3.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.a.compareTo(month2.a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.h = (contextThemeWrapper.getResources().getDimensionPixelSize(oq6.mtrl_calendar_day_height) * n.g) + (MaterialDatePicker.I0(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(oq6.mtrl_calendar_day_height) : 0);
        this.d = calendarConstraints;
        this.e = dateSelector;
        this.f = dayViewDecorator;
        this.g = iVar;
        u(true);
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        return this.d.g;
    }

    @Override // androidx.recyclerview.widget.g
    public final long d(int i) {
        Calendar calendarD = e29.d(this.d.a.a);
        calendarD.add(2, i);
        return new Month(calendarD).a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.g
    public final void l(androidx.recyclerview.widget.o oVar, int i) {
        p pVar = (p) oVar;
        CalendarConstraints calendarConstraints = this.d;
        Calendar calendarD = e29.d(calendarConstraints.a.a);
        calendarD.add(2, i);
        Month month = new Month(calendarD);
        pVar.u.setText(month.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) pVar.v.findViewById(qr6.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().a)) {
            n nVar = new n(month, this.e, calendarConstraints, this.f);
            materialCalendarGridView.setNumColumns(month.d);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            n nVarA = materialCalendarGridView.a();
            DateSelector dateSelector = nVarA.b;
            Iterator it = nVarA.c.iterator();
            while (it.hasNext()) {
                nVarA.e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (dateSelector != null) {
                Iterator it2 = dateSelector.N0().iterator();
                while (it2.hasNext()) {
                    nVarA.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                nVarA.c = dateSelector.N0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new o(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.g
    public final androidx.recyclerview.widget.o n(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(is6.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.I0(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new p(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.h));
        return new p(linearLayout, true);
    }
}
