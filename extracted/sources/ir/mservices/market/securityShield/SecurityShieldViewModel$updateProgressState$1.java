package ir.mservices.market.securityShield;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.SecurityShieldViewModel$updateProgressState$1", f = "SecurityShieldViewModel.kt", l = {318}, m = "invokeSuspend", v = 1)
final class SecurityShieldViewModel$updateProgressState$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SecurityShieldViewModel b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldViewModel$updateProgressState$1(SecurityShieldViewModel securityShieldViewModel, int i, g51 g51Var) {
        super(2, g51Var);
        this.b = securityShieldViewModel;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SecurityShieldViewModel$updateProgressState$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SecurityShieldViewModel$updateProgressState$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        l lVar = this.b.B;
        Integer num = new Integer(this.c);
        this.a = 1;
        lVar.emit(num, this);
        return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
