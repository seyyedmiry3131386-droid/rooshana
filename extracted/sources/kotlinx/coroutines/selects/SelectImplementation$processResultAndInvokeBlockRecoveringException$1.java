package kotlinx.coroutines.selects;

import defpackage.g51;
import defpackage.tb1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {729}, m = "processResultAndInvokeBlockRecoveringException")
final class SelectImplementation$processResultAndInvokeBlockRecoveringException$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$processResultAndInvokeBlockRecoveringException$1(b bVar, g51 g51Var) {
        super(g51Var);
        this.b = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SelectImplementation$processResultAndInvokeBlockRecoveringException$1 selectImplementation$processResultAndInvokeBlockRecoveringException$1;
        this.a = obj;
        int i = this.c | Integer.MIN_VALUE;
        this.c = i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.c = i - Integer.MIN_VALUE;
            selectImplementation$processResultAndInvokeBlockRecoveringException$1 = this;
        } else {
            selectImplementation$processResultAndInvokeBlockRecoveringException$1 = new SelectImplementation$processResultAndInvokeBlockRecoveringException$1(this.b, this);
        }
        Object obj2 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.c;
        if (i2 == 0) {
            kotlin.b.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj2);
        return obj2;
    }
}
