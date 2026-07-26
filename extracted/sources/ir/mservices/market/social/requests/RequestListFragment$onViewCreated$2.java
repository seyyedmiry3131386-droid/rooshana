package ir.mservices.market.social.requests;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.dp2;
import defpackage.g51;
import defpackage.n57;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.requests.RequestListFragment$onViewCreated$2", f = "RequestListFragment.kt", l = {MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
final class RequestListFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ RequestListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestListFragment$onViewCreated$2(RequestListFragment requestListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = requestListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new RequestListFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((RequestListFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            int i3 = RequestListFragment.h1;
            RequestListFragment requestListFragment = this.b;
            pv6 pv6Var = requestListFragment.P1().D;
            n57 n57Var = new n57(requestListFragment, i2);
            this.a = 1;
            if (pv6Var.a.a(n57Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
