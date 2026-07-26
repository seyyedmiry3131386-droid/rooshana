package androidx.datastore.core;

import defpackage.eu0;
import defpackage.js3;
import defpackage.x2;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class e implements eu0 {
    public final File a;
    public final f b;
    public final x2 c;
    public final AtomicBoolean d;
    public final kotlinx.coroutines.sync.a e;

    public e(File file, f fVar, x2 x2Var) {
        js3.p(fVar, "coordinator");
        this.a = file;
        this.b = fVar;
        this.c = x2Var;
        this.d = new AtomicBoolean(false);
        this.e = new kotlinx.coroutines.sync.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[Catch: all -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:33:0x0073, B:43:0x0085, B:42:0x0082, B:39:0x007d), top: B:53:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [rp2] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.rp2 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.FileStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = (androidx.datastore.core.FileStorageConnection$readScope$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = new androidx.datastore.core.FileStorageConnection$readScope$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            kotlinx.coroutines.sync.a r3 = r8.e
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r9 = r0.a
            rb2 r0 = r0.b
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L65
        L2e:
            r10 = move-exception
            goto L7d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.b.b(r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.d
            boolean r10 = r10.get()
            if (r10 != 0) goto L90
            boolean r10 = r3.g()
            rb2 r2 = new rb2     // Catch: java.lang.Throwable -> L86
            java.io.File r6 = r8.a     // Catch: java.lang.Throwable -> L86
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L86
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L7b
            r0.b = r2     // Catch: java.lang.Throwable -> L7b
            r0.a = r10     // Catch: java.lang.Throwable -> L7b
            r0.e = r4     // Catch: java.lang.Throwable -> L7b
            androidx.datastore.core.StorageConnectionKt$readData$2 r9 = (androidx.datastore.core.StorageConnectionKt$readData$2) r9     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r9 = r9.a(r2, r6, r0)     // Catch: java.lang.Throwable -> L7b
            if (r9 != r1) goto L61
            return r1
        L61:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r2
        L65:
            r0.close()     // Catch: java.lang.Throwable -> L6a
            r0 = r5
            goto L6b
        L6a:
            r0 = move-exception
        L6b:
            if (r0 != 0) goto L73
            if (r9 == 0) goto L72
            r3.d(r5)
        L72:
            return r10
        L73:
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r10 = move-exception
            goto L8a
        L76:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r2
            goto L7d
        L7b:
            r9 = move-exception
            goto L76
        L7d:
            r0.close()     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r0 = move-exception
            defpackage.wu8.f(r10, r0)     // Catch: java.lang.Throwable -> L74
        L85:
            throw r10     // Catch: java.lang.Throwable -> L74
        L86:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L8a:
            if (r9 == 0) goto L8f
            r3.d(r5)
        L8f:
            throw r10
        L90:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.e.a(rp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[Catch: all -> 0x0105, IOException -> 0x0108, TRY_ENTER, TryCatch #8 {IOException -> 0x0108, all -> 0x0105, blocks: (B:42:0x00ce, B:44:0x00d4, B:46:0x00da, B:50:0x00e6, B:51:0x0104, B:47:0x00df, B:58:0x0112, B:65:0x0120, B:64:0x011d), top: B:77:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112 A[Catch: all -> 0x0105, IOException -> 0x0108, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0108, all -> 0x0105, blocks: (B:42:0x00ce, B:44:0x00d4, B:46:0x00da, B:50:0x00e6, B:51:0x0104, B:47:0x00df, B:58:0x0112, B:65:0x0120, B:64:0x011d), top: B:77:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [dc5] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qp2 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.e.b(qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.eu0
    public final void close() {
        this.d.set(true);
        this.c.invoke();
    }
}
