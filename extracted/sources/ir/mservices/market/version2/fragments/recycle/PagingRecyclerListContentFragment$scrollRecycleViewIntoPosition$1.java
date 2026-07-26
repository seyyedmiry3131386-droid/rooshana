package ir.mservices.market.version2.fragments.recycle;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1", f = "PagingRecyclerListContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class PagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ PagingRecyclerListContentFragment a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, int i, g51 g51Var) {
        super(1, g51Var);
        this.a = pagingRecyclerListContentFragment;
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        PagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1 pagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1 = (PagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        pagingRecyclerListContentFragment$scrollRecycleViewIntoPosition$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        this.a.y1().n0(this.b);
        return tx8.a;
    }
}
