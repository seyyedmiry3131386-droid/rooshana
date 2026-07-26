package kotlinx.coroutines;

import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {47}, m = "joinAll")
final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public Object[] a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wt3 wt3Var;
        this.d = obj;
        int i = (this.e | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.e = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = this.c;
        int i3 = this.b;
        wt3[] wt3VarArr = (wt3[]) this.a;
        kotlin.b.b(obj);
        do {
            i3++;
            if (i3 >= i2) {
                return tx8.a;
            }
            wt3Var = wt3VarArr[i3];
            this.a = wt3VarArr;
            this.b = i3;
            this.c = i2;
            this.e = 1;
        } while (wt3Var.D(this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
