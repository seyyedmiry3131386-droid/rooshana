package ir.mservices.market.social.profile.listMore.app.list;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wk6;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$4", f = "ProfileAppListMoreFragment.kt", l = {193}, m = "invokeSuspend", v = 1)
final class ProfileAppListMoreFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileAppListMoreFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAppListMoreFragment$onViewCreated$4(ProfileAppListMoreFragment profileAppListMoreFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileAppListMoreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileAppListMoreFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((ProfileAppListMoreFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ProfileAppListMoreFragment.l1;
            ProfileAppListMoreFragment profileAppListMoreFragment = this.b;
            pv6 pv6Var = profileAppListMoreFragment.S1().G;
            wk6 wk6Var = new wk6(profileAppListMoreFragment);
            this.a = 1;
            if (pv6Var.a.a(wk6Var, this) == coroutineSingletons) {
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
