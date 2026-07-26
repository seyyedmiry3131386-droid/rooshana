package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.ir9;
import io.sentry.SentryLevel;
import io.sentry.w4;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements f0 {
    public final SentryAndroidOptions a;
    public final ir9 b;
    public final Context c;

    public w1(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
        this.b = new ir9(sentryAndroidOptions);
        this.c = context;
    }

    @Override // io.sentry.android.core.f0
    public final int a() {
        return 5;
    }

    @Override // io.sentry.android.core.f0
    public final Long b() {
        return io.sentry.android.core.cache.b.j(this.a, "last_tombstone_report", "Tombstone");
    }

    @Override // io.sentry.android.core.f0
    public final String c() {
        return "Tombstone";
    }

    @Override // io.sentry.android.core.f0
    public final boolean d() {
        return this.a.isReportHistoricalTombstones();
    }

    @Override // io.sentry.android.core.f0
    public final io.sentry.k e(ApplicationExitInfo applicationExitInfo, boolean z) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            boolean zIsAttachRawTombstone = sentryAndroidOptions.isAttachRawTombstone();
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    sentryAndroidOptions.getLogger().i(SentryLevel.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                    if (traceInputStream == null) {
                        return null;
                    }
                    traceInputStream.close();
                    return null;
                }
                byte[] bArrT = zIsAttachRawTombstone ? io.sentry.config.a.T(traceInputStream) : null;
                io.sentry.android.core.internal.tombstone.a aVar = new io.sentry.android.core.internal.tombstone.a(zIsAttachRawTombstone ? new ByteArrayInputStream(bArrT) : traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), this.c.getApplicationInfo().nativeLibraryDir);
                try {
                    w4 w4VarB = aVar.b();
                    aVar.close();
                    traceInputStream.close();
                    long timestamp = applicationExitInfo.getTimestamp();
                    w4VarB.p = io.sentry.config.a.A(timestamp);
                    v1 v1Var = new v1(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z);
                    io.sentry.h0 h0VarO = io.sentry.config.a.o(v1Var);
                    if (bArrT != null) {
                        h0VarO.g = new io.sentry.a(bArrT, "tombstone.pb", "application/x-protobuf");
                    }
                    try {
                        w4 w4VarF = f(timestamp, w4VarB, h0VarO);
                        if (w4VarF != null) {
                            w4VarB = w4VarF;
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().i(SentryLevel.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                    }
                    return new io.sentry.k(w4VarB, h0VarO, v1Var, 3);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().i(SentryLevel.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th2.getMessage());
            return null;
        }
        sentryAndroidOptions.getLogger().i(SentryLevel.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th2.getMessage());
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x012c, code lost:
    
        r13.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.w4 f(long r23, io.sentry.w4 r25, io.sentry.h0 r26) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.w1.f(long, io.sentry.w4, io.sentry.h0):io.sentry.w4");
    }
}
