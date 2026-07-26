package ir.mservices.market.myAccount.model;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wc5;
import defpackage.z4;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.model.MyAccountRepositoryImpl$getPersonalInfo$1$1", f = "MyAccountRepositoryImpl.kt", l = {43}, m = "invokeSuspend", v = 1)
final class MyAccountRepositoryImpl$getPersonalInfo$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ z4 b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAccountRepositoryImpl$getPersonalInfo$1$1(z4 z4Var, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.b = z4Var;
        this.c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MyAccountRepositoryImpl$getPersonalInfo$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MyAccountRepositoryImpl$getPersonalInfo$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        wc5 wc5Var = (wc5) this.b.b;
        this.a = 1;
        Object objH = wc5Var.h(this.c, this);
        return objH == coroutineSingletons ? coroutineSingletons : objH;
    }
}
