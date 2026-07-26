package androidx.paging;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend", v = 1)
final class AsyncPagingDataDiffer$loadStateFlow$1$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ boolean a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AsyncPagingDataDiffer$loadStateFlow$1$1 asyncPagingDataDiffer$loadStateFlow$1$1 = new AsyncPagingDataDiffer$loadStateFlow$1$1(2, g51Var);
        asyncPagingDataDiffer$loadStateFlow$1$1.a = ((Boolean) obj).booleanValue();
        return asyncPagingDataDiffer$loadStateFlow$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((AsyncPagingDataDiffer$loadStateFlow$1$1) create(bool, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return Boolean.valueOf(!this.a);
    }
}
