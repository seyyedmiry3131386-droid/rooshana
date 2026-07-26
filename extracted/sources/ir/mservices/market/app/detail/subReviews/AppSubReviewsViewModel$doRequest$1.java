package ir.mservices.market.app.detail.subReviews;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.ht;
import defpackage.js3;
import defpackage.n;
import defpackage.qp2;
import defpackage.rn6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$doRequest$1", f = "AppSubReviewsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppSubReviewsViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ AppSubReviewsViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSubReviewsViewModel$doRequest$1(AppSubReviewsViewModel appSubReviewsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = appSubReviewsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppSubReviewsViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppSubReviewsViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final AppSubReviewsViewModel appSubReviewsViewModel = this.a;
        final rn6 rn6Var = appSubReviewsViewModel.t;
        ht htVar = appSubReviewsViewModel.v;
        final String str = htVar.a;
        final String str2 = htVar.f;
        rn6Var.getClass();
        js3.p(str, "packageName");
        return new bz6(e.b(gu9.x((xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.app.detail.subReviews.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new SubReviewRepositoryImpl$getSubReviews$1$1(rn6Var, str, str2, appSubReviewsViewModel, null), null);
            }
        }).a, new n(9, appSubReviewsViewModel)), y97.G(appSubReviewsViewModel)), null, null, null, 14);
    }
}
