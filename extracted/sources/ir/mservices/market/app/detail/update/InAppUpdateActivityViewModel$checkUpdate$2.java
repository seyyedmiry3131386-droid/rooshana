package ir.mservices.market.app.detail.update;

import defpackage.dp3;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rm7;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.update.InAppUpdateActivityViewModel$checkUpdate$2", f = "InAppUpdateActivityViewModel.kt", l = {95}, m = "invokeSuspend", v = 1)
final class InAppUpdateActivityViewModel$checkUpdate$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InAppUpdateActivityViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateActivityViewModel$checkUpdate$2(InAppUpdateActivityViewModel inAppUpdateActivityViewModel, String str, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.b = inAppUpdateActivityViewModel;
        this.c = str;
        this.d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InAppUpdateActivityViewModel$checkUpdate$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppUpdateActivityViewModel$checkUpdate$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            InAppUpdateActivityViewModel inAppUpdateActivityViewModel = this.b;
            ir.mservices.market.app.update.common.modal.a aVar = inAppUpdateActivityViewModel.u;
            dp3 dp3Var = inAppUpdateActivityViewModel.v;
            String str = this.c;
            Integer numP = dp3Var.p(str);
            js3.o(numP, "getApplicationVersionCode(...)");
            int iIntValue = numP.intValue();
            this.a = 1;
            if (rm7.C(aVar, str, iIntValue, null, inAppUpdateActivityViewModel, "update_list", "in_app_update_list", this.d, this, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
