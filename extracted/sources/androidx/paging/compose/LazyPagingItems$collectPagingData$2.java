package androidx.paging.compose;

import defpackage.a06;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {168}, m = "invokeSuspend", v = 1)
final class LazyPagingItems$collectPagingData$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        LazyPagingItems$collectPagingData$2 lazyPagingItems$collectPagingData$2 = new LazyPagingItems$collectPagingData$2(2, g51Var);
        lazyPagingItems$collectPagingData$2.a = obj;
        return lazyPagingItems$collectPagingData$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((LazyPagingItems$collectPagingData$2) create((a06) obj, (g51) obj2)).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        throw null;
    }
}
