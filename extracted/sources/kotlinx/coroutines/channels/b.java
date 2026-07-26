package kotlinx.coroutines.channels;

import defpackage.ct2;
import defpackage.dt2;
import defpackage.e71;
import defpackage.pw6;
import defpackage.qk6;
import defpackage.qp2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.rk6 r4, defpackage.bp2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            bp2 r4 = r0.a
            r5 = r4
            bp2 r5 = (defpackage.bp2) r5
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L6a
        L2c:
            r4 = move-exception
            goto L70
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.b.b(r6)
            w61 r6 = r0.getContext()
            th0 r2 = defpackage.th0.n
            u61 r6 = r6.r0(r2)
            if (r6 != r4) goto L74
            r6 = r5
            bp2 r6 = (defpackage.bp2) r6     // Catch: java.lang.Throwable -> L2c
            r0.a = r6     // Catch: java.lang.Throwable -> L2c
            r0.c = r3     // Catch: java.lang.Throwable -> L2c
            om0 r6 = new om0     // Catch: java.lang.Throwable -> L2c
            g51 r0 = defpackage.ok4.I(r0)     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2c
            r6.v()     // Catch: java.lang.Throwable -> L2c
            pk6 r0 = new pk6     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L2c
            ep0 r4 = (defpackage.ep0) r4     // Catch: java.lang.Throwable -> L2c
            r4.a(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r5.invoke()
            tx8 r4 = defpackage.tx8.a
            return r4
        L70:
            r5.invoke()
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b.a(rk6, bp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(pw6 pw6Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        pw6Var.g(cancellationException);
    }

    public static qk6 c(e71 e71Var, int i, qp2 qp2Var, int i2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        BufferOverflow bufferOverflow = BufferOverflow.a;
        CoroutineStart coroutineStart = CoroutineStart.a;
        qk6 qk6Var = new qk6(ct2.p(e71Var, emptyCoroutineContext), dt2.b(i, 4, bufferOverflow));
        qk6Var.m0(coroutineStart, qk6Var, qp2Var);
        return qk6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002c, B:28:0x0062, B:30:0x006a, B:20:0x0043), top: B:43:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, wn7] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v0, types: [pw6] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [pw6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [rk6] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [pw6] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [pw6] */
    /* JADX WARN: Type inference failed for: r7v6, types: [wn7] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007a -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.pw6 r6, defpackage.rk6 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            lh0 r6 = r0.c
            pw6 r7 = r0.b
            wn7 r2 = r0.a
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L33
        L2f:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L4e
        L33:
            r6 = move-exception
            goto L86
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            lh0 r6 = r0.c
            pw6 r7 = r0.b
            wn7 r2 = r0.a
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L33
            goto L62
        L47:
            kotlin.b.b(r8)
            lh0 r8 = r6.iterator()     // Catch: java.lang.Throwable -> L82
        L4e:
            r0.a = r7     // Catch: java.lang.Throwable -> L82
            r0.b = r6     // Catch: java.lang.Throwable -> L82
            r0.c = r8     // Catch: java.lang.Throwable -> L82
            r0.e = r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r8.d(r0)     // Catch: java.lang.Throwable -> L82
            if (r2 != r1) goto L5d
            goto L7c
        L5d:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r6.f()     // Catch: java.lang.Throwable -> L33
            r0.a = r2     // Catch: java.lang.Throwable -> L33
            r0.b = r7     // Catch: java.lang.Throwable -> L33
            r0.c = r6     // Catch: java.lang.Throwable -> L33
            r0.e = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r8 = r2.c(r0, r8)     // Catch: java.lang.Throwable -> L33
            if (r8 != r1) goto L2f
        L7c:
            return r1
        L7d:
            r6 = 0
            r7.g(r6)
            return r2
        L82:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L86:
            throw r6     // Catch: java.lang.Throwable -> L87
        L87:
            r8 = move-exception
            b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b.d(pw6, rk6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
