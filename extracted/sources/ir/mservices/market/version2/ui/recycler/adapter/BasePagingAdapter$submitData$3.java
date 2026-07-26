package ir.mservices.market.version2.ui.recycler.adapter;

import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter$submitData$3", f = "BasePagingAdapter.kt", l = {229}, m = "invokeSuspend", v = 1)
final class BasePagingAdapter$submitData$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ bz6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePagingAdapter$submitData$3(a aVar, bz6 bz6Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = bz6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BasePagingAdapter$submitData$3(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePagingAdapter$submitData$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            this.a = 1;
            if (this.b.L(this.c, this) == coroutineSingletons) {
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
