package ir.mservices.market.pika.send.model;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledApps$1$1", f = "InstalledAppsRepositoryImpl.kt", l = {37}, m = "invokeSuspend", v = 1)
final class InstalledAppsRepositoryImpl$getInstalledApps$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsRepositoryImpl$getInstalledApps$1$1(c cVar, g51 g51Var) {
        super(1, g51Var);
        this.b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new InstalledAppsRepositoryImpl$getInstalledApps$1$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((InstalledAppsRepositoryImpl$getInstalledApps$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        this.a = 1;
        Object objA = c.a(this.b, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
