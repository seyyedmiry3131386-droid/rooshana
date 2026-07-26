package ir.mservices.market.viewModel;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u95;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.viewModel.BaseMultiSelectViewModel$sendMultiSelectEvent$1", f = "BaseMultiSelectViewModel.kt", l = {189}, m = "invokeSuspend", v = 1)
final class BaseMultiSelectViewModel$sendMultiSelectEvent$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ BaseMultiSelectViewModel b;
    public final /* synthetic */ u95 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMultiSelectViewModel$sendMultiSelectEvent$1(BaseMultiSelectViewModel baseMultiSelectViewModel, u95 u95Var, g51 g51Var) {
        super(2, g51Var);
        this.b = baseMultiSelectViewModel;
        this.c = u95Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseMultiSelectViewModel$sendMultiSelectEvent$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseMultiSelectViewModel$sendMultiSelectEvent$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.b.B;
            this.a = 1;
            if (iVar.emit(this.c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
