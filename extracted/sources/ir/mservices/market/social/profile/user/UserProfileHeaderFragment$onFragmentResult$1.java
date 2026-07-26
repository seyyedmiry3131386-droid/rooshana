package ir.mservices.market.social.profile.user;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.user.UserProfileHeaderAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderFragment$onFragmentResult$1", f = "UserProfileHeaderFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class UserProfileHeaderFragment$onFragmentResult$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ UserProfileHeaderFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeaderFragment$onFragmentResult$1(UserProfileHeaderFragment userProfileHeaderFragment, g51 g51Var) {
        super(1, g51Var);
        this.a = userProfileHeaderFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UserProfileHeaderFragment$onFragmentResult$1(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        UserProfileHeaderFragment$onFragmentResult$1 userProfileHeaderFragment$onFragmentResult$1 = (UserProfileHeaderFragment$onFragmentResult$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        userProfileHeaderFragment$onFragmentResult$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        int i = UserProfileHeaderFragment.Z0;
        this.a.V0().r(UserProfileHeaderAction.RefreshAction.INSTANCE);
        return tx8.a;
    }
}
