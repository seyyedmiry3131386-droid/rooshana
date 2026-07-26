package androidx.compose.foundation.gestures;

import defpackage.e49;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.ru1;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {333}, m = "invokeSuspend", v = 1)
final class DraggableNode$onDragStopped$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g c;
    public final /* synthetic */ ru1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$onDragStopped$1(g gVar, ru1 ru1Var, g51 g51Var) {
        super(2, g51Var);
        this.c = gVar;
        this.d = ru1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DraggableNode$onDragStopped$1 draggableNode$onDragStopped$1 = new DraggableNode$onDragStopped$1(this.c, this.d, g51Var);
        draggableNode$onDragStopped$1.b = obj;
        return draggableNode$onDragStopped$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$onDragStopped$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e71 e71Var = (e71) this.b;
            g gVar = this.c;
            rp2 rp2Var = gVar.M;
            long jF = e49.f(1.0f, this.d.a);
            Orientation orientation = gVar.J;
            rp2 rp2Var2 = f.a;
            Float f = new Float(orientation == Orientation.a ? e49.c(jF) : e49.b(jF));
            this.a = 1;
            if (rp2Var.a(e71Var, f, this) == coroutineSingletons) {
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
