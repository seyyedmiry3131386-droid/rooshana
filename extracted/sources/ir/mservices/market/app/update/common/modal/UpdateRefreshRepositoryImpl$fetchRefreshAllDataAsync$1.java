package ir.mservices.market.app.update.common.modal;

import defpackage.e71;
import defpackage.ff5;
import defpackage.g51;
import defpackage.iz8;
import defpackage.qp2;
import defpackage.rq7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vz8;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.modal.UpdateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1", f = "UpdateRefreshRepositoryImpl.kt", l = {42}, m = "invokeSuspend", v = 1)
final class UpdateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1 extends SuspendLambda implements qp2 {
    public rq7 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ ff5 h;
    public final /* synthetic */ vz8 i;
    public final /* synthetic */ iz8 j;
    public final /* synthetic */ rq7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1(a aVar, Object obj, String str, String str2, ff5 ff5Var, vz8 vz8Var, iz8 iz8Var, rq7 rq7Var, g51 g51Var) {
        super(2, g51Var);
        this.d = aVar;
        this.e = obj;
        this.f = str;
        this.g = str2;
        this.h = ff5Var;
        this.i = vz8Var;
        this.j = iz8Var;
        this.k = rq7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        UpdateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1 updateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1 = new UpdateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, g51Var);
        updateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1.c = obj;
        return updateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        rq7 rq7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        tx8 tx8Var = tx8.a;
        rq7 rq7Var2 = this.k;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.d;
                Object obj2 = this.e;
                String str = this.f;
                String str2 = this.g;
                ff5 ff5Var = this.h;
                vz8 vz8Var = this.i;
                iz8 iz8Var = this.j;
                this.c = null;
                this.a = rq7Var2;
                this.b = 1;
                if (aVar.c(obj2, str, str2, ff5Var, vz8Var, iz8Var, this) == coroutineSingletons) {
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
