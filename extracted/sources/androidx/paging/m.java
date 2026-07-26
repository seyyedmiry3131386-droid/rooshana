package androidx.paging;

import defpackage.bp2;
import defpackage.rz5;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final Object a;

    public m(boolean z) {
        this.a = new p(this, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(defpackage.g51 r5, defpackage.dp2 r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.SingleRunner$runInIsolation$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner$runInIsolation$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.paging.SingleRunner$runInIsolation$1 r0 = new androidx.paging.SingleRunner$runInIsolation$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.b.b(r5)     // Catch: androidx.paging.SingleRunner$CancelIsolatedRunnerException -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r5)
            androidx.paging.SingleRunner$runInIsolation$2 r5 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch: androidx.paging.SingleRunner$CancelIsolatedRunnerException -> L27
            r2 = 0
            r5.<init>(r4, r6, r2)     // Catch: androidx.paging.SingleRunner$CancelIsolatedRunnerException -> L27
            r0.c = r3     // Catch: androidx.paging.SingleRunner$CancelIsolatedRunnerException -> L27
            java.lang.Object r5 = defpackage.js3.v(r5, r0)     // Catch: androidx.paging.SingleRunner$CancelIsolatedRunnerException -> L27
            if (r5 != r1) goto L47
            return r1
        L43:
            androidx.paging.m r6 = r5.a
            if (r6 != r4) goto L4a
        L47:
            tx8 r5 = defpackage.tx8.a
            return r5
        L4a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.m.a(g51, dp2):java.lang.Object");
    }

    public m(rz5 rz5Var, bp2 bp2Var) {
        this.a = new k(new Pager$flow$2(bp2Var, null), rz5Var).e;
    }
}
