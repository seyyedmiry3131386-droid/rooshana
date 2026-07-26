package ir.mservices.market.app.detail.ui.recycler;

import defpackage.e71;
import defpackage.e73;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yq6;
import ir.mservices.market.app.detail.data.TrafficPriceDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$setTrafficHint$1$1", f = "AppBar.kt", l = {238}, m = "invokeSuspend", v = 1)
final class AppBarViewHolder$setTrafficHint$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ TrafficPriceDto c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarViewHolder$setTrafficHint$1$1(a aVar, TrafficPriceDto trafficPriceDto, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = trafficPriceDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppBarViewHolder$setTrafficHint$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppBarViewHolder$setTrafficHint$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (kotlinx.coroutines.a.e(1500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        int i2 = yq6.ic_wifi;
        int i3 = a.R;
        a aVar = this.b;
        aVar.J(i2);
        e73 e73Var = aVar.Q;
        if (e73Var != null) {
            e73Var.x.setText(this.c.getDownloadingText());
            return tx8.a;
        }
        js3.V("binding");
        throw null;
    }
}
