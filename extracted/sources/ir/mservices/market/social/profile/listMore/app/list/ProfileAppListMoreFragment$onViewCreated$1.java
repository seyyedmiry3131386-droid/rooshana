package ir.mservices.market.social.profile.listMore.app.list;

import defpackage.dp2;
import defpackage.em;
import defpackage.g51;
import defpackage.o4;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$1", f = "ProfileAppListMoreFragment.kt", l = {148}, m = "invokeSuspend", v = 1)
final class ProfileAppListMoreFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileAppListMoreFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$1$1", f = "ProfileAppListMoreFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ProfileAppListMoreFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProfileAppListMoreFragment profileAppListMoreFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = profileAppListMoreFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((SocialListPolicies) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SocialListPolicies socialListPolicies = (SocialListPolicies) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = ProfileAppListMoreFragment.l1;
            ProfileAppListMoreFragment profileAppListMoreFragment = this.b;
            profileAppListMoreFragment.S1().r(ProfileAppListMoreAction.ClearAllAction.INSTANCE);
            NavIntentDirections.AppAddProfileList appAddProfileList = new NavIntentDirections.AppAddProfileList(new em(profileAppListMoreFragment.R1().b.a, socialListPolicies, profileAppListMoreFragment.R1().b.b, profileAppListMoreFragment.R1().a));
            profileAppListMoreFragment.J0.q();
            pk5.g(profileAppListMoreFragment.J0, appAddProfileList, -1);
            profileAppListMoreFragment.S1().r(new ProfileAppListMoreAction.EditListAction(null));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAppListMoreFragment$onViewCreated$1(ProfileAppListMoreFragment profileAppListMoreFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileAppListMoreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileAppListMoreFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ProfileAppListMoreFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ProfileAppListMoreFragment.l1;
            ProfileAppListMoreFragment profileAppListMoreFragment = this.b;
            o4 o4Var = new o4(profileAppListMoreFragment.S1().J, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(profileAppListMoreFragment, null);
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
