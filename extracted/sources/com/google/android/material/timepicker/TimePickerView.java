package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import defpackage.is6;
import defpackage.j94;
import defpackage.qr6;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public final Chip q;
    public final Chip r;
    public final ClockHandView s;
    public final ClockFaceView t;
    public final MaterialButtonToggleGroup u;
    public g v;
    public g w;
    public MaterialTimePicker x;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.r.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m mVar = new m(this);
        LayoutInflater.from(context).inflate(is6.material_timepicker, this);
        this.t = (ClockFaceView) findViewById(qr6.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(qr6.material_clock_period_toggle);
        this.u = materialButtonToggleGroup;
        materialButtonToggleGroup.l.add(new i(1, this));
        Chip chip = (Chip) findViewById(qr6.material_minute_tv);
        this.q = chip;
        Chip chip2 = (Chip) findViewById(qr6.material_hour_tv);
        this.r = chip2;
        this.s = (ClockHandView) findViewById(qr6.material_clock_hand);
        j94 j94Var = new j94(1, new GestureDetector(getContext(), new n(this)));
        chip.setOnTouchListener(j94Var);
        chip2.setOnTouchListener(j94Var);
        chip.setTag(qr6.selection_type, 12);
        chip2.setTag(qr6.selection_type, 10);
        chip.setOnClickListener(mVar);
        chip2.setOnClickListener(mVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }
}
