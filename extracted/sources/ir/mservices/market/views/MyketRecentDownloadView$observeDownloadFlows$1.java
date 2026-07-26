package ir.mservices.market.views;

import defpackage.e71;
import defpackage.fp;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.views.MyketRecentDownloadView$observeDownloadFlows$1", f = "MyketRecentDownloadView.kt", l = {161}, m = "invokeSuspend", v = 1)
final class MyketRecentDownloadView$observeDownloadFlows$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MyketRecentDownloadView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketRecentDownloadView$observeDownloadFlows$1(MyketRecentDownloadView myketRecentDownloadView, g51 g51Var) {
        super(2, g51Var);
        this.b = myketRecentDownloadView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MyketRecentDownloadView$observeDownloadFlows$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((MyketRecentDownloadView$observeDownloadFlows$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            MyketRecentDownloadView myketRecentDownloadView = this.b;
            rv6 rv6Var = myketRecentDownloadView.getNeneDownloadRepository().c;
            fp fpVar = new fp(myketRecentDownloadView, 1);
            this.a = 1;
            if (rv6Var.a.a(fpVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
