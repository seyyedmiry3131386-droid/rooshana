package androidx.compose.foundation.gestures;

import defpackage.dh7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rg7;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {914}, m = "invokeSuspend", v = 1)
final class ScrollingLogic$scroll$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o c;
    public final /* synthetic */ qp2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$scroll$2(g51 g51Var, qp2 qp2Var, o oVar) {
        super(2, g51Var);
        this.c = oVar;
        this.d = qp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollingLogic$scroll$2 scrollingLogic$scroll$2 = new ScrollingLogic$scroll$2(g51Var, this.d, this.c);
        scrollingLogic$scroll$2.b = obj;
        return scrollingLogic$scroll$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$scroll$2) create((rg7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            rg7 rg7Var = (rg7) this.b;
            o oVar = this.c;
            oVar.k = rg7Var;
            dh7 dh7Var = oVar.l;
            this.a = 1;
            if (this.d.invoke(dh7Var, this) == coroutineSingletons) {
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
