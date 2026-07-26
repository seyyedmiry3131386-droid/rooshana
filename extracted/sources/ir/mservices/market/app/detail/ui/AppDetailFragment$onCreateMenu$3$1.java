package ir.mservices.market.app.detail.ui;

import defpackage.dp2;
import defpackage.fp;
import defpackage.g51;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import ir.mservices.market.views.MyketRecentDownloadView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$onCreateMenu$3$1", f = "AppDetailFragment.kt", l = {781}, m = "invokeSuspend", v = 1)
final class AppDetailFragment$onCreateMenu$3$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MyketRecentDownloadView b;
    public final /* synthetic */ MyketRecentDownloadView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailFragment$onCreateMenu$3$1(MyketRecentDownloadView myketRecentDownloadView, MyketRecentDownloadView myketRecentDownloadView2, g51 g51Var) {
        super(1, g51Var);
        this.b = myketRecentDownloadView;
        this.c = myketRecentDownloadView2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppDetailFragment$onCreateMenu$3$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws Throwable {
        ((AppDetailFragment$onCreateMenu$3$1) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw t61.q(obj);
        }
        kotlin.b.b(obj);
        xb5 onStateChangedFlow = this.b.getOnStateChangedFlow();
        fp fpVar = new fp(this.c, 0);
        this.a = 1;
        ((l) onStateChangedFlow).a(fpVar, this);
        return coroutineSingletons;
    }
}
