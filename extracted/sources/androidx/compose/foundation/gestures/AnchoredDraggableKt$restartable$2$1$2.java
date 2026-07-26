package androidx.compose.foundation.gestures;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1556}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableKt$restartable$2$1$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ qp2 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ e71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2$1$2(qp2 qp2Var, Object obj, e71 e71Var, g51 g51Var) {
        super(2, g51Var);
        this.b = qp2Var;
        this.c = obj;
        this.d = e71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AnchoredDraggableKt$restartable$2$1$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnchoredDraggableKt$restartable$2$1$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (this.b.invoke(this.c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        js3.j(this.d, new AnchoredDragFinishedSignal());
        return tx8.a;
    }
}
