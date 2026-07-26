package ir.mservices.market.social.requests;

import defpackage.dp2;
import defpackage.g51;
import defpackage.n57;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.requests.RequestListFragment$onViewCreated$1", f = "RequestListFragment.kt", l = {39}, m = "invokeSuspend", v = 1)
final class RequestListFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ RequestListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestListFragment$onViewCreated$1(RequestListFragment requestListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = requestListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new RequestListFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((RequestListFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
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
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        int i2 = RequestListFragment.h1;
        RequestListFragment requestListFragment = this.b;
        pv6 pv6Var = requestListFragment.P1().z;
        n57 n57Var = new n57(requestListFragment, 0);
        this.a = 1;
        Object objA = pv6Var.a.a(new pt1(n57Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
