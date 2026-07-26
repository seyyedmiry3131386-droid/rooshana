package ir.mservices.market.version2.ui.recycler.adapter;

import defpackage.a06;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter$submitShimmerData$2", f = "BasePagingAdapter.kt", l = {211}, m = "invokeSuspend", v = 1)
final class BasePagingAdapter$submitShimmerData$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePagingAdapter$submitShimmerData$2(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        BasePagingAdapter$submitShimmerData$2 basePagingAdapter$submitShimmerData$2 = new BasePagingAdapter$submitShimmerData$2(this.c, g51Var);
        basePagingAdapter$submitShimmerData$2.b = obj;
        return basePagingAdapter$submitShimmerData$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePagingAdapter$submitShimmerData$2) create((a06) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a06 a06Var = (a06) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.E(a06Var, this) == coroutineSingletons) {
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
