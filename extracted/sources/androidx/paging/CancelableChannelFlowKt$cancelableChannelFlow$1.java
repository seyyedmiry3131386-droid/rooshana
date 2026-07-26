package androidx.paging;

import defpackage.g51;
import defpackage.pw7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xt3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {31}, m = "invokeSuspend", v = 1)
final class CancelableChannelFlowKt$cancelableChannelFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xt3 c;
    public final /* synthetic */ SuspendLambda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancelableChannelFlowKt$cancelableChannelFlow$1(xt3 xt3Var, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = xt3Var;
        this.d = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new CancelableChannelFlowKt$cancelableChannelFlow$1(this.c, this.d, g51Var);
        cancelableChannelFlowKt$cancelableChannelFlow$1.b = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelableChannelFlowKt$cancelableChannelFlow$1) create((pw7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            pw7 pw7Var = (pw7) this.b;
            this.c.s0(new defpackage.n(22, pw7Var));
            this.a = 1;
            if (this.d.invoke(pw7Var, this) == coroutineSingletons) {
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
