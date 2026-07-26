package ir.mservices.market.social.welcome;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pd9;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.sd9;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.welcome.WelcomeFragment$onViewCreated$4", f = "WelcomeFragment.kt", l = {167}, m = "invokeSuspend", v = 1)
final class WelcomeFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ pd9 b;
    public final /* synthetic */ WelcomeFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$onViewCreated$4(g51 g51Var, pd9 pd9Var, WelcomeFragment welcomeFragment) {
        super(1, g51Var);
        this.b = pd9Var;
        this.c = welcomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new WelcomeFragment$onViewCreated$4(g51Var, this.b, this.c);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((WelcomeFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
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
        pv6 pv6Var = this.b.g;
        sd9 sd9Var = new sd9(this.c, 2);
        this.a = 1;
        Object objA = pv6Var.a.a(new pt1(sd9Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
