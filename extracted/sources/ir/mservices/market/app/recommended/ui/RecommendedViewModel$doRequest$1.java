package ir.mservices.market.app.recommended.ui;

import androidx.paging.e;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.jy6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xg5;
import defpackage.y97;
import defpackage.z45;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.recommended.ui.RecommendedViewModel$doRequest$1", f = "RecommendedViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecommendedViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ RecommendedViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedViewModel$doRequest$1(RecommendedViewModel recommendedViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = recommendedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new RecommendedViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecommendedViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        RecommendedViewModel recommendedViewModel = this.a;
        xg5 xg5Var = recommendedViewModel.t;
        jy6 jy6Var = recommendedViewModel.w;
        return new bz6(e.b(gu9.x(xg5Var.c(null, jy6Var.b, jy6Var.d, false, recommendedViewModel), new z45(24, recommendedViewModel)), y97.G(recommendedViewModel)), null, null, null, 14);
    }
}
