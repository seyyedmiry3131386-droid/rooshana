package ir.mservices.market.model.paging;

import defpackage.b16;
import defpackage.e16;
import defpackage.x06;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends b16 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object e(ir.mservices.market.model.paging.c r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof ir.mservices.market.model.paging.PagingSourceSuspendListPage$load$1
            if (r0 == 0) goto L13
            r0 = r5
            ir.mservices.market.model.paging.PagingSourceSuspendListPage$load$1 r0 = (ir.mservices.market.model.paging.PagingSourceSuspendListPage$load$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.mservices.market.model.paging.PagingSourceSuspendListPage$load$1 r0 = new ir.mservices.market.model.paging.PagingSourceSuspendListPage$load$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.b.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.d(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.util.List r4 = defpackage.br9.B(r5)
            z06 r5 = new z06
            r0 = 0
            r5.<init>(r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.model.paging.c.e(ir.mservices.market.model.paging.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.b16
    public final Object a(e16 e16Var) {
        return null;
    }

    @Override // defpackage.b16
    public final Object b(x06 x06Var, ContinuationImpl continuationImpl) {
        return e(this, continuationImpl);
    }

    public abstract Object d(ContinuationImpl continuationImpl);
}
