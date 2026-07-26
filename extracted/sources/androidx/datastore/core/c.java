package androidx.datastore.core;

import defpackage.ct2;
import defpackage.hx0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final kotlinx.coroutines.sync.a a = new kotlinx.coroutines.sync.a();
    public final hx0 b = ct2.b();
    public List c;
    public final /* synthetic */ d d;

    public c(d dVar, List list) {
        this.d = dVar;
        this.c = kotlin.collections.a.P0(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws androidx.datastore.core.CorruptionException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            androidx.datastore.core.d r5 = r6.d
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.b.b(r7)
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.b.b(r7)
            goto L66
        L38:
            kotlin.b.b(r7)
            java.util.List r7 = r6.c
            if (r7 == 0) goto L5c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L46
            goto L5c
        L46:
            androidx.datastore.core.f r7 = r5.i()
            androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.c = r3
            java.lang.Object r7 = r7.b(r2, r0)
            if (r7 != r1) goto L59
            goto L65
        L59:
            aa1 r7 = (defpackage.aa1) r7
            goto L68
        L5c:
            r0.c = r4
            r7 = 0
            java.lang.Object r7 = androidx.datastore.core.d.h(r5, r7, r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            aa1 r7 = (defpackage.aa1) r7
        L68:
            nm5 r0 = r5.h
            r0.A(r7)
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.c.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.RunOnce$runIfNeeded$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce$runIfNeeded$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            tx8 r5 = defpackage.tx8.a
            hx0 r6 = r9.b
            r7 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            dc5 r0 = r0.a
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L6f
        L31:
            r10 = move-exception
            goto L7a
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3b:
            dc5 r2 = r0.a
            kotlin.b.b(r10)
            r10 = r2
            goto L59
        L42:
            kotlin.b.b(r10)
            boolean r10 = r6.T()
            if (r10 == 0) goto L4c
            return r5
        L4c:
            kotlinx.coroutines.sync.a r10 = r9.a
            r0.a = r10
            r0.d = r4
            java.lang.Object r2 = r10.b(r0)
            if (r2 != r1) goto L59
            goto L6d
        L59:
            boolean r2 = r6.T()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L63
            r10.d(r7)
            return r5
        L63:
            r0.a = r10     // Catch: java.lang.Throwable -> L76
            r0.d = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r9.a(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r0 = r10
        L6f:
            r6.V(r5)     // Catch: java.lang.Throwable -> L31
            r0.d(r7)
            return r5
        L76:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L7a:
            r0.d(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.c.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
