package androidx.paging;

import defpackage.e71;
import defpackage.g51;
import defpackage.gz5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {647, 252}, m = "invokeSuspend", v = 1)
final class PageFetcherSnapshot$startConsumingHints$3 extends SuspendLambda implements qp2 {
    public gz5 a;
    public kotlinx.coroutines.sync.a b;
    public l c;
    public int d;
    public final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$3(l lVar, g51 g51Var) {
        super(2, g51Var);
        this.e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PageFetcherSnapshot$startConsumingHints$3(this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$startConsumingHints$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (androidx.paging.l.a(r1, r4, r3, r7) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r8)
            goto L62
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            androidx.paging.l r1 = r7.c
            kotlinx.coroutines.sync.a r3 = r7.b
            gz5 r4 = r7.a
            kotlin.b.b(r8)
            goto L3b
        L22:
            kotlin.b.b(r8)
            androidx.paging.l r1 = r7.e
            gz5 r4 = r1.i
            kotlinx.coroutines.sync.a r8 = r4.a
            r7.a = r4
            r7.b = r8
            r7.c = r1
            r7.d = r3
            java.lang.Object r3 = r8.b(r7)
            if (r3 != r0) goto L3a
            goto L61
        L3a:
            r3 = r8
        L3b:
            r8 = 0
            hz5 r4 = r4.b     // Catch: java.lang.Throwable -> L65
            kotlinx.coroutines.channels.a r5 = r4.h     // Catch: java.lang.Throwable -> L65
            dp0 r5 = kotlinx.coroutines.flow.d.h(r5)     // Catch: java.lang.Throwable -> L65
            androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 r6 = new androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1     // Catch: java.lang.Throwable -> L65
            r6.<init>(r4, r8)     // Catch: java.lang.Throwable -> L65
            gf2 r4 = new gf2     // Catch: java.lang.Throwable -> L65
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L65
            r3.d(r8)
            androidx.paging.LoadType r3 = androidx.paging.LoadType.c
            r7.a = r8
            r7.b = r8
            r7.c = r8
            r7.d = r2
            java.lang.Object r8 = androidx.paging.l.a(r1, r4, r3, r7)
            if (r8 != r0) goto L62
        L61:
            return r0
        L62:
            tx8 r8 = defpackage.tx8.a
            return r8
        L65:
            r0 = move-exception
            r3.d(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$startConsumingHints$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
