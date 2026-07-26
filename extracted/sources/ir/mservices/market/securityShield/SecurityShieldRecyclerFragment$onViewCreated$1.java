package ir.mservices.market.securityShield;

import defpackage.dp2;
import defpackage.fl7;
import defpackage.g51;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.SecurityShieldRecyclerFragment$onViewCreated$1", f = "SecurityShieldRecyclerFragment.kt", l = {64}, m = "invokeSuspend", v = 1)
final class SecurityShieldRecyclerFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SecurityShieldRecyclerFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldRecyclerFragment$onViewCreated$1(SecurityShieldRecyclerFragment securityShieldRecyclerFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = securityShieldRecyclerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SecurityShieldRecyclerFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((SecurityShieldRecyclerFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = SecurityShieldRecyclerFragment.k1;
            rv6 rv6Var = ((SecurityShieldViewModel) this.b.j1.getValue()).A;
            this.a = 1;
            if (rv6Var.a.a(fl7.b, this) == coroutineSingletons) {
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
