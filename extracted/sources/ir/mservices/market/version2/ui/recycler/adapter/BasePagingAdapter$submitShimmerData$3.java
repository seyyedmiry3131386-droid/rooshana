package ir.mservices.market.version2.ui.recycler.adapter;

import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter$submitShimmerData$3", f = "BasePagingAdapter.kt", l = {220}, m = "invokeSuspend", v = 1)
final class BasePagingAdapter$submitShimmerData$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ bz6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePagingAdapter$submitShimmerData$3(a aVar, bz6 bz6Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = bz6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BasePagingAdapter$submitShimmerData$3(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePagingAdapter$submitShimmerData$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF;
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
        this.a = 1;
        xe2 xe2Var = this.c.d;
        if (xe2Var == null || (objF = d.f(xe2Var, new BasePagingAdapter$submitShimmerData$2(this.b, null), this)) != coroutineSingletons) {
            objF = tx8Var;
        }
        return objF == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
