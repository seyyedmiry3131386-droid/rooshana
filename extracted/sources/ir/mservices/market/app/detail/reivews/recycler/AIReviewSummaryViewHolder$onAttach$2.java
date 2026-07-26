package ir.mservices.market.app.detail.reivews.recycler;

import defpackage.e;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.reivews.recycler.AIReviewSummaryViewHolder$onAttach$2", f = "AIReviewSummary.kt", l = {167}, m = "invokeSuspend", v = 1)
final class AIReviewSummaryViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AIReviewSummaryData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIReviewSummaryViewHolder$onAttach$2(AIReviewSummaryData aIReviewSummaryData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = aIReviewSummaryData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AIReviewSummaryViewHolder$onAttach$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((AIReviewSummaryViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            v48 v48Var = this.b.c;
            e eVar = new e(this.c, 1);
            this.a = 1;
            if (v48Var.a(eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
