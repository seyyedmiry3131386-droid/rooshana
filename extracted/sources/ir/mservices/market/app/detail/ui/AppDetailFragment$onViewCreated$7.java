package ir.mservices.market.app.detail.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pv6;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$7", f = "AppDetailFragment.kt", l = {477}, m = "invokeSuspend", v = 1)
final class AppDetailFragment$onViewCreated$7 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailFragment$onViewCreated$7(AppDetailFragment appDetailFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppDetailFragment$onViewCreated$7(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((AppDetailFragment$onViewCreated$7) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = AppDetailFragment.M1;
            AppDetailFragment appDetailFragment = this.b;
            pv6 pv6Var = appDetailFragment.R1().U;
            r4 r4Var = new r4(4, appDetailFragment);
            this.a = 1;
            if (pv6Var.a.a(r4Var, this) == coroutineSingletons) {
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
