package ir.mservices.market.social.profile.user;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderFragment$onViewCreated$2", f = "UserProfileHeaderFragment.kt", l = {65}, m = "invokeSuspend", v = 1)
final class UserProfileHeaderFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ UserProfileHeaderFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderFragment$onViewCreated$2$1", f = "UserProfileHeaderFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ UserProfileHeaderFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserProfileHeaderFragment userProfileHeaderFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = userProfileHeaderFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tx8) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = UserProfileHeaderFragment.Z0;
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.a.P0;
            if (aVar != null) {
                aVar.A();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeaderFragment$onViewCreated$2(UserProfileHeaderFragment userProfileHeaderFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = userProfileHeaderFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UserProfileHeaderFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((UserProfileHeaderFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = UserProfileHeaderFragment.Z0;
            UserProfileHeaderFragment userProfileHeaderFragment = this.b;
            pv6 pv6Var = userProfileHeaderFragment.V0().F;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(userProfileHeaderFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
