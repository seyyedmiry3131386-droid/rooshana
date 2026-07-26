package ir.mservices.market.app.detail.update;

import defpackage.bj2;
import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.update.InAppFragment$onViewCreated$2", f = "InAppFragment.kt", l = {68}, m = "invokeSuspend", v = 1)
final class InAppFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ InAppFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppFragment$onViewCreated$2(InAppFragment inAppFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = inAppFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new InAppFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((InAppFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
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
        int i2 = InAppFragment.a1;
        InAppFragment inAppFragment = this.b;
        pv6 pv6Var = ((InAppUpdateViewModel) inAppFragment.Z0.getValue()).z;
        bj2 bj2Var = new bj2(4, inAppFragment);
        this.a = 1;
        Object objA = pv6Var.a.a(new pt1(bj2Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
