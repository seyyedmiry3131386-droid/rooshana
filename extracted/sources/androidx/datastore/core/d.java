package androidx.datastore.core;

import androidx.datastore.core.d;
import androidx.datastore.core.e;
import androidx.datastore.core.f;
import defpackage.b09;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.dt2;
import defpackage.e71;
import defpackage.eb1;
import defpackage.fz1;
import defpackage.g71;
import defpackage.li1;
import defpackage.n;
import defpackage.nm5;
import defpackage.o77;
import defpackage.pt2;
import defpackage.qp2;
import defpackage.sb2;
import defpackage.sy0;
import defpackage.th0;
import defpackage.vb7;
import defpackage.vt;
import defpackage.wt3;
import defpackage.xe2;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class d implements eb1 {
    public final sb2 a;
    public final g71 b;
    public final e71 c;
    public int f;
    public li1 g;
    public final c i;
    public final c24 j;
    public final c24 k;
    public final o77 l;
    public final vb7 d = new vb7(new DataStoreImpl$data$1(this, null));
    public final kotlinx.coroutines.sync.a e = new kotlinx.coroutines.sync.a();
    public final nm5 h = new nm5(14);

    public d(sb2 sb2Var, List list, g71 g71Var, e71 e71Var) {
        this.a = sb2Var;
        this.b = g71Var;
        this.c = e71Var;
        this.i = new c(this, list);
        final int i = 0;
        this.j = kotlin.a.a(new bp2(this) { // from class: fb1
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() throws IOException {
                switch (i) {
                    case 0:
                        sb2 sb2Var2 = this.b.a;
                        File canonicalFile = ((File) sb2Var2.b.invoke()).getCanonicalFile();
                        synchronized (sb2.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = sb2.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            js3.m(absolutePath);
                            linkedHashSet.add(absolutePath);
                        }
                        return new e(canonicalFile, (f) sb2Var2.a.invoke(canonicalFile), new x2(23, canonicalFile));
                    default:
                        return ((e) this.b.j.getValue()).b;
                }
            }
        });
        final int i2 = 1;
        this.k = kotlin.a.a(new bp2(this) { // from class: fb1
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() throws IOException {
                switch (i2) {
                    case 0:
                        sb2 sb2Var2 = this.b.a;
                        File canonicalFile = ((File) sb2Var2.b.invoke()).getCanonicalFile();
                        synchronized (sb2.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = sb2.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            js3.m(absolutePath);
                            linkedHashSet.add(absolutePath);
                        }
                        return new e(canonicalFile, (f) sb2Var2.a.invoke(canonicalFile), new x2(23, canonicalFile));
                    default:
                        return ((e) this.b.j.getValue()).b;
                }
            }
        });
        n nVar = new n(25, this);
        sy0 sy0Var = new sy0(8);
        DataStoreImpl$writeActor$3 dataStoreImpl$writeActor$3 = new DataStoreImpl$writeActor$3(this, null);
        o77 o77Var = new o77();
        o77Var.a = e71Var;
        o77Var.b = dataStoreImpl$writeActor$3;
        o77Var.c = dt2.b(Integer.MAX_VALUE, 6, null);
        o77Var.d = new pt2(9);
        wt3 wt3Var = (wt3) e71Var.getCoroutineContext().r0(th0.n);
        if (wt3Var != null) {
            wt3Var.s0(new vt(nVar, o77Var, sy0Var, 21));
        }
        this.l = o77Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.datastore.core.d r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.datastore.core.DataStoreImpl$decrementCollector$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl$decrementCollector$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlinx.coroutines.sync.a r0 = r0.a
            kotlin.b.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.b.b(r5)
            kotlinx.coroutines.sync.a r5 = r4.e
            r0.a = r5
            r0.d = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r5
        L42:
            r5 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L53
            int r1 = r1 + (-1)
            r4.f = r1     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L57
            li1 r1 = r4.g     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L55
            r1.g(r5)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r4 = move-exception
            goto L5d
        L55:
            r4.g = r5     // Catch: java.lang.Throwable -> L53
        L57:
            r0.d(r5)
            tx8 r4 = defpackage.tx8.a
            return r4
        L5d:
            r0.d(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.d.c(androidx.datastore.core.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.datastore.core.d r7, defpackage.tu4 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.datastore.core.DataStoreImpl$handleUpdate$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.DataStoreImpl$handleUpdate$1 r0 = (androidx.datastore.core.DataStoreImpl$handleUpdate$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$handleUpdate$1 r0 = new androidx.datastore.core.DataStoreImpl$handleUpdate$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            hx0 r7 = r0.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r8 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.b.b(r9)
            hx0 r9 = r8.b
            w61 r2 = r8.d     // Catch: java.lang.Throwable -> L57
            w61 r4 = r0.getContext()     // Catch: java.lang.Throwable -> L57
            w61 r2 = r2.l0(r4)     // Catch: java.lang.Throwable -> L57
            androidx.datastore.core.DataStoreImpl$handleUpdate$2$1 r4 = new androidx.datastore.core.DataStoreImpl$handleUpdate$2$1     // Catch: java.lang.Throwable -> L57
            r5 = 0
            r4.<init>(r7, r8, r5)     // Catch: java.lang.Throwable -> L57
            r0.a = r9     // Catch: java.lang.Throwable -> L57
            r0.d = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = defpackage.bt2.Z(r2, r4, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 != r1) goto L53
            return r1
        L53:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L57:
            r8 = move-exception
            r7 = r9
        L59:
            kotlin.Result$Failure r9 = kotlin.b.a(r8)
        L5d:
            java.lang.Throwable r8 = kotlin.Result.a(r9)
            if (r8 != 0) goto L67
            r7.V(r9)
            goto L73
        L67:
            r7.getClass()
            rx0 r9 = new rx0
            r0 = 0
            r9.<init>(r8, r0)
            r7.V(r9)
        L73:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.d.d(androidx.datastore.core.d, tu4, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(androidx.datastore.core.d r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.datastore.core.DataStoreImpl$incrementCollector$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl$incrementCollector$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlinx.coroutines.sync.a r0 = r0.a
            kotlin.b.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.b.b(r5)
            kotlinx.coroutines.sync.a r5 = r4.e
            r0.a = r5
            r0.d = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r5
        L42:
            r5 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L59
            int r1 = r1 + r3
            r4.f = r1     // Catch: java.lang.Throwable -> L59
            if (r1 != r3) goto L5b
            e71 r1 = r4.c     // Catch: java.lang.Throwable -> L59
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r2 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L59
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L59
            r3 = 3
            li1 r1 = defpackage.bt2.G(r1, r5, r5, r2, r3)     // Catch: java.lang.Throwable -> L59
            r4.g = r1     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r4 = move-exception
            goto L61
        L5b:
            r0.d(r5)
            tx8 r4 = defpackage.tx8.a
            return r4
        L61:
            r0.d(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.d.e(androidx.datastore.core.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r2.b(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(androidx.datastore.core.d r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r0 = r0.a
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5d
        L2c:
            r7 = move-exception
            goto L64
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.b.b(r7)
            goto L4a
        L3a:
            kotlin.b.b(r7)
            androidx.datastore.core.f r7 = r6.i()
            r0.d = r4
            java.lang.Integer r7 = r7.a()
            if (r7 != r1) goto L4a
            goto L5c
        L4a:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            androidx.datastore.core.c r2 = r6.i     // Catch: java.lang.Throwable -> L60
            r0.a = r7     // Catch: java.lang.Throwable -> L60
            r0.d = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r2.b(r0)     // Catch: java.lang.Throwable -> L60
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            tx8 r6 = defpackage.tx8.a
            return r6
        L60:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L64:
            nm5 r6 = r6.h
            kv6 r1 = new kv6
            r1.<init>(r7, r0)
            r6.A(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.d.f(androidx.datastore.core.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(androidx.datastore.core.d r8, boolean r9, defpackage.g51 r10) {
        /*
            nm5 r0 = r8.h
            boolean r1 = r10 instanceof androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1
            if (r1 == 0) goto L15
            r1 = r10
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 r1 = (androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 r1 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.e
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L44
            if (r3 == r6) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            kotlin.b.b(r10)
            goto La4
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.b.b(r10)
            goto L8d
        L3c:
            boolean r9 = r1.a
            t48 r3 = r1.b
            kotlin.b.b(r10)
            goto L60
        L44:
            kotlin.b.b(r10)
            t48 r3 = r0.m()
            boolean r10 = r3 instanceof defpackage.ix8
            if (r10 != 0) goto Lb8
            androidx.datastore.core.f r10 = r8.i()
            r1.b = r3
            r1.a = r9
            r1.e = r6
            java.lang.Integer r10 = r10.a()
            if (r10 != r2) goto L60
            goto La3
        L60:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r6 = r3 instanceof defpackage.aa1
            if (r6 == 0) goto L70
            r7 = r3
            aa1 r7 = (defpackage.aa1) r7
            int r7 = r7.a
            goto L71
        L70:
            r7 = -1
        L71:
            if (r6 == 0) goto L76
            if (r10 != r7) goto L76
            return r3
        L76:
            r10 = 0
            if (r9 == 0) goto L90
            androidx.datastore.core.f r9 = r8.i()
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 r3 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3
            r3.<init>(r8, r10)
            r1.b = r10
            r1.e = r5
            java.lang.Object r10 = r9.b(r3, r1)
            if (r10 != r2) goto L8d
            goto La3
        L8d:
            kotlin.Pair r10 = (kotlin.Pair) r10
            goto La6
        L90:
            androidx.datastore.core.f r9 = r8.i()
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 r3 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4
            r3.<init>(r8, r7, r10)
            r1.b = r10
            r1.e = r4
            java.lang.Object r10 = r9.c(r3, r1)
            if (r10 != r2) goto La4
        La3:
            return r2
        La4:
            kotlin.Pair r10 = (kotlin.Pair) r10
        La6:
            java.lang.Object r8 = r10.a
            t48 r8 = (defpackage.t48) r8
            java.lang.Object r9 = r10.b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb7
            r0.A(r8)
        Lb7:
            return r8
        Lb8:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.d.g(androidx.datastore.core.d, boolean, g51):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[Catch: CorruptionException -> 0x0058, TryCatch #2 {CorruptionException -> 0x0058, blocks: (B:19:0x0053, B:54:0x00e3, B:24:0x005d, B:51:0x00c8, B:32:0x0072, B:40:0x008a, B:42:0x0090, B:36:0x007b, B:48:0x00b7), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:61:0x0109, B:63:0x0119, B:64:0x011e), top: B:78:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:61:0x0109, B:63:0x0119, B:64:0x011e), top: B:78:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(androidx.datastore.core.d r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.d.h(androidx.datastore.core.d, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.eb1
    public final Object a(qp2 qp2Var, ContinuationImpl continuationImpl) {
        b09 b09Var = (b09) continuationImpl.getContext().r0(fz1.t);
        if (b09Var != null) {
            b09Var.a(this);
        }
        return bt2.Z(new b09(b09Var, this), new DataStoreImpl$updateData$2(this, qp2Var, null), continuationImpl);
    }

    @Override // defpackage.eb1
    public final xe2 b() {
        return this.d;
    }

    public final f i() {
        return (f) this.k.getValue();
    }

    public final Object j(ContinuationImpl continuationImpl) {
        return ((e) this.j.getValue()).a(new StorageConnectionKt$readData$2(3, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12, boolean r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$IntRef r11 = r0.a
            kotlin.b.b(r12)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.b.b(r12)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            c24 r12 = r10.j
            java.lang.Object r12 = r12.getValue()
            androidx.datastore.core.e r12 = (androidx.datastore.core.e) r12
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r5
            r0.d = r3
            java.lang.Object r11 = r12.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.d.k(java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }
}
