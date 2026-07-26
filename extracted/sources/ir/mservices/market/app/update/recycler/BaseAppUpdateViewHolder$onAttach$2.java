package ir.mservices.market.app.update.recycler;

import defpackage.a60;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.recycler.BaseAppUpdateViewHolder$onAttach$2", f = "BaseAppUpdate.kt", l = {451}, m = "invokeSuspend", v = 1)
final class BaseAppUpdateViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppUpdateData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppUpdateViewHolder$onAttach$2(g51 g51Var, AppUpdateData appUpdateData, a aVar) {
        super(2, g51Var);
        this.b = appUpdateData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseAppUpdateViewHolder$onAttach$2(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAppUpdateViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AppUpdateData appUpdateData = this.b;
            xe2 xe2Var = appUpdateData.f;
            a60 a60Var = new a60(appUpdateData, this.c, 0);
            this.a = 1;
            if (xe2Var.a(a60Var, this) == coroutineSingletons) {
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
