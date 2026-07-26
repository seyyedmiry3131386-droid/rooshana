package androidx.compose.ui.platform;

import android.view.GestureDetector;
import android.view.MotionEvent;
import defpackage.cf0;
import defpackage.dp2;

/* JADX INFO: loaded from: classes.dex */
public final class n implements GestureDetector.OnGestureListener {
    public final /* synthetic */ cf0 a;

    public n(cf0 cf0Var) {
        this.a = cf0Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        cf0 cf0Var = this.a;
        dp2 dp2Var = (dp2) cf0Var.d;
        if (!cf0Var.c) {
            int i = cf0Var.b;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((androidx.compose.ui.focus.c) ((AndroidComposeView$indirectPointerNavigationGestureDetector$1) dp2Var).g.getFocusOwner()).g(f > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((androidx.compose.ui.focus.c) ((AndroidComposeView$indirectPointerNavigationGestureDetector$1) dp2Var).g.getFocusOwner()).g(f2 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
