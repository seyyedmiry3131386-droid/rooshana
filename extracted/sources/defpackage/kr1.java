package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import ir.mservices.market.version2.manager.player.doubleTap.DoubleTapPlayerView;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.PlayerOverlay;

/* JADX INFO: loaded from: classes3.dex */
public final class kr1 extends GestureDetector.SimpleOnGestureListener {
    public final DoubleTapPlayerView a;
    public xd6 d;
    public boolean e;
    public final Handler b = new Handler();
    public final b7 c = new b7(21, this);
    public long f = 650;

    public kr1(DoubleTapPlayerView doubleTapPlayerView) {
        this.a = doubleTapPlayerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        DoubleTapPlayerView doubleTapPlayerView;
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        if (!this.e) {
            this.e = true;
            Handler handler = this.b;
            b7 b7Var = this.c;
            handler.removeCallbacks(b7Var);
            handler.postDelayed(b7Var, this.f);
            xd6 xd6Var = this.d;
            if (xd6Var != null) {
                float x = motionEvent.getX();
                motionEvent.getY();
                PlayerOverlay playerOverlay = (PlayerOverlay) xd6Var;
                e62 e62Var = playerOverlay.v;
                if (e62Var != null && (doubleTapPlayerView = playerOverlay.u) != null && playerOverlay.w != null) {
                    js3.m(doubleTapPlayerView);
                    wv8.Q(e62Var, doubleTapPlayerView, x);
                }
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        if (motionEvent.getActionMasked() != 1 || !this.e) {
            return super.onDoubleTapEvent(motionEvent);
        }
        xd6 xd6Var = this.d;
        if (xd6Var != null) {
            ((PlayerOverlay) xd6Var).u(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        if (!this.e) {
            return super.onDown(motionEvent);
        }
        if (this.d == null) {
            return true;
        }
        motionEvent.getX();
        motionEvent.getY();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        if (this.e) {
            return true;
        }
        return this.a.performClick();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        if (!this.e) {
            return super.onSingleTapUp(motionEvent);
        }
        xd6 xd6Var = this.d;
        if (xd6Var == null) {
            return true;
        }
        ((PlayerOverlay) xd6Var).u(motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
