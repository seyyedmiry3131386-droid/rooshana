package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.d1;
import io.sentry.android.core.j0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ViewTreeObserver.OnDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final Runnable c;

    public j(View view, Runnable runnable) {
        this.b = new AtomicReference(view);
        this.c = runnable;
    }

    public static void a(Activity activity2, Runnable runnable, j0 j0Var) {
        Window window = activity2.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                b(viewPeekDecorView, runnable, j0Var);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.i(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new d1(window, callback, runnable, j0Var, 1)));
            }
        }
    }

    public static void b(View view, Runnable runnable, j0 j0Var) {
        j jVar = new j(view, runnable);
        j0Var.getClass();
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(jVar);
        } else {
            view.addOnAttachStateChangeListener(new i(jVar));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.h
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                j jVar = this.a;
                jVar.getClass();
                view.getViewTreeObserver().removeOnDrawListener(jVar);
            }
        });
        this.a.postAtFrontOfQueue(this.c);
    }
}
