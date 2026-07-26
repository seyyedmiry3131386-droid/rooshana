package io.sentry.android.replay;

import android.os.Handler;
import defpackage.dw1;
import defpackage.js3;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.f2;
import io.sentry.u0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Runnable {
    public final b6 a;
    public final f2 b;
    public q c;
    public r d;
    public final AtomicBoolean e;

    public v(b6 b6Var, f2 f2Var) {
        js3.p(f2Var, "mainLooperHandler");
        this.a = b6Var;
        this.b = f2Var;
        this.e = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.e.get();
        b6 b6Var = this.a;
        if (!z) {
            if (b6Var.getSessionReplay().m) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                return;
            }
            return;
        }
        try {
            if (b6Var.getSessionReplay().m) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Capturing a frame.", new Object[0]);
            }
            q qVar = this.c;
            if (qVar != null) {
                qVar.b();
            }
        } catch (Throwable th) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Failed to capture a frame", th);
        }
        if (b6Var.getSessionReplay().m) {
            u0 logger = b6Var.getLogger();
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
            r rVar = this.d;
            logger.i(sentryLevel, dw1.k(rVar != null ? rVar.e : 1, " fps.", sb), new Object[0]);
        }
        r rVar2 = this.d;
        if (((Handler) this.b.b).postDelayed(this, 1000 / ((long) (rVar2 != null ? rVar2.e : 1)))) {
            return;
        }
        b6Var.getLogger().i(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
    }
}
