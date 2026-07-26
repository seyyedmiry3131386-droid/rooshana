package ir.mservices.market.reels.home.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.ds6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rz5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.xg5;
import defpackage.y97;
import defpackage.z45;
import ir.mservices.market.version2.ApplicationLauncher;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.home.ui.ReelsHomeViewModel$doRequest$1", f = "ReelsHomeViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class ReelsHomeViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ReelsHomeViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsHomeViewModel$doRequest$1(ReelsHomeViewModel reelsHomeViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = reelsHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReelsHomeViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReelsHomeViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final ReelsHomeViewModel reelsHomeViewModel = this.a;
        final xg5 xg5Var = reelsHomeViewModel.v;
        final String str = reelsHomeViewModel.w.a;
        xg5Var.getClass();
        js3.p(str, "refId");
        return new bz6(e.b(gu9.x((xe2) new m(new rz5(ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.collection_limit_reels_home), ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.reels_home_collection_prefetch_size), ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.collection_limit_reels_home), 52), new bp2() { // from class: ir.mservices.market.reels.home.ui.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new ReelsHomeRepositoryImpl$getReelsHome$1$1(xg5Var, str, reelsHomeViewModel, null), null);
            }
        }).a, new z45(28, reelsHomeViewModel)), y97.G(reelsHomeViewModel)), null, null, null, 14);
    }
}
