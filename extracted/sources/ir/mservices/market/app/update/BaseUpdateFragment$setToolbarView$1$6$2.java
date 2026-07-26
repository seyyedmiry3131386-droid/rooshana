package ir.mservices.market.app.update;

import com.airbnb.lottie.LottieAnimationView;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wk;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.BaseUpdateFragment$setToolbarView$1$6$2", f = "UpdateFragment.kt", l = {477}, m = "invokeSuspend", v = 1)
final class BaseUpdateFragment$setToolbarView$1$6$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ BaseUpdateFragment b;
    public final /* synthetic */ LottieAnimationView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUpdateFragment$setToolbarView$1$6$2(BaseUpdateFragment baseUpdateFragment, LottieAnimationView lottieAnimationView, g51 g51Var) {
        super(2, g51Var);
        this.b = baseUpdateFragment;
        this.c = lottieAnimationView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseUpdateFragment$setToolbarView$1$6$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseUpdateFragment$setToolbarView$1$6$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            this.a = 1;
            if (kotlinx.coroutines.a.e(2000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        if (js3.i(this.b.k1, wk.q)) {
            this.c.f();
        }
        return tx8.a;
    }
}
