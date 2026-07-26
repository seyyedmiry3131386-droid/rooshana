package androidx.paging;

import defpackage.a16;
import defpackage.b16;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.ca7;
import defpackage.dt2;
import defpackage.dz5;
import defpackage.e16;
import defpackage.e71;
import defpackage.g51;
import defpackage.ga4;
import defpackage.gf2;
import defpackage.gz5;
import defpackage.h11;
import defpackage.ha4;
import defpackage.hz5;
import defpackage.iz;
import defpackage.ja4;
import defpackage.ja9;
import defpackage.js3;
import defpackage.nl;
import defpackage.pa2;
import defpackage.rz5;
import defpackage.tx8;
import defpackage.u06;
import defpackage.v06;
import defpackage.vb7;
import defpackage.vp7;
import defpackage.w06;
import defpackage.x06;
import defpackage.xe2;
import defpackage.xt3;
import defpackage.z06;
import defpackage.zy5;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final Object a;
    public final b16 b;
    public final rz5 c;
    public final xe2 d;
    public final bp2 e;
    public final ca7 f;
    public final AtomicBoolean g;
    public final kotlinx.coroutines.channels.a h;
    public final gz5 i;
    public final xt3 j;
    public final gf2 k;

    public l(Object obj, b16 b16Var, rz5 rz5Var, h11 h11Var, e16 e16Var, bp2 bp2Var) {
        js3.p(b16Var, "pagingSource");
        js3.p(h11Var, "retryFlow");
        this.a = obj;
        this.b = b16Var;
        this.c = rz5Var;
        this.d = h11Var;
        this.e = bp2Var;
        this.f = new ca7(24);
        this.g = new AtomicBoolean(false);
        this.h = dt2.b(-2, 6, null);
        this.i = new gz5(rz5Var);
        xt3 xt3VarA = kotlinx.coroutines.a.a();
        this.j = xt3VarA;
        this.k = new gf2(e.h(new CancelableChannelFlowKt$cancelableChannelFlow$1(xt3VarA, new PageFetcherSnapshot$pageEventFlow$1(this, null), null)), new PageFetcherSnapshot$pageEventFlow$2(this, null));
    }

    public static final Object a(l lVar, gf2 gf2Var, LoadType loadType, SuspendLambda suspendLambda) {
        lVar.getClass();
        xe2 xe2VarI = e.i(gf2Var, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, lVar, loadType));
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, null);
        js3.p(xe2VarI, "<this>");
        Object objA = kotlinx.coroutines.flow.d.d(new vb7(new FlowExtKt$simpleRunningReduce$1(xe2VarI, pageFetcherSnapshot$collectAsGenerationalViewportHints$3, null)), -1).a(new nl(lVar, loadType, 23), suspendLambda);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x03a7, code lost:
    
        r2 = r0;
        r0 = r9;
        r20 = r10;
        r9 = r11;
        r11 = r12;
        r4 = r15;
        r5 = r17;
        r12 = r18;
        r17 = r22;
        r15 = r3;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x051c A[Catch: all -> 0x052b, TryCatch #7 {all -> 0x052b, blocks: (B:156:0x04ea, B:157:0x0500, B:159:0x051c, B:161:0x0524, B:163:0x0528, B:167:0x0531, B:166:0x052f, B:168:0x0534), top: B:235:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0528 A[Catch: all -> 0x052b, TryCatch #7 {all -> 0x052b, blocks: (B:156:0x04ea, B:157:0x0500, B:159:0x051c, B:161:0x0524, B:163:0x0528, B:167:0x0531, B:166:0x052f, B:168:0x0534), top: B:235:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x052f A[Catch: all -> 0x052b, TryCatch #7 {all -> 0x052b, blocks: (B:156:0x04ea, B:157:0x0500, B:159:0x051c, B:161:0x0524, B:163:0x0528, B:167:0x0531, B:166:0x052f, B:168:0x0534), top: B:235:0x04ea }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0371 A[Catch: all -> 0x0396, TRY_LEAVE, TryCatch #3 {all -> 0x0396, blocks: (B:83:0x0359, B:85:0x0371), top: B:228:0x0359 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ab  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.paging.l] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v67, types: [androidx.paging.l] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r10v17, types: [ja9] */
    /* JADX WARN: Type inference failed for: r10v21, types: [pa2] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.paging.LoadType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.paging.LoadType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dc5] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v55, types: [dc5] */
    /* JADX WARN: Type inference failed for: r1v65, types: [hz5] */
    /* JADX WARN: Type inference failed for: r1v73, types: [androidx.paging.LoadType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.paging.LoadType] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75, types: [androidx.paging.LoadType] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78, types: [androidx.paging.LoadType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [androidx.paging.LoadType] */
    /* JADX WARN: Type inference failed for: r3v33, types: [hz5] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ja9] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [androidx.paging.l] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v35, types: [androidx.paging.l] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.paging.l r21, androidx.paging.LoadType r22, defpackage.kr2 r23, defpackage.g51 r24) {
        /*
            Method dump skipped, instruction units count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l.b(androidx.paging.l, androidx.paging.LoadType, kr2, g51):java.lang.Object");
    }

    public static final Object c(l lVar, LoadType loadType, ja9 ja9Var, g51 g51Var) throws Throwable {
        lVar.getClass();
        int i = dz5.a[loadType.ordinal()];
        tx8 tx8Var = tx8.a;
        if (i == 1) {
            Object objF = lVar.f((ContinuationImpl) g51Var);
            return objF == CoroutineSingletons.a ? objF : tx8Var;
        }
        if (ja9Var == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        ca7 ca7Var = lVar.f;
        ca7Var.getClass();
        if (loadType == LoadType.b || loadType == LoadType.c) {
            ((vp7) ca7Var.b).s0(null, new iz(loadType, ja9Var, 8));
            return tx8Var;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public static final void d(l lVar, e71 e71Var) {
        rz5 rz5Var = lVar.c;
        bt2.G(e71Var, null, null, new PageFetcherSnapshot$startConsumingHints$2(lVar, null), 3);
        bt2.G(e71Var, null, null, new PageFetcherSnapshot$startConsumingHints$3(lVar, null), 3);
    }

    public static String h(LoadType loadType, Object obj, a16 a16Var) {
        if (a16Var == null) {
            return "End " + loadType + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + obj + ". Returned " + a16Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.PageFetcherSnapshot$currentPagingState$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = (androidx.paging.PageFetcherSnapshot$currentPagingState$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlinx.coroutines.sync.a r1 = r0.b
            gz5 r0 = r0.a
            kotlin.b.b(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            gz5 r5 = r4.i
            kotlinx.coroutines.sync.a r2 = r5.a
            r0.a = r5
            r0.b = r2
            r0.e = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r5
            r1 = r2
        L49:
            r5 = 0
            hz5 r0 = r0.b     // Catch: java.lang.Throwable -> L5e
            ca7 r2 = r4.f     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r2 = r2.b     // Catch: java.lang.Throwable -> L5e
            vp7 r2 = (defpackage.vp7) r2     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r2 = r2.d     // Catch: java.lang.Throwable -> L5e
            ha9 r2 = (defpackage.ha9) r2     // Catch: java.lang.Throwable -> L5e
            e16 r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L5e
            r1.d(r5)
            return r0
        L5e:
            r0 = move-exception
            r1.d(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff A[PHI: r4
      0x00ff: PHI (r4v8 dc5) = (r4v5 dc5), (r4v14 dc5) binds: [B:51:0x00fb, B:41:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139 A[PHI: r0
      0x0139: PHI (r0v9 java.lang.Object) = (r0v8 java.lang.Object), (r0v1 java.lang.Object) binds: [B:59:0x0135, B:39:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170 A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #2 {all -> 0x0176, blocks: (B:67:0x0154, B:70:0x0170, B:73:0x0179, B:75:0x0180), top: B:134:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180 A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:67:0x0154, B:70:0x0170, B:73:0x0179, B:75:0x0180), top: B:134:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.paging.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dc5] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final x06 g(LoadType loadType, Object obj) {
        LoadType loadType2 = LoadType.a;
        rz5 rz5Var = this.c;
        int i = loadType == loadType2 ? rz5Var.c : rz5Var.a;
        js3.p(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            return new w06(i, obj);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new v06(i, obj);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (obj != null) {
            return new u06(i, obj);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    public final Object i(hz5 hz5Var, LoadType loadType, int i, int i2) {
        hz5Var.getClass();
        ArrayList arrayList = hz5Var.c;
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (i == 0 && !(hz5Var.j.p(loadType) instanceof ga4) && i2 < this.c.b) {
            return loadType == LoadType.b ? ((z06) kotlin.collections.a.o0(arrayList)).b : ((z06) kotlin.collections.a.u0(arrayList)).c;
        }
        return null;
    }

    public final Object j(hz5 hz5Var, LoadType loadType, ga4 ga4Var, ContinuationImpl continuationImpl) {
        pa2 pa2Var = hz5Var.j;
        if (!js3.i(pa2Var.p(loadType), ga4Var)) {
            pa2Var.B(loadType, ga4Var);
            Object objC = this.h.c(continuationImpl, new zy5(pa2Var.D(), null));
            if (objC == CoroutineSingletons.a) {
                return objC;
            }
        }
        return tx8.a;
    }

    public final Object k(hz5 hz5Var, LoadType loadType, ContinuationImpl continuationImpl) {
        pa2 pa2Var = hz5Var.j;
        ja4 ja4VarP = pa2Var.p(loadType);
        ha4 ha4Var = ha4.b;
        if (!js3.i(ja4VarP, ha4Var)) {
            pa2Var.B(loadType, ha4Var);
            Object objC = this.h.c(continuationImpl, new zy5(pa2Var.D(), null));
            if (objC == CoroutineSingletons.a) {
                return objC;
            }
        }
        return tx8.a;
    }
}
