package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import defpackage.dp2;
import defpackage.js3;
import defpackage.m91;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.f2;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Closeable, d {
    public final b6 a;
    public final ReplayIntegration b;
    public final ReplayIntegration c;
    public final f2 d;
    public final ScheduledExecutorService e;
    public final AtomicBoolean f;
    public final ArrayList g;
    public final Point h;
    public final WeakHashMap i;
    public final AutoClosableReentrantLock j;
    public final AutoClosableReentrantLock k;
    public final AutoClosableReentrantLock l;
    public volatile v m;
    public volatile HandlerThread n;
    public volatile Handler o;

    public x(b6 b6Var, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, f2 f2Var, io.sentry.android.replay.util.d dVar) {
        js3.p(f2Var, "mainLooperHandler");
        js3.p(dVar, "replayExecutor");
        this.a = b6Var;
        this.b = replayIntegration;
        this.c = replayIntegration2;
        this.d = f2Var;
        this.e = dVar;
        this.f = new AtomicBoolean(false);
        this.g = new ArrayList();
        this.h = new Point();
        this.i = new WeakHashMap();
        this.j = new AutoClosableReentrantLock();
        this.k = new AutoClosableReentrantLock();
        this.l = new AutoClosableReentrantLock();
    }

    @Override // io.sentry.android.replay.d
    public final void b(final View view, boolean z) throws Exception {
        q qVar;
        q qVar2;
        q qVar3;
        js3.p(view, "root");
        io.sentry.r rVarA = this.j.a();
        try {
            if (!z) {
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.i.remove(view);
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                v vVar = this.m;
                if (vVar != null && (qVar2 = vVar.c) != null) {
                    qVar2.c(view);
                }
                kotlin.collections.a.B0(new dp2() { // from class: io.sentry.android.replay.WindowRecorder$onRootViewsChanged$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        WeakReference weakReference = (WeakReference) obj;
                        js3.p(weakReference, "it");
                        return Boolean.valueOf(js3.i(weakReference.get(), view));
                    }
                }, this.g);
                WeakReference weakReference = (WeakReference) kotlin.collections.a.v0(this.g);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    v vVar2 = this.m;
                    if (vVar2 != null && (qVar = vVar2.c) != null) {
                        qVar.a(view2);
                    }
                    d(view2);
                    WeakHashMap weakHashMap = this.i;
                    if (!weakHashMap.containsKey(view2)) {
                        View.OnLayoutChangeListener onLayoutChangeListener2 = new View.OnLayoutChangeListener() { // from class: io.sentry.android.replay.u
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                int i9 = i4 - i2;
                                int i10 = i8 - i6;
                                if (i3 - i == i7 - i5 && i9 == i10) {
                                    return;
                                }
                                x xVar = this.a;
                                WeakReference weakReference2 = (WeakReference) kotlin.collections.a.v0(xVar.g);
                                if (js3.i(view3, weakReference2 != null ? (View) weakReference2.get() : null)) {
                                    js3.m(view3);
                                    xVar.d(view3);
                                }
                            }
                        };
                        weakHashMap.put(view2, onLayoutChangeListener2);
                        view2.addOnLayoutChangeListener(onLayoutChangeListener2);
                    }
                }
            } else {
                if (io.sentry.config.a.F(view) == null) {
                    this.a.getLogger().i(SentryLevel.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    m91.i(rVarA, null);
                    return;
                }
                this.g.add(new WeakReference(view));
                v vVar3 = this.m;
                if (vVar3 != null && (qVar3 = vVar3.c) != null) {
                    qVar3.a(view);
                }
                d(view);
                WeakHashMap weakHashMap2 = this.i;
                if (!weakHashMap2.containsKey(view)) {
                    View.OnLayoutChangeListener onLayoutChangeListener3 = new View.OnLayoutChangeListener() { // from class: io.sentry.android.replay.u
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            int i9 = i4 - i2;
                            int i10 = i8 - i6;
                            if (i3 - i == i7 - i5 && i9 == i10) {
                                return;
                            }
                            x xVar = this.a;
                            WeakReference weakReference2 = (WeakReference) kotlin.collections.a.v0(xVar.g);
                            if (js3.i(view3, weakReference2 != null ? (View) weakReference2.get() : null)) {
                                js3.m(view3);
                                xVar.d(view3);
                            }
                        }
                    };
                    weakHashMap2.put(view, onLayoutChangeListener3);
                    view.addOnLayoutChangeListener(onLayoutChangeListener3);
                }
            }
            m91.i(rVarA, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m91.i(rVarA, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        reset();
        f2 f2Var = this.d;
        v vVar = this.m;
        Handler handler = (Handler) f2Var.b;
        if (vVar != null) {
            handler.removeCallbacks(vVar);
        }
        io.sentry.r rVarA = this.l.a();
        try {
            Handler handler2 = this.o;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.n;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            m91.i(rVarA, null);
            y();
        } finally {
        }
    }

    public final void d(View view) {
        js3.p(view, "root");
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            w wVar = new w(this, view);
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().addOnPreDrawListener(wVar);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = view.getWidth();
        Point point = this.h;
        if (width == point.x && view.getHeight() == point.y) {
            return;
        }
        point.set(view.getWidth(), view.getHeight());
        this.c.l0(view.getWidth(), view.getHeight());
    }

    public final Handler g() throws Exception {
        if (this.o == null) {
            io.sentry.r rVarA = this.l.a();
            try {
                if (this.o == null) {
                    this.n = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.n;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.n;
                    js3.m(handlerThread2);
                    this.o = new Handler(handlerThread2.getLooper());
                }
                m91.i(rVarA, null);
            } finally {
            }
        }
        Handler handler = this.o;
        js3.m(handler);
        return handler;
    }

    public final void k() {
        v vVar = this.m;
        if (vVar != null) {
            q qVar = vVar.c;
            if (qVar != null) {
                qVar.c.set(false);
                WeakReference weakReference = qVar.b;
                qVar.c(weakReference != null ? (View) weakReference.get() : null);
            }
            vVar.e.getAndSet(false);
        }
    }

    public final void reset() throws Exception {
        q qVar;
        this.h.set(0, 0);
        io.sentry.r rVarA = this.j.a();
        try {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.i.remove(view);
                    if (onLayoutChangeListener != null) {
                        view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    v vVar = this.m;
                    if (vVar != null && (qVar = vVar.c) != null) {
                        qVar.c(view);
                    }
                }
            }
            this.g.clear();
            m91.i(rVarA, null);
        } finally {
        }
    }

    public final void u() {
        View view;
        v vVar = this.m;
        if (vVar != null) {
            f2 f2Var = vVar.b;
            b6 b6Var = vVar.a;
            if (b6Var.getSessionReplay().m) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            q qVar = vVar.c;
            if (qVar != null) {
                WeakReference weakReference = qVar.b;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    io.sentry.android.replay.util.h.a(view, qVar);
                }
                qVar.c.set(true);
            }
            vVar.e.getAndSet(true);
            ((Handler) f2Var.b).removeCallbacks(vVar);
            if (((Handler) f2Var.b).post(vVar)) {
                return;
            }
            b6Var.getLogger().i(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }

    public final void y() throws Exception {
        v vVar = this.m;
        if (vVar != null) {
            q qVar = vVar.c;
            if (qVar != null) {
                qVar.c.set(false);
                WeakReference weakReference = qVar.b;
                qVar.c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = qVar.b;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                qVar.e.close();
            }
            vVar.c = null;
            vVar.e.getAndSet(false);
        }
        io.sentry.r rVarA = this.k.a();
        try {
            this.m = null;
            m91.i(rVarA, null);
            this.f.set(false);
        } finally {
        }
    }
}
