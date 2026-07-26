package ir.mservices.market.version2.core.utils;

import defpackage.br9;
import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.PagingCrudExtKt$replace$1$1", f = "PagingCrudExt.kt", l = {}, m = "invokeSuspend", v = 1)
final class PagingCrudExtKt$replace$1$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ dp2 b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingCrudExtKt$replace$1$1(dp2 dp2Var, List list, g51 g51Var) {
        super(2, g51Var);
        this.b = dp2Var;
        this.c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PagingCrudExtKt$replace$1$1 pagingCrudExtKt$replace$1$1 = new PagingCrudExtKt$replace$1$1(this.b, this.c, g51Var);
        pagingCrudExtKt$replace$1$1.a = obj;
        return pagingCrudExtKt$replace$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagingCrudExtKt$replace$1$1) create((RecyclerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecyclerItem recyclerItem = (RecyclerItem) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return ((Boolean) this.b.invoke(recyclerItem)).booleanValue() ? this.c : br9.B(recyclerItem);
    }
}
