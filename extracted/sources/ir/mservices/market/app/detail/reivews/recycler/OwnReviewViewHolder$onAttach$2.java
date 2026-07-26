package ir.mservices.market.app.detail.reivews.recycler;

import defpackage.dy5;
import defpackage.e71;
import defpackage.g51;
import defpackage.pt1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.yx5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.reivews.recycler.OwnReviewViewHolder$onAttach$2", f = "OwnReview.kt", l = {306}, m = "invokeSuspend", v = 1)
final class OwnReviewViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ OwnReviewData b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnReviewViewHolder$onAttach$2(OwnReviewData ownReviewData, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.b = ownReviewData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new OwnReviewViewHolder$onAttach$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((OwnReviewViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        OwnReviewData ownReviewData = this.b;
        xe2 xe2Var = ownReviewData.g;
        dy5 dy5Var = new dy5(this.c, ownReviewData, 1);
        this.a = 1;
        Object objA = xe2Var.a(new pt1(new yx5(dy5Var, 4), 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
