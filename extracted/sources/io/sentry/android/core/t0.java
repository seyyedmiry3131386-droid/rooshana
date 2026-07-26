package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import defpackage.t61;
import io.sentry.InitPriority;
import io.sentry.ProfileLifecycle;
import io.sentry.ScreenshotStrategyType;
import io.sentry.SentryLevel;
import io.sentry.SentryLogLevel;
import io.sentry.b5;
import io.sentry.d6;
import io.sentry.e5;
import io.sentry.h4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {
    public static void a(String str, SentryLevel sentryLevel, String str2, Throwable th) {
        io.sentry.f fVar = new io.sentry.f();
        fVar.g = "Logcat";
        fVar.d = str2;
        fVar.i = sentryLevel;
        if (str != null) {
            fVar.c(str, "tag");
        }
        if (th != null && th.getMessage() != null) {
            fVar.c(th.getMessage(), "throwable");
        }
        h4.b().k(fVar);
    }

    public static void b(SentryLogLevel sentryLogLevel, String str, Throwable th) {
        if (h4.b().m().getLogs().a) {
            String message = th != null ? th.getMessage() : null;
            io.sentry.d dVar = new io.sentry.d();
            dVar.a = "auto.log.logcat";
            if (th == null || message == null) {
                h4.b().t().e(sentryLogLevel, dVar, str, new Object[0]);
                return;
            }
            io.sentry.logger.a aVarT = h4.b().t();
            if (str != null) {
                message = t61.j(str, "\n", message);
            }
            aVarT.e(sentryLogLevel, dVar, message, new Object[0]);
        }
    }

    public static void c(Context context, j0 j0Var, SentryAndroidOptions sentryAndroidOptions) {
        List listH;
        List listH2;
        List listH3;
        List listH4;
        io.sentry.config.a.W(sentryAndroidOptions, "The options object is required.");
        try {
            sentryAndroidOptions.getLogger();
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) i0.d.b(context) : (ApplicationInfo) i0.e.b(context);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            io.sentry.u0 logger = sentryAndroidOptions.getLogger();
            if (bundle != null) {
                sentryAndroidOptions.setDebug(f(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strJ = j(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strJ != null) {
                        sentryAndroidOptions.setDiagnosticLevel(SentryLevel.valueOf(strJ.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(f(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(f(bundle, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setAttachRawTombstone(f(bundle, logger, "io.sentry.tombstone.attach-raw", sentryAndroidOptions.isAttachRawTombstone()));
                sentryAndroidOptions.setEnableAutoSessionTracking(f(bundle, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dG = g(bundle, logger, "io.sentry.sample-rate");
                    if (dG != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dG));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(f(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(i(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(f(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                sentryAndroidOptions.setReportHistoricalAnrs(f(bundle, logger, "io.sentry.anr.report-historical", sentryAndroidOptions.isReportHistoricalAnrs()));
                String strJ2 = j(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zF = f(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zF || (strJ2 != null && strJ2.isEmpty())) {
                    sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strJ2 == null) {
                    sentryAndroidOptions.getLogger().i(SentryLevel.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zF);
                sentryAndroidOptions.setDsn(strJ2);
                sentryAndroidOptions.setEnableNdk(f(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(f(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strJ3 = j(bundle, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strJ3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strJ3);
                }
                sentryAndroidOptions.setRelease(j(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setDist(j(bundle, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                sentryAndroidOptions.setEnvironment(j(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(i(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) i(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(f(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(f(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(f(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(f(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(f(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (f(bundle, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(InitPriority.LOW);
                }
                sentryAndroidOptions.setForceInit(f(bundle, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(f(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(f(bundle, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dG2 = g(bundle, logger, "io.sentry.traces.sample-rate");
                    if (dG2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dG2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(f(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(f(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(f(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dG3 = g(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dG3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dG3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dG4 = g(bundle, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dG4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dG4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strJ4 = j(bundle, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strJ4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(ProfileLifecycle.valueOf(strJ4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(f(bundle, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(f(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(f(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jI = i(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jI != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jI));
                }
                List<String> listH5 = h(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundle.containsKey("io.sentry.traces.trace-propagation-targets") && listH5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listH5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listH5);
                }
                sentryAndroidOptions.setEnableFramesTracking(f(bundle, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(j(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.t sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.t("", "");
                }
                String strK = k(bundle, logger, "io.sentry.sdk.name", sdkVersion.a());
                io.sentry.config.a.W(strK, "name is required.");
                sdkVersion.a = strK;
                String strK2 = k(bundle, logger, "io.sentry.sdk.version", sdkVersion.b());
                io.sentry.config.a.W(strK2, "version is required.");
                sdkVersion.b = strK2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(f(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List listH6 = h(bundle, logger, "io.sentry.gradle-plugin-integrations");
                if (listH6 != null) {
                    Iterator it = listH6.iterator();
                    while (it.hasNext()) {
                        e5.d().a((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(f(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(f(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(f(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(f(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(f(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(f(bundle, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(i(bundle, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().L() == null) {
                    double dG5 = g(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dG5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().W(Double.valueOf(dG5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().K() == null) {
                    double dG6 = g(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dG6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().V(Double.valueOf(dG6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().B(f(bundle, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().A(f(bundle, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().P(f(bundle, logger, "io.sentry.session-replay.debug", false));
                String strJ5 = j(bundle, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strJ5 != null) {
                    if ("canvas".equals(strJ5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().n = ScreenshotStrategyType.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().n = ScreenshotStrategyType.PIXEL_COPY;
                    }
                }
                sentryAndroidOptions.getSessionReplay().O(f(bundle, logger, "io.sentry.session-replay.capture-surface-views", sentryAndroidOptions.getSessionReplay().M()));
                if (sentryAndroidOptions.getSessionReplay().G().isEmpty() && (listH4 = h(bundle, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listH4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listH4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = ((String) it2.next()).trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().R(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().H().isEmpty() && (listH3 = h(bundle, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listH3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listH3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = ((String) it3.next()).trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().S(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().Q(f(bundle, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().N()));
                if (sentryAndroidOptions.getSessionReplay().I().size() == d6.u.size() && (listH2 = h(bundle, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = listH2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = ((String) it4.next()).trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().T(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().J().size() == d6.u.size() && (listH = h(bundle, logger, "io.sentry.session-replay.network-response-headers")) != null && !listH.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = listH.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = ((String) it5.next()).trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().U(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(h(bundle, logger, "io.sentry.ignored-errors"));
                List listH7 = h(bundle, logger, "io.sentry.in-app-includes");
                if (listH7 != null && !listH7.isEmpty()) {
                    Iterator it6 = listH7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it6.next());
                    }
                }
                List listH8 = h(bundle, logger, "io.sentry.in-app-excludes");
                if (listH8 != null && !listH8.isEmpty()) {
                    Iterator it7 = listH8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().b(f(bundle, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().a()));
                sentryAndroidOptions.getMetrics().b(f(bundle, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().a()));
                b5 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.i(f(bundle, logger, "io.sentry.feedback.is-name-required", feedbackOptions.b()));
                feedbackOptions.l(f(bundle, logger, "io.sentry.feedback.show-name", feedbackOptions.e()));
                feedbackOptions.h(f(bundle, logger, "io.sentry.feedback.is-email-required", feedbackOptions.a()));
                feedbackOptions.k(f(bundle, logger, "io.sentry.feedback.show-email", feedbackOptions.d()));
                feedbackOptions.m(f(bundle, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.f()));
                feedbackOptions.j(f(bundle, logger, "io.sentry.feedback.show-branding", feedbackOptions.c()));
                feedbackOptions.n(f(bundle, logger, "io.sentry.feedback.use-shake-gesture", feedbackOptions.g()));
                sentryAndroidOptions.setStrictTraceContinuation(f(bundle, logger, "io.sentry.strict-trace-continuation.enabled", sentryAndroidOptions.isStrictTraceContinuation()));
                String strJ6 = j(bundle, logger, "io.sentry.org-id", null);
                if (strJ6 != null) {
                    sentryAndroidOptions.setOrgId(strJ6);
                }
                sentryAndroidOptions.setEnableSpotlight(f(bundle, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                String strJ7 = j(bundle, logger, "io.sentry.spotlight.url", null);
                if (strJ7 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(strJ7);
                }
                sentryAndroidOptions.getScreenshot().B(f(bundle, logger, "io.sentry.screenshot.mask-all-text", false));
                sentryAndroidOptions.getScreenshot().A(f(bundle, logger, "io.sentry.screenshot.mask-all-images", false));
                if (sentryAndroidOptions.getAnrProfilingSampleRate() == null) {
                    double dG7 = g(bundle, logger, "io.sentry.anr.profiling.sample-rate");
                    if (dG7 != -1.0d) {
                        sentryAndroidOptions.setAnrProfilingSampleRate(Double.valueOf(dG7));
                    }
                }
                sentryAndroidOptions.setEnableAnrFingerprinting(f(bundle, logger, "io.sentry.anr.enable-fingerprinting", sentryAndroidOptions.isEnableAnrFingerprinting()));
            }
            sentryAndroidOptions.getLogger().i(SentryLevel.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    public static void d(String str, String str2) {
        a(str, SentryLevel.ERROR, str2, null);
        b(SentryLogLevel.ERROR, str2, null);
    }

    public static void e(String str, String str2, Throwable th) {
        a(str, SentryLevel.ERROR, str2, th);
        b(SentryLogLevel.ERROR, str2, th);
    }

    public static boolean f(Bundle bundle, io.sentry.u0 u0Var, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        u0Var.i(SentryLevel.DEBUG, str + " read: " + z2, new Object[0]);
        return z2;
    }

    public static double g(Bundle bundle, io.sentry.u0 u0Var, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        u0Var.i(SentryLevel.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    public static List h(Bundle bundle, io.sentry.u0 u0Var, String str) {
        String string = bundle.getString(str);
        u0Var.i(SentryLevel.DEBUG, t61.j(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long i(Bundle bundle, io.sentry.u0 u0Var, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        u0Var.i(SentryLevel.DEBUG, str + " read: " + j2, new Object[0]);
        return j2;
    }

    public static String j(Bundle bundle, io.sentry.u0 u0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        u0Var.i(SentryLevel.DEBUG, t61.j(str, " read: ", string), new Object[0]);
        return string;
    }

    public static String k(Bundle bundle, io.sentry.u0 u0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        u0Var.i(SentryLevel.DEBUG, t61.j(str, " read: ", string), new Object[0]);
        return string;
    }

    public static void l(Exception exc, String str) {
        a(str, SentryLevel.WARNING, null, exc);
        b(SentryLogLevel.WARN, null, exc);
    }

    public static void m(String str, String str2) {
        a(str, SentryLevel.WARNING, str2, null);
        b(SentryLogLevel.WARN, str2, null);
    }

    public static void n(String str, String str2, Throwable th) {
        a(str, SentryLevel.WARNING, str2, th);
        b(SentryLogLevel.WARN, str2, th);
    }

    public static void o(String str, String str2, Exception exc) {
        a(str, SentryLevel.ERROR, str2, exc);
        b(SentryLogLevel.FATAL, str2, exc);
    }
}
