package kotlinx.coroutines.sync;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", l = {81}, m = "withPermit")
final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            r3.a = r4
            int r0 = r3.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r3.b = r0
            int r2 = defpackage.qn7.a
            int r0 = r0 - r1
            r3.b = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L1b
            kotlin.b.b(r4)
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            throw r1
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L23:
            kotlin.b.b(r4)
            r3.b = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreKt$withPermit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
