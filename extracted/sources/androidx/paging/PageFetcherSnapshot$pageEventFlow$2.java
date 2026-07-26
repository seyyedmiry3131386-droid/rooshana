package androidx.paging;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {647, 193}, m = "invokeSuspend", v = 1)
final class PageFetcherSnapshot$pageEventFlow$2 extends SuspendLambda implements qp2 {
    public kotlinx.coroutines.sync.a a;
    public ze2 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$2(l lVar, g51 g51Var) {
        super(2, g51Var);
        this.e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new PageFetcherSnapshot$pageEventFlow$2(this.e, g51Var);
        pageFetcherSnapshot$pageEventFlow$2.d = obj;
        return pageFetcherSnapshot$pageEventFlow$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$pageEventFlow$2) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r1.emit(r3, r5) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r6)
            goto L62
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            ze2 r1 = r5.b
            kotlinx.coroutines.sync.a r3 = r5.a
            java.lang.Object r4 = r5.d
            gz5 r4 = (defpackage.gz5) r4
            kotlin.b.b(r6)
            goto L42
        L24:
            kotlin.b.b(r6)
            java.lang.Object r6 = r5.d
            r1 = r6
            ze2 r1 = (defpackage.ze2) r1
            androidx.paging.l r6 = r5.e
            gz5 r4 = r6.i
            kotlinx.coroutines.sync.a r6 = r4.a
            r5.d = r4
            r5.a = r6
            r5.b = r1
            r5.c = r3
            java.lang.Object r3 = r6.b(r5)
            if (r3 != r0) goto L41
            goto L61
        L41:
            r3 = r6
        L42:
            r6 = 0
            hz5 r4 = r4.b     // Catch: java.lang.Throwable -> L65
            pa2 r4 = r4.j     // Catch: java.lang.Throwable -> L65
            na4 r4 = r4.D()     // Catch: java.lang.Throwable -> L65
            r3.d(r6)
            zy5 r3 = new zy5
            r3.<init>(r4, r6)
            r5.d = r6
            r5.a = r6
            r5.b = r6
            r5.c = r2
            java.lang.Object r6 = r1.emit(r3, r5)
            if (r6 != r0) goto L62
        L61:
            return r0
        L62:
            tx8 r6 = defpackage.tx8.a
            return r6
        L65:
            r0 = move-exception
            r3.d(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
