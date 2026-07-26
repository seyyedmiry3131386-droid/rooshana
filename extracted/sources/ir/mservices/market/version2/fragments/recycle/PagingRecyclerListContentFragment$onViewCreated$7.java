package ir.mservices.market.version2.fragments.recycle;

import defpackage.dp2;
import defpackage.g51;
import defpackage.n06;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.views.TryAgainView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$7", f = "PagingRecyclerListContentFragment.kt", l = {390}, m = "invokeSuspend", v = 1)
final class PagingRecyclerListContentFragment$onViewCreated$7 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PagingRecyclerListContentFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$7$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$7$1", f = "PagingRecyclerListContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ PagingRecyclerListContentFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = pagingRecyclerListContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.b;
            TryAgainView tryAgainViewC1 = pagingRecyclerListContentFragment.C1();
            if (tryAgainViewC1 != null) {
                tryAgainViewC1.u(str);
            }
            TryAgainView tryAgainViewC12 = pagingRecyclerListContentFragment.C1();
            if (tryAgainViewC12 != null) {
                tryAgainViewC12.setOnTryAgainListener(new n06(pagingRecyclerListContentFragment, 3));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingRecyclerListContentFragment$onViewCreated$7(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pagingRecyclerListContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingRecyclerListContentFragment$onViewCreated$7(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PagingRecyclerListContentFragment$onViewCreated$7) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.b;
            o4 o4Var = new o4(pagingRecyclerListContentFragment.l1().i, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pagingRecyclerListContentFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
