package coil3.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.i64 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof coil3.util.LifecyclesKt$awaitStarted$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = (coil3.util.LifecyclesKt$awaitStarted$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            tx8 r3 = defpackage.tx8.a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.b
            i64 r0 = r0.a
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L70
        L2d:
            r7 = move-exception
            goto L7f
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.b.b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.d
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle$State.d
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L45
            return r3
        L45:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.a = r6     // Catch: java.lang.Throwable -> L7a
            r0.b = r7     // Catch: java.lang.Throwable -> L7a
            r0.d = r4     // Catch: java.lang.Throwable -> L7a
            om0 r2 = new om0     // Catch: java.lang.Throwable -> L7a
            g51 r0 = defpackage.ok4.I(r0)     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7a
            r2.v()     // Catch: java.lang.Throwable -> L7a
            fy0 r0 = new fy0     // Catch: java.lang.Throwable -> L7a
            r4 = 2
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L7a
            r7.a = r0     // Catch: java.lang.Throwable -> L7a
            r6.a(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r2.u()     // Catch: java.lang.Throwable -> L7a
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r6
            r6 = r7
        L70:
            java.lang.Object r6 = r6.a
            f64 r6 = (defpackage.f64) r6
            if (r6 == 0) goto L79
            r0.f(r6)
        L79:
            return r3
        L7a:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L7f:
            java.lang.Object r6 = r6.a
            f64 r6 = (defpackage.f64) r6
            if (r6 == 0) goto L88
            r0.f(r6)
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.a.a(i64, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
