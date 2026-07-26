package ir.mservices.market.social.welcome;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.sd9;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.welcome.WelcomeFragment$onViewCreated$3", f = "WelcomeFragment.kt", l = {162}, m = "invokeSuspend", v = 1)
final class WelcomeFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ WelcomeFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$onViewCreated$3(WelcomeFragment welcomeFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = welcomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new WelcomeFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((WelcomeFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            int i3 = WelcomeFragment.a1;
            WelcomeFragment welcomeFragment = this.b;
            pv6 pv6Var = welcomeFragment.m1().J;
            sd9 sd9Var = new sd9(welcomeFragment, i2);
            this.a = 1;
            if (pv6Var.a.a(sd9Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
