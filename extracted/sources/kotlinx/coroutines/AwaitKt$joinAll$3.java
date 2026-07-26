package kotlinx.coroutines;

import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
final class AwaitKt$joinAll$3 extends ContinuationImpl {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        this.b = obj;
        int i = this.c | Integer.MIN_VALUE;
        this.c = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.c = i - Integer.MIN_VALUE;
            awaitKt$joinAll$3 = this;
        } else {
            awaitKt$joinAll$3 = new AwaitKt$joinAll$3(this);
        }
        Object obj2 = awaitKt$joinAll$3.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = awaitKt$joinAll$3.c;
        if (i2 == 0) {
            kotlin.b.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = awaitKt$joinAll$3.a;
        kotlin.b.b(obj2);
        while (it.hasNext()) {
            wt3 wt3Var = (wt3) it.next();
            awaitKt$joinAll$3.a = it;
            awaitKt$joinAll$3.c = 1;
            if (wt3Var.D(awaitKt$joinAll$3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8.a;
    }
}
