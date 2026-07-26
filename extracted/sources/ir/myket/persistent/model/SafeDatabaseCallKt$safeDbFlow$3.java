package ir.myket.persistent.model;

import defpackage.g51;
import defpackage.nb1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.model.SafeDatabaseCallKt$safeDbFlow$3", f = "SafeDatabaseCall.kt", l = {53}, m = "invokeSuspend", v = 1)
public final class SafeDatabaseCallKt$safeDbFlow$3 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SafeDatabaseCallKt$safeDbFlow$3 safeDatabaseCallKt$safeDbFlow$3 = new SafeDatabaseCallKt$safeDbFlow$3(2, g51Var);
        safeDatabaseCallKt$safeDbFlow$3.b = obj;
        return safeDatabaseCallKt$safeDbFlow$3;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SafeDatabaseCallKt$safeDbFlow$3) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ze2 ze2Var = (ze2) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            this.b = null;
            this.a = 1;
            if (ze2Var.emit(nb1.a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
