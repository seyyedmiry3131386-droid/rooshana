package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements io.sentry.util.thread.a {
    public static final f a;
    public static volatile long b;

    static {
        f fVar = new f();
        new Handler(Looper.getMainLooper()).post(new e(0));
        a = fVar;
        b = Process.myTid();
    }

    public static long d(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    @Override // io.sentry.util.thread.a
    public final String a() {
        return c() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long b() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public final boolean c() {
        return d(Looper.getMainLooper().getThread()) == d(Thread.currentThread());
    }
}
