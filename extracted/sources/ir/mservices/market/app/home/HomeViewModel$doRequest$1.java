package ir.mservices.market.app.home;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.m88;
import defpackage.mc3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vp7;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.app.home.data.HomeDto;
import ir.myket.core.utils.GraphicUtils$Dimension;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.HomeViewModel$doRequest$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class HomeViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ HomeViewModel a;
    public final /* synthetic */ GraphicUtils$Dimension b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$doRequest$1(HomeViewModel homeViewModel, GraphicUtils$Dimension graphicUtils$Dimension, g51 g51Var) {
        super(2, g51Var);
        this.a = homeViewModel;
        this.b = graphicUtils$Dimension;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new HomeViewModel$doRequest$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final HomeViewModel homeViewModel = this.a;
        final vp7 vp7Var = homeViewModel.A;
        GraphicUtils$Dimension graphicUtils$Dimension = this.b;
        final int i = graphicUtils$Dimension.a;
        final int i2 = graphicUtils$Dimension.b;
        String str = homeViewModel.M;
        if (m88.T(str, HomeDto.MAIN, true)) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        final String str2 = str;
        vp7Var.getClass();
        bz6 bz6Var = new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.app.home.model.b
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.b(new HomeRepositoryImpl$getHome$1$1(vp7Var, i, i2, str2, homeViewModel, null));
            }
        }).a, new mc3(homeViewModel, 1)), y97.G(homeViewModel)), null, null, null, 14);
        bz6Var.c = new HomeViewModel$doRequest$1$3$1(2, homeViewModel, HomeViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0);
        return bz6Var;
    }
}
