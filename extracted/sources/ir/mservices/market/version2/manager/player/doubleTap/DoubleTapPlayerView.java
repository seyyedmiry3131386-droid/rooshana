package ir.mservices.market.version2.manager.player.doubleTap;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.ui.PlayerView;
import defpackage.b7;
import defpackage.bu6;
import defpackage.js3;
import defpackage.kr1;
import defpackage.ql4;
import defpackage.xd6;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes3.dex */
public class DoubleTapPlayerView extends PlayerView {
    public final ql4 H;
    public final kr1 I;
    public final int J;
    public boolean K;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleTapPlayerView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    private final xd6 getController() {
        return this.I.d;
    }

    private final void setController(xd6 xd6Var) {
        this.I.d = xd6Var;
    }

    public final long getDoubleTapDelay() {
        return this.I.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kr1 kr1Var = this.I;
        kr1Var.e = true;
        Handler handler = kr1Var.b;
        b7 b7Var = kr1Var.c;
        handler.removeCallbacks(b7Var);
        handler.postDelayed(b7Var, kr1Var.f);
        int i = this.J;
        if (i != -1) {
            try {
                Object parent = getParent();
                js3.n(parent, "null cannot be cast to non-null type android.view.View");
                KeyEvent.Callback callbackFindViewById = ((View) parent).findViewById(i);
                js3.n(callbackFindViewById, "null cannot be cast to non-null type android.view.View");
                if (callbackFindViewById instanceof xd6) {
                    setController((xd6) callbackFindViewById);
                }
            } catch (Exception e) {
                e.printStackTrace();
                t0.d("DoubleTapPlayerView", "controllerRef is either invalid or not PlayerDoubleTapListener: " + e.getMessage());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kr1 kr1Var = this.I;
        kr1Var.b.removeCallbacks(kr1Var.c);
        kr1Var.e = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        js3.p(motionEvent, "ev");
        if (!this.K) {
            return super.onTouchEvent(motionEvent);
        }
        ((GestureDetector) this.H.b).onTouchEvent(motionEvent);
        return true;
    }

    public final void setDoubleTapDelay(long j) {
        this.I.f = j;
    }

    public final void setDoubleTapEnabled(boolean z) {
        this.K = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleTapPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleTapPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        kr1 kr1Var = new kr1(this);
        this.I = kr1Var;
        this.J = -1;
        this.H = new ql4(context, kr1Var);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu6.DoubleTapPlayerView, 0, 0);
            js3.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.J = typedArrayObtainStyledAttributes.getResourceId(bu6.DoubleTapPlayerView_dtpv_controller, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.K = true;
    }

    public /* synthetic */ DoubleTapPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
