package io.sentry;

import defpackage.rm7;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 implements g2 {
    public boolean a;
    public Double b;
    public boolean c;
    public Double d;
    public String e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ProfileLifecycle l;
    public ConcurrentHashMap m;

    public i4(b6 b6Var, p6 p6Var) {
        this.c = p6Var.a.booleanValue();
        this.d = p6Var.b;
        this.a = p6Var.d.booleanValue();
        this.b = p6Var.e;
        o6 internalTracesSampler = b6Var.getInternalTracesSampler();
        double dC = io.sentry.util.i.a().c();
        Double profileSessionSampleRate = internalTracesSampler.a.getProfileSessionSampleRate();
        this.i = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
        this.e = b6Var.getProfilingTracesDirPath();
        this.f = b6Var.isProfilingEnabled();
        this.g = b6Var.isContinuousProfilingEnabled();
        this.l = b6Var.getProfileLifecycle();
        this.h = b6Var.getProfilingTracesHz();
        this.j = b6Var.isEnableAppStartProfiling();
        this.k = b6Var.isStartProfilerOnAppStart();
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("profile_sampled");
        cVar.w(u0Var, Boolean.valueOf(this.a));
        cVar.q("profile_sample_rate");
        cVar.w(u0Var, this.b);
        cVar.q("continuous_profile_sampled");
        cVar.w(u0Var, Boolean.valueOf(this.i));
        cVar.q("trace_sampled");
        cVar.w(u0Var, Boolean.valueOf(this.c));
        cVar.q("trace_sample_rate");
        cVar.w(u0Var, this.d);
        cVar.q("profiling_traces_dir_path");
        cVar.w(u0Var, this.e);
        cVar.q("is_profiling_enabled");
        cVar.w(u0Var, Boolean.valueOf(this.f));
        cVar.q("is_continuous_profiling_enabled");
        cVar.w(u0Var, Boolean.valueOf(this.g));
        cVar.q("profile_lifecycle");
        cVar.w(u0Var, this.l.name());
        cVar.q("profiling_traces_hz");
        cVar.w(u0Var, Integer.valueOf(this.h));
        cVar.q("is_enable_app_start_profiling");
        cVar.w(u0Var, Boolean.valueOf(this.j));
        cVar.q("is_start_profiler_on_app_start");
        cVar.w(u0Var, Boolean.valueOf(this.k));
        ConcurrentHashMap concurrentHashMap = this.m;
        if (concurrentHashMap != null) {
            for (K k : concurrentHashMap.keySet()) {
                rm7.z(this.m, k, cVar, k, u0Var);
            }
        }
        cVar.n();
    }
}
