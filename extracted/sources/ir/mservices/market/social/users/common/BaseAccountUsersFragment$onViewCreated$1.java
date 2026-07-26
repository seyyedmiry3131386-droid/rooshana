package ir.mservices.market.social.users.common;

import defpackage.dp2;
import defpackage.g51;
import defpackage.r4;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.users.common.BaseAccountUsersFragment$onViewCreated$1", f = "BaseAccountUsersFragment.kt", l = {52}, m = "invokeSuspend", v = 1)
final class BaseAccountUsersFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseAccountUsersFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAccountUsersFragment$onViewCreated$1(BaseAccountUsersFragment baseAccountUsersFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseAccountUsersFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseAccountUsersFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((BaseAccountUsersFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            BaseAccountUsersFragment baseAccountUsersFragment = this.b;
            rv6 rv6Var = baseAccountUsersFragment.Q1().g;
            r4 r4Var = new r4(9, baseAccountUsersFragment);
            this.a = 1;
            if (rv6Var.a.a(r4Var, this) == coroutineSingletons) {
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
