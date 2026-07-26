package ir.mservices.market.app.detail.reivews;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xr;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.reivews.AppReviewsFragment$onViewCreated$1", f = "AppReviewsFragment.kt", l = {159}, m = "invokeSuspend", v = 1)
final class AppReviewsFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppReviewsFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppReviewsFragment$onViewCreated$1(AppReviewsFragment appReviewsFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appReviewsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppReviewsFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((AppReviewsFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = AppReviewsFragment.o1;
            AppReviewsFragment appReviewsFragment = this.b;
            pv6 pv6Var = appReviewsFragment.Q1().x;
            xr xrVar = new xr(appReviewsFragment);
            this.a = 1;
            if (pv6Var.a.a(xrVar, this) == coroutineSingletons) {
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
