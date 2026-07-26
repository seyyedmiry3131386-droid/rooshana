package ir.mservices.market.version2.fragments.recycle;

import android.view.animation.AnimationUtils;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$5", f = "PagingRecyclerListContentFragment.kt", l = {373}, m = "invokeSuspend", v = 1)
final class PagingRecyclerListContentFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PagingRecyclerListContentFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$5$1", f = "PagingRecyclerListContentFragment.kt", l = {375}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ PagingRecyclerListContentFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, g51 g51Var) {
            super(2, g51Var);
            this.c = pagingRecyclerListContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            bz6 bz6Var = (bz6) this.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.c;
            if (i == 0) {
                b.b(obj);
                if (bz6Var != null) {
                    a aVar = pagingRecyclerListContentFragment.Z0;
                    if (aVar != null) {
                        this.b = null;
                        this.a = 1;
                        if (aVar.L(bz6Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return tx8.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            int i2 = PagingRecyclerListContentFragment.e1;
            if (!pagingRecyclerListContentFragment.l1().k && pagingRecyclerListContentFragment.q1() != -1) {
                pagingRecyclerListContentFragment.y1().setLayoutAnimation(AnimationUtils.loadLayoutAnimation(pagingRecyclerListContentFragment.F(), pagingRecyclerListContentFragment.q1()));
                pagingRecyclerListContentFragment.y1().scheduleLayoutAnimation();
                pagingRecyclerListContentFragment.l1().k = true;
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingRecyclerListContentFragment$onViewCreated$5(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pagingRecyclerListContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingRecyclerListContentFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PagingRecyclerListContentFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.b;
            rv6 rv6Var = pagingRecyclerListContentFragment.l1().e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pagingRecyclerListContentFragment, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
