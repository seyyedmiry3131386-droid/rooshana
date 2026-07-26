package ir.mservices.market.myReview.incomplete;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewResultDTO;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.incomplete.InCompleteReviewViewModel$setItem$1", f = "InCompleteReviewViewModel.kt", l = {56}, m = "invokeSuspend", v = 1)
final class InCompleteReviewViewModel$setItem$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InCompleteReviewViewModel b;
    public final /* synthetic */ InCompleteReviewResultDTO c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InCompleteReviewViewModel$setItem$1(InCompleteReviewViewModel inCompleteReviewViewModel, InCompleteReviewResultDTO inCompleteReviewResultDTO, g51 g51Var) {
        super(2, g51Var);
        this.b = inCompleteReviewViewModel;
        this.c = inCompleteReviewResultDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InCompleteReviewViewModel$setItem$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InCompleteReviewViewModel$setItem$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        l lVar = this.b.y;
        Boolean boolValueOf = Boolean.valueOf(this.c.isCompleted());
        this.a = 1;
        lVar.emit(boolValueOf, this);
        return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
