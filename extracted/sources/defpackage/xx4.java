package defpackage;

import com.google.common.util.concurrent.b;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class xx4 extends hs9 implements ScheduledFuture, n94, Future {
    public final b s;
    public final ScheduledFuture t;

    public xx4(b bVar, ScheduledFuture scheduledFuture) {
        super(16);
        this.s = bVar;
        this.t = scheduledFuture;
    }

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        return this.s;
    }

    public final boolean Y(boolean z) {
        return this.s.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zY = Y(z);
        if (zY) {
            this.t.cancel(z);
        }
        return zY;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.t.compareTo(delayed);
    }

    @Override // defpackage.n94
    public final void e(Runnable runnable, Executor executor) {
        this.s.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.s.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.t.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.s.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.s.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.s.get(j, timeUnit);
    }
}
