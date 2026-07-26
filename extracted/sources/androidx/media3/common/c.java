package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.gb6 r6, defpackage.qp2 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.media3.common.PlayerExtensionsKt$listen$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.media3.common.PlayerExtensionsKt$listen$1 r0 = (androidx.media3.common.PlayerExtensionsKt$listen$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            androidx.media3.common.PlayerExtensionsKt$listen$1 r0 = new androidx.media3.common.PlayerExtensionsKt$listen$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            kotlin.b.b(r8)
            goto L72
        L32:
            kotlin.KotlinNothingValueException r6 = defpackage.t61.q(r8)
            throw r6
        L37:
            kotlin.b.b(r8)
            android.os.Looper r8 = android.os.Looper.myLooper()
            android.os.Looper r2 = r6.g0()
            boolean r8 = defpackage.js3.i(r8, r2)
            if (r8 == 0) goto L4e
            r0.b = r4
            b(r6, r7, r0)
            return
        L4e:
            android.os.Looper r8 = r6.g0()
            android.os.Handler r8 = defpackage.rq4.s(r8)
            java.lang.String r2 = "createAsync(...)"
            defpackage.js3.o(r8, r2)
            int r2 = defpackage.rw2.a
            kotlinx.coroutines.android.a r2 = new kotlinx.coroutines.android.a
            r4 = 0
            r5 = 0
            r2.<init>(r8, r5, r4)
            androidx.media3.common.PlayerExtensionsKt$listen$2 r8 = new androidx.media3.common.PlayerExtensionsKt$listen$2
            r8.<init>(r6, r7, r5)
            r0.b = r3
            java.lang.Object r6 = defpackage.bt2.Z(r2, r8, r0)
            if (r6 != r1) goto L72
            return
        L72:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.c.a(gb6, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.gb6 r7, defpackage.qp2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.media3.common.PlayerExtensionsKt$listenImpl$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.media3.common.PlayerExtensionsKt$listenImpl$1 r0 = (androidx.media3.common.PlayerExtensionsKt$listenImpl$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.media3.common.PlayerExtensionsKt$listenImpl$1 r0 = new androidx.media3.common.PlayerExtensionsKt$listenImpl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 0
            java.lang.String r4 = "listener"
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L2e
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2e:
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.c
            qp2 r8 = r0.b
            qp2 r8 = (defpackage.qp2) r8
            gb6 r8 = r0.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L3c
            r9 = r7
            r7 = r8
            goto L81
        L3c:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L8d
        L42:
            kotlin.b.b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r0.a = r7     // Catch: java.lang.Throwable -> L87
            r2 = r8
            qp2 r2 = (defpackage.qp2) r2     // Catch: java.lang.Throwable -> L87
            r0.b = r2     // Catch: java.lang.Throwable -> L87
            r0.c = r9     // Catch: java.lang.Throwable -> L87
            r0.e = r5     // Catch: java.lang.Throwable -> L87
            om0 r2 = new om0     // Catch: java.lang.Throwable -> L87
            g51 r0 = defpackage.ok4.I(r0)     // Catch: java.lang.Throwable -> L87
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> L87
            r2.v()     // Catch: java.lang.Throwable -> L87
            ie6 r0 = new ie6     // Catch: java.lang.Throwable -> L87
            r0.<init>(r8, r2)     // Catch: java.lang.Throwable -> L87
            r9.a = r0     // Catch: java.lang.Throwable -> L87
            ah0 r8 = new ah0     // Catch: java.lang.Throwable -> L87
            r0 = 2
            r8.<init>(r0, r9)     // Catch: java.lang.Throwable -> L87
            r2.x(r8)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = r9.a     // Catch: java.lang.Throwable -> L87
            if (r8 == 0) goto L89
            ie6 r8 = (defpackage.ie6) r8     // Catch: java.lang.Throwable -> L87
            r7.n(r8)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = r2.u()     // Catch: java.lang.Throwable -> L87
            if (r8 != r1) goto L81
            return
        L81:
            kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L87
            r8.<init>()     // Catch: java.lang.Throwable -> L87
            throw r8     // Catch: java.lang.Throwable -> L87
        L87:
            r8 = move-exception
            goto L8d
        L89:
            defpackage.js3.V(r4)     // Catch: java.lang.Throwable -> L87
            throw r3     // Catch: java.lang.Throwable -> L87
        L8d:
            java.lang.Object r9 = r9.a
            if (r9 != 0) goto L95
            defpackage.js3.V(r4)
            throw r3
        L95:
            ie6 r9 = (defpackage.ie6) r9
            r7.O(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.c.b(gb6, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
