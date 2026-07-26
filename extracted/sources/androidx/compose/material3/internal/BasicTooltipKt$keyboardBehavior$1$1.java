package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.p;
import androidx.compose.ui.focus.FocusStateImpl;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {301}, m = "invokeSuspend")
final class BasicTooltipKt$keyboardBehavior$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ug2 b;
    public final /* synthetic */ p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$keyboardBehavior$1$1(ug2 ug2Var, p pVar, g51 g51Var) {
        super(2, g51Var);
        this.b = ug2Var;
        this.c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BasicTooltipKt$keyboardBehavior$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$keyboardBehavior$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        ug2 ug2Var = this.b;
        p pVar = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((FocusStateImpl) ug2Var).b()) {
                MutatePriority mutatePriority = MutatePriority.c;
                this.a = 1;
                if (pVar.c(mutatePriority, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        if (pVar.b() && !((FocusStateImpl) ug2Var).b()) {
            pVar.a();
        }
        return tx8.a;
    }
}
