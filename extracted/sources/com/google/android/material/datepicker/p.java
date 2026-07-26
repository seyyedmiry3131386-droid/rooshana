package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.d69;
import defpackage.q69;
import defpackage.qr6;
import defpackage.xr6;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.recyclerview.widget.o {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public p(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(qr6.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = q69.a;
        new d69(xr6.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(qr6.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
