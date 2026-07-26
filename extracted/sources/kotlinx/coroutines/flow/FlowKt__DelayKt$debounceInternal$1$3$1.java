package kotlinx.coroutines.flow;

import defpackage.dp2;
import defpackage.g51;
import defpackage.mu3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ze2 b;
    public final /* synthetic */ Ref$ObjectRef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(g51 g51Var, ze2 ze2Var, Ref$ObjectRef ref$ObjectRef) {
        super(1, g51Var);
        this.b = ze2Var;
        this.c = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        Ref$ObjectRef ref$ObjectRef = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            mu3 mu3Var = vy2.f;
            Object obj2 = ref$ObjectRef.a;
            if (obj2 == mu3Var) {
                obj2 = null;
            }
            this.a = 1;
            if (this.b.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        ref$ObjectRef.a = null;
        return tx8.a;
    }
}
