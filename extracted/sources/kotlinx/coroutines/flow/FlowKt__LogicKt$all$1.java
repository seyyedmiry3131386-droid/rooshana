package kotlinx.coroutines.flow;

import defpackage.jf2;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {119}, m = "all")
final class FlowKt__LogicKt$all$1<T> extends ContinuationImpl {
    public Ref$BooleanRef a;
    public jf2 b;
    public /* synthetic */ Object c;
    public int d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        int i = (this.d | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.d = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        try {
        } catch (AbortFlowException e) {
            if (e.a != i) {
                throw e;
            }
            kotlinx.coroutines.a.f(getContext());
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jf2 jf2Var = this.b;
            Ref$BooleanRef ref$BooleanRef = this.a;
            kotlin.b.b(obj);
            return Boolean.valueOf(!ref$BooleanRef.a);
        }
        kotlin.b.b(obj);
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        jf2 jf2Var2 = new jf2(ref$BooleanRef2, 0);
        this.a = ref$BooleanRef2;
        this.b = jf2Var2;
        this.d = 1;
        throw null;
    }
}
