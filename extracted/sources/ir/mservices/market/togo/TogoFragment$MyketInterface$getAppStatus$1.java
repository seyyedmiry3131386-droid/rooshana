package ir.mservices.market.togo;

import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$getAppStatus$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$getAppStatus$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ TogoFragment b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$getAppStatus$1(String str, TogoFragment togoFragment, int i, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.a = str;
        this.b = togoFragment;
        this.c = i;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$getAppStatus$1(this.a, this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TogoFragment$MyketInterface$getAppStatus$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        String str = this.a;
        if (str == null) {
            return PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN;
        }
        if ((!f88.n0(str) ? str : null) == null) {
            return PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN;
        }
        ir.mservices.market.version2.manager.a aVar = this.b.W0;
        if (aVar != null) {
            String strName = aVar.d(str, this.c, this.d, null).name();
            return strName == null ? PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN : strName;
        }
        js3.V("appManager");
        throw null;
    }
}
