package ir.mservices.market.app.update.common.modal;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rm7;
import defpackage.rq7;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.core.notification.PushMessage;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.modal.UpdateRefreshRepositoryImpl$fetchRefreshDataAsync$1", f = "UpdateRefreshRepositoryImpl.kt", l = {69}, m = "invokeSuspend", v = 1)
final class UpdateRefreshRepositoryImpl$fetchRefreshDataAsync$1 extends SuspendLambda implements qp2 {
    public rq7 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ PushMessage g;
    public final /* synthetic */ rq7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRefreshRepositoryImpl$fetchRefreshDataAsync$1(a aVar, String str, int i, PushMessage pushMessage, rq7 rq7Var, g51 g51Var) {
        super(2, g51Var);
        this.d = aVar;
        this.e = str;
        this.f = i;
        this.g = pushMessage;
        this.h = rq7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        UpdateRefreshRepositoryImpl$fetchRefreshDataAsync$1 updateRefreshRepositoryImpl$fetchRefreshDataAsync$1 = new UpdateRefreshRepositoryImpl$fetchRefreshDataAsync$1(this.d, this.e, this.f, this.g, this.h, g51Var);
        updateRefreshRepositoryImpl$fetchRefreshDataAsync$1.c = obj;
        return updateRefreshRepositoryImpl$fetchRefreshDataAsync$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateRefreshRepositoryImpl$fetchRefreshDataAsync$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        rq7 rq7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        tx8 tx8Var = tx8.a;
        rq7 rq7Var2 = this.h;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.d;
                String str = this.e;
                int i2 = this.f;
                PushMessage pushMessage = this.g;
                this.c = null;
                this.a = rq7Var2;
                this.b = 1;
                if (rm7.C(aVar, str, i2, pushMessage, null, "push", "push_update_list", null, this, 8) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rq7Var = rq7Var2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rq7Var = this.a;
                b.b(obj);
            }
            objA = Boolean.valueOf(rq7Var.k(tx8Var));
        } catch (Throwable th) {
            objA = b.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            rq7Var2.l(thA);
        }
        return tx8Var;
    }
}
