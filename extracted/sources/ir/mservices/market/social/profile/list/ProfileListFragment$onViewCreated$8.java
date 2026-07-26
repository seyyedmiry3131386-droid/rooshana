package ir.mservices.market.social.profile.list;

import defpackage.dp2;
import defpackage.g51;
import defpackage.il6;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.ProfileListFragment$onViewCreated$8", f = "ProfileListFragment.kt", l = {430}, m = "invokeSuspend", v = 1)
final class ProfileListFragment$onViewCreated$8 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListFragment$onViewCreated$8(ProfileListFragment profileListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileListFragment$onViewCreated$8(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((ProfileListFragment$onViewCreated$8) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = ProfileListFragment.Z0;
            ProfileListFragment profileListFragment = this.b;
            pv6 pv6Var = profileListFragment.V0().P;
            il6 il6Var = new il6(profileListFragment, 2);
            this.a = 1;
            if (pv6Var.a.a(il6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
