package ir.mservices.market.myMarket;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myMarket.MyMarketViewModel$handleFinancialAfterLogin$2$1", f = "MyMarketViewModel.kt", l = {106}, m = "invokeSuspend", v = 1)
final class MyMarketViewModel$handleFinancialAfterLogin$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MyMarketViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMarketViewModel$handleFinancialAfterLogin$2$1(MyMarketViewModel myMarketViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = myMarketViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MyMarketViewModel$handleFinancialAfterLogin$2$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyMarketViewModel$handleFinancialAfterLogin$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        i iVar = this.b.B;
        this.a = 1;
        return iVar.emit(tx8Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
