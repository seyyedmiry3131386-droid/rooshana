package io.sentry;

import io.sentry.protocol.TransactionNameSource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ f4(b6 b6Var, int i) {
        this.a = i;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.loadLazyFields();
                return;
            case 1:
                b6 b6Var = this.b;
                String cacheDirPathWithoutDsn = b6Var.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        io.sentry.config.a.p(file);
                        if (b6Var.isEnableAppStartProfiling() || b6Var.isStartProfilerOnAppStart()) {
                            if (!b6Var.isStartProfilerOnAppStart() && !b6Var.isTracingEnabled()) {
                                b6Var.getLogger().i(SentryLevel.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                i4 i4Var = new i4(b6Var, b6Var.isEnableAppStartProfiling() ? b6Var.getInternalTracesSampler().a(new io.sentry.internal.debugmeta.c(new q6("app.launch", TransactionNameSource.CUSTOM, "profile", null), Double.valueOf(io.sentry.util.i.a().c()))) : new p6(Boolean.FALSE, null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, h4.e));
                                    try {
                                        b6Var.getSerializer().a(i4Var, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } finally {
                                        try {
                                            break;
                                        } catch (Throwable th) {
                                        }
                                    }
                                } finally {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        b6Var.getLogger().f(SentryLevel.ERROR, "Unable to create app start profiling config file. ", th3);
                        return;
                    }
                }
                return;
            case 2:
                b6 b6Var2 = this.b;
                for (v0 v0Var : b6Var2.getOptionsObservers()) {
                    String release = b6Var2.getRelease();
                    io.sentry.cache.e eVar = (io.sentry.cache.e) v0Var;
                    if (release == null) {
                        eVar.a("release.json");
                    } else {
                        eVar.b(release, "release.json");
                    }
                    String proguardUuid = b6Var2.getProguardUuid();
                    if (proguardUuid == null) {
                        eVar.a("proguard-uuid.json");
                    } else {
                        eVar.b(proguardUuid, "proguard-uuid.json");
                    }
                    io.sentry.protocol.t sdkVersion = b6Var2.getSdkVersion();
                    if (sdkVersion == null) {
                        eVar.a("sdk-version.json");
                    } else {
                        eVar.b(sdkVersion, "sdk-version.json");
                    }
                    String dist = b6Var2.getDist();
                    if (dist == null) {
                        eVar.a("dist.json");
                    } else {
                        eVar.b(dist, "dist.json");
                    }
                    String environment = b6Var2.getEnvironment();
                    if (environment == null) {
                        eVar.a("environment.json");
                    } else {
                        eVar.b(environment, "environment.json");
                    }
                    eVar.b(b6Var2.getTags(), "tags.json");
                    Double d = b6Var2.getSessionReplay().e;
                    if (d == null) {
                        eVar.a("replay-error-sample-rate.json");
                    } else {
                        eVar.b(d.toString(), "replay-error-sample-rate.json");
                    }
                }
                io.sentry.cache.f fVarFindPersistingScopeObserver = b6Var2.findPersistingScopeObserver();
                if (fVarFindPersistingScopeObserver != null) {
                    try {
                        ((io.sentry.cache.tape.g) fVarFindPersistingScopeObserver.b.a()).clear();
                        break;
                    } catch (IOException e) {
                        fVarFindPersistingScopeObserver.a.getLogger().f(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    }
                    fVarFindPersistingScopeObserver.a("user.json");
                    fVarFindPersistingScopeObserver.a("level.json");
                    fVarFindPersistingScopeObserver.a("request.json");
                    fVarFindPersistingScopeObserver.a("fingerprint.json");
                    fVarFindPersistingScopeObserver.a("contexts.json");
                    fVarFindPersistingScopeObserver.a("extras.json");
                    fVarFindPersistingScopeObserver.a("tags.json");
                    fVarFindPersistingScopeObserver.a("trace.json");
                    fVarFindPersistingScopeObserver.a("transaction.json");
                    return;
                }
                return;
            default:
                h4.b().c(this.b.getFlushTimeoutMillis());
                return;
        }
    }
}
