package ir.mservices.market.app.update;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.UpdateViewModel$doRequest$1", f = "UpdateViewModel.kt", l = {221, 223}, m = "invokeSuspend", v = 1)
final class UpdateViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ UpdateViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateViewModel$doRequest$1(UpdateViewModel updateViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = updateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UpdateViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateViewModel$doRequest$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        UpdateViewModel updateViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            i iVar = updateViewModel.X;
            this.a = 1;
            if (iVar.emit(tx8Var, this) != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        l lVar = updateViewModel.V;
        Boolean bool = Boolean.FALSE;
        lVar.getClass();
        lVar.p(null, bool);
        this.a = 2;
        return updateViewModel.fillData(this) == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
