package ir.mservices.market.feedback;

import androidx.paging.e;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.m22;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackTransactionViewModel$doRequest$1", f = "FeedbackTransactionViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class FeedbackTransactionViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ FeedbackTransactionViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackTransactionViewModel$doRequest$1(FeedbackTransactionViewModel feedbackTransactionViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = feedbackTransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FeedbackTransactionViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackTransactionViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        FeedbackTransactionViewModel feedbackTransactionViewModel = this.a;
        return new bz6(e.b(gu9.x(feedbackTransactionViewModel.t.d("unsuccessful", "all", feedbackTransactionViewModel), new m22(1, feedbackTransactionViewModel)), y97.G(feedbackTransactionViewModel)), null, null, null, 14);
    }
}
