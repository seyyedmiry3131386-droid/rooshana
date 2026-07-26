package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2", f = "Scrollable2D.kt", l = {289}, m = "invokeSuspend", v = 1)
final class Scrollable2DNode$setScrollSemanticsActions$2 extends SuspendLambda implements qp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        Scrollable2DNode$setScrollSemanticsActions$2 scrollable2DNode$setScrollSemanticsActions$2 = new Scrollable2DNode$setScrollSemanticsActions$2(2, g51Var);
        long j = ((nr5) obj).a;
        return scrollable2DNode$setScrollSemanticsActions$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((nr5) obj).a;
        new Scrollable2DNode$setScrollSemanticsActions$2(2, (g51) obj2).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        throw null;
    }
}
