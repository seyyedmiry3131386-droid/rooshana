package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.SentryLevel;
import io.sentry.c4;
import io.sentry.w4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements Runnable {
    public static final long f = TimeUnit.DAYS.toMillis(91);
    public final Context a;
    public final c4 b;
    public final SentryAndroidOptions c;
    public final f0 d;
    public final long e;

    public g0(Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.d dVar, f0 f0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = c4.a;
        this.c = sentryAndroidOptions;
        this.d = f0Var;
        dVar.getClass();
        this.e = System.currentTimeMillis() - f;
    }

    public final void a(ApplicationExitInfo applicationExitInfo, boolean z) {
        f0 f0Var = this.d;
        io.sentry.k kVarE = f0Var.e(applicationExitInfo, z);
        if (kVarE == null) {
            return;
        }
        w4 w4Var = (w4) kVarE.b;
        if (this.b.C(w4Var, (io.sentry.h0) kVarE.c).equals(io.sentry.protocol.v.b) || ((io.sentry.hints.c) kVarE.d).d()) {
            return;
        }
        this.c.getLogger().i(SentryLevel.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", f0Var.c(), w4Var.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        ApplicationExitInfo applicationExitInfo = null;
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            if (!cVar.h()) {
                sentryAndroidOptions.getLogger().i(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                cVar.e.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        f0 f0Var = this.d;
        Long lB = f0Var.b();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ApplicationExitInfo applicationExitInfoH = io.sentry.u1.h(it.next());
            if (applicationExitInfoH.getReason() == f0Var.a()) {
                it.remove();
                applicationExitInfo = applicationExitInfoH;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "No %ss have been found in the historical exit reasons list.", f0Var.c());
            return;
        }
        long timestamp = applicationExitInfo.getTimestamp();
        long j = this.e;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Latest %s happened too long ago, returning early.", f0Var.c());
            return;
        }
        if (lB != null && applicationExitInfo.getTimestamp() <= lB.longValue()) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Latest %s has already been reported, returning early.", f0Var.c());
            return;
        }
        if (f0Var.d()) {
            Collections.reverse(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApplicationExitInfo applicationExitInfoH2 = io.sentry.u1.h(it2.next());
                if (applicationExitInfoH2.getReason() == f0Var.a()) {
                    if (applicationExitInfoH2.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "%s happened too long ago %s.", f0Var.c(), applicationExitInfoH2);
                    } else if (lB == null || applicationExitInfoH2.getTimestamp() > lB.longValue()) {
                        a(applicationExitInfoH2, false);
                    } else {
                        sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "%s has already been reported %s.", f0Var.c(), applicationExitInfoH2);
                    }
                }
            }
        }
        a(applicationExitInfo, true);
    }
}
