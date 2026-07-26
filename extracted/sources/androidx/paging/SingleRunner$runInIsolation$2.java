package androidx.paging;

import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {48, 51, 53, 53}, m = "invokeSuspend", v = 1)
final class SingleRunner$runInIsolation$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m c;
    public final /* synthetic */ dp2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$2(m mVar, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = mVar;
        this.d = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.c, this.d, g51Var);
        singleRunner$runInIsolation$2.b = obj;
        return singleRunner$runInIsolation$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleRunner$runInIsolation$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r0.a(r2, r8) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.paging.p] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [wt3] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6, types: [wt3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            androidx.paging.m r0 = r8.c
            java.lang.Object r0 = r0.a
            androidx.paging.p r0 = (androidx.paging.p) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r8.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L38
            if (r2 == r5) goto L2e
            if (r2 == r4) goto L29
            if (r2 == r3) goto L20
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r0 = r8.b
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.b.b(r9)
            goto L90
        L29:
            kotlin.b.b(r9)
            goto L91
        L2e:
            java.lang.Object r2 = r8.b
            wt3 r2 = (defpackage.wt3) r2
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L36
            goto L78
        L36:
            r9 = move-exception
            goto L84
        L38:
            java.lang.Object r2 = r8.b
            wt3 r2 = (defpackage.wt3) r2
            kotlin.b.b(r9)
            goto L63
        L40:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.b
            e71 r9 = (defpackage.e71) r9
            w61 r9 = r9.getCoroutineContext()
            th0 r2 = defpackage.th0.n
            u61 r9 = r9.r0(r2)
            if (r9 == 0) goto L94
            wt3 r9 = (defpackage.wt3) r9
            r8.b = r9
            r8.a = r6
            java.lang.Object r2 = r0.b(r9, r8)
            if (r2 != r1) goto L60
            goto L8e
        L60:
            r7 = r2
            r2 = r9
            r9 = r7
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L91
            dp2 r9 = r8.d     // Catch: java.lang.Throwable -> L36
            r8.b = r2     // Catch: java.lang.Throwable -> L36
            r8.a = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L36
            if (r9 != r1) goto L78
            goto L8e
        L78:
            r9 = 0
            r8.b = r9
            r8.a = r4
            java.lang.Object r9 = r0.a(r2, r8)
            if (r9 != r1) goto L91
            goto L8e
        L84:
            r8.b = r9
            r8.a = r3
            java.lang.Object r0 = r0.a(r2, r8)
            if (r0 != r1) goto L8f
        L8e:
            return r1
        L8f:
            r0 = r9
        L90:
            throw r0
        L91:
            tx8 r9 = defpackage.tx8.a
            return r9
        L94:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner$runInIsolation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
