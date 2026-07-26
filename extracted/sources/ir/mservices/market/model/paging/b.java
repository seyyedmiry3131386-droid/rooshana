package ir.mservices.market.model.paging;

import defpackage.b16;
import defpackage.dp2;
import defpackage.e16;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends b16 {
    public final SuspendLambda b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(dp2 dp2Var) {
        this.b = (SuspendLambda) dp2Var;
    }

    @Override // defpackage.b16
    public final Object a(e16 e16Var) {
        return e16Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // defpackage.b16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.x06 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ir.mservices.market.model.paging.PagingSourceSinglePage$load$1
            if (r0 == 0) goto L13
            r0 = r6
            ir.mservices.market.model.paging.PagingSourceSinglePage$load$1 r0 = (ir.mservices.market.model.paging.PagingSourceSinglePage$load$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.mservices.market.model.paging.PagingSourceSinglePage$load$1 r0 = new ir.mservices.market.model.paging.PagingSourceSinglePage$load$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.b.b(r6)     // Catch: java.lang.Exception -> L27
            goto L42
        L27:
            r5 = move-exception
            goto L6b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r6)
            r5.getClass()     // Catch: java.lang.Exception -> L27
            kotlin.coroutines.jvm.internal.SuspendLambda r5 = r4.b     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L42
            return r1
        L42:
            n99 r6 = (defpackage.n99) r6     // Catch: java.lang.Exception -> L27
            boolean r5 = r6 instanceof defpackage.l99     // Catch: java.lang.Exception -> L27
            if (r5 == 0) goto L57
            z06 r5 = new z06     // Catch: java.lang.Exception -> L27
            l99 r6 = (defpackage.l99) r6     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.a     // Catch: java.lang.Exception -> L27
            java.util.List r6 = defpackage.br9.B(r6)     // Catch: java.lang.Exception -> L27
            r0 = 0
            r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L27
            return r5
        L57:
            y06 r5 = new y06     // Catch: java.lang.Exception -> L27
            ir.mservices.market.model.paging.MyketPagingError r0 = new ir.mservices.market.model.paging.MyketPagingError     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "null cannot be cast to non-null type ir.mservices.market.version2.services.ViewState.Failure<T of ir.mservices.market.model.paging.PagingSourceSinglePage>"
            defpackage.js3.n(r6, r1)     // Catch: java.lang.Exception -> L27
            h99 r6 = (defpackage.h99) r6     // Catch: java.lang.Exception -> L27
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r6 = r6.a     // Catch: java.lang.Exception -> L27
            r0.<init>(r6)     // Catch: java.lang.Exception -> L27
            r5.<init>(r0)     // Catch: java.lang.Exception -> L27
            return r5
        L6b:
            y06 r6 = new y06
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.model.paging.b.b(x06, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
