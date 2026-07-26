package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import defpackage.i48;
import defpackage.nd1;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.h4;
import io.sentry.h6;
import io.sentry.p3;
import io.sentry.q3;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements io.sentry.n1 {
    public final Context a;
    public final io.sentry.u0 b;
    public final String c;
    public final boolean d;
    public final int e;
    public final io.sentry.util.d f;
    public final j0 g;
    public final io.sentry.android.core.internal.util.s j;
    public volatile q3 k;
    public long m;
    public long n;
    public Date o;
    public boolean h = false;
    public final AtomicBoolean i = new AtomicBoolean(false);
    public volatile s l = null;
    public final AutoClosableReentrantLock p = new AutoClosableReentrantLock();

    public u(Context context, j0 j0Var, io.sentry.android.core.internal.util.s sVar, io.sentry.u0 u0Var, String str, boolean z, int i, io.sentry.util.d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        io.sentry.config.a.W(u0Var, "ILogger is required");
        this.b = u0Var;
        this.j = sVar;
        io.sentry.config.a.W(j0Var, "The BuildInfoProvider is required.");
        this.g = j0Var;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = dVar;
        this.o = io.sentry.config.a.z();
    }

    public final p3 a(String str, String str2, String str3, boolean z, List list, b6 b6Var) {
        this.g.getClass();
        int i = Build.VERSION.SDK_INT;
        if (this.l != null) {
            io.sentry.r rVarA = this.p.a();
            try {
                q3 q3Var = this.k;
                if (q3Var == null || !q3Var.a.equals(str2)) {
                    this.b.i(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    rVarA.close();
                    return null;
                }
                this.k = null;
                rVarA.close();
                this.b.i(SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                i48 i48VarA = this.l.a(list, false);
                this.i.set(false);
                if (i48VarA != null) {
                    long j = i48VarA.a - this.m;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(q3Var);
                    long j2 = i48VarA.a;
                    long j3 = this.m;
                    long j4 = i48VarA.b;
                    long j5 = this.n;
                    if (q3Var.e == null) {
                        q3Var.e = Long.valueOf(j2 - j3);
                        q3Var.d = Long.valueOf(q3Var.d.longValue() - j3);
                        q3Var.g = Long.valueOf(j4 - j5);
                        q3Var.f = Long.valueOf(q3Var.f.longValue() - j5);
                    }
                    Long l = b6Var instanceof SentryAndroidOptions ? m0.c(this.a, (SentryAndroidOptions) b6Var).h : null;
                    String string = l != null ? Long.toString(l.longValue()) : "0";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = (File) i48VarA.d;
                    Date date = this.o;
                    String string2 = Long.toString(j);
                    this.g.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    io.sentry.i0 i0Var = new io.sentry.i0(3);
                    this.g.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.g.getClass();
                    String str6 = Build.MODEL;
                    this.g.getClass();
                    return new p3(file, date, arrayList, str, str2, str3, string2, i, str4, i0Var, str5, str6, Build.VERSION.RELEASE, this.g.b(), string, b6Var.getProguardUuid(), b6Var.getRelease(), b6Var.getEnvironment(), (i48VarA.c || z) ? "timeout" : "normal", (Map) i48VarA.e);
                }
            } finally {
            }
        }
        return null;
    }

    @Override // io.sentry.n1
    public final void close() {
        u uVar;
        q3 q3Var = this.k;
        if (q3Var != null) {
            uVar = this;
            uVar.a(q3Var.c, q3Var.a, q3Var.b, true, null, h4.b().m());
        } else {
            uVar = this;
        }
        uVar.i.set(false);
        if (uVar.l == null) {
            return;
        }
        s sVar = uVar.l;
        io.sentry.r rVarA = sVar.o.a();
        try {
            Future future = sVar.d;
            if (future != null) {
                future.cancel(true);
                sVar.d = null;
            }
            if (sVar.n) {
                sVar.a(null, true);
            }
            rVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.n1
    public final void g(io.sentry.m1 m1Var) {
        if (this.i.get() && this.k == null) {
            io.sentry.r rVarA = this.p.a();
            try {
                if (this.i.get() && this.k == null) {
                    this.k = new q3(m1Var, Long.valueOf(this.m), Long.valueOf(this.n));
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

    @Override // io.sentry.n1
    public final p3 h(h6 h6Var, List list, b6 b6Var) {
        return a(h6Var.e, h6Var.a.toString(), h6Var.b.c.a.toString(), false, list, b6Var);
    }

    @Override // io.sentry.n1
    public final boolean isRunning() {
        return this.i.get();
    }

    @Override // io.sentry.n1
    public final void start() {
        nd1 nd1VarC;
        this.g.getClass();
        if (this.i.getAndSet(true)) {
            return;
        }
        if (!this.h) {
            this.h = true;
            if (this.d) {
                String str = this.c;
                if (str == null) {
                    this.b.i(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i = this.e;
                    if (i <= 0) {
                        this.b.i(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                    } else {
                        this.l = new s(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.e, this.j, this.f, this.b);
                    }
                }
            } else {
                this.b.i(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.l != null && (nd1VarC = this.l.c()) != null) {
            this.m = nd1VarC.a;
            this.n = nd1VarC.b;
            this.o = (Date) nd1VarC.c;
            this.b.i(SentryLevel.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.l != null && this.l.n) {
            this.b.i(SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        io.sentry.r rVarA = this.p.a();
        try {
            this.k = null;
            rVarA.close();
            this.i.set(false);
        } finally {
        }
    }
}
