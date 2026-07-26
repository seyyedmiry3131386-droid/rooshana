package androidx.compose.foundation.gestures;

import defpackage.e71;
import defpackage.g51;
import defpackage.ml9;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.us3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {194}, m = "invokeSuspend", v = 1)
final class MouseWheelScrollingLogic$busyReceive$2$job$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MouseWheelScrollingLogic$busyReceive$2$job$1 mouseWheelScrollingLogic$busyReceive$2$job$1 = new MouseWheelScrollingLogic$busyReceive$2$job$1(2, g51Var);
        mouseWheelScrollingLogic$busyReceive$2$job$1.b = obj;
        return mouseWheelScrollingLogic$busyReceive$2$job$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$busyReceive$2$job$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e71 e71Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e71Var = (e71) this.b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e71Var = (e71) this.b;
            kotlin.b.b(obj);
        }
        while (kotlinx.coroutines.a.j(e71Var.getCoroutineContext())) {
            us3 us3Var = new us3(13);
            this.b = e71Var;
            this.a = 1;
            if (ml9.s(getContext()).k0(this, us3Var) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8.a;
    }
}
