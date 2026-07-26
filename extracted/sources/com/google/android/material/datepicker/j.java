package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.e29;
import defpackage.h16;
import defpackage.yb;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.recyclerview.widget.h {
    public final Calendar a = e29.i(null);
    public final Calendar b = e29.i(null);
    public final /* synthetic */ MaterialCalendar c;

    public j(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.h
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            s sVar = (s) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.c;
            for (h16 h16Var : materialCalendar.C0.D()) {
                Object obj = h16Var.a;
                Object obj2 = h16Var.b;
                if (obj != null && obj2 != null) {
                    long jLongValue = ((Long) obj).longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) obj2).longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - sVar.d.D0.a.c;
                    int i2 = calendar2.get(1) - sVar.d.D0.a.c;
                    View viewR = gridLayoutManager.r(i);
                    View viewR2 = gridLayoutManager.r(i2);
                    int i3 = gridLayoutManager.F;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View viewR3 = gridLayoutManager.r(gridLayoutManager.F * i6);
                        if (viewR3 != null) {
                            int top = viewR3.getTop() + ((Rect) ((yb) materialCalendar.H0.d).b).top;
                            int bottom = viewR3.getBottom() - ((Rect) ((yb) materialCalendar.H0.d).b).bottom;
                            canvas.drawRect((i6 != i4 || viewR == null) ? 0 : (viewR.getWidth() / 2) + viewR.getLeft(), top, (i6 != i5 || viewR2 == null) ? recyclerView.getWidth() : (viewR2.getWidth() / 2) + viewR2.getLeft(), bottom, (Paint) materialCalendar.H0.h);
                        }
                    }
                }
            }
        }
    }
}
