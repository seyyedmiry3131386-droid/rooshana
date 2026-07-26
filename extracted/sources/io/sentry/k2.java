package io.sentry;

import io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2;
import io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2;
import io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2;
import io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2;
import io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2;
import io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2;
import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVarA;
        switch (this.a) {
            case 0:
                b6 b6Var = (b6) this.b;
                String cacheDirPath = b6Var.getCacheDirPath();
                if (cacheDirPath == null) {
                    b6Var.getLogger().i(SentryLevel.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                    return;
                }
                io.sentry.cache.d envelopeDiskCache = b6Var.getEnvelopeDiskCache();
                if (envelopeDiskCache instanceof io.sentry.cache.c) {
                    Charset charset = io.sentry.cache.c.i;
                    io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
                    cVar.d(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                    cVar.e.countDown();
                    return;
                }
                return;
            case 1:
                ((BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2) this.b).invoke();
                return;
            case 2:
                ((BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2) this.b).invoke();
                return;
            case 3:
                ((BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2) this.b).invoke();
                return;
            case 4:
                ((BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2) this.b).invoke();
                return;
            case 5:
                ((BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2) this.b).invoke();
                return;
            case 6:
                ((BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2) this.b).invoke();
                return;
            case 7:
                io.sentry.logger.d dVar = (io.sentry.logger.d) this.b;
                do {
                    dVar.e();
                } while (dVar.c.size() >= 100);
                rVarA = dVar.f.a();
                try {
                    if (dVar.c.isEmpty()) {
                        dVar.g = false;
                    } else {
                        dVar.f(true, false);
                    }
                    rVarA.close();
                    return;
                } catch (Throwable th) {
                    try {
                        break;
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            default:
                io.sentry.metrics.c cVar2 = (io.sentry.metrics.c) this.b;
                do {
                    cVar2.d();
                } while (cVar2.c.size() >= 1000);
                rVarA = cVar2.e.a();
                try {
                    if (!cVar2.c.isEmpty()) {
                        cVar2.e(false);
                        break;
                    }
                    rVarA.close();
                    return;
                } finally {
                    try {
                        rVarA.close();
                        break;
                    } catch (Throwable th22) {
                        th.addSuppressed(th22);
                    }
                }
        }
    }
}
