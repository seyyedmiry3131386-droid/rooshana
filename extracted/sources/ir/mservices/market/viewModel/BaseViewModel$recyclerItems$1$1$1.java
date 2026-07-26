package ir.mservices.market.viewModel;

import androidx.paging.e;
import defpackage.a06;
import defpackage.g32;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.viewModel.BaseViewModel$recyclerItems$1$1$1", f = "BaseViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class BaseViewModel$recyclerItems$1$1$1 extends SuspendLambda implements sp2 {
    public /* synthetic */ a06 a;
    public /* synthetic */ Set b;
    public /* synthetic */ Map c;

    /* JADX INFO: renamed from: ir.mservices.market.viewModel.BaseViewModel$recyclerItems$1$1$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.viewModel.BaseViewModel$recyclerItems$1$1$1$1", f = "BaseViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ Set b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set set, g51 g51Var) {
            super(2, g51Var);
            this.b = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((RecyclerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerItem recyclerItem = (RecyclerItem) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            Set set = this.b;
            MyketRecyclerData myketRecyclerData = recyclerItem.c;
            return Boolean.valueOf(!kotlin.collections.a.h0(set, (myketRecyclerData instanceof g32 ? (g32) myketRecyclerData : null) != null ? r0.getUniqueId() : null));
        }
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        BaseViewModel$recyclerItems$1$1$1 baseViewModel$recyclerItems$1$1$1 = new BaseViewModel$recyclerItems$1$1$1(4, (g51) obj4);
        baseViewModel$recyclerItems$1$1$1.a = (a06) obj;
        baseViewModel$recyclerItems$1$1$1.b = (Set) obj2;
        baseViewModel$recyclerItems$1$1$1.c = (Map) obj3;
        return baseViewModel$recyclerItems$1$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a06 a06Var = this.a;
        Set set = this.b;
        Map map = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return e.c(ir.mservices.market.core.ext.a.b(a06Var, map), new AnonymousClass1(set, null));
    }
}
