package ir.mservices.market.feedback;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackFragment$onViewCreated$1", f = "FeedbackFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class FeedbackFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ FeedbackFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackFragment$onViewCreated$1(FeedbackFragment feedbackFragment, g51 g51Var) {
        super(1, g51Var);
        this.a = feedbackFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FeedbackFragment$onViewCreated$1(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        FeedbackFragment$onViewCreated$1 feedbackFragment$onViewCreated$1 = (FeedbackFragment$onViewCreated$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        feedbackFragment$onViewCreated$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        int i = FeedbackFragment.r1;
        FeedbackFragment feedbackFragment = this.a;
        feedbackFragment.y1().k0(feedbackFragment.Z0 != null ? r2.c() - 1 : 0);
        return tx8.a;
    }
}
