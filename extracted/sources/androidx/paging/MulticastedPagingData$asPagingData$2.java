package androidx.paging;

import defpackage.ea5;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", l = {54}, m = "invokeSuspend", v = 1)
final class MulticastedPagingData$asPagingData$2 extends SuspendLambda implements rp2 {
    public final /* synthetic */ ea5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastedPagingData$asPagingData$2(ea5 ea5Var, g51 g51Var) {
        super(3, g51Var);
        this.a = ea5Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        MulticastedPagingData$asPagingData$2 multicastedPagingData$asPagingData$2 = new MulticastedPagingData$asPagingData$2(this.a, (g51) obj3);
        tx8 tx8Var = tx8.a;
        multicastedPagingData$asPagingData$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        this.a.getClass();
        return tx8.a;
    }
}
