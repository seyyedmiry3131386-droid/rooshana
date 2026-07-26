package ir.mservices.market.app.detail.reivews;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.as;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.sk6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.reivews.AppReviewsViewModel$doRequest$1", f = "AppReviewsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppReviewsViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ AppReviewsViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppReviewsViewModel$doRequest$1(AppReviewsViewModel appReviewsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = appReviewsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppReviewsViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppReviewsViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final AppReviewsViewModel appReviewsViewModel = this.a;
        final sk6 sk6Var = appReviewsViewModel.t;
        final String str = appReviewsViewModel.B.a;
        final Integer num = appReviewsViewModel.D;
        sk6Var.getClass();
        js3.p(str, "packageName");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.app.detail.reivews.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new ReviewRepositoryImpl$getReviews$1$1(sk6Var, str, appReviewsViewModel, num, null), null);
            }
        }).a, new as(appReviewsViewModel, 1)), y97.G(appReviewsViewModel)), null, null, null, 14);
    }
}
