package ir.mservices.market.social.users.following;

import defpackage.dp2;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.users.following.AccountFollowingAction;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.users.following.AccountFollowingFragment$onViewCreated$1", f = "AccountFollowingFragment.kt", l = {33}, m = "invokeSuspend", v = 1)
final class AccountFollowingFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AccountFollowingFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.users.following.AccountFollowingFragment$onViewCreated$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.users.following.AccountFollowingFragment$onViewCreated$1$2", f = "AccountFollowingFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ AccountFollowingFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AccountFollowingFragment accountFollowingFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = accountFollowingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            AccountFollowingFragment accountFollowingFragment = this.a;
            a aVar = accountFollowingFragment.Z0;
            if (aVar != null) {
                aVar.A();
            }
            ((AccountFollowingViewModel) accountFollowingFragment.m1.getValue()).r(new AccountFollowingAction.Refresh(false));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountFollowingFragment$onViewCreated$1(AccountFollowingFragment accountFollowingFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = accountFollowingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AccountFollowingFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AccountFollowingFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            AccountFollowingFragment accountFollowingFragment = this.b;
            o4 o4Var = new o4(((AccountFollowingViewModel) accountFollowingFragment.m1.getValue()).C, 0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(accountFollowingFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
