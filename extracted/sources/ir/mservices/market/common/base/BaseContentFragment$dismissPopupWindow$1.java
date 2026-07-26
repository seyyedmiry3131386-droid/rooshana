package ir.mservices.market.common.base;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.base.BaseContentFragment$dismissPopupWindow$1", f = "BaseContentFragment.kt", l = {127}, m = "invokeSuspend", v = 1)
final class BaseContentFragment$dismissPopupWindow$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseContentFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentFragment$dismissPopupWindow$1(BaseContentFragment baseContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseContentFragment$dismissPopupWindow$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseContentFragment$dismissPopupWindow$1) create((g51) obj)).invokeSuspend(tx8.a);
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
        i iVar = this.b.P0;
        this.a = 1;
        return iVar.emit(tx8Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
