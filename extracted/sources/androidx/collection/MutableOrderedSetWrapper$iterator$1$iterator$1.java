package androidx.collection;

import defpackage.g51;
import defpackage.io7;
import defpackage.nb5;
import defpackage.ob5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements qp2 {
    public b b;
    public ob5 c;
    public long[] d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ob5 h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(ob5 ob5Var, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.h = ob5Var;
        this.i = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.h, this.i, g51Var);
        mutableOrderedSetWrapper$iterator$1$iterator$1.g = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        io7 io7Var;
        ob5 ob5Var;
        long[] jArr;
        int i;
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = this.f;
        if (i2 == 0) {
            kotlin.b.b(obj);
            io7Var = (io7) this.g;
            ob5Var = this.h;
            nb5 nb5Var = ob5Var.b;
            jArr = nb5Var.c;
            i = nb5Var.e;
            bVar = this.i;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.e;
            jArr = this.d;
            ob5Var = this.c;
            bVar = this.b;
            io7Var = (io7) this.g;
            kotlin.b.b(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return tx8.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        bVar.b = i;
        Object obj2 = ob5Var.b.b[i];
        this.g = io7Var;
        this.b = bVar;
        this.c = ob5Var;
        this.d = jArr;
        this.e = i3;
        this.f = 1;
        io7Var.b(this, obj2);
        return coroutineSingletons;
    }
}
