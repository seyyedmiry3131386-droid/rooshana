package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import defpackage.bl0;
import defpackage.e29;
import defpackage.h16;
import defpackage.jr9;
import defpackage.yb;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n extends BaseAdapter {
    public static final int g = e29.i(null).getMaximum(4);
    public static final int h = (e29.i(null).getMaximum(7) + e29.i(null).getMaximum(5)) - 1;
    public final Month a;
    public final DateSelector b;
    public Collection c;
    public bl0 d;
    public final CalendarConstraints e;
    public final DayViewDecorator f;

    public n(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.a = month;
        this.b = dateSelector;
        this.e = calendarConstraints;
        this.f = dayViewDecorator;
        this.c = dateSelector.N0();
    }

    public final int a() {
        int firstDayOfWeek = this.e.e;
        Month month = this.a;
        Calendar calendar = month.a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.d : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarD = e29.d(this.a.a);
        calendarD.set(5, iA);
        return Long.valueOf(calendarD.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.e) - 1;
    }

    public final void d(TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        yb ybVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z3 = true;
        boolean z4 = e29.h().getTimeInMillis() == j;
        DateSelector dateSelector = this.b;
        Iterator it = dateSelector.D().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((h16) it.next()).a;
            if (obj != null && ((Long) obj).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = dateSelector.D().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj2 = ((h16) it2.next()).b;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z2 = true;
                break;
            }
        }
        String strK = jr9.k(context, j, z4, z, z2);
        textView.setContentDescription(strK);
        if (this.e.c.H0(j)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.N0().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (e29.a(j) == e29.a(((Long) it3.next()).longValue())) {
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            ybVar = z3 ? (yb) this.d.b : e29.h().getTimeInMillis() == j ? (yb) this.d.c : (yb) this.d.a;
        } else {
            textView.setEnabled(false);
            ybVar = (yb) this.d.g;
        }
        if (this.f == null || i == -1) {
            ybVar.z(textView);
            return;
        }
        int i2 = this.a.c;
        ybVar.z(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(strK);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month monthB = Month.b(j);
        Month month = this.a;
        if (monthB.equals(month)) {
            Calendar calendarD = e29.d(month.a);
            calendarD.setTimeInMillis(j);
            int i = calendarD.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            bl0 r1 = r5.d
            if (r1 != 0) goto Lf
            bl0 r1 = new bl0
            r1.<init>(r0)
            r5.d = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L26
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = defpackage.is6.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r7 = r5.a()
            int r7 = r6 - r7
            if (r7 < 0) goto L5c
            com.google.android.material.datepicker.Month r8 = r5.a
            int r2 = r8.e
            if (r7 < r2) goto L35
            goto L5c
        L35:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5c:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L65:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6c
            return r0
        L6c:
            long r1 = r6.longValue()
            r5.d(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
