package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.SentryLevel;
import io.sentry.k3;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements io.sentry.y0 {
    public final io.sentry.u0 g;
    public long a = 0;
    public long b = 0;
    public long c = 1;
    public long d = 1;
    public double e = 1.0E9d / 1;
    public final File f = new File("/proc/self/stat");
    public boolean h = false;
    public final Pattern i = Pattern.compile("[\n\t\r ]");

    public i(io.sentry.u0 u0Var) {
        io.sentry.config.a.W(u0Var, "Logger is required.");
        this.g = u0Var;
    }

    @Override // io.sentry.y0
    public final void a(k3 k3Var) {
        if (this.h) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.a;
            this.a = jElapsedRealtimeNanos;
            long jB = b();
            long j2 = jB - this.b;
            this.b = jB;
            k3Var.a = Double.valueOf(((j2 / j) / this.d) * 100.0d);
        }
    }

    public final long b() {
        String strV;
        io.sentry.u0 u0Var = this.g;
        try {
            strV = io.sentry.config.a.V(this.f);
        } catch (IOException e) {
            this.h = false;
            u0Var.f(SentryLevel.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strV = null;
        }
        if (strV != null) {
            String[] strArrSplit = this.i.split(strV.trim());
            try {
                long j = Long.parseLong(strArrSplit[13]);
                long j2 = Long.parseLong(strArrSplit[14]);
                return (long) ((j + j2 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
                u0Var.f(SentryLevel.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }

    @Override // io.sentry.y0
    public final void c() {
        this.h = true;
        this.c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.e = 1.0E9d / this.c;
        this.b = b();
    }
}
