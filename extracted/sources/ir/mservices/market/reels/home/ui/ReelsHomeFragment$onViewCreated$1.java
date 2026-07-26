package ir.mservices.market.reels.home.ui;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xk6;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.home.ui.ReelsHomeFragment$onViewCreated$1", f = "ReelsHomeFragment.kt", l = {75}, m = "invokeSuspend", v = 1)
final class ReelsHomeFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ReelsHomeFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsHomeFragment$onViewCreated$1(ReelsHomeFragment reelsHomeFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = reelsHomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ReelsHomeFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ReelsHomeFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        int i2 = ReelsHomeFragment.j1;
        ReelsHomeFragment reelsHomeFragment = this.b;
        rv6 rv6Var = ((ReelsHomeViewModel) reelsHomeFragment.i1.getValue()).y;
        xk6 xk6Var = new xk6(7, reelsHomeFragment);
        this.a = 1;
        Object objA = rv6Var.a.a(new pt1(xk6Var, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
