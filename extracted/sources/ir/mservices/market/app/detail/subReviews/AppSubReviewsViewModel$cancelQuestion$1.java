package ir.mservices.market.app.detail.subReviews;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rn6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uc8;
import ir.mservices.market.app.survey.data.CancelQuestionRequestDto;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$cancelQuestion$1", f = "AppSubReviewsViewModel.kt", l = {168}, m = "invokeSuspend", v = 1)
final class AppSubReviewsViewModel$cancelQuestion$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AppSubReviewsViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSubReviewsViewModel$cancelQuestion$1(AppSubReviewsViewModel appSubReviewsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.c = appSubReviewsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AppSubReviewsViewModel$cancelQuestion$1 appSubReviewsViewModel$cancelQuestion$1 = new AppSubReviewsViewModel$cancelQuestion$1(this.c, g51Var);
        appSubReviewsViewModel$cancelQuestion$1.b = obj;
        return appSubReviewsViewModel$cancelQuestion$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppSubReviewsViewModel$cancelQuestion$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e71 e71Var = (e71) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            AppSubReviewsViewModel appSubReviewsViewModel = this.c;
            rn6 rn6Var = appSubReviewsViewModel.t;
            String str = appSubReviewsViewModel.v.a;
            CancelQuestionRequestDto cancelQuestionRequestDto = new CancelQuestionRequestDto(null);
            this.b = null;
            this.a = 1;
            if (((uc8) rn6Var.c).g(str, cancelQuestionRequestDto, e71Var, this) == coroutineSingletons) {
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
