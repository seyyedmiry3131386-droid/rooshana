package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import io.sentry.SentryLevel;
import io.sentry.c2;
import io.sentry.w4;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements f0 {
    public final SentryAndroidOptions a;

    public y(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // io.sentry.android.core.f0
    public final int a() {
        return 6;
    }

    @Override // io.sentry.android.core.f0
    public final Long b() {
        return io.sentry.android.core.cache.b.j(this.a, "last_anr_report", "ANR");
    }

    @Override // io.sentry.android.core.f0
    public final String c() {
        return "ANR";
    }

    @Override // io.sentry.android.core.f0
    public final boolean d() {
        return this.a.isReportHistoricalAnrs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.android.core.f0
    public final io.sentry.k e(ApplicationExitInfo applicationExitInfo, boolean z) {
        z zVar;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = this.a;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z2 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == 0) {
                    zVar = new z(AnrV2Integration$ParseResult$Type.NO_DUMP);
                    traceInputStream = traceInputStream;
                    if (traceInputStream != 0) {
                        traceInputStream.close();
                        traceInputStream = traceInputStream;
                    }
                } else {
                    byte[] bArrT = io.sentry.config.a.T(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrT)));
                        try {
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                aVar.a = line;
                                arrayList.add(aVar);
                            }
                            io.sentry.android.core.internal.threaddump.b bVar = new io.sentry.android.core.internal.threaddump.b(arrayList);
                            io.sentry.android.core.internal.threaddump.c cVar = new io.sentry.android.core.internal.threaddump.c(sentryAndroidOptions, z2);
                            cVar.d(bVar);
                            ArrayList arrayList2 = cVar.e;
                            ArrayList arrayList3 = new ArrayList(cVar.d.values());
                            io.sentry.protocol.c cVar2 = (io.sentry.protocol.c) cVar.f.b;
                            if (arrayList2.isEmpty()) {
                                zVar = new z(AnrV2Integration$ParseResult$Type.NO_DUMP);
                                bufferedReader.close();
                                traceInputStream = bufferedReader;
                            } else {
                                z zVar2 = new z(AnrV2Integration$ParseResult$Type.DUMP, bArrT, arrayList2, arrayList3, cVar2);
                                bufferedReader.close();
                                zVar = zVar2;
                                traceInputStream = bufferedReader;
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().f(SentryLevel.WARNING, "Failed to parse ANR thread dump", th);
                        AnrV2Integration$ParseResult$Type anrV2Integration$ParseResult$Type = AnrV2Integration$ParseResult$Type.ERROR;
                        zVar = new z(anrV2Integration$ParseResult$Type, bArrT);
                        traceInputStream = anrV2Integration$ParseResult$Type;
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().f(SentryLevel.WARNING, "Failed to read ANR thread dump", th2);
            zVar = new z(AnrV2Integration$ParseResult$Type.NO_DUMP);
        }
        AnrV2Integration$ParseResult$Type anrV2Integration$ParseResult$Type2 = AnrV2Integration$ParseResult$Type.NO_DUMP;
        AnrV2Integration$ParseResult$Type anrV2Integration$ParseResult$Type3 = zVar.a;
        if (anrV2Integration$ParseResult$Type3 == anrV2Integration$ParseResult$Type2) {
            sentryAndroidOptions.getLogger().i(SentryLevel.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return null;
        }
        x xVar = new x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
        io.sentry.h0 h0VarO = io.sentry.config.a.o(xVar);
        w4 w4Var = new w4();
        if (anrV2Integration$ParseResult$Type3 == AnrV2Integration$ParseResult$Type.ERROR) {
            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
            oVar.a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            w4Var.q = oVar;
        } else if (anrV2Integration$ParseResult$Type3 == AnrV2Integration$ParseResult$Type.DUMP) {
            w4Var.s = new c2(zVar.c);
            ArrayList arrayList4 = zVar.d;
            if (arrayList4 != null) {
                io.sentry.protocol.f fVar = new io.sentry.protocol.f();
                fVar.b = new ArrayList(arrayList4);
                w4Var.n = fVar;
            }
            io.sentry.protocol.c cVar3 = zVar.e;
            if (cVar3 != null) {
                w4Var.b.k(cVar3, "art");
            }
        }
        w4Var.u = SentryLevel.FATAL;
        w4Var.p = io.sentry.config.a.A(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = zVar.b) != null) {
            h0VarO.f = new io.sentry.a(bArr, "thread-dump.txt", "text/plain");
        }
        return new io.sentry.k(w4Var, h0VarO, xVar, 3);
    }
}
