package ir.mservices.market.social.profile.user;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import defpackage.dp2;
import defpackage.fp6;
import defpackage.g51;
import defpackage.im2;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.common.ProfileTabView;
import ir.mservices.market.social.profile.user.UserProfileAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$8", f = "UserProfileFragment.kt", l = {320}, m = "invokeSuspend", v = 1)
final class UserProfileFragment$onViewCreated$8 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ UserProfileFragment b;
    public final /* synthetic */ View c;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$8$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileFragment$onViewCreated$8$1", f = "UserProfileFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ UserProfileFragment b;
        public final /* synthetic */ View c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserProfileFragment userProfileFragment, View view, g51 g51Var) {
            super(2, g51Var);
            this.b = userProfileFragment;
            this.c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, g51Var);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            if (z) {
                UserProfileFragment userProfileFragment = this.b;
                im2 im2Var = userProfileFragment.Z0;
                js3.m(im2Var);
                ProfileTabView profileTabView = im2Var.A;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.c.getContext(), fp6.item_animation_fall_down);
                animationLoadAnimation.setStartOffset(300L);
                animationLoadAnimation.setAnimationListener(new a(userProfileFragment));
                profileTabView.startAnimation(animationLoadAnimation);
                userProfileFragment.m1().r(new UserProfileAction.TabAnimationAction(false));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFragment$onViewCreated$8(UserProfileFragment userProfileFragment, View view, g51 g51Var) {
        super(1, g51Var);
        this.b = userProfileFragment;
        this.c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UserProfileFragment$onViewCreated$8(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((UserProfileFragment$onViewCreated$8) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = UserProfileFragment.c1;
            UserProfileFragment userProfileFragment = this.b;
            o4 o4Var = new o4(userProfileFragment.m1().z, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(userProfileFragment, this.c, null);
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
