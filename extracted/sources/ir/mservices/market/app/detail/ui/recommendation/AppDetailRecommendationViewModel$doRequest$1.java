package ir.mservices.market.app.detail.ui.recommendation;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.d;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.k7;
import defpackage.pw6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.th0;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationViewModel$doRequest$1", f = "AppDetailRecommendationViewModel.kt", l = {31}, m = "invokeSuspend", v = 1)
final class AppDetailRecommendationViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppDetailRecommendationViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationViewModel$doRequest$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements dp2 {
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            String str = (String) obj;
            js3.p(str, "p0");
            ((AppDetailRecommendationViewModel) this.receiver).k(str);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailRecommendationViewModel$doRequest$1(AppDetailRecommendationViewModel appDetailRecommendationViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = appDetailRecommendationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppDetailRecommendationViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppDetailRecommendationViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        AppDetailRecommendationViewModel appDetailRecommendationViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            th0 th0Var = appDetailRecommendationViewModel.v;
            Object objB = (pw6) appDetailRecommendationViewModel.w.getValue();
            if (objB == null) {
                objB = dt2.b(0, 7, null);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, appDetailRecommendationViewModel, AppDetailRecommendationViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0);
            this.a = 1;
            th0Var.getClass();
            obj = (xe2) new m(gu9.B(), new d(objB, anonymousClass1, 7)).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new k7(4)), y97.G(appDetailRecommendationViewModel)), null, null, null, 8);
    }
}
