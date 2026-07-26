package androidx.collection;

import defpackage.g51;
import defpackage.io7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
final class OrderedSetWrapper$iterator$1 extends RestrictedSuspendLambda implements qp2 {
    public Object[] b;
    public long[] c;
    public int d;
    public int e;
    public /* synthetic */ Object f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderedSetWrapper$iterator$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.e;
        if (i == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = this.d;
        long[] jArr = this.c;
        Object[] objArr = this.b;
        io7 io7Var = (io7) this.f;
        kotlin.b.b(obj);
        if (i2 == Integer.MAX_VALUE) {
            return tx8.a;
        }
        int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
        Object obj2 = objArr[i2];
        this.f = io7Var;
        this.b = objArr;
        this.c = jArr;
        this.d = i3;
        this.e = 1;
        io7Var.b(this, obj2);
        return coroutineSingletons;
    }
}
