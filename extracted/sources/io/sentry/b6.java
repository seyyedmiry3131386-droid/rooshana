package io.sentry;

import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public class b6 {
    static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private n5 beforeBreadcrumb;
    private o5 beforeEnvelopeCallback;
    private p5 beforeSend;
    private p5 beforeSendFeedback;
    private q5 beforeSendReplay;
    private r5 beforeSendTransaction;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.e clientReportRecorder;
    private l compositePerformanceCollector;
    private o0 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private p0 continuousProfiler;
    private s5 cron;
    private final io.sentry.util.e dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private ScopeType defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private SentryLevel diagnosticLevel;
    private String dist;
    private String distinctId;
    private t5 distribution;
    private q0 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableCacheTracing;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableQueueTracing;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.d envelopeDiskCache;
    private final io.sentry.util.e envelopeReader;
    private String environment;
    private g1 executorService;
    private final c0 experimental;
    private u0 fatalLogger;
    private b5 feedbackOptions;
    private boolean forceInit;
    private g0 fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<f0> ignoredCheckIns;
    private List<f0> ignoredSpanOrigins;
    private List<f0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private InitPriority initPriority;
    private Instrumenter instrumenter;
    private volatile o6 internalTracesSampler;
    protected final AutoClosableReentrantLock lock;
    private u0 logger;
    private u5 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;
    private SentryOptions$RequestSize maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private v5 metrics;
    private io.sentry.internal.modules.a modulesLoader;
    private final List<b1> observers;
    private w5 onDiscard;
    private x5 onOversizedEvent;
    private SentryOpenTelemetryMode openTelemetryMode;
    private final List<v0> optionsObservers;
    private String orgId;
    private final List<w0> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private ProfileLifecycle profileLifecycle;
    private Double profileSessionSampleRate;
    private z0 profilerConverter;
    private Double profilesSampleRate;
    private y5 profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private z5 proxy;
    private int readTimeoutMillis;
    private String release;
    private s3 replayController;
    private Double sampleRate;
    private e1 scopesStorageFactory;
    private io.sentry.protocol.t sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.e serializer;
    private String serverName;
    private d6 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private j1 socketTagger;
    private l1 spanFactory;
    private String spotlightConnectionUrl;
    private final AtomicBoolean spotlightIntegrationLoaded;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private boolean strictTraceContinuation;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private a6 tracesSampler;
    private n1 transactionProfiler;
    private o1 transportFactory;
    private io.sentry.transport.h transportGate;
    private p1 versionDetector;
    private final List<ComposeViewHierarchyExporter> viewHierarchyExporters;
    private final List<b0> eventProcessors = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private List<f0> ignoredErrors = null;
    private final List<q1> integrations = new CopyOnWriteArrayList();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private final io.sentry.util.e parsedDsn = new io.sentry.util.e(new m5(this, 0));
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Removed duplicated region for block: B:19:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b6(boolean r12) {
        /*
            Method dump skipped, instruction units count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.b6.<init>(boolean):void");
    }

    public static /* synthetic */ y b(b6 b6Var) {
        return new y(b6Var.dsn);
    }

    public static /* synthetic */ z c(b6 b6Var) {
        return new z((i1) b6Var.serializer.a());
    }

    public static b6 empty() {
        return new b6(true);
    }

    public void activate() {
        if (this.executorService instanceof z2) {
            z4 z4Var = new z4(this);
            this.executorService = z4Var;
            z4Var.b();
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((q1) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(b0 b0Var) {
        this.eventProcessors.add(b0Var);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new f0(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new f0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new f0(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new f0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(q1 q1Var) {
        this.integrations.add(q1Var);
    }

    public void addOptionsObserver(v0 v0Var) {
        this.optionsObservers.add(v0Var);
    }

    public void addPerformanceCollector(w0 w0Var) {
        this.performanceCollectors.add(w0Var);
    }

    public void addScopeObserver(b1 b1Var) {
        this.observers.add(b1Var);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public io.sentry.cache.f findPersistingScopeObserver() {
        for (b1 b1Var : this.observers) {
            if (b1Var instanceof io.sentry.cache.f) {
                return (io.sentry.cache.f) b1Var;
            }
        }
        return null;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public n5 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public o5 getBeforeEnvelopeCallback() {
        return null;
    }

    public p5 getBeforeSend() {
        return null;
    }

    public p5 getBeforeSendFeedback() {
        return null;
    }

    public q5 getBeforeSendReplay() {
        return null;
    }

    public r5 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.e getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public l getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public o0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public p0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public s5 getCron() {
        return this.cron;
    }

    public o4 getDateProvider() {
        return (o4) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public ScopeType getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public t5 getDistribution() {
        return this.distribution;
    }

    public q0 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEffectiveOrgId() {
        String str = this.orgId;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        }
        try {
            return retrieveParsedDsn().d;
        } catch (Throwable unused) {
            return null;
        }
    }

    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public r0 getEnvelopeReader() {
        return (r0) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<b0> getEventProcessors() {
        return this.eventProcessors;
    }

    public g1 getExecutorService() {
        return this.executorService;
    }

    public c0 getExperimental() {
        return this.experimental;
    }

    public u0 getFatalLogger() {
        return this.fatalLogger;
    }

    public b5 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public g0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<f0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<f0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<f0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<f0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public InitPriority getInitPriority() {
        return this.initPriority;
    }

    public Instrumenter getInstrumenter() {
        return this.instrumenter;
    }

    public List<q1> getIntegrations() {
        return this.integrations;
    }

    public o6 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            r rVarA = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new o6(this);
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
        return this.internalTracesSampler;
    }

    public u0 getLogger() {
        return this.logger;
    }

    public u5 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public SentryOptions$RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public v5 getMetrics() {
        return this.metrics;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public w5 getOnDiscard() {
        return null;
    }

    public x5 getOnOversizedEvent() {
        return null;
    }

    public SentryOpenTelemetryMode getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<v0> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<w0> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public ProfileLifecycle getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public z0 getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public y5 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public z5 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public s3 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<b1> getScopeObservers() {
        return this.observers;
    }

    public e1 getScopesStorageFactory() {
        return null;
    }

    public io.sentry.protocol.t getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public i1 getSerializer() {
        return (i1) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public d6 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public j1 getSocketTagger() {
        return this.socketTagger;
    }

    public l1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public a6 getTracesSampler() {
        return null;
    }

    public n1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public o1 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.h getTransportGate() {
        return this.transportGate;
    }

    public p1 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d;
        return this.profilesSampleRate == null && (d = this.profileSessionSampleRate) != null && d.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d = this.profilesSampleRate;
        return d != null && d.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(d0 d0Var) {
        String str = d0Var.a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = d0Var.b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = d0Var.c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = d0Var.d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = d0Var.e;
        if (str5 != null) {
            setServerName(str5);
        }
        z5 z5Var = d0Var.n;
        if (z5Var != null) {
            setProxy(z5Var);
        }
        Boolean bool = d0Var.f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = d0Var.y;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d = d0Var.i;
        if (d != null) {
            setSampleRate(d);
        }
        Double d2 = d0Var.j;
        if (d2 != null) {
            setTracesSampleRate(d2);
        }
        Double d3 = d0Var.k;
        if (d3 != null) {
            setProfilesSampleRate(d3);
        }
        Boolean bool3 = d0Var.g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = d0Var.h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = d0Var.z;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        Boolean bool6 = d0Var.Q;
        if (bool6 != null) {
            setForceInit(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(d0Var.m).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(d0Var.p).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(d0Var.o).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(d0Var.w).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (d0Var.q != null) {
            setTracePropagationTargets(new ArrayList(d0Var.q));
        }
        Iterator it4 = new ArrayList(d0Var.r).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = d0Var.s;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l = d0Var.t;
        if (l != null) {
            setIdleTimeout(l);
        }
        Long l2 = d0Var.u;
        if (l2 != null) {
            setShutdownTimeoutMillis(l2.longValue());
        }
        Long l3 = d0Var.v;
        if (l3 != null) {
            setSessionFlushTimeoutMillis(l3.longValue());
        }
        Iterator it5 = d0Var.A.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = d0Var.B;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = d0Var.C;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = d0Var.J;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (d0Var.H != null) {
            setIgnoredCheckIns(new ArrayList(d0Var.H));
        }
        if (d0Var.I != null) {
            setIgnoredTransactions(new ArrayList(d0Var.I));
        }
        if (d0Var.x != null) {
            setIgnoredErrors(new ArrayList(d0Var.x));
        }
        Boolean bool10 = d0Var.L;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        Boolean bool11 = d0Var.M;
        if (bool11 != null) {
            setEnableDatabaseTransactionTracing(bool11.booleanValue());
        }
        Boolean bool12 = d0Var.N;
        if (bool12 != null) {
            setEnableCacheTracing(bool12.booleanValue());
        }
        Boolean bool13 = d0Var.O;
        if (bool13 != null) {
            setEnableQueueTracing(bool13.booleanValue());
        }
        SentryOptions$RequestSize sentryOptions$RequestSize = d0Var.l;
        if (sentryOptions$RequestSize != null) {
            setMaxRequestBodySize(sentryOptions$RequestSize);
        }
        Boolean bool14 = d0Var.K;
        if (bool14 != null) {
            setSendDefaultPii(bool14.booleanValue());
        }
        Boolean bool15 = d0Var.R;
        if (bool15 != null) {
            setCaptureOpenTelemetryEvents(bool15.booleanValue());
        }
        Boolean bool16 = d0Var.D;
        if (bool16 != null) {
            setEnableSpotlight(bool16.booleanValue());
        }
        String str7 = d0Var.G;
        if (str7 != null) {
            setSpotlightConnectionUrl(str7);
        }
        Boolean bool17 = d0Var.P;
        if (bool17 != null) {
            setGlobalHubMode(bool17);
        }
        if (d0Var.X != null) {
            if (getCron() == null) {
                setCron(d0Var.X);
            } else {
                if (d0Var.X.a != null) {
                    getCron().a = d0Var.X.a;
                }
                if (d0Var.X.b != null) {
                    getCron().b = d0Var.X.b;
                }
                if (d0Var.X.c != null) {
                    getCron().c = d0Var.X.c;
                }
                if (d0Var.X.d != null) {
                    getCron().d = d0Var.X.d;
                }
                if (d0Var.X.e != null) {
                    getCron().e = d0Var.X.e;
                }
            }
        }
        if (d0Var.E != null) {
            getLogs().a = d0Var.E.booleanValue();
        }
        if (d0Var.F != null) {
            getMetrics().a = d0Var.F.booleanValue();
        }
        Double d4 = d0Var.S;
        if (d4 != null) {
            setProfileSessionSampleRate(d4);
        }
        String str8 = d0Var.T;
        if (str8 != null) {
            setProfilingTracesDirPath(str8);
        }
        ProfileLifecycle profileLifecycle = d0Var.U;
        if (profileLifecycle != null) {
            setProfileLifecycle(profileLifecycle);
        }
        Boolean bool18 = d0Var.V;
        if (bool18 != null) {
            setStrictTraceContinuation(bool18.booleanValue());
        }
        String str9 = d0Var.W;
        if (str9 != null) {
            setOrgId(str9);
        }
    }

    public y retrieveParsedDsn() throws IllegalArgumentException {
        return (y) this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(n5 n5Var) {
        this.beforeBreadcrumb = n5Var;
    }

    public void setBeforeEnvelopeCallback(o5 o5Var) {
    }

    public void setBeforeSend(p5 p5Var) {
    }

    public void setBeforeSendFeedback(p5 p5Var) {
    }

    public void setBeforeSendReplay(q5 q5Var) {
    }

    public void setBeforeSendTransaction(r5 r5Var) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z) {
        this.captureOpenTelemetryEvents = z;
    }

    public void setCompositePerformanceCollector(l lVar) {
        this.compositePerformanceCollector = lVar;
    }

    public void setConnectionStatusProvider(o0 o0Var) {
        this.connectionStatusProvider = o0Var;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setContinuousProfiler(p0 p0Var) {
        if (this.continuousProfiler != n2.a || p0Var == null) {
            return;
        }
        this.continuousProfiler = p0Var;
    }

    public void setCron(s5 s5Var) {
        this.cron = s5Var;
    }

    public void setDateProvider(o4 o4Var) {
        this.dateProvider.c(o4Var);
    }

    public void setDeadlineTimeout(long j) {
        this.deadlineTimeout = j;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.a;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(ScopeType scopeType) {
        this.defaultScopeType = scopeType;
    }

    public void setDiagnosticLevel(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(t5 t5Var) {
        if (t5Var == null) {
            t5Var = new t5();
        }
        this.distribution = t5Var;
    }

    public void setDistributionController(q0 q0Var) {
        if (q0Var == null) {
            q0Var = o2.a;
        }
        this.distributionController = q0Var;
    }

    public void setDsn(String str) {
        String string = null;
        this.dsn = str != null ? str.trim() : null;
        this.parsedDsn.b();
        String str2 = this.dsn;
        u0 u0Var = this.logger;
        Charset charset = io.sentry.util.k.a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(io.sentry.util.k.a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                u0Var.f(SentryLevel.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th) {
                u0Var.i(SentryLevel.INFO, "string: %s could not calculate its hash", th, str2);
            }
        }
        this.dsnHash = string;
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableCacheTracing(boolean z) {
        this.enableCacheTracing = z;
    }

    public void setEnableDatabaseTransactionTracing(boolean z) {
        this.enableDatabaseTransactionTracing = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableEventSizeLimiting(boolean z) {
        this.enableEventSizeLimiting = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableQueueTracing(boolean z) {
        this.enableQueueTracing = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.i.a;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(r0 r0Var) {
        io.sentry.util.e eVar = this.envelopeReader;
        if (r0Var == null) {
            r0Var = p2.a;
        }
        eVar.c(r0Var);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(g1 g1Var) {
        if (g1Var != null) {
            this.executorService = g1Var;
        }
    }

    public void setFatalLogger(u0 u0Var) {
        if (u0Var == null) {
            u0Var = r2.a;
        }
        this.fatalLogger = u0Var;
    }

    public void setFeedbackOptions(b5 b5Var) {
        this.feedbackOptions = b5Var;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z) {
        this.forceInit = z;
    }

    public void setFullyDisplayedReporter(g0 g0Var) {
        this.fullyDisplayedReporter = g0Var;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(InitPriority initPriority) {
        this.initPriority = initPriority;
    }

    @Deprecated
    public void setInstrumenter(Instrumenter instrumenter) {
        this.instrumenter = instrumenter;
    }

    public void setLogger(u0 u0Var) {
        this.logger = u0Var == null ? r2.a : new io.sentry.internal.debugmeta.c(this, u0Var, 1);
    }

    public void setLogs(u5 u5Var) {
        this.logs = u5Var;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxFeatureFlags(int i) {
        this.maxFeatureFlags = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(SentryOptions$RequestSize sentryOptions$RequestSize) {
        this.maxRequestBodySize = sentryOptions$RequestSize;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setMetrics(v5 v5Var) {
        this.metrics = v5Var;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.a;
        }
        this.modulesLoader = aVar;
    }

    public void setOnDiscard(w5 w5Var) {
    }

    public void setOnOversizedEvent(x5 x5Var) {
    }

    public void setOpenTelemetryMode(SentryOpenTelemetryMode sentryOpenTelemetryMode) {
        this.openTelemetryMode = sentryOpenTelemetryMode;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfileLifecycle(ProfileLifecycle profileLifecycle) {
        this.profileLifecycle = profileLifecycle;
        if (profileLifecycle != ProfileLifecycle.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.i(SentryLevel.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d) {
        if (io.sentry.config.a.O(d, true)) {
            this.profileSessionSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(z0 z0Var) {
        this.profilerConverter = z0Var;
    }

    public void setProfilesSampleRate(Double d) {
        if (io.sentry.config.a.O(d, true)) {
            this.profilesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(y5 y5Var) {
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z) {
        this.propagateTraceparent = z;
    }

    public void setProxy(z5 z5Var) {
        this.proxy = z5Var;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(s3 s3Var) {
        if (s3Var == null) {
            s3Var = o2.c;
        }
        this.replayController = s3Var;
    }

    public void setSampleRate(Double d) {
        if (io.sentry.config.a.O(d, true)) {
            this.sampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setScopesStorageFactory(e1 e1Var) {
    }

    public void setSdkVersion(io.sentry.protocol.t tVar) {
        io.sentry.protocol.t tVar2 = getSessionReplay().l;
        io.sentry.protocol.t tVar3 = this.sdkVersion;
        if (tVar3 != null && tVar2 != null && tVar3.equals(tVar2)) {
            getSessionReplay().l = tVar;
        }
        this.sdkVersion = tVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new io.sentry.internal.debugmeta.c(this);
        } else {
            this.clientReportRecorder = new io.sentry.hints.i();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(i1 i1Var) {
        io.sentry.util.e eVar = this.serializer;
        if (i1Var == null) {
            i1Var = a3.a;
        }
        eVar.c(i1Var);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(d6 d6Var) {
        this.sessionReplay = d6Var;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSocketTagger(j1 j1Var) {
        if (j1Var == null) {
            j1Var = b3.a;
        }
        this.socketTagger = j1Var;
    }

    public void setSpanFactory(l1 l1Var) {
        this.spanFactory = l1Var;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z) {
        this.startProfilerOnAppStart = z;
    }

    public void setStrictTraceContinuation(boolean z) {
        this.strictTraceContinuation = z;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (io.sentry.config.a.O(d, true)) {
            this.tracesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(a6 a6Var) {
    }

    public void setTransactionProfiler(n1 n1Var) {
        if (this.transactionProfiler != o2.d || n1Var == null) {
            return;
        }
        this.transactionProfiler = n1Var;
    }

    public void setTransportFactory(o1 o1Var) {
        if (o1Var == null) {
            o1Var = f3.a;
        }
        this.transportFactory = o1Var;
    }

    public void setTransportGate(io.sentry.transport.h hVar) {
        if (hVar == null) {
            hVar = io.sentry.transport.k.a;
        }
        this.transportGate = hVar;
    }

    public void setVersionDetector(p1 p1Var) {
        this.versionDetector = p1Var;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
