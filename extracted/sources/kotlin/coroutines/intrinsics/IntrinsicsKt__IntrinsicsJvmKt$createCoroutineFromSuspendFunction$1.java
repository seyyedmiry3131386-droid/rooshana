package kotlin.coroutines.intrinsics;

import kotlin.b;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 extends RestrictedContinuationImpl {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.a = 1;
            b.b(obj);
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
