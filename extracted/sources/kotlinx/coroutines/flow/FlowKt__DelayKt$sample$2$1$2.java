package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ ze2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(g51 g51Var, ze2 ze2Var, Ref$ObjectRef ref$ObjectRef) {
        super(2, g51Var);
        this.b = ref$ObjectRef;
        this.c = ze2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FlowKt__DelayKt$sample$2$1$2(g51Var, this.c, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$sample$2$1$2) create((tx8) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        Ref$ObjectRef ref$ObjectRef = this.b;
        Object obj2 = ref$ObjectRef.a;
        if (obj2 != null) {
            ref$ObjectRef.a = null;
            if (obj2 == vy2.f) {
                obj2 = null;
            }
            this.a = 1;
            if (this.c.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8Var;
    }
}
