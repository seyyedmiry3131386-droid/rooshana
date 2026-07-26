package androidx.datastore.core;

import defpackage.br9;
import defpackage.e71;
import defpackage.g71;
import defpackage.ol3;
import defpackage.sb2;
import defpackage.ut4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.io.File r4, defpackage.dp2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1 r0 = (androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1 r0 = new androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.io.File r4 = r0.a
            kotlin.b.b(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.b.b(r6)
            r0.a = r4     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        L42:
            boolean r6 = r5 instanceof androidx.datastore.core.CorruptionException
            if (r6 != 0) goto La8
            java.lang.String r6 = "file"
            defpackage.js3.p(r4, r6)
            boolean r6 = r4.exists()
            if (r6 == 0) goto La3
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7d
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6d
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L68
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
            goto La7
        L68:
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
            goto La7
        L6d:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L78
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
            goto La7
        L78:
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
            goto La7
        L7d:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L93
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8e
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
            goto La7
        L8e:
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
            goto La7
        L93:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9e
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
            goto La7
        L9e:
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
            goto La7
        La3:
            java.io.IOException r4 = defpackage.wq2.j(r4, r5)
        La7:
            throw r4
        La8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.a.a(java.io.File, dp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.List r6, androidx.datastore.core.b r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.b
            java.io.Serializable r7 = r0.a
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.a
            java.util.List r6 = (java.util.List) r6
            kotlin.b.b(r8)
            goto L5c
        L42:
            kotlin.b.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.a = r8
            r0.d = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            dp2 r8 = (defpackage.dp2) r8
            r0.a = r7     // Catch: java.lang.Throwable -> L30
            r0.b = r6     // Catch: java.lang.Throwable -> L30
            r0.d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.a
            if (r2 != 0) goto L85
            r7.a = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            defpackage.wu8.f(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            tx8 r1 = defpackage.tx8.a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.a.b(java.util.List, androidx.datastore.core.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static d c(sb2 sb2Var, ut4 ut4Var, List list, e71 e71Var) {
        g71 ol3Var = ut4Var;
        if (ut4Var == null) {
            ol3Var = new ol3(11);
        }
        return new d(sb2Var, br9.B(new DataMigrationInitializer$Companion$getInitializer$1(list, null)), ol3Var, e71Var);
    }
}
