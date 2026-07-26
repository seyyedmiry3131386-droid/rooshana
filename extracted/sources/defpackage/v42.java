package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes3.dex */
public final class v42 extends u42 implements qi1 {
    public final Executor c;

    public v42(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = z01.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = z01.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            a.c(w61Var, cancellationException);
            ug1 ug1Var = up1.a;
            kf1.c.U(w61Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.qi1
    public final bq1 d(long j, Runnable runnable, w61 w61Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                a.c(w61Var, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new aq1(scheduledFutureSchedule) : me1.j.d(j, runnable, w61Var);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v42) && ((v42) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.y61
    public final String toString() {
        return this.c.toString();
    }

    @Override // defpackage.qi1
    public final void u(long j, om0 om0Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            g6 g6Var = new g6(25, this, om0Var, false);
            w61 w61Var = om0Var.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(g6Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                a.c(w61Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            om0Var.y(new im0(0, scheduledFutureSchedule));
        } else {
            me1.j.u(j, om0Var);
        }
    }
}
