package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class dm8 {
    public static final cm8 d = new cm8();
    public boolean a;
    public long b;
    public long c;

    public dm8 a() {
        this.a = false;
        return this;
    }

    public dm8 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public dm8 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public dm8 g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        js3.p(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "timeout < 0: ").toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }
}
