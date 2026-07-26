package ir.mservices.market.social.profile.own;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qx5;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.OwnProfileFragment$onViewCreated$9", f = "OwnProfileFragment.kt", l = {329}, m = "invokeSuspend", v = 1)
final class OwnProfileFragment$onViewCreated$9 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ OwnProfileFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileFragment$onViewCreated$9(OwnProfileFragment ownProfileFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = ownProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new OwnProfileFragment$onViewCreated$9(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((OwnProfileFragment$onViewCreated$9) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        int i3 = OwnProfileFragment.d1;
        OwnProfileFragment ownProfileFragment = this.b;
        pv6 pv6Var = ownProfileFragment.l1().z;
        qx5 qx5Var = new qx5(ownProfileFragment, i2);
        this.a = 1;
        Object objA = pv6Var.a.a(new pt1(qx5Var, 27), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
