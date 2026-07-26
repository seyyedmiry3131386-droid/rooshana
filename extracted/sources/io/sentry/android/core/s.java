package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import defpackage.i48;
import defpackage.kb8;
import defpackage.nd1;
import io.sentry.SentryLevel;
import io.sentry.k3;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public final File b;
    public final int c;
    public String f;
    public final io.sentry.android.core.internal.util.s g;
    public final io.sentry.util.d l;
    public final io.sentry.u0 m;
    public long a = 0;
    public Future d = null;
    public File e = null;
    public final ArrayDeque h = new ArrayDeque();
    public final ArrayDeque i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public final HashMap k = new HashMap();
    public volatile boolean n = false;
    public final AutoClosableReentrantLock o = new AutoClosableReentrantLock();

    public s(String str, int i, io.sentry.android.core.internal.util.s sVar, io.sentry.util.d dVar, io.sentry.u0 u0Var) {
        io.sentry.config.a.W(str, "TracesFilesDirPath is required");
        this.b = new File(str);
        this.c = i;
        io.sentry.config.a.W(u0Var, "Logger is required");
        this.m = u0Var;
        this.l = dVar;
        io.sentry.config.a.W(sVar, "SentryFrameMetricsCollector is required");
        this.g = sVar;
    }

    public final i48 a(List list, boolean z) {
        io.sentry.r rVarA = this.o.a();
        try {
            if (!this.n) {
                this.m.i(SentryLevel.WARNING, "Profiler not running", new Object[0]);
                rVarA.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.n = false;
            this.g.b(this.f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.e == null) {
                this.m.i(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
                rVarA.close();
                return null;
            }
            if (!this.i.isEmpty()) {
                this.k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.i));
            }
            if (!this.j.isEmpty()) {
                this.k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
            }
            if (!this.h.isEmpty()) {
                this.k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.h));
            }
            b(list);
            Future future = this.d;
            if (future != null) {
                future.cancel(true);
                this.d = null;
            }
            i48 i48Var = new i48(jElapsedRealtimeNanos, elapsedCpuTime, z, this.e, this.k);
            rVarA.close();
            return i48Var;
        } finally {
        }
    }

    public final void b(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        k3 k3Var = (k3) it.next();
                        long j = k3Var.d;
                        long j2 = j + jElapsedRealtimeNanos;
                        Double d = k3Var.a;
                        Long l = k3Var.b;
                        Long l2 = k3Var.c;
                        if (d != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), d, j));
                        }
                        if (l != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), l, j));
                        }
                        if (l2 != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), l2, j));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final nd1 c() {
        String strX;
        io.sentry.r rVarA = this.o.a();
        try {
            int i = this.c;
            if (i == 0) {
                this.m.i(SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                rVarA.close();
                return null;
            }
            if (this.n) {
                this.m.i(SentryLevel.WARNING, "Profiling has already started...", new Object[0]);
                rVarA.close();
                return null;
            }
            this.e = new File(this.b, io.sentry.config.a.x().concat(".trace"));
            this.k.clear();
            this.h.clear();
            this.i.clear();
            this.j.clear();
            io.sentry.android.core.internal.util.s sVar = this.g;
            r rVar = new r(this);
            if (sVar.g) {
                strX = io.sentry.config.a.x();
                sVar.f.put(strX, rVar);
                sVar.c();
            } else {
                strX = null;
            }
            this.f = strX;
            try {
                io.sentry.util.d dVar = this.l;
                if (dVar != null) {
                    this.d = ((io.sentry.g1) dVar.c()).c(new kb8(11, this), 30000L);
                }
            } catch (RejectedExecutionException e) {
                this.m.f(SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
            }
            this.a = SystemClock.elapsedRealtimeNanos();
            Date dateZ = io.sentry.config.a.z();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.e.getPath(), 3000000, this.c);
                this.n = true;
                long j = this.a;
                nd1 nd1Var = new nd1();
                nd1Var.a = j;
                nd1Var.b = elapsedCpuTime;
                nd1Var.c = dateZ;
                rVarA.close();
                return nd1Var;
            } catch (Throwable th) {
                a(null, false);
                this.m.f(SentryLevel.ERROR, "Unable to start a profile: ", th);
                this.n = false;
                rVarA.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
