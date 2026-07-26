package androidx.compose.foundation.text.selection;

import defpackage.bn7;
import defpackage.e71;
import defpackage.g51;
import defpackage.nr5;
import defpackage.o38;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {96}, m = "invokeSuspend", v = 1)
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ androidx.compose.animation.core.a b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(androidx.compose.animation.core.a aVar, long j, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            nr5 nr5Var = new nr5(this.c);
            o38 o38Var = bn7.d;
            this.a = 1;
            if (androidx.compose.animation.core.a.b(this.b, nr5Var, o38Var, null, null, this, 12) == coroutineSingletons) {
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
