package ir.mservices.market.social.profile.user;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.xk6;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$9", f = "UserProfileFragment.kt", l = {351}, m = "invokeSuspend", v = 1)
final class UserProfileFragment$onViewCreated$9 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ UserProfileFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFragment$onViewCreated$9(UserProfileFragment userProfileFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = userProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UserProfileFragment$onViewCreated$9(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((UserProfileFragment$onViewCreated$9) create((g51) obj)).invokeSuspend(tx8.a);
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
        int i2 = UserProfileFragment.c1;
        UserProfileFragment userProfileFragment = this.b;
        pv6 pv6Var = userProfileFragment.l1().z;
        xk6 xk6Var = new xk6(27, userProfileFragment);
        this.a = 1;
        Object objA = pv6Var.a.a(new vc8(xk6Var, 8), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
