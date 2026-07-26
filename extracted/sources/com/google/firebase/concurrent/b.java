package com.google.firebase.concurrent;

import defpackage.rq4;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {
    public static final Logger f = Logger.getLogger(b.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public SequentialExecutor$WorkerRunningState c = SequentialExecutor$WorkerRunningState.a;
    public long d = 0;
    public final a e = new a(this);

    public b(Executor executor) {
        rq4.n(executor);
        this.a = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            defpackage.rq4.n(r8)
            java.util.ArrayDeque r0 = r7.b
            monitor-enter(r0)
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r1 = r7.c     // Catch: java.lang.Throwable -> L6e
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.d     // Catch: java.lang.Throwable -> L6e
            if (r1 == r2) goto L70
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.c     // Catch: java.lang.Throwable -> L6e
            if (r1 != r2) goto L11
            goto L70
        L11:
            long r3 = r7.d     // Catch: java.lang.Throwable -> L6e
            o6 r1 = new o6     // Catch: java.lang.Throwable -> L6e
            r5 = 2
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque r8 = r7.b     // Catch: java.lang.Throwable -> L6e
            r8.add(r1)     // Catch: java.lang.Throwable -> L6e
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r8 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.b     // Catch: java.lang.Throwable -> L6e
            r7.c = r8     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r0 = r7.a     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            com.google.firebase.concurrent.a r5 = r7.e     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r5)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = r7.c
            if (r0 == r8) goto L2f
            goto L6a
        L2f:
            java.util.ArrayDeque r0 = r7.b
            monitor-enter(r0)
            long r5 = r7.d     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r1 = r7.c     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.c = r2     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L45:
            r8 = move-exception
            goto L48
        L47:
            r8 = move-exception
        L48:
            java.util.ArrayDeque r2 = r7.b
            monitor-enter(r2)
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = r7.c     // Catch: java.lang.Throwable -> L56
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.a     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.b     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L62
            goto L58
        L56:
            r8 = move-exception
            goto L6c
        L58:
            java.util.ArrayDeque r0 = r7.b     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L6b
            if (r0 != 0) goto L6b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
        L6a:
            return
        L6b:
            throw r8     // Catch: java.lang.Throwable -> L56
        L6c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r8
        L6e:
            r8 = move-exception
            goto L77
        L70:
            java.util.ArrayDeque r1 = r7.b     // Catch: java.lang.Throwable -> L6e
            r1.add(r8)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.b.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
