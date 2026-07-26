package androidx.paging;

import defpackage.ea5;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {99}, m = "invokeSuspend", v = 1)
final class CachedPagingDataKt$cachedIn$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ea5 b;
    public /* synthetic */ ea5 c;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(3, (g51) obj3);
        cachedPagingDataKt$cachedIn$2.b = (ea5) obj;
        cachedPagingDataKt$cachedIn$2.c = (ea5) obj2;
        return cachedPagingDataKt$cachedIn$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ea5 ea5Var = this.b;
            kotlin.b.b(obj);
            return ea5Var;
        }
        kotlin.b.b(obj);
        ea5 ea5Var2 = this.b;
        ea5 ea5Var3 = this.c;
        this.b = ea5Var3;
        this.a = 1;
        ea5Var2.b.d.g(null);
        return tx8.a == coroutineSingletons ? coroutineSingletons : ea5Var3;
    }
}
