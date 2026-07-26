package ir.myket.network.model;

import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.zm5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.model.SafeApiCallKt$safeCall$2", f = "SafeApiCall.kt", l = {67}, m = "invokeSuspend", v = 1)
public final class SafeApiCallKt$safeCall$2 extends SuspendLambda implements qp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        try {
            throw null;
        } catch (Throwable th) {
            th.printStackTrace();
            return new zm5(js3.B(th));
        }
    }
}
