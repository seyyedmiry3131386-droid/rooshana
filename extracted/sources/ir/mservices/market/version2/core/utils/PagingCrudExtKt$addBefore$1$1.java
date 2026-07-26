package ir.mservices.market.version2.core.utils;

import defpackage.br9;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r01;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vd7;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.PagingCrudExtKt$addBefore$1$1", f = "PagingCrudExt.kt", l = {}, m = "invokeSuspend", v = 1)
final class PagingCrudExtKt$addBefore$1$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ vd7 b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingCrudExtKt$addBefore$1$1(vd7 vd7Var, ArrayList arrayList, g51 g51Var) {
        super(2, g51Var);
        this.b = vd7Var;
        this.c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PagingCrudExtKt$addBefore$1$1 pagingCrudExtKt$addBefore$1$1 = new PagingCrudExtKt$addBefore$1$1(this.b, this.c, g51Var);
        pagingCrudExtKt$addBefore$1$1.a = obj;
        return pagingCrudExtKt$addBefore$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagingCrudExtKt$addBefore$1$1) create((RecyclerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecyclerItem recyclerItem = (RecyclerItem) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (!((Boolean) this.b.invoke(recyclerItem)).booleanValue()) {
            return br9.B(recyclerItem);
        }
        r01 r01Var = new r01(2);
        r01Var.b(this.c.toArray(new RecyclerItem[0]));
        r01Var.a(recyclerItem);
        ArrayList arrayList = r01Var.a;
        return br9.C(arrayList.toArray(new RecyclerItem[arrayList.size()]));
    }
}
