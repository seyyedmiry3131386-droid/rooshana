package io.sentry.android.core.cache;

import android.os.SystemClock;
import defpackage.o40;
import defpackage.tg1;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.d;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.performance.h;
import io.sentry.android.core.v1;
import io.sentry.android.core.x;
import io.sentry.b6;
import io.sentry.cache.c;
import io.sentry.h0;
import io.sentry.s6;
import io.sentry.u0;
import io.sentry.u1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    public static final List k = Arrays.asList(new a(x.class, "ANR", "last_anr_report", new u1(21)), new a(v1.class, "Tombstone", "last_tombstone_report", new u1(22)));
    public final d j;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        io.sentry.config.a.W(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.j = d.a;
    }

    public static Long j(b6 b6Var, String str, String str2) {
        String cacheDirPath = b6Var.getCacheDirPath();
        io.sentry.config.a.W(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String strV = io.sentry.config.a.V(file);
            if (strV != null && !strV.equals(Ssh2PublicKeyAlgorithmName.NULL)) {
                return Long.valueOf(Long.parseLong(strV.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                b6Var.getLogger().i(SentryLevel.DEBUG, o40.y("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            b6Var.getLogger().f(SentryLevel.ERROR, o40.y("Error reading last ", str2, " marker"), th);
            return null;
        }
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final boolean R(io.sentry.internal.debugmeta.c cVar, h0 h0Var) {
        boolean zR = super.R(cVar, h0Var);
        b6 b6Var = this.a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) b6Var;
        h hVar = g.c().e;
        if (s6.class.isInstance(h0Var.b("sentry:typeCheckHint")) && hVar.b()) {
            this.j.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - hVar.c;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                u0 logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.i(sentryLevel, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = b6Var.getOutboxPath();
                if (outboxPath == null) {
                    b6Var.getLogger().i(sentryLevel, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th) {
                        b6Var.getLogger().f(SentryLevel.ERROR, "Error writing the startup crash marker file to the disk", th);
                    }
                }
            }
        }
        for (a aVar : k) {
            Class cls = aVar.a;
            tg1 tg1Var = new tg1(aVar, sentryAndroidOptions, this, 15);
            Object objB = h0Var.b("sentry:typeCheckHint");
            if (cls.isInstance(h0Var.b("sentry:typeCheckHint")) && objB != null) {
                tg1Var.accept(objB);
            }
        }
        return zR;
    }
}
