package androidx.paging;

import defpackage.ea5;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.MulticastedPagingData$asPagingData$1", f = "CachedPagingData.kt", l = {53}, m = "invokeSuspend", v = 1)
final class MulticastedPagingData$asPagingData$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ea5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastedPagingData$asPagingData$1(ea5 ea5Var, g51 g51Var) {
        super(2, g51Var);
        this.a = ea5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MulticastedPagingData$asPagingData$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        MulticastedPagingData$asPagingData$1 multicastedPagingData$asPagingData$1 = (MulticastedPagingData$asPagingData$1) create((ze2) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        multicastedPagingData$asPagingData$1.invokeSuspend(tx8Var);
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
