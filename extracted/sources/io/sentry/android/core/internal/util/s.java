package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import defpackage.r59;
import io.sentry.SentryLevel;
import io.sentry.android.core.j0;
import io.sentry.android.core.t;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Application.ActivityLifecycleCallbacks {
    public static final long o = TimeUnit.SECONDS.toNanos(1);
    public static final long p = TimeUnit.MILLISECONDS.toNanos(700);
    public static final /* synthetic */ int q = 0;
    public final j0 a;
    public final CopyOnWriteArraySet b;
    public final u0 c;
    public final Handler d;
    public WeakReference e;
    public final ConcurrentHashMap f;
    public final boolean g;
    public final d h;
    public final p i;
    public Choreographer j;
    public final Field k;
    public long l;
    public long m;
    public final ConcurrentSkipListSet n;

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.p] */
    public s(Context context, final t tVar, final j0 j0Var) {
        d dVar = new d();
        this.b = new CopyOnWriteArraySet();
        this.f = new ConcurrentHashMap();
        this.g = false;
        this.l = 0L;
        this.m = 0L;
        this.n = new ConcurrentSkipListSet();
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.config.a.W(tVar, "Logger is required");
        this.c = tVar;
        io.sentry.config.a.W(j0Var, "BuildInfoProvider is required");
        this.a = j0Var;
        this.h = dVar;
        if ((context instanceof Application) && Build.VERSION.SDK_INT >= 24) {
            this.g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.o
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    tVar.f(SentryLevel.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.d = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new r59(this, tVar, 11));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                tVar.f(SentryLevel.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.i = new Window$OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.p
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    s.a(this.a, j0Var, window, frameMetrics);
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(io.sentry.android.core.internal.util.s r21, io.sentry.android.core.j0 r22, android.view.Window r23, android.view.FrameMetrics r24) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.s.a(io.sentry.android.core.internal.util.s, io.sentry.android.core.j0, android.view.Window, android.view.FrameMetrics):void");
    }

    public final void b(String str) {
        if (this.g) {
            ConcurrentHashMap concurrentHashMap = this.f;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new n(this, window, 1));
        }
    }

    public final void c() {
        WeakReference weakReference = this.e;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.g || this.f.isEmpty() || this.d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new n(this, window, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
        Window window = activity2.getWindow();
        WeakReference weakReference = this.e;
        if (weakReference == null || weakReference.get() != window) {
            this.e = new WeakReference(window);
            c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
        new Handler(Looper.getMainLooper()).post(new n(this, activity2.getWindow(), 1));
        WeakReference weakReference = this.e;
        if (weakReference == null || weakReference.get() != activity2.getWindow()) {
            return;
        }
        this.e = null;
    }
}
