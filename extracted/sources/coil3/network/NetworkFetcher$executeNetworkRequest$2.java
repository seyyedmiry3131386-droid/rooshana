package coil3.network;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ym5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", l = {205}, m = "invokeSuspend")
final class NetworkFetcher$executeNetworkRequest$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SuspendLambda c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkFetcher$executeNetworkRequest$2(qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        NetworkFetcher$executeNetworkRequest$2 networkFetcher$executeNetworkRequest$2 = new NetworkFetcher$executeNetworkRequest$2(this.c, g51Var);
        networkFetcher$executeNetworkRequest$2.b = obj;
        return networkFetcher$executeNetworkRequest$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkFetcher$executeNetworkRequest$2) create((ym5) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ym5 ym5Var = (ym5) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        int i2 = ym5Var.a;
        if ((200 > i2 || i2 >= 300) && i2 != 304) {
            throw new HttpException("HTTP " + ym5Var.a);
        }
        this.b = null;
        this.a = 1;
        Object objInvoke = this.c.invoke(ym5Var, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
