package kotlinx.coroutines;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.x2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ x2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(x2 x2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = x2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.b, g51Var);
        interruptibleKt$runInterruptible$2.a = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InterruptibleKt$runInterruptible$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return coil3.decode.a.b((coil3.decode.a) r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        throw r5;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            kotlin.b.b(r5)
            java.lang.Object r5 = r4.a
            e71 r5 = (defpackage.e71) r5
            w61 r5 = r5.getCoroutineContext()
            x2 r0 = r4.b
            yk8 r1 = new yk8     // Catch: java.lang.InterruptedException -> L46
            r1.<init>()     // Catch: java.lang.InterruptedException -> L46
            wt3 r5 = kotlinx.coroutines.a.h(r5)     // Catch: java.lang.InterruptedException -> L46
            r2 = 1
            bq1 r5 = kotlinx.coroutines.a.i(r5, r2, r1)     // Catch: java.lang.InterruptedException -> L46
            r1.f = r5     // Catch: java.lang.InterruptedException -> L46
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.yk8.g     // Catch: java.lang.InterruptedException -> L46
        L21:
            int r2 = r5.get(r1)     // Catch: java.lang.InterruptedException -> L46
            if (r2 == 0) goto L33
            r5 = 2
            if (r2 == r5) goto L3a
            r5 = 3
            if (r2 != r5) goto L2e
            goto L3a
        L2e:
            defpackage.yk8.n(r2)     // Catch: java.lang.InterruptedException -> L46
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L46
        L33:
            r3 = 0
            boolean r2 = r5.compareAndSet(r1, r2, r3)     // Catch: java.lang.InterruptedException -> L46
            if (r2 == 0) goto L21
        L3a:
            java.lang.Object r5 = r0.b     // Catch: java.lang.Throwable -> L48
            coil3.decode.a r5 = (coil3.decode.a) r5     // Catch: java.lang.Throwable -> L48
            zb1 r5 = coil3.decode.a.b(r5)     // Catch: java.lang.Throwable -> L48
            r1.m()     // Catch: java.lang.InterruptedException -> L46
            return r5
        L46:
            r5 = move-exception
            goto L4d
        L48:
            r5 = move-exception
            r1.m()     // Catch: java.lang.InterruptedException -> L46
            throw r5     // Catch: java.lang.InterruptedException -> L46
        L4d:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.InterruptibleKt$runInterruptible$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
