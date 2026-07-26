package ir.myket.network.model;

import defpackage.bn5;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.model.SafeApiCallKt$flowSafeCall$5", f = "SafeApiCall.kt", l = {93, 93}, m = "invokeSuspend", v = 1)
public final class SafeApiCallKt$flowSafeCall$5 extends SuspendLambda implements qp2 {
    public ze2 a;
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SafeApiCallKt$flowSafeCall$5) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            throw null;
        }
        if (i == 1) {
            ze2 ze2Var = this.a;
            b.b(obj);
            bn5 bn5Var = new bn5(obj);
            this.c = null;
            this.a = null;
            this.b = 2;
            if (ze2Var.emit(bn5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
