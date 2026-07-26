package ir.mservices.market.version2.ui.recycler.adapter;

import androidx.paging.e;
import defpackage.a06;
import defpackage.bz6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.Filter;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter$submitData$2", f = "BasePagingAdapter.kt", l = {ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR}, m = "invokeSuspend", v = 1)
final class BasePagingAdapter$submitData$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public final /* synthetic */ bz6 d;

    /* JADX INFO: renamed from: ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter$submitData$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter$submitData$2$1", f = "BasePagingAdapter.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ bz6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bz6 bz6Var, g51 g51Var) {
            super(2, g51Var);
            this.b = bz6Var;
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
            b.b(obj);
            Filter filter = this.b.b;
            boolean z = false;
            if (filter != null && filter.u(recyclerItem.c)) {
                z = true;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePagingAdapter$submitData$2(a aVar, bz6 bz6Var, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
        this.d = bz6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        BasePagingAdapter$submitData$2 basePagingAdapter$submitData$2 = new BasePagingAdapter$submitData$2(this.c, this.d, g51Var);
        basePagingAdapter$submitData$2.b = obj;
        return basePagingAdapter$submitData$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePagingAdapter$submitData$2) create((a06) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a06 a06Var = (a06) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            bz6 bz6Var = this.d;
            a06 a06VarA = ir.mservices.market.version2.core.utils.a.a(e.c(a06Var, new AnonymousClass1(bz6Var, null)), bz6Var.c);
            this.b = null;
            this.a = 1;
            if (this.c.E(a06VarA, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
