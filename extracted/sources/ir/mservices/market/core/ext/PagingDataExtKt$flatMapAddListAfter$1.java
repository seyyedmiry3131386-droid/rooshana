package ir.mservices.market.core.ext;

import defpackage.bc;
import defpackage.br9;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r01;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.core.ext.PagingDataExtKt$flatMapAddListAfter$1", f = "PagingDataExt.kt", l = {}, m = "invokeSuspend", v = 1)
final class PagingDataExtKt$flatMapAddListAfter$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataExtKt$flatMapAddListAfter$1(Map map, g51 g51Var) {
        super(2, g51Var);
        this.b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PagingDataExtKt$flatMapAddListAfter$1 pagingDataExtKt$flatMapAddListAfter$1 = new PagingDataExtKt$flatMapAddListAfter$1(this.b, g51Var);
        pagingDataExtKt$flatMapAddListAfter$1.a = obj;
        return pagingDataExtKt$flatMapAddListAfter$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagingDataExtKt$flatMapAddListAfter$1) create((RecyclerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecyclerItem recyclerItem = (RecyclerItem) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        Collection collectionValues = this.b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (((Boolean) ((bc) obj2).b.invoke(recyclerItem)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kotlin.collections.a.b0(((bc) it.next()).a, arrayList2);
        }
        r01 r01Var = new r01(2);
        r01Var.a(recyclerItem);
        r01Var.b(arrayList2.toArray(new RecyclerItem[0]));
        ArrayList arrayList3 = r01Var.a;
        return br9.C(arrayList3.toArray(new RecyclerItem[arrayList3.size()]));
    }
}
