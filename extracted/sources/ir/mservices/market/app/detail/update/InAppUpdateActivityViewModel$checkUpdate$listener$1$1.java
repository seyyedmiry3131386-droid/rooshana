package ir.mservices.market.app.detail.update;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.update.InAppUpdateActivityViewModel$checkUpdate$listener$1$1", f = "InAppUpdateActivityViewModel.kt", l = {90}, m = "invokeSuspend", v = 1)
final class InAppUpdateActivityViewModel$checkUpdate$listener$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InAppUpdateActivityViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateActivityViewModel$checkUpdate$listener$1$1(InAppUpdateActivityViewModel inAppUpdateActivityViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = inAppUpdateActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InAppUpdateActivityViewModel$checkUpdate$listener$1$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppUpdateActivityViewModel$checkUpdate$listener$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        i iVar = this.b.z;
        this.a = 1;
        return iVar.emit(tx8Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
