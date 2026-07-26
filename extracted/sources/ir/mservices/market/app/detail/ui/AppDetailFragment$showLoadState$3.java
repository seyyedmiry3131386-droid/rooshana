package ir.mservices.market.app.detail.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$showLoadState$3", f = "AppDetailFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppDetailFragment$showLoadState$3 extends SuspendLambda implements dp2 {
    public final /* synthetic */ AppDetailFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailFragment$showLoadState$3(AppDetailFragment appDetailFragment, g51 g51Var) {
        super(1, g51Var);
        this.a = appDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppDetailFragment$showLoadState$3(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        AppDetailFragment$showLoadState$3 appDetailFragment$showLoadState$3 = (AppDetailFragment$showLoadState$3) create((g51) obj);
        tx8 tx8Var = tx8.a;
        appDetailFragment$showLoadState$3.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        int i = AppDetailFragment.M1;
        AppDetailFragment appDetailFragment = this.a;
        appDetailFragment.e2(appDetailFragment.R1().V());
        return tx8.a;
    }
}
