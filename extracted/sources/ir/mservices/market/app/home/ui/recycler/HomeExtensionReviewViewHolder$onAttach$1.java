package ir.mservices.market.app.home.ui.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.nl;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.ui.recycler.HomeExtensionReviewViewHolder$onAttach$1", f = "HomeExtensionReview.kt", l = {130}, m = "invokeSuspend", v = 1)
final class HomeExtensionReviewViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ HomeExtensionReviewData b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeExtensionReviewViewHolder$onAttach$1(HomeExtensionReviewData homeExtensionReviewData, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.b = homeExtensionReviewData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new HomeExtensionReviewViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeExtensionReviewViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            HomeExtensionReviewData homeExtensionReviewData = this.b;
            xe2 xe2Var = homeExtensionReviewData.c;
            nl nlVar = new nl(homeExtensionReviewData, this.c, 18);
            this.a = 1;
            if (xe2Var.a(nlVar, this) == coroutineSingletons) {
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
