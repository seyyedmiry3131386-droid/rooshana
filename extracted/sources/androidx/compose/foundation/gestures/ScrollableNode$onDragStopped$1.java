package androidx.compose.foundation.gestures;

import defpackage.e49;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.ru1;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {395}, m = "invokeSuspend", v = 1)
final class ScrollableNode$onDragStopped$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ru1 b;
    public final /* synthetic */ n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onDragStopped$1(ru1 ru1Var, n nVar, g51 g51Var) {
        super(2, g51Var);
        this.b = ru1Var;
        this.c = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ScrollableNode$onDragStopped$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableNode$onDragStopped$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ru1 ru1Var = this.b;
            float f = ru1Var.b ? -1.0f : 1.0f;
            o oVar = this.c.N;
            long jF = e49.f(f, ru1Var.a);
            this.a = 1;
            if (oVar.b(jF, false, this) == coroutineSingletons) {
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
