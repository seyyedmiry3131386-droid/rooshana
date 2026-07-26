package ir.mservices.market.social.welcome;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.welcome.WelcomeFragment$onViewCreated$5", f = "WelcomeFragment.kt", l = {172}, m = "invokeSuspend", v = 1)
final class WelcomeFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ WelcomeFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$onViewCreated$5(WelcomeFragment welcomeFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = welcomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new WelcomeFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((WelcomeFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        int i2 = WelcomeFragment.a1;
        WelcomeFragment welcomeFragment = this.b;
        rv6 rv6Var = welcomeFragment.m1().L;
        b bVar = new b(welcomeFragment);
        this.a = 1;
        Object objA = rv6Var.a.a(new pt1(bVar, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
