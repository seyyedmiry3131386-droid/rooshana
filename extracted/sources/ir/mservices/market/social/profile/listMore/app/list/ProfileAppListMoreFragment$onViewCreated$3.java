package ir.mservices.market.social.profile.listMore.app.list;

import defpackage.dp2;
import defpackage.g51;
import defpackage.hh2;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$3", f = "ProfileAppListMoreFragment.kt", l = {186}, m = "invokeSuspend", v = 1)
final class ProfileAppListMoreFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileAppListMoreFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$3$1", f = "ProfileAppListMoreFragment.kt", l = {}, m = "invokeSuspend", v = 1)
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
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            ProfileAppListMoreFragment profileAppListMoreFragment = this.b;
            hh2.H(new hh2(profileAppListMoreFragment.F(), str));
            profileAppListMoreFragment.S1().r(new ProfileAppListMoreAction.ToastAction(null));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAppListMoreFragment$onViewCreated$3(ProfileAppListMoreFragment profileAppListMoreFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileAppListMoreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileAppListMoreFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ProfileAppListMoreFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ProfileAppListMoreFragment.l1;
            ProfileAppListMoreFragment profileAppListMoreFragment = this.b;
            o4 o4Var = new o4(profileAppListMoreFragment.S1().C, 9);
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
