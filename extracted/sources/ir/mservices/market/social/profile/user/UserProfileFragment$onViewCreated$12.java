package ir.mservices.market.social.profile.user;

import androidx.fragment.app.FragmentActivity;
import defpackage.dp2;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.data.MenuDto;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$12", f = "UserProfileFragment.kt", l = {425}, m = "invokeSuspend", v = 1)
final class UserProfileFragment$onViewCreated$12 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ UserProfileFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$12$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$12$1", f = "UserProfileFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ UserProfileFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserProfileFragment userProfileFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = userProfileFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((MenuDto) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            FragmentActivity fragmentActivityF = this.a.F();
            if (fragmentActivityF != null) {
                fragmentActivityF.invalidateOptionsMenu();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFragment$onViewCreated$12(UserProfileFragment userProfileFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = userProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UserProfileFragment$onViewCreated$12(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((UserProfileFragment$onViewCreated$12) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = UserProfileFragment.c1;
            UserProfileFragment userProfileFragment = this.b;
            o4 o4Var = new o4(userProfileFragment.l1().N, 9);
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
