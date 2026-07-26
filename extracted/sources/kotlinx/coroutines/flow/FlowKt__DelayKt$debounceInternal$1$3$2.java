package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.ip0;
import defpackage.jp0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements qp2 {
    public Ref$ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ ze2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(g51 g51Var, ze2 ze2Var, Ref$ObjectRef ref$ObjectRef) {
        super(2, g51Var);
        this.d = ref$ObjectRef;
        this.e = ze2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(g51Var, this.e, this.d);
        flowKt__DelayKt$debounceInternal$1$3$2.c = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new jp0(((jp0) obj).a), (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = ((jp0) this.c).a;
            boolean z = obj2 instanceof ip0;
            ref$ObjectRef = this.d;
            if (!z) {
                ref$ObjectRef.a = obj2;
            }
            if (z) {
                Throwable thA = jp0.a(obj2);
                if (thA != null) {
                    throw thA;
                }
                Object obj3 = ref$ObjectRef.a;
                if (obj3 != null) {
                    if (obj3 == vy2.f) {
                        obj3 = null;
                    }
                    this.c = obj2;
                    this.a = ref$ObjectRef;
                    this.b = 1;
                    if (this.e.emit(obj3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.a = vy2.h;
            }
            return tx8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef2 = this.a;
        kotlin.b.b(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.a = vy2.h;
        return tx8.a;
    }
}
