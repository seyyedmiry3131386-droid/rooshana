package ir.mservices.market.intro;

import defpackage.dp2;
import defpackage.g51;
import defpackage.os3;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.intro.IntroFragment$onViewCreated$9", f = "IntroFragment.kt", l = {127}, m = "invokeSuspend", v = 1)
final class IntroFragment$onViewCreated$9 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ IntroFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroFragment$onViewCreated$9(IntroFragment introFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = introFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new IntroFragment$onViewCreated$9(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((IntroFragment$onViewCreated$9) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = IntroFragment.Z0;
            IntroFragment introFragment = this.b;
            pv6 pv6Var = introFragment.l1().z;
            os3 os3Var = new os3(introFragment, 2);
            this.a = 1;
            if (pv6Var.a.a(os3Var, this) == coroutineSingletons) {
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
