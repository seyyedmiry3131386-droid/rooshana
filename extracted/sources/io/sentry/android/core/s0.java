package io.sentry.android.core;

import defpackage.f09;
import io.sentry.SentryLevel;
import io.sentry.c4;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements a0 {
    public final long b;
    public io.sentry.n c;
    public final boolean g;
    public final boolean h;
    public final AtomicLong a = new AtomicLong(0);
    public final io.sentry.util.e d = new io.sentry.util.e(new io.sentry.u1(19));
    public final AutoClosableReentrantLock e = new AutoClosableReentrantLock();
    public final c4 f = c4.a;
    public final io.sentry.transport.d i = io.sentry.transport.d.a;

    public s0(boolean z, boolean z2, long j) {
        this.b = j;
        this.g = z;
        this.h = z2;
    }

    public final void a(String str) {
        if (this.h) {
            io.sentry.f fVar = new io.sentry.f();
            fVar.e = "navigation";
            fVar.c(str, "state");
            fVar.g = "app.lifecycle";
            fVar.i = SentryLevel.INFO;
            this.f.k(fVar);
        }
    }

    @Override // io.sentry.android.core.a0
    public final void b() {
        c();
        this.i.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        f09 f09Var = new f09(14, this);
        c4 c4Var = this.f;
        c4Var.s(f09Var);
        AtomicLong atomicLong = this.a;
        long j = atomicLong.get();
        if (j == 0 || j + this.b <= jCurrentTimeMillis) {
            if (this.g) {
                c4Var.q();
            }
            c4Var.m().getReplayController().K();
        }
        c4Var.m().getReplayController().u();
        atomicLong.set(jCurrentTimeMillis);
        a("foreground");
    }

    public final void c() {
        io.sentry.r rVarA = this.e.a();
        try {
            io.sentry.n nVar = this.c;
            if (nVar != null) {
                nVar.cancel();
                this.c = null;
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

    @Override // io.sentry.android.core.a0
    public final void g() {
        this.i.getClass();
        this.a.set(System.currentTimeMillis());
        this.f.m().getReplayController().b();
        io.sentry.r rVarA = this.e.a();
        try {
            c();
            this.c = new io.sentry.n(1, this);
            ((Timer) this.d.a()).schedule(this.c, this.b);
            rVarA.close();
            a("background");
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
