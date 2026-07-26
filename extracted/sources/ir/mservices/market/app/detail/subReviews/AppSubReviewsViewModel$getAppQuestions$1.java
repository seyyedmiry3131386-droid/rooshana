package ir.mservices.market.app.detail.subReviews;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$getAppQuestions$1", f = "AppSubReviewsViewModel.kt", l = {154, 154}, m = "invokeSuspend", v = 1)
final class AppSubReviewsViewModel$getAppQuestions$1 extends SuspendLambda implements qp2 {
    public i a;
    public int b;
    public final /* synthetic */ AppSubReviewsViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSubReviewsViewModel$getAppQuestions$1(AppSubReviewsViewModel appSubReviewsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.c = appSubReviewsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppSubReviewsViewModel$getAppQuestions$1(this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppSubReviewsViewModel$getAppQuestions$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r7)
            goto L46
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlinx.coroutines.flow.i r1 = r6.a
            kotlin.b.b(r7)
            goto L3a
        L1e:
            kotlin.b.b(r7)
            ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel r7 = r6.c
            kotlinx.coroutines.flow.i r1 = r7.x
            rn6 r4 = r7.t
            ht r5 = r7.v
            java.lang.String r5 = r5.a
            r6.a = r1
            r6.b = r3
            java.lang.Object r3 = r4.c
            uc8 r3 = (defpackage.uc8) r3
            java.lang.Object r7 = r3.h(r5, r7, r6)
            if (r7 != r0) goto L3a
            goto L45
        L3a:
            r3 = 0
            r6.a = r3
            r6.b = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L46
        L45:
            return r0
        L46:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$getAppQuestions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
