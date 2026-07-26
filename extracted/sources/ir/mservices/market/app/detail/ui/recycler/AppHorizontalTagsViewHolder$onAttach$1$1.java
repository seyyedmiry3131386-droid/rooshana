package ir.mservices.market.app.detail.ui.recycler;

import defpackage.bz6;
import defpackage.e71;
import defpackage.fa2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppHorizontalTagsViewHolder$onAttach$1$1", f = "AppHorizontalTags.kt", l = {124}, m = "invokeSuspend", v = 1)
final class AppHorizontalTagsViewHolder$onAttach$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ fa2 b;
    public final /* synthetic */ AppHorizontalTagsData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppHorizontalTagsViewHolder$onAttach$1$1(fa2 fa2Var, AppHorizontalTagsData appHorizontalTagsData, g51 g51Var) {
        super(2, g51Var);
        this.b = fa2Var;
        this.c = appHorizontalTagsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppHorizontalTagsViewHolder$onAttach$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppHorizontalTagsViewHolder$onAttach$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            bz6 bz6Var = this.c.a;
            this.a = 1;
            if (this.b.L(bz6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
