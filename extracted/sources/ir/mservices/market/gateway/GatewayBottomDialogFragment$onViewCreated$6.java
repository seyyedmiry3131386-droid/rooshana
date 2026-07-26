package ir.mservices.market.gateway;

import defpackage.dp2;
import defpackage.g51;
import defpackage.oq2;
import defpackage.pt1;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.gateway.GatewayBottomDialogFragment$onViewCreated$6", f = "GatewayBottomDialogFragment.kt", l = {198}, m = "invokeSuspend", v = 1)
final class GatewayBottomDialogFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ GatewayBottomDialogFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayBottomDialogFragment$onViewCreated$6(GatewayBottomDialogFragment gatewayBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = gatewayBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new GatewayBottomDialogFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((GatewayBottomDialogFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
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
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        GatewayBottomDialogFragment gatewayBottomDialogFragment = this.b;
        rv6 rv6Var = gatewayBottomDialogFragment.W0().e;
        oq2 oq2Var = new oq2(gatewayBottomDialogFragment, 2);
        this.a = 1;
        Object objA = rv6Var.a.a(new pt1(oq2Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
