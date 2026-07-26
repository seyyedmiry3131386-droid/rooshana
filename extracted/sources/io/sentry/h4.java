package io.sentry;

import defpackage.gg1;
import defpackage.kb8;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h4 {
    public static volatile d1 a = x2.a;
    public static volatile c1 b = v2.b;
    public static final y3 c = new y3(b6.empty());
    public static volatile boolean d = false;
    public static final Charset e = Charset.forName("UTF-8");
    public static final long f = System.currentTimeMillis();
    public static final AutoClosableReentrantLock g = new AutoClosableReentrantLock();

    public static void a() {
        r rVarA = g.a();
        try {
            c1 c1VarB = b();
            b = v2.b;
            a.close();
            c1VarB.a(false);
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

    public static c1 b() {
        if (d) {
            return b;
        }
        c1 c1Var = a.get();
        if (c1Var != null && !c1Var.j()) {
            return c1Var;
        }
        c1 c1VarB = b.B("getCurrentScopes");
        a.a(c1VarB);
        return c1VarB;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Collection] */
    public static void c(o2 o2Var, io.sentry.android.core.f fVar) {
        b6 b6Var = (b6) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            fVar.d(b6Var);
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        r rVarA = g.a();
        try {
            if (!b6Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.h.a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(b6Var.getClass().getName()));
            }
            if (g(b6Var)) {
                Boolean boolIsGlobalHubMode = b6Var.isGlobalHubMode();
                int i = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                int i2 = 0;
                b6Var.getLogger().i(SentryLevel.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                d = zBooleanValue;
                if (b6Var.getFatalLogger() instanceof r2) {
                    b6Var.setFatalLogger(new o2());
                }
                y3 y3Var = c;
                if (io.sentry.config.a.Z(y3Var.l, b6Var, f())) {
                    if (f()) {
                        b6Var.getLogger().i(SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    b6Var.activate();
                    b().a(true);
                    y3Var.l = b6Var;
                    ?? r3 = y3Var.g;
                    y3Var.g = y3.b(b6Var.getMaxBreadcrumbs());
                    Iterator it = r3.iterator();
                    while (it.hasNext()) {
                        y3Var.h((f) it.next(), null);
                    }
                    b = new b4(new y3(b6Var), new y3(b6Var), y3Var);
                    if (b6Var.isDebug() && (b6Var.getLogger() instanceof r2)) {
                        b6Var.setLogger(new o2());
                    }
                    e(b6Var);
                    a.a(b);
                    d(b6Var);
                    y3Var.u = new gg1(b6Var);
                    if (b6Var.getExecutorService().isClosed()) {
                        b6Var.setExecutorService(new z4(b6Var));
                        b6Var.getExecutorService().b();
                    }
                    try {
                        b6Var.getExecutorService().submit(new f4(b6Var, i2));
                    } catch (RejectedExecutionException e2) {
                        b6Var.getLogger().f(SentryLevel.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
                    }
                    try {
                        b6Var.getExecutorService().submit(new k2(i2, b6Var));
                    } catch (Throwable th2) {
                        b6Var.getLogger().f(SentryLevel.DEBUG, "Failed to move previous session.", th2);
                    }
                    for (q1 q1Var : b6Var.getIntegrations()) {
                        try {
                            q1Var.J(b6Var);
                        } catch (Throwable th3) {
                            b6Var.getLogger().f(SentryLevel.WARNING, "Failed to register the integration " + q1Var.getClass().getName(), th3);
                        }
                    }
                    try {
                        b6Var.getExecutorService().submit(new f4(b6Var, 2));
                    } catch (Throwable th4) {
                        b6Var.getLogger().f(SentryLevel.DEBUG, "Failed to notify options observers.", th4);
                    }
                    try {
                        b6Var.getExecutorService().submit(new l3(b6Var));
                    } catch (Throwable th5) {
                        b6Var.getLogger().f(SentryLevel.DEBUG, "Failed to finalize previous session.", th5);
                    }
                    try {
                        b6Var.getExecutorService().submit(new f4(b6Var, i));
                    } catch (Throwable th6) {
                        b6Var.getLogger().f(SentryLevel.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                    }
                    u0 logger = b6Var.getLogger();
                    SentryLevel sentryLevel = SentryLevel.DEBUG;
                    logger.i(sentryLevel, "Using openTelemetryMode %s", b6Var.getOpenTelemetryMode());
                    b6Var.getLogger().i(sentryLevel, "Using span factory %s", b6Var.getSpanFactory().getClass().getName());
                    b6Var.getLogger().i(sentryLevel, "Using scopes storage %s", a.getClass().getName());
                } else {
                    b6Var.getLogger().i(SentryLevel.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            rVarA.close();
        } catch (Throwable th7) {
            try {
                rVarA.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    public static void d(b6 b6Var) {
        Iterator it;
        u0 logger;
        Iterator it2;
        io.sentry.cache.d cVar;
        u0 logger2 = b6Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.INFO;
        logger2.i(sentryLevel, "Initializing SDK with DSN: '%s'", b6Var.getDsn());
        String outboxPath = b6Var.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger2.i(sentryLevel, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = b6Var.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (b6Var.getEnvelopeDiskCache() instanceof io.sentry.transport.i) {
                Charset charset = io.sentry.cache.c.i;
                String cacheDirPath2 = b6Var.getCacheDirPath();
                int maxCacheItems = b6Var.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    b6Var.getLogger().i(SentryLevel.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    cVar = io.sentry.transport.i.a;
                } else {
                    cVar = new io.sentry.cache.c(b6Var, cacheDirPath2, maxCacheItems);
                }
                b6Var.setEnvelopeDiskCache(cVar);
            }
        }
        String profilingTracesDirPath = b6Var.getProfilingTracesDirPath();
        if ((b6Var.isProfilingEnabled() || b6Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                b6Var.getExecutorService().submit(new kb8(6, file));
            } catch (RejectedExecutionException e2) {
                b6Var.getLogger().f(SentryLevel.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        io.sentry.internal.modules.a modulesLoader = b6Var.getModulesLoader();
        if (!b6Var.isSendModules()) {
            b6Var.setModulesLoader(io.sentry.internal.modules.e.a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            b6Var.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(b6Var.getLogger()), new io.sentry.internal.modules.f(b6Var.getLogger())), b6Var.getLogger()));
        }
        if (b6Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            b6Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(b6Var.getLogger()));
        }
        List<Properties> listC = b6Var.getDebugMetaLoader().c();
        if (listC != null) {
            if (b6Var.getBundleIds().isEmpty()) {
                Iterator it3 = listC.iterator();
                while (it3.hasNext()) {
                    String property = ((Properties) it3.next()).getProperty("io.sentry.bundle-ids");
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            b6Var.addBundleId(str);
                        }
                    }
                }
            }
            if (b6Var.getProguardUuid() == null) {
                Iterator it4 = listC.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    String property2 = ((Properties) it4.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        b6Var.getLogger().i(SentryLevel.DEBUG, "Proguard UUID found: %s", property2);
                        b6Var.setProguardUuid(property2);
                        break;
                    }
                }
            }
            Iterator it5 = listC.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Properties properties = (Properties) it5.next();
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    e5.d().b(property3, property4);
                }
            }
            for (Properties properties2 : listC) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                String property9 = properties2.getProperty("io.sentry.distribution.install-groups-override");
                if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
                    t5 distribution = b6Var.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.b.isEmpty()) {
                        b6Var.getLogger().i(SentryLevel.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.c.isEmpty()) {
                        b6Var.getLogger().i(SentryLevel.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.a.isEmpty()) {
                        b6Var.getLogger().i(SentryLevel.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.d == null) {
                        b6Var.getLogger().i(SentryLevel.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.d = property8;
                    }
                    if (property9 != null && !property9.isEmpty() && distribution.e == null) {
                        String[] strArrSplit = property9.split(",", -1);
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strTrim = str2.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            b6Var.getLogger().i(SentryLevel.DEBUG, "Distribution install groups override found: %s", arrayList);
                            distribution.e = arrayList;
                        }
                    }
                }
            }
        }
        if (b6Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            b6Var.setThreadChecker(io.sentry.util.thread.c.b);
        }
        if (b6Var.getPerformanceCollectors().isEmpty()) {
            b6Var.addPerformanceCollector(new r1());
        }
        if (b6Var.isEnableBackpressureHandling() && !io.sentry.util.h.a) {
            if (b6Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                b6Var.setBackpressureMonitor(new io.sentry.backpressure.a(b6Var));
            }
            b6Var.getBackpressureMonitor().start();
        }
        if (!io.sentry.util.h.a && b6Var.isContinuousProfilingEnabled() && (b6Var.getContinuousProfiler() instanceof n2)) {
            try {
                io.sentry.config.a.E(b6Var);
                logger = b6Var.getLogger();
                b6Var.getProfilingTracesHz();
                b6Var.getExecutorService();
                try {
                    it2 = ServiceLoader.load(io.sentry.profiling.a.class).iterator();
                } catch (Throwable th) {
                    logger.f(SentryLevel.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th);
                }
            } catch (Exception e3) {
                b6Var.getLogger().f(SentryLevel.ERROR, "Failed to create default profiling traces directory", e3);
            }
            if ((it2.hasNext() ? it2.next() : null) != null) {
                throw new ClassCastException();
            }
            logger.i(SentryLevel.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            b6Var.getLogger().i(SentryLevel.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            b6Var.getContinuousProfiler();
        } else {
            b6Var.getContinuousProfiler();
        }
        if (!io.sentry.util.h.a && b6Var.isContinuousProfilingEnabled() && (b6Var.getProfilerConverter() instanceof s2)) {
            u0 logger3 = c.l.getLogger();
            try {
                it = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
            } catch (Throwable th2) {
                logger3.f(SentryLevel.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            }
            if ((it.hasNext() ? it.next() : null) != null) {
                throw new ClassCastException();
            }
            logger3.i(SentryLevel.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
            b6Var.getLogger().i(SentryLevel.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
            b6Var.getProfilerConverter();
        } else {
            b6Var.getProfilerConverter();
        }
        b6Var.getLogger().i(SentryLevel.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(b6Var.isContinuousProfilingEnabled()), b6Var.getProfileLifecycle());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(io.sentry.b6 r6) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.h4.e(io.sentry.b6):void");
    }

    public static boolean f() {
        return b().isEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025d A[LOOP:4: B:101:0x0257->B:103:0x025d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0281 A[LOOP:5: B:105:0x027b->B:107:0x0281, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a A[LOOP:0: B:65:0x0184->B:67:0x018a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0 A[LOOP:1: B:75:0x01da->B:77:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc A[LOOP:2: B:79:0x01f6->B:81:0x01fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(io.sentry.b6 r12) {
        /*
            Method dump skipped, instruction units count: 1079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.h4.g(io.sentry.b6):boolean");
    }
}
