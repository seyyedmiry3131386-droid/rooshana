package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import defpackage.kb8;
import defpackage.r59;
import io.sentry.SentryLevel;
import io.sentry.r2;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Closeable {
    public static final c0 e = new c0();
    public volatile b0 b;
    public final AutoClosableReentrantLock a = new AutoClosableReentrantLock();
    public final j0 c = new j0();
    public volatile Boolean d = null;

    public final void b(a0 a0Var) {
        io.sentry.r rVarA = this.a.a();
        try {
            g(r2.a);
            if (this.b != null) {
                ((AppState$LifecycleObserver$1) this.b.a).add(a0Var);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u();
    }

    public final void d(io.sentry.u0 u0Var) {
        b0 b0Var = this.b;
        if (b0Var != null) {
            try {
                ProcessLifecycleOwner.i.f.a(b0Var);
            } catch (Throwable th) {
                this.b = null;
                u0Var.f(SentryLevel.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    public final void g(io.sentry.u0 u0Var) {
        if (this.b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.i;
            this.b = new b0(this);
            if (io.sentry.android.core.internal.util.f.a.c()) {
                d(u0Var);
                return;
            }
            j0 j0Var = this.c;
            ((Handler) j0Var.a).post(new r59(this, u0Var, 6));
        } catch (ClassNotFoundException unused) {
            u0Var.i(SentryLevel.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            u0Var.f(SentryLevel.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    public final void k(a0 a0Var) {
        io.sentry.r rVarA = this.a.a();
        try {
            if (this.b != null) {
                ((CopyOnWriteArrayList) this.b.a).remove(a0Var);
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

    public final void u() {
        if (this.b == null) {
            return;
        }
        io.sentry.r rVarA = this.a.a();
        try {
            b0 b0Var = this.b;
            ((CopyOnWriteArrayList) this.b.a).clear();
            this.b = null;
            rVarA.close();
            if (io.sentry.android.core.internal.util.f.a.c()) {
                if (b0Var != null) {
                    ProcessLifecycleOwner.i.f.f(b0Var);
                }
            } else {
                j0 j0Var = this.c;
                ((Handler) j0Var.a).post(new kb8(this, b0Var));
            }
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
