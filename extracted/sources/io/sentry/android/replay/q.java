package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import io.sentry.SentryLevel;
import io.sentry.b6;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ViewTreeObserver.OnDrawListener {
    public final b6 a;
    public WeakReference b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final io.sentry.android.replay.screenshot.g e;

    public q(b6 b6Var, ReplayIntegration replayIntegration, r rVar, x xVar) {
        io.sentry.android.replay.screenshot.g cVar;
        js3.p(xVar, "executorProvider");
        this.a = b6Var;
        this.c = new AtomicBoolean(true);
        io.sentry.android.replay.util.a aVar = new io.sentry.android.replay.util.a();
        this.d = new AtomicBoolean(false);
        int i = p.a[b6Var.getSessionReplay().n.ordinal()];
        if (i == 1) {
            cVar = new io.sentry.android.replay.screenshot.c(b6Var, replayIntegration, rVar, xVar);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new io.sentry.android.replay.screenshot.f(xVar, replayIntegration, b6Var, rVar, aVar, new bp2() { // from class: io.sentry.android.replay.ScreenshotRecorder$screenshotStrategy$1
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    this.g.d.set(true);
                    return tx8.a;
                }
            });
        }
        this.e = cVar;
    }

    public final void a(View view) {
        js3.p(view, "root");
        WeakReference weakReference = this.b;
        c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.b = new WeakReference(view);
        io.sentry.android.replay.util.h.a(view, this);
        this.d.set(true);
        this.e.onContentChanged();
    }

    public final void b() {
        b6 b6Var = this.a;
        boolean z = b6Var.getSessionReplay().m;
        AtomicBoolean atomicBoolean = this.c;
        if (z) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (b6Var.getSessionReplay().m) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z2 = b6Var.getSessionReplay().m;
        io.sentry.android.replay.screenshot.g gVar = this.e;
        AtomicBoolean atomicBoolean2 = this.d;
        if (z2) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(gVar.a()));
        }
        if (!atomicBoolean2.get()) {
            gVar.c();
            return;
        }
        WeakReference weakReference = this.b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (io.sentry.config.a.F(view) == null) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            gVar.b(view);
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.WARNING, "Failed to capture replay recording", th);
        }
    }

    public final void c(View view) {
        this.a.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.c.get()) {
            WeakReference weakReference = this.b;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.a.getLogger().i(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.d.set(true);
                this.e.onContentChanged();
            }
        }
    }
}
