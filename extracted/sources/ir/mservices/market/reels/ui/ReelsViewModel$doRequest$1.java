package ir.mservices.market.reels.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.ds6;
import defpackage.f17;
import defpackage.g51;
import defpackage.gu9;
import defpackage.qp2;
import defpackage.rz5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z45;
import ir.mservices.market.reels.data.ReelHomeDto;
import ir.mservices.market.version2.ApplicationLauncher;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.ReelsViewModel$doRequest$1", f = "ReelsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class ReelsViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ReelsViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsViewModel$doRequest$1(ReelsViewModel reelsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = reelsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReelsViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReelsViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final ReelsViewModel reelsViewModel = this.a;
        final ut4 ut4Var = reelsViewModel.t;
        f17 f17Var = reelsViewModel.E;
        ReelHomeDto reelHomeDto = f17Var.a;
        final Map<String, String> params = reelHomeDto != null ? reelHomeDto.getParams() : null;
        final String str = f17Var.b;
        ut4Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(new rz5(ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.collection_limit_reels), ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.reels_collection_prefetch_size), ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.collection_limit_reels), 52), new bp2() { // from class: ir.mservices.market.reels.ui.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new ReelsRepositoryImpl$getReels$1$1(ut4Var, reelsViewModel, params, str, null), null);
            }
        }).a, new z45(29, reelsViewModel)), y97.G(reelsViewModel)), null, null, null, 14);
    }
}
