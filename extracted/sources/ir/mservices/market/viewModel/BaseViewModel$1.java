package ir.mservices.market.viewModel;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.viewModel.BaseViewModel$1", f = "BaseViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class BaseViewModel$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$1(c cVar, g51 g51Var) {
        super(2, g51Var);
        this.a = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseViewModel$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        BaseViewModel$1 baseViewModel$1 = (BaseViewModel$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        baseViewModel$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        c cVar = this.a;
        cVar.l(cVar.b);
        return tx8.a;
    }
}
