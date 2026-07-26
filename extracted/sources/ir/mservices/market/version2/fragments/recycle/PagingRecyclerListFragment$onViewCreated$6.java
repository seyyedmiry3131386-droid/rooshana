package ir.mservices.market.version2.fragments.recycle;

import defpackage.bj2;
import defpackage.dp2;
import defpackage.g51;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment$onViewCreated$6", f = "PagingRecyclerListFragment.kt", l = {316}, m = "invokeSuspend", v = 1)
final class PagingRecyclerListFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PagingRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingRecyclerListFragment$onViewCreated$6(PagingRecyclerListFragment pagingRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pagingRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingRecyclerListFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((PagingRecyclerListFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PagingRecyclerListFragment pagingRecyclerListFragment = this.b;
            rv6 rv6Var = pagingRecyclerListFragment.E0().g;
            bj2 bj2Var = new bj2(28, pagingRecyclerListFragment);
            this.a = 1;
            if (rv6Var.a.a(bj2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
