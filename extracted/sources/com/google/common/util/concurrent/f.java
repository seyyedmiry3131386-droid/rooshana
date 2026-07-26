package com.google.common.util.concurrent;

import com.google.common.util.concurrent.InterruptibleTask;
import defpackage.b02;
import defpackage.c0;
import defpackage.h0;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b implements RunnableFuture, h0 {
    public volatile TrustedListenableFutureTask$TrustedFutureInterruptibleTask h;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleTask] */
    public f(Callable callable) {
        this.h = new InterruptibleTask<Object>(callable) { // from class: com.google.common.util.concurrent.TrustedListenableFutureTask$TrustedFutureInterruptibleTask
            public final Callable c;

            {
                callable.getClass();
                this.c = callable;
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            public final void a(Throwable th) {
                this.d.l(th);
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            public final void b(Object obj) {
                this.d.k(obj);
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            public final boolean c() {
                return this.d.isDone();
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            public final Object e() {
                return this.c.call();
            }

            @Override // com.google.common.util.concurrent.InterruptibleTask
            public final String f() {
                return this.c.toString();
            }
        };
    }

    @Override // com.google.common.util.concurrent.b
    public final void b() {
        TrustedListenableFutureTask$TrustedFutureInterruptibleTask trustedListenableFutureTask$TrustedFutureInterruptibleTask;
        Object obj = this.a;
        if ((obj instanceof c0) && ((c0) obj).a && (trustedListenableFutureTask$TrustedFutureInterruptibleTask = this.h) != null) {
            b02 b02Var = InterruptibleTask.b;
            b02 b02Var2 = InterruptibleTask.a;
            Runnable runnable = trustedListenableFutureTask$TrustedFutureInterruptibleTask.get();
            if (runnable instanceof Thread) {
                InterruptibleTask.Blocker blocker = new InterruptibleTask.Blocker(trustedListenableFutureTask$TrustedFutureInterruptibleTask);
                InterruptibleTask.Blocker.a(blocker, Thread.currentThread());
                if (trustedListenableFutureTask$TrustedFutureInterruptibleTask.compareAndSet(runnable, blocker)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (trustedListenableFutureTask$TrustedFutureInterruptibleTask.getAndSet(b02Var2) == b02Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.h = null;
    }

    @Override // com.google.common.util.concurrent.b
    public final String i() {
        TrustedListenableFutureTask$TrustedFutureInterruptibleTask trustedListenableFutureTask$TrustedFutureInterruptibleTask = this.h;
        if (trustedListenableFutureTask$TrustedFutureInterruptibleTask == null) {
            return super.i();
        }
        return "task=[" + trustedListenableFutureTask$TrustedFutureInterruptibleTask + "]";
    }

    @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof c0;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        TrustedListenableFutureTask$TrustedFutureInterruptibleTask trustedListenableFutureTask$TrustedFutureInterruptibleTask = this.h;
        if (trustedListenableFutureTask$TrustedFutureInterruptibleTask != null) {
            trustedListenableFutureTask$TrustedFutureInterruptibleTask.run();
        }
        this.h = null;
    }
}
