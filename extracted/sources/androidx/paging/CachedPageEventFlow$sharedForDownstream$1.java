package androidx.paging;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {61, 66}, m = "invokeSuspend", v = 1)
final class CachedPageEventFlow$sharedForDownstream$1 extends SuspendLambda implements qp2 {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$sharedForDownstream$1(d dVar, g51 g51Var) {
        super(2, g51Var);
        this.d = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.d, g51Var);
        cachedPageEventFlow$sharedForDownstream$1.c = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$sharedForDownstream$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.b
            androidx.paging.d r2 = r5.d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.util.Iterator r1 = r5.a
            java.lang.Object r2 = r5.c
            ze2 r2 = (defpackage.ze2) r2
            kotlin.b.b(r6)
            goto L4a
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            java.lang.Object r1 = r5.c
            ze2 r1 = (defpackage.ze2) r1
            kotlin.b.b(r6)
            goto L3d
        L28:
            kotlin.b.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            ze2 r1 = (defpackage.ze2) r1
            androidx.paging.f r6 = r2.a
            r5.c = r1
            r5.b = r4
            java.io.Serializable r6 = r6.a(r5)
            if (r6 != r0) goto L3d
            goto L62
        L3d:
            java.util.List r6 = (java.util.List) r6
            li1 r2 = r2.d
            r2.start()
            java.util.Iterator r6 = r6.iterator()
            r2 = r1
            r1 = r6
        L4a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L63
            java.lang.Object r6 = r1.next()
            pm3 r6 = (defpackage.pm3) r6
            r5.c = r2
            r5.a = r1
            r5.b = r3
            java.lang.Object r6 = r2.emit(r6, r5)
            if (r6 != r0) goto L4a
        L62:
            return r0
        L63:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$sharedForDownstream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
