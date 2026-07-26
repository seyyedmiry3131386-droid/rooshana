package ir.mservices.market.myReview.incomplete;

import defpackage.dl3;
import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$onViewCreated$1", f = "InCompleteReviewRecyclerListFragment.kt", l = {66}, m = "invokeSuspend", v = 1)
final class InCompleteReviewRecyclerListFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ InCompleteReviewRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InCompleteReviewRecyclerListFragment$onViewCreated$1(InCompleteReviewRecyclerListFragment inCompleteReviewRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = inCompleteReviewRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new InCompleteReviewRecyclerListFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((InCompleteReviewRecyclerListFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
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
        int i2 = InCompleteReviewRecyclerListFragment.k1;
        InCompleteReviewRecyclerListFragment inCompleteReviewRecyclerListFragment = this.b;
        rv6 rv6Var = ((ir.mservices.market.common.model.a) ((InCompleteReviewViewModel) inCompleteReviewRecyclerListFragment.i1.getValue()).w.b).j;
        dl3 dl3Var = new dl3(inCompleteReviewRecyclerListFragment);
        this.a = 1;
        Object objA = rv6Var.a.a(new pt1(dl3Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
