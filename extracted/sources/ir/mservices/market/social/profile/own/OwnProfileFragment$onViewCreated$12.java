package ir.mservices.market.social.profile.own;

import defpackage.dp2;
import defpackage.g51;
import defpackage.qx5;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.OwnProfileFragment$onViewCreated$12", f = "OwnProfileFragment.kt", l = {369}, m = "invokeSuspend", v = 1)
final class OwnProfileFragment$onViewCreated$12 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ OwnProfileFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileFragment$onViewCreated$12(OwnProfileFragment ownProfileFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = ownProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new OwnProfileFragment$onViewCreated$12(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((OwnProfileFragment$onViewCreated$12) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = OwnProfileFragment.d1;
            OwnProfileFragment ownProfileFragment = this.b;
            rv6 rv6Var = ownProfileFragment.m1().D;
            qx5 qx5Var = new qx5(ownProfileFragment, 0);
            this.a = 1;
            if (rv6Var.a.a(qx5Var, this) == coroutineSingletons) {
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
