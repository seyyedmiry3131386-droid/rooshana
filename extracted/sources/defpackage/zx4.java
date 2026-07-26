package defpackage;

import com.google.common.util.concurrent.f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zx4 extends wx4 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public zx4(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // defpackage.wx4, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        d1.j(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        f fVar = new f(callable);
        return new xx4(fVar, this.b.schedule(fVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        yx4 yx4Var = new yx4(runnable);
        return new xx4(yx4Var, this.b.scheduleAtFixedRate(yx4Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        yx4 yx4Var = new yx4(runnable);
        return new xx4(yx4Var, this.b.scheduleWithFixedDelay(yx4Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        f fVar = new f(Executors.callable(runnable, null));
        return new xx4(fVar, this.b.schedule(fVar, j, timeUnit));
    }
}
