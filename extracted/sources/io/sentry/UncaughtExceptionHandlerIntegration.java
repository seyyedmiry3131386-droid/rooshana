package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.EventDropReason;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class UncaughtExceptionHandlerIntegration implements q1, Thread.UncaughtExceptionHandler, Closeable {
    public static final AutoClosableReentrantLock e = new AutoClosableReentrantLock();
    public Thread.UncaughtExceptionHandler a;
    public c4 b;
    public b6 c;
    public boolean d = false;

    @Override // io.sentry.q1
    public final void J(b6 b6Var) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        c4 c4Var;
        c4 c4Var2 = c4.a;
        if (this.d) {
            b6Var.getLogger().i(SentryLevel.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.d = true;
        this.b = c4Var2;
        this.c = b6Var;
        u0 logger = b6Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.i(sentryLevel, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.c.isEnableUncaughtExceptionHandler()));
        if (this.c.isEnableUncaughtExceptionHandler()) {
            r rVarA = e.a();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.c.getLogger().i(sentryLevel, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (c4Var = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).b) == null) {
                        this.a = defaultUncaughtExceptionHandler;
                    } else {
                        d1 d1Var = h4.a;
                        c4Var.getClass();
                        this.a = uncaughtExceptionHandlerIntegration.a;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                rVarA.close();
                this.c.getLogger().i(sentryLevel, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.config.a.a("UncaughtExceptionHandler");
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

    public final void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            b6 b6Var = this.c;
            if (b6Var != null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            b6 b6Var2 = this.c;
            if (b6Var2 != null) {
                b6Var2.getLogger().i(SentryLevel.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.a;
            if (this != uncaughtExceptionHandler2) {
                b(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.a = this.a;
            b6 b6Var3 = this.c;
            if (b6Var3 != null) {
                b6Var3.getLogger().i(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVarA = e.a();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.a);
                b6 b6Var = this.c;
                if (b6Var != null) {
                    b6Var.getLogger().i(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                b(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        io.sentry.protocol.v vVar;
        b6 b6Var = this.c;
        if (b6Var == null || this.b == null) {
            return;
        }
        b6Var.getLogger().i(SentryLevel.INFO, "Uncaught exception received.", new Object[0]);
        try {
            s6 s6Var = new s6(this.c.getFlushTimeoutMillis(), this.c.getLogger());
            io.sentry.protocol.n nVar = new io.sentry.protocol.n();
            nVar.d = Boolean.FALSE;
            nVar.a = "UncaughtExceptionHandler";
            w4 w4Var = new w4(new ExceptionMechanismException(nVar, th, thread, false));
            w4Var.u = SentryLevel.FATAL;
            if (this.b.o() == null && (vVar = w4Var.a) != null) {
                s6Var.g(vVar);
            }
            h0 h0VarO = io.sentry.config.a.o(s6Var);
            boolean zEquals = this.b.C(w4Var, h0VarO).equals(io.sentry.protocol.v.b);
            EventDropReason eventDropReason = (EventDropReason) h0VarO.c("sentry:eventDropReason", EventDropReason.class);
            if ((!zEquals || EventDropReason.MULTITHREADED_DEDUPLICATION.equals(eventDropReason)) && !s6Var.d()) {
                this.c.getLogger().i(SentryLevel.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", w4Var.a);
            }
        } catch (Throwable th2) {
            this.c.getLogger().f(SentryLevel.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.a != null) {
            this.c.getLogger().i(SentryLevel.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.a.uncaughtException(thread, th);
        } else if (this.c.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
