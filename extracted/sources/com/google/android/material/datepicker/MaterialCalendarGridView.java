package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.bl0;
import defpackage.e29;
import defpackage.h16;
import defpackage.hw1;
import defpackage.q69;
import defpackage.qr6;
import defpackage.vp6;
import defpackage.yb;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar a;
    public final boolean b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final n a() {
        return (n) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((n) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int width;
        int iA2;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        n nVar = (n) super.getAdapter();
        DateSelector dateSelector = nVar.b;
        Month month = nVar.a;
        bl0 bl0Var = nVar.d;
        int iMax = Math.max(nVar.a(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(nVar.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = nVar.getItem(iMax);
        Long item2 = nVar.getItem(iMin);
        Iterator it = dateSelector.D().iterator();
        while (it.hasNext()) {
            h16 h16Var = (h16) it.next();
            Object obj = h16Var.a;
            Object obj2 = h16Var.b;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (obj2 != null) {
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                Long l2 = (Long) obj2;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    month = month;
                    it = it;
                    nVar = nVar;
                } else {
                    boolean z = materialCalendarGridView.getLayoutDirection() == 1;
                    long jLongValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.a;
                    if (jLongValue < jLongValue3) {
                        width = iMax % month.d == 0 ? 0 : !z ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                        iA = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iA = nVar.a() + (calendar.get(5) - 1);
                        View viewB = materialCalendarGridView.b(iA);
                        width = (viewB.getWidth() / 2) + viewB.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        width2 = (iMin + 1) % month.d == 0 ? materialCalendarGridView.getWidth() : !z ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                        iA2 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iA2 = nVar.a() + (calendar.get(5) - 1);
                        View viewB2 = materialCalendarGridView.b(iA2);
                        width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                    }
                    int itemId = (int) nVar.getItemId(iA);
                    Iterator it2 = it;
                    Month month2 = month;
                    int itemId2 = (int) nVar.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        n nVar2 = nVar;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewB3 = materialCalendarGridView.b(numColumns);
                        int top = viewB3.getTop() + ((Rect) ((yb) bl0Var.a).b).top;
                        int i2 = itemId2;
                        int bottom = viewB3.getBottom() - ((Rect) ((yb) bl0Var.a).b).bottom;
                        if (z) {
                            int i3 = iA2 > numColumns2 ? 0 : width2;
                            int width4 = numColumns > iA ? getWidth() : width;
                            i = i3;
                            width3 = width4;
                        } else {
                            i = numColumns > iA ? 0 : width;
                            width3 = iA2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top, width3, bottom, (Paint) bl0Var.h);
                        itemId++;
                        materialCalendarGridView = this;
                        nVar = nVar2;
                        itemId2 = i2;
                    }
                    materialCalendarGridView = this;
                    month = month2;
                    it = it2;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((n) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((n) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((n) super.getAdapter()).a() && selectedItemPosition <= ((n) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((n) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((n) super.getAdapter()).a()) {
            super.setSelection(((n) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = e29.i(null);
        if (MaterialDatePicker.I0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(qr6.cancel_button);
            setNextFocusRightId(qr6.confirm_button);
        }
        this.b = MaterialDatePicker.I0(getContext(), vp6.nestedScrollable);
        q69.q(this, new hw1(3));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof n)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
