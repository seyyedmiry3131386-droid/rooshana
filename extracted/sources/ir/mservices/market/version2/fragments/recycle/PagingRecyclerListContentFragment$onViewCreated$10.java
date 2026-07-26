package ir.mservices.market.version2.fragments.recycle;

import defpackage.dp2;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$10", f = "PagingRecyclerListContentFragment.kt", l = {411}, m = "invokeSuspend", v = 1)
final class PagingRecyclerListContentFragment$onViewCreated$10 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PagingRecyclerListContentFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$10$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$10$2", f = "PagingRecyclerListContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ PagingRecyclerListContentFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = pagingRecyclerListContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.a;
            a aVar = pagingRecyclerListContentFragment.Z0;
            if (aVar != null) {
                aVar.A();
            }
            pagingRecyclerListContentFragment.l1().q(false);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingRecyclerListContentFragment$onViewCreated$10(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pagingRecyclerListContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingRecyclerListContentFragment$onViewCreated$10(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PagingRecyclerListContentFragment$onViewCreated$10) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.b;
            o4 o4Var = new o4(pagingRecyclerListContentFragment.l1().o, 19);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(pagingRecyclerListContentFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass2, this) == coroutineSingletons) {
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
