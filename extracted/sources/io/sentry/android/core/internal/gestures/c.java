package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.sentry.r;
import io.sentry.util.AutoClosableReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final f a;
    public final int b;
    public final int c;
    public final int d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public MotionEvent k;
    public VelocityTracker l;
    public final AutoClosableReentrantLock m = new AutoClosableReentrantLock();

    public c(Context context, f fVar) {
        this.a = fVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.b = scaledTouchSlop * scaledTouchSlop;
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void a() {
        r rVarA = this.m.a();
        try {
            MotionEvent motionEvent = this.k;
            this.k = null;
            VelocityTracker velocityTracker = this.l;
            this.l = null;
            rVarA.close();
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            if (velocityTracker != null) {
                velocityTracker.recycle();
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
}
