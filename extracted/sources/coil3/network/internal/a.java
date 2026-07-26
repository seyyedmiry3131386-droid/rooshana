package coil3.network.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.b28 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Exception {
        /*
            boolean r0 = r5 instanceof coil3.network.internal.UtilsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = (coil3.network.internal.UtilsKt$readBuffer$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = new coil3.network.internal.UtilsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            gh0 r4 = r0.b
            b28 r0 = r0.a
            kotlin.b.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r4 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.b.b(r5)
            gh0 r5 = new gh0     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            r0.a = r4     // Catch: java.lang.Throwable -> L57
            r0.b = r5     // Catch: java.lang.Throwable -> L57
            r0.d = r3     // Catch: java.lang.Throwable -> L57
            ph0 r0 = r4.a     // Catch: java.lang.Throwable -> L57
            r0.e0(r5)     // Catch: java.lang.Throwable -> L57
            tx8 r0 = defpackage.tx8.a     // Catch: java.lang.Throwable -> L57
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
            r4 = r5
        L4f:
            r5 = 0
            defpackage.m91.i(r0, r5)
            return r4
        L54:
            r0 = r4
            r4 = r5
            goto L59
        L57:
            r5 = move-exception
            goto L54
        L59:
            throw r4     // Catch: java.lang.Throwable -> L5a
        L5a:
            r5 = move-exception
            defpackage.m91.i(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.internal.a.a(b28, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
