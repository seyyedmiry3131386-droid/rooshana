package ir.mservices.market.app.detail.update;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.gv;
import defpackage.hk3;
import defpackage.qp2;
import defpackage.sl0;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.update.InAppUpdateViewModel$doRequest$1", f = "InAppUpdateViewModel.kt", l = {48}, m = "invokeSuspend", v = 1)
final class InAppUpdateViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InAppUpdateViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateViewModel$doRequest$1(InAppUpdateViewModel inAppUpdateViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = inAppUpdateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InAppUpdateViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppUpdateViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        InAppUpdateViewModel inAppUpdateViewModel = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            gv gvVar = inAppUpdateViewModel.u;
            InAppUpdateData inAppUpdateData = inAppUpdateViewModel.x;
            this.a = 1;
            gvVar.getClass();
            obj = (xe2) new m(gu9.B(), new hk3(0, inAppUpdateData)).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new sl0(22)), y97.G(inAppUpdateViewModel)), null, null, null, 14);
    }
}
