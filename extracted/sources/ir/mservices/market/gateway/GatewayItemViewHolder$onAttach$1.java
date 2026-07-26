package ir.mservices.market.gateway;

import defpackage.e71;
import defpackage.g51;
import defpackage.nl;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.gateway.GatewayItemViewHolder$onAttach$1", f = "GatewayItem.kt", l = {77}, m = "invokeSuspend", v = 1)
final class GatewayItemViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ GatewayItemData b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayItemViewHolder$onAttach$1(GatewayItemData gatewayItemData, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.b = gatewayItemData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new GatewayItemViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((GatewayItemViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            GatewayItemData gatewayItemData = this.b;
            v48 v48Var = gatewayItemData.c;
            nl nlVar = new nl(gatewayItemData, this.c, 17);
            this.a = 1;
            if (v48Var.a(nlVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
