package ir.mservices.market.purchaseTransaction;

import androidx.paging.e;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.qp2;
import defpackage.sm5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.purchaseTransaction.PurchaseTransactionViewModel$refreshData$1", f = "PurchaseTransactionViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PurchaseTransactionViewModel$refreshData$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ PurchaseTransactionViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseTransactionViewModel$refreshData$1(PurchaseTransactionViewModel purchaseTransactionViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = purchaseTransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PurchaseTransactionViewModel$refreshData$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PurchaseTransactionViewModel$refreshData$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        PurchaseTransactionViewModel purchaseTransactionViewModel = this.a;
        return new bz6(e.b(gu9.x(purchaseTransactionViewModel.t.d(purchaseTransactionViewModel.u, purchaseTransactionViewModel.v, purchaseTransactionViewModel), new sm5(27)), y97.G(purchaseTransactionViewModel)), null, null, null, 14);
    }
}
