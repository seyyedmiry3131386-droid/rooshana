package ir.mservices.market.version2.core.utils;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.PagingExtensionKt$mapToSingleRecyclerItem$1$1", f = "PagingExtension.kt", l = {}, m = "invokeSuspend", v = 1)
final class PagingExtensionKt$mapToSingleRecyclerItem$1$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PagingExtensionKt$mapToSingleRecyclerItem$1$1 pagingExtensionKt$mapToSingleRecyclerItem$1$1 = new PagingExtensionKt$mapToSingleRecyclerItem$1$1(2, g51Var);
        pagingExtensionKt$mapToSingleRecyclerItem$1$1.a = obj;
        return pagingExtensionKt$mapToSingleRecyclerItem$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagingExtensionKt$mapToSingleRecyclerItem$1$1) create((MyketRecyclerData) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MyketRecyclerData myketRecyclerData = (MyketRecyclerData) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return new RecyclerItem(myketRecyclerData);
    }
}
