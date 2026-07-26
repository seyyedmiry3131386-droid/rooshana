package ir.mservices.market.feedback;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackFragment$onViewCreated$2", f = "FeedbackFragment.kt", l = {144}, m = "invokeSuspend", v = 1)
final class FeedbackFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ FeedbackFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackFragment$onViewCreated$2(FeedbackFragment feedbackFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = feedbackFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FeedbackFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((FeedbackFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        int i2 = FeedbackFragment.r1;
        FeedbackFragment feedbackFragment = this.b;
        pv6 pv6Var = feedbackFragment.R1().H;
        r4 r4Var = new r4(27, feedbackFragment);
        this.a = 1;
        Object objA = pv6Var.a.a(new pt1(r4Var, 1), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
