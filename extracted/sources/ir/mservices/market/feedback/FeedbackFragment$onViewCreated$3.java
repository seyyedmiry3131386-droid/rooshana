package ir.mservices.market.feedback;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.q92;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackFragment$onViewCreated$3", f = "FeedbackFragment.kt", l = {150}, m = "invokeSuspend", v = 1)
final class FeedbackFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ FeedbackFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackFragment$onViewCreated$3(FeedbackFragment feedbackFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = feedbackFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FeedbackFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((FeedbackFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = FeedbackFragment.r1;
            FeedbackFragment feedbackFragment = this.b;
            pv6 pv6Var = feedbackFragment.R1().J;
            q92 q92Var = new q92(feedbackFragment);
            this.a = 1;
            if (pv6Var.a.a(q92Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
