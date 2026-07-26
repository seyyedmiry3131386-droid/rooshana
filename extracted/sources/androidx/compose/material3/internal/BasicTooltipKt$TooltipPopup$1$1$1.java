package androidx.compose.material3.internal;

import androidx.compose.material3.p;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
final class BasicTooltipKt$TooltipPopup$1$1$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$TooltipPopup$1$1$1(p pVar, g51 g51Var) {
        super(2, g51Var);
        this.a = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BasicTooltipKt$TooltipPopup$1$1$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        BasicTooltipKt$TooltipPopup$1$1$1 basicTooltipKt$TooltipPopup$1$1$1 = (BasicTooltipKt$TooltipPopup$1$1$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        basicTooltipKt$TooltipPopup$1$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        this.a.a();
        return tx8.a;
    }
}
