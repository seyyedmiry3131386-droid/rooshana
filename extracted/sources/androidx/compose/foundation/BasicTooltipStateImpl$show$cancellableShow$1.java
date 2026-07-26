package androidx.compose.foundation;

import defpackage.dp2;
import defpackage.g51;
import defpackage.ok4;
import defpackage.om0;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", l = {391}, m = "invokeSuspend", v = 1)
final class BasicTooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements dp2 {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(1, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        BasicTooltipStateImpl$show$cancellableShow$1 basicTooltipStateImpl$show$cancellableShow$1 = (BasicTooltipStateImpl$show$cancellableShow$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        basicTooltipStateImpl$show$cancellableShow$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8.a;
        }
        kotlin.b.b(obj);
        this.a = 1;
        new om0(1, ok4.I(this)).v();
        throw null;
    }
}
