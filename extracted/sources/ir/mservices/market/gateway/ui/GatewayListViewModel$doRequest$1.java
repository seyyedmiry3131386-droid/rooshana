package ir.mservices.market.gateway.ui;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.av;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tq2;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.gateway.ui.GatewayListViewModel$doRequest$1", f = "GatewayListViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class GatewayListViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ GatewayListViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayListViewModel$doRequest$1(GatewayListViewModel gatewayListViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = gatewayListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new GatewayListViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((GatewayListViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        GatewayListViewModel gatewayListViewModel = this.a;
        GatewayBottomDialogFragment.GatewayData gatewayData = gatewayListViewModel.w;
        if (gatewayData == null) {
            return new bz6();
        }
        av avVar = gatewayListViewModel.v;
        List list = gatewayData.c;
        String str = gatewayData.i;
        int iIntValue = ((Number) gatewayListViewModel.z.getValue()).intValue();
        l lVar = gatewayListViewModel.x;
        avVar.getClass();
        js3.p(str, "layoutMode");
        js3.p(lVar, "selectedItem");
        xe2 xe2Var = (xe2) new m(gu9.o(false), new tq2(list, str, iIntValue, lVar)).a;
        js3.p(xe2Var, "<this>");
        return new bz6(e.b(new o4(xe2Var, 18), y97.G(gatewayListViewModel)), null, null, null, 14);
    }
}
