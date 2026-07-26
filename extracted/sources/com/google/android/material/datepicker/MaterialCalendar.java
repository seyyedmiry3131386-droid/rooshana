package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.bl0;
import defpackage.bm0;
import defpackage.cs6;
import defpackage.h76;
import defpackage.hw1;
import defpackage.is6;
import defpackage.mz5;
import defpackage.n90;
import defpackage.oq6;
import defpackage.q69;
import defpackage.qr6;
import defpackage.rb1;
import defpackage.sj4;
import defpackage.zj4;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends h76 {
    public int B0;
    public DateSelector C0;
    public CalendarConstraints D0;
    public DayViewDecorator E0;
    public Month F0;
    public CalendarSelector G0;
    public bl0 H0;
    public RecyclerView I0;
    public RecyclerView J0;
    public View K0;
    public View L0;
    public View M0;
    public View N0;
    public MaterialButton O0;
    public AccessibilityManager P0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CalendarSelector {
        public static final CalendarSelector a;
        public static final CalendarSelector b;
        public static final /* synthetic */ CalendarSelector[] c;

        static {
            CalendarSelector calendarSelector = new CalendarSelector("DAY", 0);
            a = calendarSelector;
            CalendarSelector calendarSelector2 = new CalendarSelector("YEAR", 1);
            b = calendarSelector2;
            c = new CalendarSelector[]{calendarSelector, calendarSelector2};
        }

        public static CalendarSelector valueOf(String str) {
            return (CalendarSelector) Enum.valueOf(CalendarSelector.class, str);
        }

        public static CalendarSelector[] values() {
            return (CalendarSelector[]) c.clone();
        }
    }

    public final void A0(Month month) {
        q qVar = (q) this.J0.getAdapter();
        int iD = qVar.d.a.d(month);
        AccessibilityManager accessibilityManager = this.P0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - qVar.d.a.d(this.F0);
            boolean z = Math.abs(iD2) > 3;
            boolean z2 = iD2 > 0;
            this.F0 = month;
            if (z && z2) {
                this.J0.k0(iD - 3);
                this.J0.post(new bm0(iD, 2, this));
            } else if (z) {
                this.J0.k0(iD + 3);
                this.J0.post(new bm0(iD, 2, this));
            } else {
                this.J0.post(new bm0(iD, 2, this));
            }
        } else {
            this.F0 = month;
            this.J0.k0(iD);
        }
        C0(iD);
    }

    public final void B0(CalendarSelector calendarSelector) {
        this.G0 = calendarSelector;
        if (calendarSelector == CalendarSelector.b) {
            this.I0.getLayoutManager().t0(this.F0.c - ((s) this.I0.getAdapter()).d.D0.a.c);
            this.M0.setVisibility(0);
            this.N0.setVisibility(8);
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.a) {
            this.M0.setVisibility(8);
            this.N0.setVisibility(0);
            this.K0.setVisibility(0);
            this.L0.setVisibility(0);
            A0(this.F0);
        }
    }

    public final void C0(int i) {
        this.L0.setEnabled(i + 1 < this.J0.getAdapter().c());
        this.K0.setEnabled(i - 1 >= 0);
    }

    @Override // androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.B0 = bundle.getInt("THEME_RES_ID_KEY");
        this.C0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.D0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.E0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.F0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(H(), this.B0);
        this.H0 = new bl0(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.P0 = (AccessibilityManager) q0().getSystemService("accessibility");
        Month month = this.D0.a;
        if (MaterialDatePicker.I0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = is6.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = is6.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = q0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(oq6.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(oq6.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(oq6.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(oq6.mtrl_calendar_days_of_week_height);
        int i3 = n.g;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(oq6.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(oq6.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(oq6.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(qr6.mtrl_calendar_days_of_week);
        q69.q(gridView, new hw1(1));
        int i4 = this.D0.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new rb1(i4) : new rb1()));
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.J0 = (RecyclerView) viewInflate.findViewById(qr6.mtrl_calendar_months);
        this.J0.setLayoutManager(new sj4(this, i2, i2));
        this.J0.setTag("MONTHS_VIEW_GROUP_TAG");
        q qVar = new q(contextThemeWrapper, this.C0, this.D0, this.E0, new i(this));
        this.J0.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(cs6.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(qr6.mtrl_calendar_year_selector_frame);
        this.I0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.I0.setLayoutManager(new GridLayoutManager(integer, 1));
            this.I0.setAdapter(new s(this));
            this.I0.i(new j(this));
        }
        View viewFindViewById = viewInflate.findViewById(qr6.month_navigation_fragment_toggle);
        CalendarConstraints calendarConstraints = qVar.d;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(qr6.month_navigation_fragment_toggle);
            this.O0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            q69.q(this.O0, new n90(5, this));
            View viewFindViewById2 = viewInflate.findViewById(qr6.month_navigation_previous);
            this.K0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(qr6.month_navigation_next);
            this.L0 = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.M0 = viewInflate.findViewById(qr6.mtrl_calendar_year_selector_frame);
            this.N0 = viewInflate.findViewById(qr6.mtrl_calendar_day_selector_frame);
            B0(CalendarSelector.a);
            this.O0.setText(this.F0.c());
            this.J0.j(new k(this, qVar));
            this.O0.setOnClickListener(new l(this));
            this.L0.setOnClickListener(new h(this, qVar, 1));
            this.K0.setOnClickListener(new h(this, qVar, 0));
            C0(calendarConstraints.a.d(this.F0));
        }
        if (!MaterialDatePicker.I0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new mz5().a(this.J0);
        }
        this.J0.k0(calendarConstraints.a.d(this.F0));
        q69.q(this.J0, new hw1(2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.B0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.C0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.D0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.E0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.F0);
    }

    @Override // defpackage.h76
    public final void z0(zj4 zj4Var) {
        this.A0.add(zj4Var);
    }
}
