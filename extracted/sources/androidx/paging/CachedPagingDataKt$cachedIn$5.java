package androidx.paging;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend", v = 1)
final class CachedPagingDataKt$cachedIn$5 extends SuspendLambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = new CachedPagingDataKt$cachedIn$5(3, (g51) obj3);
        tx8 tx8Var = tx8.a;
        cachedPagingDataKt$cachedIn$5.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return tx8.a;
    }
}
