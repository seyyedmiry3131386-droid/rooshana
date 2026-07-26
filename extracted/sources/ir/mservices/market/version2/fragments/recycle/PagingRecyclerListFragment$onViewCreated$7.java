package ir.mservices.market.version2.fragments.recycle;

import defpackage.aw0;
import defpackage.dp2;
import defpackage.g51;
import defpackage.ga4;
import defpackage.p06;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$7", f = "PagingRecyclerListFragment.kt", l = {329}, m = "invokeSuspend", v = 1)
final class PagingRecyclerListFragment$onViewCreated$7 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PagingRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$7$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$7$1", f = "PagingRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements rp2 {
        public /* synthetic */ aw0 a;
        public /* synthetic */ boolean b;

        @Override // defpackage.rp2
        public final Object a(Object obj, Object obj2, Object obj3) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (g51) obj3);
            anonymousClass1.a = (aw0) obj;
            anonymousClass1.b = zBooleanValue;
            return anonymousClass1.invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            aw0 aw0Var = this.a;
            boolean z = this.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            return Boolean.valueOf(z && ((aw0Var.a instanceof ga4) || (aw0Var.c instanceof ga4)));
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$7$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$7$3", f = "PagingRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public final /* synthetic */ PagingRecyclerListFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PagingRecyclerListFragment pagingRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = pagingRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass3(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass3.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            PagingRecyclerListFragment pagingRecyclerListFragment = this.a;
            pagingRecyclerListFragment.E0().i();
            l lVar = pagingRecyclerListFragment.T0;
            do {
                value = lVar.getValue();
                ((Boolean) value).getClass();
            } while (!lVar.n(value, Boolean.FALSE));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingRecyclerListFragment$onViewCreated$7(PagingRecyclerListFragment pagingRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pagingRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingRecyclerListFragment$onViewCreated$7(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PagingRecyclerListFragment$onViewCreated$7) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xe2 xe2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PagingRecyclerListFragment pagingRecyclerListFragment = this.b;
            a aVar = pagingRecyclerListFragment.P0;
            if (aVar != null && (xe2Var = aVar.f) != null) {
                p06 p06Var = new p06(new h(xe2Var, pagingRecyclerListFragment.T0, new AnonymousClass1(3, null)), 1);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(pagingRecyclerListFragment, null);
                this.a = 1;
                if (d.f(p06Var, anonymousClass3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
