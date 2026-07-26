package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import defpackage.f09;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.h2;
import io.sentry.i4;
import io.sentry.o6;
import io.sentry.p6;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.z4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryPerformanceProvider extends n0 {
    public static final long e = SystemClock.uptimeMillis();
    public static final /* synthetic */ int f = 0;
    public Application b;
    public final t c;
    public final j0 d;

    public SentryPerformanceProvider() {
        new AutoClosableReentrantLock();
        t tVar = new t(3);
        this.c = tVar;
        this.d = new j0(tVar);
    }

    public final void a(Context context, i4 i4Var, io.sentry.android.core.performance.g gVar) {
        boolean z = i4Var.i;
        t tVar = this.c;
        if (!z) {
            tVar.i(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        h hVar = new h(this.d, new io.sentry.android.core.internal.util.s(context.getApplicationContext(), tVar, this.d), tVar, i4Var.e, i4Var.h, new f09(16, new z4()));
        gVar.i = null;
        gVar.j = hVar;
        tVar.i(SentryLevel.DEBUG, "App start continuous profiling started.", new Object[0]);
        b6 b6VarEmpty = b6.empty();
        b6VarEmpty.setProfileSessionSampleRate(Double.valueOf(i4Var.i ? 1.0d : 0.0d));
        hVar.c(i4Var.l, new o6(b6VarEmpty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    public final void b(Context context, i4 i4Var, io.sentry.android.core.performance.g gVar) {
        boolean z = i4Var.c;
        p6 p6Var = new p6(Boolean.valueOf(z), i4Var.d, null, Boolean.valueOf(i4Var.a), i4Var.b);
        gVar.k = p6Var;
        boolean zBooleanValue = p6Var.d.booleanValue();
        t tVar = this.c;
        if (!zBooleanValue || !z) {
            tVar.i(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        z4 z4Var = new z4();
        u uVar = new u(context, this.d, new io.sentry.android.core.internal.util.s(context, tVar, this.d), tVar, i4Var.e, i4Var.f, i4Var.h, new f09(16, z4Var));
        gVar.j = null;
        gVar.i = uVar;
        tVar.i(SentryLevel.DEBUG, "App start profiling started.", new Object[0]);
        uVar.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.g.e(this);
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        Context context = getContext();
        gVarC.e.c(e);
        this.d.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            gVarC.d.c(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.b = (Application) context;
        }
        Application application = this.b;
        if (application != null) {
            gVarC.h(application);
        }
        Context context2 = getContext();
        t tVar = this.c;
        if (context2 == null) {
            tVar.i(SentryLevel.FATAL, "App. Context from ContentProvider is null", new Object[0]);
        } else {
            File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
            if (file.exists() && file.canRead()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    try {
                        i4 i4Var = (i4) new h2(b6.empty()).c(bufferedReader, i4.class);
                        if (i4Var == null) {
                            tVar.i(SentryLevel.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                        } else if (i4Var.g && i4Var.k) {
                            a(context2, i4Var, gVarC);
                        } else if (!i4Var.f) {
                            tVar.i(SentryLevel.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                        } else if (i4Var.j) {
                            b(context2, i4Var, gVarC);
                        }
                        bufferedReader.close();
                    } finally {
                    }
                } catch (FileNotFoundException e2) {
                    tVar.f(SentryLevel.ERROR, "App start profiling config file not found. ", e2);
                } catch (Throwable th) {
                    tVar.f(SentryLevel.ERROR, "Error reading app start profiling config file. ", th);
                }
            }
        }
        io.sentry.android.core.performance.g.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        io.sentry.r rVarA = io.sentry.android.core.performance.g.r.a();
        try {
            u uVar = io.sentry.android.core.performance.g.c().i;
            if (uVar != null) {
                uVar.close();
            }
            h hVar = io.sentry.android.core.performance.g.c().j;
            if (hVar != null) {
                hVar.a(true);
            }
            rVarA.close();
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
