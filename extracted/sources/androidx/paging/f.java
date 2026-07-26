package androidx.paging;

import defpackage.wd2;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final wd2 a = new wd2();
    public final kotlinx.coroutines.sync.a b = new kotlinx.coroutines.sync.a();
    public int c = -1;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.paging.FlattenedPageController$getStateAsEvents$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = (androidx.paging.FlattenedPageController$getStateAsEvents$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = new androidx.paging.FlattenedPageController$getStateAsEvents$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlinx.coroutines.sync.a r0 = r0.a
            kotlin.b.b(r9)
            goto L42
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            kotlin.b.b(r9)
            kotlinx.coroutines.sync.a r9 = r8.b
            r0.a = r9
            r0.d = r3
            java.lang.Object r0 = r9.b(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r9
        L42:
            r9 = 0
            wd2 r1 = r8.a     // Catch: java.lang.Throwable -> L7c
            java.util.List r1 = r1.b()     // Catch: java.lang.Throwable -> L7c
            int r2 = r8.c     // Catch: java.lang.Throwable -> L7c
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 - r4
            int r2 = r2 + r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c
            r4 = 10
            int r4 = defpackage.wu0.V(r1, r4)     // Catch: java.lang.Throwable -> L7c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7c
            r4 = 0
        L61:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r5 == 0) goto L82
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L7c
            int r6 = r4 + 1
            if (r4 < 0) goto L7e
            az5 r5 = (defpackage.az5) r5     // Catch: java.lang.Throwable -> L7c
            pm3 r7 = new pm3     // Catch: java.lang.Throwable -> L7c
            int r4 = r4 + r2
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7c
            r3.add(r7)     // Catch: java.lang.Throwable -> L7c
            r4 = r6
            goto L61
        L7c:
            r1 = move-exception
            goto L86
        L7e:
            defpackage.br9.P()     // Catch: java.lang.Throwable -> L7c
            throw r9     // Catch: java.lang.Throwable -> L7c
        L82:
            r0.d(r9)
            return r3
        L86:
            r0.d(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.pm3 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.FlattenedPageController$record$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController$record$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$record$1 r0 = new androidx.paging.FlattenedPageController$record$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.sync.a r5 = r0.b
            pm3 r0 = r0.a
            kotlin.b.b(r6)
            r6 = r5
            r5 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.b.b(r6)
            r0.a = r5
            kotlinx.coroutines.sync.a r6 = r4.b
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r5.a     // Catch: java.lang.Throwable -> L5b
            r4.c = r1     // Catch: java.lang.Throwable -> L5b
            wd2 r1 = r4.a     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r5.b     // Catch: java.lang.Throwable -> L5b
            az5 r5 = (defpackage.az5) r5     // Catch: java.lang.Throwable -> L5b
            r1.a(r5)     // Catch: java.lang.Throwable -> L5b
            r6.d(r0)
            tx8 r5 = defpackage.tx8.a
            return r5
        L5b:
            r5 = move-exception
            r6.d(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f.b(pm3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
