package ir.mservices.market.common.base;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.base.BaseContentFragment$onCreateAnimation$1$onAnimationStart$1", f = "BaseContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class BaseContentFragment$onCreateAnimation$1$onAnimationStart$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ BaseContentFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentFragment$onCreateAnimation$1$onAnimationStart$1(BaseContentFragment baseContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.a = baseContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseContentFragment$onCreateAnimation$1$onAnimationStart$1(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        BaseContentFragment$onCreateAnimation$1$onAnimationStart$1 baseContentFragment$onCreateAnimation$1$onAnimationStart$1 = (BaseContentFragment$onCreateAnimation$1$onAnimationStart$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        baseContentFragment$onCreateAnimation$1$onAnimationStart$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        this.a.L0 = false;
        return tx8.a;
    }
}
