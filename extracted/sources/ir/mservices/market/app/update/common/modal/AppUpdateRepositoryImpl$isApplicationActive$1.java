package ir.mservices.market.app.update.common.modal;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rq7;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl$isApplicationActive$1", f = "AppUpdateRepositoryImpl.kt", l = {38}, m = "invokeSuspend", v = 1)
final class AppUpdateRepositoryImpl$isApplicationActive$1 extends SuspendLambda implements qp2 {
    public rq7 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ rq7 e;
    public final /* synthetic */ AppUpdateRepositoryImpl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateRepositoryImpl$isApplicationActive$1(String str, rq7 rq7Var, AppUpdateRepositoryImpl appUpdateRepositoryImpl, g51 g51Var) {
        super(2, g51Var);
        this.d = str;
        this.e = rq7Var;
        this.f = appUpdateRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AppUpdateRepositoryImpl$isApplicationActive$1 appUpdateRepositoryImpl$isApplicationActive$1 = new AppUpdateRepositoryImpl$isApplicationActive$1(this.d, this.e, this.f, g51Var);
        appUpdateRepositoryImpl$isApplicationActive$1.c = obj;
        return appUpdateRepositoryImpl$isApplicationActive$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppUpdateRepositoryImpl$isApplicationActive$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            e71 r0 = (defpackage.e71) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.b
            rq7 r2 = r5.e
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 != r3) goto L17
            rq7 r0 = r5.a
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L15
            goto L39
        L15:
            r6 = move-exception
            goto L42
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1f:
            kotlin.b.b(r6)
            ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl r6 = r5.f
            r1 = 0
            java.lang.String r4 = r5.d
            if (r4 == 0) goto L47
            ir.mservices.market.app.update.common.manager.b r6 = r6.b     // Catch: java.lang.Throwable -> L15
            r5.c = r1     // Catch: java.lang.Throwable -> L15
            r5.a = r2     // Catch: java.lang.Throwable -> L15
            r5.b = r3     // Catch: java.lang.Throwable -> L15
            java.lang.Object r6 = r6.b(r4, r5)     // Catch: java.lang.Throwable -> L15
            if (r6 != r0) goto L38
            return r0
        L38:
            r0 = r2
        L39:
            boolean r6 = r0.k(r6)     // Catch: java.lang.Throwable -> L15
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L15
            goto L47
        L42:
            kotlin.Result$Failure r6 = kotlin.b.a(r6)
            goto L48
        L47:
            r6 = r1
        L48:
            java.lang.Throwable r6 = kotlin.Result.a(r6)
            if (r6 == 0) goto L51
            r2.l(r6)
        L51:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl$isApplicationActive$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
