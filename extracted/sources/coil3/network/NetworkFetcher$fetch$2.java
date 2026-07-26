package coil3.network;

import coil3.decode.DataSource;
import defpackage.b28;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ui3;
import defpackage.v18;
import defpackage.ym5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
final class NetworkFetcher$fetch$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$2(b bVar, g51 g51Var) {
        super(2, g51Var);
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(this.c, g51Var);
        networkFetcher$fetch$2.b = obj;
        return networkFetcher$fetch$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkFetcher$fetch$2) create((ym5) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ym5 ym5Var = (ym5) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        b bVar = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            b28 b28Var = ym5Var.e;
            if (b28Var == null) {
                throw new IllegalStateException("body == null");
            }
            this.b = ym5Var;
            this.a = 1;
            obj = b.b(bVar, b28Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return new v18((ui3) obj, b.f(bVar.a, ym5Var.d.a()), DataSource.d);
    }
}
