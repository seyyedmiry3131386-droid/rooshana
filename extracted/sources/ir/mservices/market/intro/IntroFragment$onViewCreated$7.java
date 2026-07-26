package ir.mservices.market.intro;

import defpackage.dp2;
import defpackage.g51;
import defpackage.os3;
import defpackage.pt1;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.intro.IntroFragment$onViewCreated$7", f = "IntroFragment.kt", l = {112}, m = "invokeSuspend", v = 1)
final class IntroFragment$onViewCreated$7 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ IntroFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroFragment$onViewCreated$7(IntroFragment introFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = introFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new IntroFragment$onViewCreated$7(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((IntroFragment$onViewCreated$7) create((g51) obj)).invokeSuspend(tx8.a);
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
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        int i2 = IntroFragment.Z0;
        IntroFragment introFragment = this.b;
        rv6 rv6Var = introFragment.l1().B;
        os3 os3Var = new os3(introFragment, 0);
        this.a = 1;
        Object objA = rv6Var.a.a(new pt1(os3Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
