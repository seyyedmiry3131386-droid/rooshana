package ir.mservices.market.appUsage;

import defpackage.bz6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.appUsage.AppsUsageViewModel$doRequest$1", f = "AppsUsageViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppsUsageViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ AppsUsageViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsUsageViewModel$doRequest$1(AppsUsageViewModel appsUsageViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = appsUsageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppsUsageViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppsUsageViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        return new bz6(this.a.A, null, null, null, 14);
    }
}
