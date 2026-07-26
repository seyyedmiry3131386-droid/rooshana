package ir.mservices.market.social.profile.list;

import defpackage.dp2;
import defpackage.g51;
import defpackage.il6;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.ProfileListFragment$onViewCreated$6", f = "ProfileListFragment.kt", l = {397}, m = "invokeSuspend", v = 1)
final class ProfileListFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListFragment$onViewCreated$6(ProfileListFragment profileListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileListFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ProfileListFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
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
        int i2 = ProfileListFragment.Z0;
        ProfileListFragment profileListFragment = this.b;
        pv6 pv6Var = profileListFragment.V0().T;
        il6 il6Var = new il6(profileListFragment, 0);
        this.a = 1;
        Object objA = pv6Var.a.a(new pt1(il6Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
