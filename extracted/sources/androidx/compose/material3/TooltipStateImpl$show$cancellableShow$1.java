package androidx.compose.material3;

import defpackage.dp2;
import defpackage.g51;
import defpackage.ok4;
import defpackage.om0;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", l = {1655}, m = "invokeSuspend")
final class TooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$cancellableShow$1(p pVar, g51 g51Var) {
        super(1, g51Var);
        this.b = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new TooltipStateImpl$show$cancellableShow$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((TooltipStateImpl$show$cancellableShow$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            om0 om0Var = new om0(1, ok4.I(this));
            om0Var.v();
            p pVar = this.b;
            yb5 yb5Var = pVar.b;
            ((s08) yb5Var.d).setValue(Boolean.TRUE);
            pVar.c = om0Var;
            if (om0Var.u() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
