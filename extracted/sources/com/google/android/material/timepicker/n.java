package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class n extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView a;

    public n(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        MaterialTimePicker materialTimePicker = this.a.x;
        if (materialTimePicker == null) {
            return false;
        }
        materialTimePicker.j1 = 1;
        materialTimePicker.G0(materialTimePicker.h1);
        materialTimePicker.X0.d();
        return true;
    }
}
