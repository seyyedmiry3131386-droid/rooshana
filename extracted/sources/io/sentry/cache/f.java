package io.sentry.cache;

import defpackage.f09;
import defpackage.ii;
import defpackage.kb8;
import defpackage.r59;
import io.sentry.SentryLevel;
import io.sentry.a4;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b6;
import io.sentry.cache.tape.g;
import io.sentry.k6;
import io.sentry.protocol.g0;
import io.sentry.protocol.v;
import io.sentry.y3;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a4 {
    public static final Charset c = Charset.forName("UTF-8");
    public final b6 a;
    public final io.sentry.util.e b = new io.sentry.util.e(new f09(22, this));

    public f(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.a, ".scope-cache", str);
    }

    public final Object b(b6 b6Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return a.c(b6Var, ".scope-cache", str, cls);
        }
        try {
            return cls.cast(((g) this.b.a()).u());
        } catch (IOException unused) {
            b6Var.getLogger().i(SentryLevel.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void c(Runnable runnable) {
        b6 b6Var = this.a;
        if (b6Var.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    b6Var.getLogger().f(SentryLevel.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                b6Var.getExecutorService().submit(new r59(this, runnable, 23));
            } catch (Throwable th2) {
                b6Var.getLogger().f(SentryLevel.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    public final void d(Object obj, String str) {
        a.d(this.a, obj, ".scope-cache", str);
    }

    @Override // io.sentry.b1
    public final void k(io.sentry.f fVar) {
        c(new r59(this, fVar, 19));
    }

    @Override // io.sentry.a4, io.sentry.b1
    public final void l(v vVar) {
        c(new r59(this, vVar, 21));
    }

    @Override // io.sentry.a4, io.sentry.b1
    public final void m(Collection collection) {
        if (collection.isEmpty()) {
            c(new kb8(20, this));
        }
    }

    @Override // io.sentry.b1
    public final void n(g0 g0Var) {
        c(new r59(this, g0Var, 18));
    }

    @Override // io.sentry.b1
    public final void p(k6 k6Var, y3 y3Var) {
        c(new ii(this, k6Var, y3Var, 21));
    }

    @Override // io.sentry.a4, io.sentry.b1
    public final void q(io.sentry.protocol.e eVar) {
        c(new r59(this, eVar, 20));
    }

    @Override // io.sentry.a4, io.sentry.b1
    public final void r(String str) {
        c(new r59(this, str, 22));
    }
}
