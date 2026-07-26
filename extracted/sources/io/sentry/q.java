package io.sentry;

import defpackage.dw1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.AutoClosableReentrantLock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements l {
    public final ArrayList d;
    public final ArrayList e;
    public final boolean f;
    public final b6 g;
    public final AutoClosableReentrantLock a = new AutoClosableReentrantLock();
    public volatile Timer b = null;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public long i = 0;

    public q(SentryAndroidOptions sentryAndroidOptions) {
        boolean z = false;
        io.sentry.config.a.W(sentryAndroidOptions, "The options object is required.");
        this.g = sentryAndroidOptions;
        this.d = new ArrayList();
        this.e = new ArrayList();
        for (w0 w0Var : sentryAndroidOptions.getPerformanceCollectors()) {
            if (w0Var instanceof y0) {
                this.d.add((y0) w0Var);
            }
            if (w0Var instanceof x0) {
                this.e.add((x0) w0Var);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // io.sentry.l
    public final void a(String str) {
        if (this.f) {
            this.g.getLogger().i(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.c.containsKey(str)) {
            this.c.put(str, new p(this, null));
        }
        if (this.h.getAndSet(true)) {
            return;
        }
        r rVarA = this.a.a();
        try {
            if (this.b == null) {
                this.b = new Timer(true);
            }
            this.b.schedule(new n(0, this), 0L);
            this.b.scheduleAtFixedRate(new o(this, new ArrayList()), 100L, 100L);
            rVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.l
    public final void b(j6 j6Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.s1) ((x0) it.next())).e(j6Var);
        }
    }

    @Override // io.sentry.l
    public final List c(String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        p pVar = (p) concurrentHashMap.remove(str);
        this.g.getLogger().i(SentryLevel.DEBUG, dw1.n("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (pVar != null) {
            return pVar.a;
        }
        return null;
    }

    @Override // io.sentry.l
    public final void close() {
        this.g.getLogger().i(SentryLevel.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.s1) ((x0) it.next())).d();
        }
        if (this.h.getAndSet(false)) {
            r rVarA = this.a.a();
            try {
                if (this.b != null) {
                    this.b.cancel();
                    this.b = null;
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

    @Override // io.sentry.l
    public final void d(j6 j6Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.s1) ((x0) it.next())).f(j6Var);
        }
    }

    @Override // io.sentry.l
    public final void e(h6 h6Var) {
        if (this.f) {
            this.g.getLogger().i(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.s1) ((x0) it.next())).f(h6Var);
        }
        String string = h6Var.a.toString();
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(string)) {
            concurrentHashMap.put(string, new p(this, h6Var));
        }
        a(string);
    }

    @Override // io.sentry.l
    public final List f(m1 m1Var) {
        this.g.getLogger().i(SentryLevel.DEBUG, "stop collecting performance info for transactions %s (%s)", m1Var.getName(), m1Var.x().a.toString());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.s1) ((x0) it.next())).e(m1Var);
        }
        return c(m1Var.t().toString());
    }
}
