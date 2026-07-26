package ir.mservices.market.version2.fragments.recycle;

import android.view.animation.AnimationUtils;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.fp6;
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
@tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$5", f = "PagingRecyclerListFragment.kt", l = {307}, m = "invokeSuspend", v = 1)
final class PagingRecyclerListFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PagingRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$5$1", f = "PagingRecyclerListFragment.kt", l = {309}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ PagingRecyclerListFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagingRecyclerListFragment pagingRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.c = pagingRecyclerListFragment;
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
            PagingRecyclerListFragment pagingRecyclerListFragment = this.c;
            if (i == 0) {
                b.b(obj);
                if (bz6Var != null) {
                    a aVar = pagingRecyclerListFragment.P0;
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
            int i2 = PagingRecyclerListFragment.U0;
            if (!pagingRecyclerListFragment.E0().k && fp6.layout_animation_fall_down != -1) {
                pagingRecyclerListFragment.J0().setLayoutAnimation(AnimationUtils.loadLayoutAnimation(pagingRecyclerListFragment.F(), fp6.layout_animation_fall_down));
                pagingRecyclerListFragment.J0().scheduleLayoutAnimation();
                pagingRecyclerListFragment.E0().k = true;
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingRecyclerListFragment$onViewCreated$5(PagingRecyclerListFragment pagingRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pagingRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingRecyclerListFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PagingRecyclerListFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PagingRecyclerListFragment pagingRecyclerListFragment = this.b;
            rv6 rv6Var = pagingRecyclerListFragment.E0().e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pagingRecyclerListFragment, null);
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
