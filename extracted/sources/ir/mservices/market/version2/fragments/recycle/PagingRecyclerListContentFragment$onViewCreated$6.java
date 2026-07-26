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
@tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$onViewCreated$6", f = "PagingRecyclerListContentFragment.kt", l = {382}, m = "invokeSuspend", v = 1)
final class PagingRecyclerListContentFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PagingRecyclerListContentFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingRecyclerListContentFragment$onViewCreated$6(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = pagingRecyclerListContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingRecyclerListContentFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((PagingRecyclerListContentFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.b;
            rv6 rv6Var = pagingRecyclerListContentFragment.l1().g;
            bj2 bj2Var = new bj2(27, pagingRecyclerListContentFragment);
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
