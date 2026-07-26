package androidx.compose.foundation;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", f = "BasicTooltip.kt", l = {220}, m = "invokeSuspend", v = 1)
final class BasicTooltipKt$anchorSemantics$1$1$1 extends SuspendLambda implements qp2 {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BasicTooltipKt$anchorSemantics$1$1$1(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        BasicTooltipKt$anchorSemantics$1$1$1 basicTooltipKt$anchorSemantics$1$1$1 = (BasicTooltipKt$anchorSemantics$1$1$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        basicTooltipKt$anchorSemantics$1$1$1.invokeSuspend(tx8Var);
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
        MutatePriority mutatePriority = MutatePriority.a;
        throw null;
    }
}
