package ir.mservices.market.app.detail.ui.recommendation;

import defpackage.dp2;
import defpackage.pw6;
import ir.mservices.market.model.paging.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public final pw6 b;
    public final dp2 c;

    public a(pw6 pw6Var, dp2 dp2Var) {
        this.b = pw6Var;
        this.c = dp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ir.mservices.market.model.paging.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationPagingSource$getData$1
            if (r0 == 0) goto L13
            r0 = r6
            ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationPagingSource$getData$1 r0 = (ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationPagingSource$getData$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationPagingSource$getData$1 r0 = new ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationPagingSource$getData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.b.b(r6)
            r0.c = r3
            pw6 r6 = r5.b
            java.lang.Object r6 = r6.l(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L75
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.wu0.V(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L50:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r6.next()
            ir.mservices.market.common.ui.recycler.MyketRecyclerData r1 = (ir.mservices.market.common.ui.recycler.MyketRecyclerData) r1
            boolean r2 = r1 instanceof ir.mservices.market.version2.ui.recycler.NestedRecyclerData
            if (r2 == 0) goto L64
            r2 = r1
            ir.mservices.market.version2.ui.recycler.NestedRecyclerData r2 = (ir.mservices.market.version2.ui.recycler.NestedRecyclerData) r2
            goto L65
        L64:
            r2 = 0
        L65:
            if (r2 == 0) goto L70
            java.lang.String r3 = "<set-?>"
            dp2 r4 = r5.c
            defpackage.js3.p(r4, r3)
            r2.a = r4
        L70:
            r0.add(r1)
            goto L50
        L74:
            return r0
        L75:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.recommendation.a.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
