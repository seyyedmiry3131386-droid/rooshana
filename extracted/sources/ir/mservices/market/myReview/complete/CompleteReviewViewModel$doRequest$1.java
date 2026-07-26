package ir.mservices.market.myReview.complete;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.n;
import defpackage.qm5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.complete.CompleteReviewViewModel$doRequest$1", f = "CompleteReviewViewModel.kt", l = {32}, m = "invokeSuspend", v = 1)
final class CompleteReviewViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ CompleteReviewViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteReviewViewModel$doRequest$1(CompleteReviewViewModel completeReviewViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = completeReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CompleteReviewViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CompleteReviewViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        final CompleteReviewViewModel completeReviewViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            final qm5 qm5Var = completeReviewViewModel.v;
            final String strA = completeReviewViewModel.t.a();
            js3.o(strA, "getAccountId(...)");
            this.a = 1;
            qm5Var.getClass();
            obj = (xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.myReview.complete.model.a
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new ir.mservices.market.model.paging.b(new CompleteReviewsRepositoryImpl$getCompleteReview$2$1(qm5Var, strA, completeReviewViewModel, null));
                }
            }).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new n(24, completeReviewViewModel)), y97.G(completeReviewViewModel)), null, null, null, 14);
    }
}
