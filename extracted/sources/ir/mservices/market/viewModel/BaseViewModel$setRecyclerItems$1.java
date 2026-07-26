package ir.mservices.market.viewModel;

import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.viewModel.BaseViewModel$setRecyclerItems$1", f = "BaseViewModel.kt", l = {167}, m = "invokeSuspend", v = 1)
final class BaseViewModel$setRecyclerItems$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SuspendLambda b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModel$setRecyclerItems$1(qp2 qp2Var, c cVar, g51 g51Var) {
        super(2, g51Var);
        this.b = (SuspendLambda) qp2Var;
        this.c = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseViewModel$setRecyclerItems$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseViewModel$setRecyclerItems$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l lVar = this.c.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Object value = lVar.getValue();
            this.a = 1;
            obj = this.b.invoke(value, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        bz6 bz6Var = (bz6) obj;
        if (bz6Var != null) {
            lVar.getClass();
            lVar.p(null, bz6Var);
        }
        return tx8.a;
    }
}
