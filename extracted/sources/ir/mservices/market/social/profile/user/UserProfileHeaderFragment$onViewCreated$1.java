package ir.mservices.market.social.profile.user;

import defpackage.aw0;
import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import ir.mservices.market.social.profile.user.UserProfileHeaderAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderFragment$onViewCreated$1", f = "UserProfileHeaderFragment.kt", l = {60}, m = "invokeSuspend", v = 1)
final class UserProfileHeaderFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ UserProfileHeaderFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderFragment$onViewCreated$1$1", f = "UserProfileHeaderFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ UserProfileHeaderFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserProfileHeaderFragment userProfileHeaderFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = userProfileHeaderFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((aw0) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            aw0 aw0Var = (aw0) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = UserProfileHeaderFragment.Z0;
            this.b.V0().r(new UserProfileHeaderAction.LoadAction(aw0Var.a));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeaderFragment$onViewCreated$1(UserProfileHeaderFragment userProfileHeaderFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = userProfileHeaderFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UserProfileHeaderFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((UserProfileHeaderFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xe2 xe2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = UserProfileHeaderFragment.Z0;
            UserProfileHeaderFragment userProfileHeaderFragment = this.b;
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = userProfileHeaderFragment.P0;
            if (aVar != null && (xe2Var = aVar.f) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(userProfileHeaderFragment, null);
                this.a = 1;
                if (d.f(xe2Var, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
