package ir.mservices.market.feedback;

import defpackage.e71;
import defpackage.g51;
import defpackage.j99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.FeedbackViewModel$sendFeedback$3", f = "FeedbackViewModel.kt", l = {164}, m = "invokeSuspend", v = 1)
final class FeedbackViewModel$sendFeedback$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ FeedbackViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel$sendFeedback$3(FeedbackViewModel feedbackViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = feedbackViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FeedbackViewModel$sendFeedback$3(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackViewModel$sendFeedback$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            i iVar = this.b.I;
            j99 j99Var = new j99(null);
            this.a = 1;
            if (iVar.emit(j99Var, this) == coroutineSingletons) {
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
