package ir.mservices.market.app.detail.subReviews;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$doRequest$2", f = "AppSubReviewsViewModel.kt", l = {90}, m = "invokeSuspend", v = 1)
final class AppSubReviewsViewModel$doRequest$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppSubReviewsViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$doRequest$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$doRequest$2$1", f = "AppSubReviewsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ AppSubReviewsViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppSubReviewsViewModel appSubReviewsViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = appSubReviewsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ReviewResultDto) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ReviewResultDto reviewResultDto = (ReviewResultDto) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            l lVar = this.b.z;
            do {
                value = lVar.getValue();
            } while (!lVar.n(value, reviewResultDto));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSubReviewsViewModel$doRequest$2(AppSubReviewsViewModel appSubReviewsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = appSubReviewsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppSubReviewsViewModel$doRequest$2(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppSubReviewsViewModel$doRequest$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            AppSubReviewsViewModel appSubReviewsViewModel = this.b;
            vb7 vb7Var = appSubReviewsViewModel.C;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(appSubReviewsViewModel, null);
            this.a = 1;
            if (d.f(vb7Var, anonymousClass1, this) == coroutineSingletons) {
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
