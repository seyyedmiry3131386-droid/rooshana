package kotlin.coroutines.intrinsics;

import defpackage.js3;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 extends ContinuationImpl {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.a = 1;
            b.b(obj);
            js3.n(null, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.a = 2;
        b.b(obj);
        return obj;
    }
}
