package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public Runnable a;
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r9.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        com.google.firebase.concurrent.b.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.a, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        r9.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            com.google.firebase.concurrent.b r2 = r9.b     // Catch: java.lang.Throwable -> L50
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L50
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L28
            com.google.firebase.concurrent.b r0 = r9.b     // Catch: java.lang.Throwable -> L1c
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = r0.c     // Catch: java.lang.Throwable -> L1c
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.d     // Catch: java.lang.Throwable -> L1c
            if (r3 != r4) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L40
        L14:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L40
        L1c:
            r0 = move-exception
            goto L73
        L1e:
            long r5 = r0.d     // Catch: java.lang.Throwable -> L1c
            r7 = 1
            long r5 = r5 + r7
            r0.d = r5     // Catch: java.lang.Throwable -> L1c
            r0.c = r4     // Catch: java.lang.Throwable -> L1c
            r0 = 1
        L28:
            com.google.firebase.concurrent.b r3 = r9.b     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayDeque r3 = r3.b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
            r9.a = r3     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L41
            com.google.firebase.concurrent.b r0 = r9.b     // Catch: java.lang.Throwable -> L1c
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.a     // Catch: java.lang.Throwable -> L1c
            r0.c = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L40
            goto L14
        L40:
            return
        L41:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L50
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r9.a     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
        L4d:
            r9.a = r2     // Catch: java.lang.Throwable -> L50
            goto L2
        L50:
            r0 = move-exception
            goto L75
        L52:
            r0 = move-exception
            goto L70
        L54:
            r3 = move-exception
            java.util.logging.Logger r4 = com.google.firebase.concurrent.b.f     // Catch: java.lang.Throwable -> L52
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r6.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L52
            java.lang.Runnable r7 = r9.a     // Catch: java.lang.Throwable -> L52
            r6.append(r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
            goto L4d
        L70:
            r9.a = r2     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L73:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L50
        L75:
            if (r1 == 0) goto L7e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L7e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.a.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Error e) {
            synchronized (this.b.b) {
                this.b.c = SequentialExecutor$WorkerRunningState.a;
                throw e;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        return "SequentialExecutorWorker{state=" + this.b.c + "}";
    }
}
