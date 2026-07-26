package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1;
import defpackage.g51;
import defpackage.ke;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {317}, m = "invokeSuspend", v = 1)
final class DraggableNode$drag$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qp2 c;
    public final /* synthetic */ g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(qp2 qp2Var, g gVar, g51 g51Var) {
        super(2, g51Var);
        this.c = qp2Var;
        this.d = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.c, this.d, g51Var);
        draggableNode$drag$2.b = obj;
        return draggableNode$drag$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$drag$2) create((ke) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            defpackage.m mVar = new defpackage.m((ke) this.b, this.d, 15);
            this.a = 1;
            if (((DragGestureNode$startListeningForEvents$1.AnonymousClass1) this.c).invoke(mVar, this) == coroutineSingletons) {
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
