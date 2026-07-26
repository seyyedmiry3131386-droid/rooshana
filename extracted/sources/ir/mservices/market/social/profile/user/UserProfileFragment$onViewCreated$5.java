package ir.mservices.market.social.profile.user;

import defpackage.dp2;
import defpackage.g51;
import defpackage.im2;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.user.UserProfileAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$5", f = "UserProfileFragment.kt", l = {230}, m = "invokeSuspend", v = 1)
final class UserProfileFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ UserProfileFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$5$1", f = "UserProfileFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ int a;
        public final /* synthetic */ UserProfileFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserProfileFragment userProfileFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = userProfileFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i2 = UserProfileFragment.c1;
            this.b.m1().r(new UserProfileAction.TabAction(i));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFragment$onViewCreated$5(UserProfileFragment userProfileFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = userProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UserProfileFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((UserProfileFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            UserProfileFragment userProfileFragment = this.b;
            im2 im2Var = userProfileFragment.Z0;
            js3.m(im2Var);
            o4 o4Var = new o4(im2Var.y.getSelectedTabFlow(), 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(userProfileFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
