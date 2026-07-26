package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.kb8;
import defpackage.ur4;
import io.sentry.SentryLevel;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.h4;
import io.sentry.w4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {
    public final boolean a;
    public final ur4 b;
    public final j0 c;
    public final io.sentry.u1 d;
    public final long e;
    public final long f;
    public final io.sentry.u0 g;
    public volatile long h;
    public final AtomicBoolean i;
    public final Context j;
    public final kb8 k;

    public a(long j, boolean z, ur4 ur4Var, io.sentry.u0 u0Var, Context context) {
        io.sentry.u1 u1Var = new io.sentry.u1(6);
        j0 j0Var = new j0();
        super("|ANR-WatchDog|");
        this.h = 0L;
        this.i = new AtomicBoolean(false);
        this.d = u1Var;
        this.f = j;
        this.e = 500L;
        this.a = z;
        this.b = ur4Var;
        this.g = u0Var;
        this.c = j0Var;
        this.j = context;
        this.k = new kb8(this, u1Var);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.k.run();
        while (!isInterrupted()) {
            ((Handler) this.c.a).post(this.k);
            try {
                Thread.sleep(this.e);
                this.d.getClass();
                if (SystemClock.uptimeMillis() - this.h > this.f) {
                    if (this.a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.j.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.g.f(SentryLevel.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (it.hasNext()) {
                                    if (it.next().condition == 2) {
                                    }
                                }
                            }
                        }
                        if (this.i.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(bl4.s(this.f, " ms.", new StringBuilder("Application Not Responding for at least ")), ((Handler) this.c.a).getLooper().getThread());
                            ur4 ur4Var = this.b;
                            Object obj = ur4Var.b;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) ur4Var.c;
                            a aVar = AnrIntegration.e;
                            sentryAndroidOptions.getLogger().i(SentryLevel.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(c0.e.d);
                            String strN = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strN = dw1.n("Background ", strN);
                            }
                            Thread thread = applicationNotResponding.a;
                            ApplicationNotResponding applicationNotResponding2 = thread == null ? new ApplicationNotResponding(strN) : new ApplicationNotResponding(strN, thread);
                            io.sentry.protocol.n nVar = new io.sentry.protocol.n();
                            nVar.a = "ANR";
                            w4 w4Var = new w4(new ExceptionMechanismException(nVar, applicationNotResponding2, thread, true));
                            w4Var.u = SentryLevel.ERROR;
                            h4.b().C(w4Var, io.sentry.config.a.o(new w(zEquals)));
                        }
                    } else {
                        this.g.i(SentryLevel.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.i.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.g.i(SentryLevel.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.g.i(SentryLevel.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
