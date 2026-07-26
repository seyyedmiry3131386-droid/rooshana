package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.view.Window;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.a) {
            case 0:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.b;
                AtomicReference atomicReference = (AtomicReference) this.c;
                Activity activity2 = (Activity) this.d;
                countDownLatch = (CountDownLatch) this.e;
                screenshotEventProcessor.getClass();
                try {
                    atomicReference.set(screenshotEventProcessor.a(activity2));
                    return;
                } finally {
                }
            case 1:
                Window window = (Window) this.b;
                Window.Callback callback = (Window.Callback) this.c;
                Runnable runnable = (Runnable) this.d;
                j0 j0Var = (j0) this.e;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback(callback);
                    io.sentry.android.core.internal.util.j.b(viewPeekDecorView, runnable, j0Var);
                    return;
                }
                return;
            default:
                View view = (View) this.b;
                Canvas canvas = (Canvas) this.c;
                io.sentry.u0 u0Var = (io.sentry.u0) this.d;
                countDownLatch = (CountDownLatch) this.e;
                try {
                    view.draw(canvas);
                    break;
                } finally {
                    try {
                    } finally {
                    }
                    break;
                }
                return;
        }
    }
}
