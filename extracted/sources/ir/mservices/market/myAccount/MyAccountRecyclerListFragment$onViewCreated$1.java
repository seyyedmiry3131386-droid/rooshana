package ir.mservices.market.myAccount;

import defpackage.bj2;
import defpackage.e71;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.MyAccountRecyclerListFragment$onViewCreated$1", f = "MyAccountRecyclerListFragment.kt", l = {117}, m = "invokeSuspend", v = 1)
final class MyAccountRecyclerListFragment$onViewCreated$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MyAccountRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAccountRecyclerListFragment$onViewCreated$1(MyAccountRecyclerListFragment myAccountRecyclerListFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = myAccountRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MyAccountRecyclerListFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((MyAccountRecyclerListFragment$onViewCreated$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MyAccountRecyclerListFragment.m1;
            MyAccountRecyclerListFragment myAccountRecyclerListFragment = this.b;
            pv6 pv6Var = myAccountRecyclerListFragment.T1().z;
            bj2 bj2Var = new bj2(18, myAccountRecyclerListFragment);
            this.a = 1;
            if (pv6Var.a.a(bj2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
