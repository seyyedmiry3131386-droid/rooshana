package ir.mservices.market.myReview.incomplete.model;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.a06;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2", f = "InCompleteReviewsRepositoryImpl.kt", l = {MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
final class InCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        InCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2 inCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2 = new InCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2(2, g51Var);
        inCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2.b = obj;
        return inCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InCompleteReviewsRepositoryImpl$getInstalledAppModels$installedApps$2) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ze2 ze2Var = (ze2) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            a06 a06Var = b.c;
            this.b = null;
            this.a = 1;
            if (ze2Var.emit(a06Var, this) == coroutineSingletons) {
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
