package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class py4 {
    public static final py4 a = new py4();

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
