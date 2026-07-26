package ir.mservices.market.app.update.recycler;

import defpackage.a60;
import defpackage.e71;
import defpackage.g51;
import defpackage.pt1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.recycler.BaseAppUpdateViewHolder$onAttach$3", f = "BaseAppUpdate.kt", l = {468}, m = "invokeSuspend", v = 1)
final class BaseAppUpdateViewHolder$onAttach$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppUpdateData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppUpdateViewHolder$onAttach$3(g51 g51Var, AppUpdateData appUpdateData, a aVar) {
        super(2, g51Var);
        this.b = appUpdateData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseAppUpdateViewHolder$onAttach$3(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAppUpdateViewHolder$onAttach$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        AppUpdateData appUpdateData = this.b;
        xe2 xe2Var = appUpdateData.g;
        a60 a60Var = new a60(appUpdateData, this.c, 1);
        this.a = 1;
        Object objA = xe2Var.a(new pt1(a60Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
