package ir.mservices.market.myReview.complete.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.nl;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.complete.recycler.CompleteReviewHolder$onAttach$1", f = "CompleteReview.kt", l = {138}, m = "invokeSuspend", v = 1)
final class CompleteReviewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ CompleteReview b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteReviewHolder$onAttach$1(CompleteReview completeReview, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = completeReview;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CompleteReviewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CompleteReviewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            CompleteReview completeReview = this.b;
            vb7 vb7Var = completeReview.b;
            nl nlVar = new nl(completeReview, this.c, 12);
            this.a = 1;
            if (vb7Var.a(nlVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
