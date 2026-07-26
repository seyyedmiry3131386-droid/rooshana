package androidx.paging;

import defpackage.wt3;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final m a;
    public final boolean b;
    public final kotlinx.coroutines.sync.a c = new kotlinx.coroutines.sync.a();
    public wt3 d;

    public p(m mVar, boolean z) {
        this.a = mVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.wt3 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.SingleRunner$Holder$onFinish$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.SingleRunner$Holder$onFinish$1 r0 = (androidx.paging.SingleRunner$Holder$onFinish$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.paging.SingleRunner$Holder$onFinish$1 r0 = new androidx.paging.SingleRunner$Holder$onFinish$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.a r5 = r0.b
            wt3 r0 = r0.a
            kotlin.b.b(r6)
            r6 = r5
            r5 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.b.b(r6)
            r0.a = r5
            kotlinx.coroutines.sync.a r6 = r4.c
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            wt3 r1 = r4.d     // Catch: java.lang.Throwable -> L4f
            if (r5 != r1) goto L51
            r4.d = r0     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r5 = move-exception
            goto L57
        L51:
            r6.d(r0)
            tx8 r5 = defpackage.tx8.a
            return r5
        L57:
            r6.d(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.p.a(wt3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [wt3] */
    /* JADX WARN: Type inference failed for: r2v4, types: [wt3] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [wt3] */
    /* JADX WARN: Type inference failed for: r9v1, types: [dc5] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4, types: [dc5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.wt3 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.paging.SingleRunner$Holder$tryEnqueue$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = (androidx.paging.SingleRunner$Holder$tryEnqueue$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = new androidx.paging.SingleRunner$Holder$tryEnqueue$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            dc5 r9 = r0.b
            wt3 r0 = r0.a
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L82
        L2f:
            r10 = move-exception
            goto L8d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            dc5 r9 = r0.b
            wt3 r2 = r0.a
            kotlin.b.b(r10)
            goto L55
        L41:
            kotlin.b.b(r10)
            r0.a = r9
            kotlinx.coroutines.sync.a r10 = r8.c
            r0.b = r10
            r0.e = r4
            java.lang.Object r2 = r10.b(r0)
            if (r2 != r1) goto L53
            goto L80
        L53:
            r2 = r9
            r9 = r10
        L55:
            wt3 r10 = r8.d     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto L66
            boolean r6 = r10.b()     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L66
            boolean r6 = r8.b     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L64
            goto L66
        L64:
            r4 = 0
            goto L85
        L66:
            if (r10 == 0) goto L72
            androidx.paging.SingleRunner$CancelIsolatedRunnerException r6 = new androidx.paging.SingleRunner$CancelIsolatedRunnerException     // Catch: java.lang.Throwable -> L2f
            androidx.paging.m r7 = r8.a     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            r10.g(r6)     // Catch: java.lang.Throwable -> L2f
        L72:
            if (r10 == 0) goto L83
            r0.a = r2     // Catch: java.lang.Throwable -> L2f
            r0.b = r9     // Catch: java.lang.Throwable -> L2f
            r0.e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r10.D(r0)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r1) goto L81
        L80:
            return r1
        L81:
            r0 = r2
        L82:
            r2 = r0
        L83:
            r8.d = r2     // Catch: java.lang.Throwable -> L2f
        L85:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            r9.d(r5)
            return r10
        L8d:
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.p.b(wt3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
