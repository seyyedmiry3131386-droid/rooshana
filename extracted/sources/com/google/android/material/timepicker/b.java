package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.h3;
import defpackage.o3;
import defpackage.qr6;
import defpackage.s3;
import defpackage.t3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h3 {
    public final /* synthetic */ ClockFaceView d;

    public b(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // defpackage.h3
    public final void d(View view, t3 t3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t3Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(qr6.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.d.x.get(iIntValue - 1));
        }
        t3Var.o(s3.a(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        t3Var.b(o3.g);
    }

    @Override // defpackage.h3
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.d;
        view.getHitRect(clockFaceView.u);
        float fCenterX = clockFaceView.u.centerX();
        float fCenterY = clockFaceView.u.centerY();
        clockFaceView.t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
