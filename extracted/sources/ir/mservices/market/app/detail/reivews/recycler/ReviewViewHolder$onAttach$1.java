package ir.mservices.market.app.detail.reivews.recycler;

import defpackage.b97;
import defpackage.e71;
import defpackage.g51;
import defpackage.pt1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.reivews.recycler.ReviewViewHolder$onAttach$1", f = "Review.kt", l = {257}, m = "invokeSuspend", v = 1)
final class ReviewViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReviewData b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewHolder$onAttach$1(ReviewData reviewData, c cVar, g51 g51Var) {
        super(2, g51Var);
        this.b = reviewData;
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReviewViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        ReviewData reviewData = this.b;
        v48 v48Var = reviewData.i;
        if (v48Var != null) {
            b97 b97Var = new b97(reviewData, this.c, 0);
            this.a = 1;
            Object objA = v48Var.a(new pt1(b97Var, 3), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8Var;
    }
}
