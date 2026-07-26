package io.sentry;

import defpackage.r58;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {
    public static volatile k0 i;
    public final long a;
    public volatile String b;
    public volatile long c;
    public final AtomicBoolean d;
    public final i0 e;
    public final ExecutorService f;
    public static final long g = TimeUnit.HOURS.toMillis(5);
    public static final long h = TimeUnit.SECONDS.toMillis(1);
    public static final AutoClosableReentrantLock j = new AutoClosableReentrantLock();

    public k0() {
        i0 i0Var = new i0(0);
        this.d = new AtomicBoolean(false);
        this.f = Executors.newSingleThreadExecutor(new j0(0));
        this.a = g;
        this.e = i0Var;
        b();
    }

    public static k0 a() {
        if (i == null) {
            r rVarA = j.a();
            try {
                if (i == null) {
                    i = new k0();
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
        return i;
    }

    public final void b() {
        try {
            this.f.submit(new r58(1, this)).get(h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
