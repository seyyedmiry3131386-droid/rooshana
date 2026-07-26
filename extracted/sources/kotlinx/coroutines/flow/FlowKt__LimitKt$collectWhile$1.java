package kotlinx.coroutines.flow;

import defpackage.fl7;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {134}, m = "collectWhile")
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    public fl7 a;
    public /* synthetic */ Object b;
    public int c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        int i = (this.c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        try {
        } catch (AbortFlowException e) {
            if (e.a != i) {
                throw e;
            }
            kotlinx.coroutines.a.f(getContext());
        }
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = new fl7(1);
            this.c = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl7 fl7Var = this.a;
        kotlin.b.b(obj);
        return tx8.a;
    }
}
