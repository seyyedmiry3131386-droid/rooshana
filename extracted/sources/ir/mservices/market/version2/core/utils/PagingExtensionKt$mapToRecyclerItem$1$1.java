package ir.mservices.market.version2.core.utils;

import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.PagingExtensionKt$mapToRecyclerItem$1$1", f = "PagingExtension.kt", l = {}, m = "invokeSuspend", v = 1)
final class PagingExtensionKt$mapToRecyclerItem$1$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ dp2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingExtensionKt$mapToRecyclerItem$1$1(g51 g51Var, dp2 dp2Var) {
        super(2, g51Var);
        this.b = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PagingExtensionKt$mapToRecyclerItem$1$1 pagingExtensionKt$mapToRecyclerItem$1$1 = new PagingExtensionKt$mapToRecyclerItem$1$1(g51Var, this.b);
        pagingExtensionKt$mapToRecyclerItem$1$1.a = obj;
        return pagingExtensionKt$mapToRecyclerItem$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagingExtensionKt$mapToRecyclerItem$1$1) create(obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        List list = (List) this.b.invoke(obj2);
        return list != null ? list : EmptyList.a;
    }
}
