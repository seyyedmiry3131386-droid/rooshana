package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class wj2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj2 b;

    public /* synthetic */ wj2(xj2 xj2Var, int i) {
        this.a = i;
        this.b = xj2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                xj2 xj2Var = this.b;
                xj2Var.a();
                View view = xj2Var.d;
                if (view.isEnabled() && !view.isLongClickable() && xj2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    xj2Var.g = true;
                    break;
                }
                break;
        }
    }
}
