package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.Window;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.r;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i {
    public final Window.Callback b;
    public final f c;
    public final c d;
    public final b6 e;
    public final io.sentry.hints.i f;
    public volatile boolean g;

    public g(Window.Callback callback, Activity activity2, f fVar, b6 b6Var) {
        c cVar = new c(activity2, fVar);
        io.sentry.hints.i iVar = new io.sentry.hints.i();
        super(callback);
        this.b = callback;
        this.c = fVar;
        this.e = b6Var;
        this.d = cVar;
        this.f = iVar;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.g) {
            return;
        }
        c cVar = this.d;
        int i = cVar.c;
        f fVar = cVar.a;
        r rVarA = cVar.m.a();
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (cVar.l == null) {
                cVar.l = VelocityTracker.obtain();
            }
            cVar.l.addMovement(motionEvent);
            if (actionMasked == 0) {
                cVar.g = motionEvent.getX();
                float y = motionEvent.getY();
                cVar.h = y;
                cVar.i = cVar.g;
                cVar.j = y;
                cVar.e = true;
                cVar.f = false;
                MotionEvent motionEvent2 = cVar.k;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                cVar.k = MotionEvent.obtain(motionEvent);
                fVar.onDown(motionEvent);
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x - cVar.g;
                    float f2 = y2 - cVar.h;
                    if ((f2 * f2) + (f * f) > cVar.b) {
                        fVar.onScroll(cVar.k, motionEvent, cVar.i - x, cVar.j - y2);
                        cVar.e = false;
                        cVar.i = x;
                        cVar.j = y2;
                    }
                } else if (actionMasked == 3) {
                    cVar.a();
                } else if (actionMasked == 5) {
                    cVar.e = false;
                    cVar.f = true;
                }
            } else if (cVar.f) {
                cVar.a();
            } else {
                if (cVar.e) {
                    fVar.onSingleTapUp(motionEvent);
                } else {
                    int pointerId = motionEvent.getPointerId(0);
                    cVar.l.computeCurrentVelocity(1000, cVar.d);
                    float xVelocity = cVar.l.getXVelocity(pointerId);
                    float yVelocity = cVar.l.getYVelocity(pointerId);
                    float f3 = i;
                    if (Math.abs(xVelocity) > f3 || Math.abs(yVelocity) > f3) {
                        fVar.onFling(cVar.k, motionEvent, xVelocity, yVelocity);
                    }
                }
                cVar.a();
            }
            rVarA.close();
            if (motionEvent.getActionMasked() == 1) {
                f fVar2 = this.c;
                View viewB = fVar2.b("onUp");
                e eVar = fVar2.g;
                io.sentry.internal.gestures.b bVar = eVar.b;
                if (viewB == null || bVar == null) {
                    return;
                }
                SentryGestureListener$GestureType sentryGestureListener$GestureType = eVar.a;
                SentryGestureListener$GestureType sentryGestureListener$GestureType2 = SentryGestureListener$GestureType.Unknown;
                if (sentryGestureListener$GestureType == sentryGestureListener$GestureType2) {
                    fVar2.c.getLogger().i(SentryLevel.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                    return;
                }
                float x2 = motionEvent.getX() - eVar.c;
                float y3 = motionEvent.getY() - eVar.d;
                fVar2.a(bVar, eVar.a, Collections.singletonMap("direction", Math.abs(x2) > Math.abs(y3) ? x2 > 0.0f ? "right" : "left" : y3 > 0.0f ? "down" : "up"), motionEvent);
                fVar2.c(bVar, eVar.a);
                eVar.b = null;
                eVar.a = sentryGestureListener$GestureType2;
                eVar.c = 0.0f;
                eVar.d = 0.0f;
            }
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b6 b6Var;
        if (motionEvent != null) {
            this.f.getClass();
            try {
                a(MotionEvent.obtain(motionEvent));
            } finally {
                if (b6Var != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.a.dispatchTouchEvent(motionEvent);
    }
}
