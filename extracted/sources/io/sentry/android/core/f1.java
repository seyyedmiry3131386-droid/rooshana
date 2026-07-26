package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import defpackage.f09;
import io.sentry.ScopeType;
import io.sentry.SentryLevel;
import io.sentry.SentryOpenTelemetryMode;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b3;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.g3;
import io.sentry.g4;
import io.sentry.h4;
import io.sentry.l2;
import io.sentry.m2;
import io.sentry.m5;
import io.sentry.n2;
import io.sentry.o2;
import io.sentry.t2;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 {
    public static final long a = SystemClock.uptimeMillis();
    public static final AutoClosableReentrantLock b = new AutoClosableReentrantLock();

    public static void a(t tVar, Context context, g4 g4Var, SentryAndroidOptions sentryAndroidOptions) {
        long j;
        io.sentry.r rVarA;
        boolean z;
        boolean z2;
        boolean zI = io.sentry.hints.i.i(sentryAndroidOptions, "timber.log.Timber");
        boolean z3 = io.sentry.hints.i.i(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.hints.i.i(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z4 = zI && io.sentry.hints.i.i(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zI2 = io.sentry.hints.i.i(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zI3 = io.sentry.hints.i.i(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        j0 j0Var = new j0(tVar);
        io.sentry.hints.i iVar = new io.sentry.hints.i();
        d dVar = new d(iVar, sentryAndroidOptions);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(tVar);
        sentryAndroidOptions.setFatalLogger(new t(2));
        sentryAndroidOptions.setDefaultScopeType(ScopeType.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(SentryOpenTelemetryMode.OFF);
        sentryAndroidOptions.setDateProvider(new g1());
        sentryAndroidOptions.getLogs().b = new t(4);
        sentryAndroidOptions.getMetrics().b = new t(5);
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.s(applicationContext, tVar, j0Var));
        t0.c(applicationContext, j0Var, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        io.sentry.android.core.anr.e.a.set(true);
        PackageInfo packageInfoG = i0.g(applicationContext, j0Var);
        if (packageInfoG != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoG.packageName + "@" + packageInfoG.versionName + Marker.ANY_NON_NULL_MARKER + i0.h(packageInfoG, j0Var));
            }
            String str = packageInfoG.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(r0.a(applicationContext));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Could not generate distinct Id.", e);
            }
        }
        c0 c0Var = c0.e;
        if (c0Var.b == null) {
            rVarA = c0Var.a.a();
            try {
                c0Var.g(sentryAndroidOptions.getLogger());
                rVarA.close();
            } finally {
            }
        }
        sentryAndroidOptions.activate();
        q.a(context, sentryAndroidOptions, j0Var, iVar, dVar, z3, z4, zI2, zI3);
        try {
            g4Var.d(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        if (!sentryAndroidOptions.isEnablePerformanceV2() || Build.VERSION.SDK_INT < 24) {
            j = 0;
        } else {
            io.sentry.android.core.performance.h hVar = gVarC.d;
            j = 0;
            if (hVar.c == 0) {
                hVar.c(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            gVarC.h((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.h hVar2 = gVarC.e;
        if (hVar2.c == j) {
            hVar2.c(a);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof m2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.c(context, j0Var, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.f(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.m(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new k0(context, j0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new y0(sentryAndroidOptions, dVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, j0Var, zI2));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new e0(context, j0Var, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.k) {
            j0 j0Var2 = new j0();
            j0Var2.a = sentryAndroidOptions;
            sentryAndroidOptions.setTransportGate(j0Var2);
        }
        io.sentry.android.core.performance.g gVarC2 = io.sentry.android.core.performance.g.c();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof g3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.t(sentryAndroidOptions, 0));
        }
        io.sentry.util.e eVar = new io.sentry.util.e(new m5(iVar, sentryAndroidOptions));
        boolean zI4 = io.sentry.hints.i.i(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(eVar));
            if (zI4 && io.sentry.hints.i.i(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zI4 && io.sentry.hints.i.i(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.f.a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof b3) {
            sentryAndroidOptions.setSocketTagger(t.b);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new n());
            sentryAndroidOptions.addPerformanceCollector(new i(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.s frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.config.a.W(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new s1(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof l2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.q(sentryAndroidOptions));
        }
        if (zI2 && (sentryAndroidOptions.getReplayController().P() instanceof t2)) {
            sentryAndroidOptions.getReplayController().D(new io.sentry.android.replay.a(sentryAndroidOptions));
        }
        rVarA = io.sentry.android.core.performance.g.r.a();
        try {
            io.sentry.n1 n1Var = gVarC2.i;
            h hVar3 = gVarC2.j;
            gVarC2.i = null;
            gVarC2.j = null;
            rVarA.close();
            io.sentry.l compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(n2.a);
                if (hVar3 != null) {
                    hVar3.a(true);
                }
                if (n1Var == null) {
                    io.sentry.android.core.internal.util.s frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                    io.sentry.config.a.W(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                    z = z3;
                    z2 = z4;
                    sentryAndroidOptions.setTransactionProfiler(new u(context, j0Var, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new p(sentryAndroidOptions, 3)));
                    b(sentryAndroidOptions, z, z2);
                }
                sentryAndroidOptions.setTransactionProfiler(n1Var);
            } else {
                sentryAndroidOptions.setTransactionProfiler(o2.d);
                if (n1Var != null) {
                    n1Var.close();
                }
                if (hVar3 != null) {
                    sentryAndroidOptions.setContinuousProfiler(hVar3);
                    io.sentry.protocol.v vVar = hVar3.o;
                    if (hVar3.i && !vVar.equals(io.sentry.protocol.v.b)) {
                        compositePerformanceCollector.a(vVar.toString());
                    }
                } else {
                    io.sentry.android.core.internal.util.s frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                    io.sentry.config.a.W(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                    sentryAndroidOptions.setContinuousProfiler(new h(j0Var, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new p(sentryAndroidOptions, 0)));
                }
            }
            z = z3;
            z2 = z4;
            b(sentryAndroidOptions, z, z2);
        } finally {
        }
    }

    public static void b(SentryAndroidOptions sentryAndroidOptions, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (io.sentry.q1 q1Var : sentryAndroidOptions.getIntegrations()) {
            if (z && (q1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(q1Var);
            }
            if (z2 && (q1Var instanceof SentryTimberIntegration)) {
                arrayList.add(q1Var);
            }
            if (q1Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(q1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.q1) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.q1) arrayList.get(i2));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i3 = 0; i3 < arrayList3.size() - 1; i3++) {
                sentryAndroidOptions.getIntegrations().remove((io.sentry.q1) arrayList3.get(i3));
            }
        }
    }

    public static void c(Context context, t tVar, g4 g4Var) {
        try {
            io.sentry.r rVarA = b.a();
            try {
                h4.c(new o2(), new f(tVar, context, g4Var));
                io.sentry.c1 c1VarB = h4.b();
                if (i0.i()) {
                    if (c1VarB.m().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        c1VarB.x(new f09(15, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            c1VarB.q();
                        }
                    }
                    c1VarB.m().getReplayController().K();
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
        } catch (IllegalAccessException e) {
            tVar.f(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e);
        } catch (InstantiationException e2) {
            tVar.f(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
        } catch (NoSuchMethodException e3) {
            tVar.f(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
        } catch (InvocationTargetException e4) {
            tVar.f(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
        }
    }
}
