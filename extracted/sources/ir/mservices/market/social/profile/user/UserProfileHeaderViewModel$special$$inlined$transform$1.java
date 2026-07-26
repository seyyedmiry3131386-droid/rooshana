package ir.mservices.market.social.profile.user;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$special$$inlined$transform$1", f = "UserProfileHeaderViewModel.kt", l = {36}, m = "invokeSuspend", v = 1)
public final class UserProfileHeaderViewModel$special$$inlined$transform$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeaderViewModel$special$$inlined$transform$1(l lVar, g51 g51Var) {
        super(2, g51Var);
        this.c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        UserProfileHeaderViewModel$special$$inlined$transform$1 userProfileHeaderViewModel$special$$inlined$transform$1 = new UserProfileHeaderViewModel$special$$inlined$transform$1(this.c, g51Var);
        userProfileHeaderViewModel$special$$inlined$transform$1.b = obj;
        return userProfileHeaderViewModel$special$$inlined$transform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileHeaderViewModel$special$$inlined$transform$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8.a;
        }
        b.b(obj);
        vc8 vc8Var = new vc8((ze2) this.b, 10);
        this.b = null;
        this.a = 1;
        this.c.a(vc8Var, this);
        return coroutineSingletons;
    }
}
