package ir.mservices.market.app.detail.ui.recommendation;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.n4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.tb1;
import defpackage.th0;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDetailRecommendationViewModel extends ir.mservices.market.viewModel.a {
    public final th0 v;
    public final l w;
    public boolean x;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationViewModel$1", f = "AppDetailRecommendationViewModel.kt", l = {65}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppDetailRecommendationViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            AppDetailRecommendationViewModel appDetailRecommendationViewModel = AppDetailRecommendationViewModel.this;
            pv6 pv6Var = appDetailRecommendationViewModel.u;
            r4 r4Var = new r4(5, appDetailRecommendationViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 9), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    public AppDetailRecommendationViewModel(th0 th0Var) {
        super(true);
        this.v = th0Var;
        this.w = ja1.b(null);
        this.x = true;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateListDataAction(AppDetailRecommendationAction.UpdateListDataAction updateListDataAction) {
        l lVar;
        Object value;
        if (this.x) {
            do {
                lVar = this.w;
                value = lVar.getValue();
            } while (!lVar.n(value, updateListDataAction.getAppRecommendationChannel()));
            this.x = false;
        }
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new AppDetailRecommendationViewModel$doRequest$1(this, null));
    }
}
