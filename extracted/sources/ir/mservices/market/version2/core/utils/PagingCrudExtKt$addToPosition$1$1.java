package ir.mservices.market.version2.core.utils;

import defpackage.br9;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r01;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.core.utils.PagingCrudExtKt$addToPosition$1$1", f = "PagingCrudExt.kt", l = {}, m = "invokeSuspend", v = 1)
final class PagingCrudExtKt$addToPosition$1$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingCrudExtKt$addToPosition$1$1(Ref$IntRef ref$IntRef, List list, g51 g51Var) {
        super(2, g51Var);
        this.b = ref$IntRef;
        this.c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PagingCrudExtKt$addToPosition$1$1 pagingCrudExtKt$addToPosition$1$1 = new PagingCrudExtKt$addToPosition$1$1(this.b, this.c, g51Var);
        pagingCrudExtKt$addToPosition$1$1.a = obj;
        return pagingCrudExtKt$addToPosition$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagingCrudExtKt$addToPosition$1$1) create((RecyclerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listB;
        RecyclerItem recyclerItem = (RecyclerItem) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        Ref$IntRef ref$IntRef = this.b;
        if (ref$IntRef.a == 0) {
            r01 r01Var = new r01(2);
            r01Var.b(this.c.toArray(new RecyclerItem[0]));
            r01Var.a(recyclerItem);
            ArrayList arrayList = r01Var.a;
            listB = br9.C(arrayList.toArray(new RecyclerItem[arrayList.size()]));
        } else {
            listB = br9.B(recyclerItem);
        }
        ref$IntRef.a++;
        return listB;
    }
}
