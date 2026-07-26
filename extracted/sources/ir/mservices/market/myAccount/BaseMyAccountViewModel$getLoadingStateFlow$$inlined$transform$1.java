package ir.mservices.market.myAccount;

import defpackage.g51;
import defpackage.n4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.BaseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1", f = "BaseMyAccountViewModel.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class BaseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xe2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1(xe2 xe2Var, g51 g51Var) {
        super(2, g51Var);
        MyAccountItemsType myAccountItemsType = MyAccountItemsType.b;
        this.c = xe2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MyAccountItemsType myAccountItemsType = MyAccountItemsType.b;
        BaseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1 baseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1 = new BaseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1(this.c, g51Var);
        baseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1.b = obj;
        return baseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            ze2 ze2Var = (ze2) this.b;
            MyAccountItemsType myAccountItemsType = MyAccountItemsType.b;
            n4 n4Var = new n4(ze2Var);
            this.b = null;
            this.a = 1;
            if (this.c.a(n4Var, this) == coroutineSingletons) {
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
