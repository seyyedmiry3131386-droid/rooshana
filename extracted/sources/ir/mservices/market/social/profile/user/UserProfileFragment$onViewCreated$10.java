package ir.mservices.market.social.profile.user;

import defpackage.dp2;
import defpackage.g51;
import defpackage.l19;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$10", f = "UserProfileFragment.kt", l = {381}, m = "invokeSuspend", v = 1)
final class UserProfileFragment$onViewCreated$10 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ UserProfileFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFragment$onViewCreated$10(UserProfileFragment userProfileFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = userProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UserProfileFragment$onViewCreated$10(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((UserProfileFragment$onViewCreated$10) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = UserProfileFragment.c1;
            UserProfileFragment userProfileFragment = this.b;
            pv6 pv6Var = userProfileFragment.m1().D;
            l19 l19Var = new l19(userProfileFragment);
            this.a = 1;
            if (pv6Var.a.a(l19Var, this) == coroutineSingletons) {
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
