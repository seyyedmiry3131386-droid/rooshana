package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public a(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.t.k) - clockFaceView.B;
        if (height != clockFaceView.r) {
            clockFaceView.r = height;
            clockFaceView.t();
            ClockHandView clockHandView = clockFaceView.t;
            clockHandView.t = clockFaceView.r;
            clockHandView.invalidate();
        }
        return true;
    }
}
