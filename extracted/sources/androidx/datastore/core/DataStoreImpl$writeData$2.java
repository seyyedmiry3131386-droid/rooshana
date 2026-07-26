package androidx.datastore.core;

import defpackage.ac2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {372, 373}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$writeData$2 extends SuspendLambda implements qp2 {
    public Ref$IntRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ d e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Ref$IntRef ref$IntRef, d dVar, Object obj, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.d = ref$IntRef;
        this.e = dVar;
        this.f = obj;
        this.g = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.d, this.e, this.f, this.g, g51Var);
        dataStoreImpl$writeData$2.c = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$writeData$2) create((ac2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r9 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.b
            tx8 r2 = defpackage.tx8.a
            java.lang.Object r3 = r8.f
            androidx.datastore.core.d r4 = r8.e
            kotlin.jvm.internal.Ref$IntRef r5 = r8.d
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L20
            if (r1 != r6) goto L18
            kotlin.b.b(r9)
            goto L7a
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            kotlin.jvm.internal.Ref$IntRef r1 = r8.a
            java.lang.Object r7 = r8.c
            ac2 r7 = (defpackage.ac2) r7
            kotlin.b.b(r9)
            goto L51
        L2a:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.c
            ac2 r9 = (defpackage.ac2) r9
            androidx.datastore.core.f r1 = r4.i()
            r8.c = r9
            r8.a = r5
            r8.b = r7
            pt2 r1 = r1.b
            java.lang.Object r1 = r1.b
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            if (r7 != r0) goto L4d
            goto L79
        L4d:
            r1 = r7
            r7 = r9
            r9 = r1
            r1 = r5
        L51:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.a = r9
            r9 = 0
            r8.c = r9
            r8.a = r9
            r8.b = r6
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.b
            boolean r1 = r1.get()
            if (r1 != 0) goto L93
            java.io.File r1 = r7.a
            androidx.datastore.core.FileWriteScope$writeData$2 r6 = new androidx.datastore.core.FileWriteScope$writeData$2
            r6.<init>(r7, r3, r9)
            java.lang.Object r9 = androidx.datastore.core.a.a(r1, r6, r8)
            if (r9 != r0) goto L76
            goto L77
        L76:
            r9 = r2
        L77:
            if (r9 != r0) goto L7a
        L79:
            return r0
        L7a:
            boolean r9 = r8.g
            if (r9 == 0) goto L92
            nm5 r9 = r4.h
            aa1 r0 = new aa1
            if (r3 == 0) goto L89
            int r1 = r3.hashCode()
            goto L8a
        L89:
            r1 = 0
        L8a:
            int r4 = r5.a
            r0.<init>(r1, r4, r3)
            r9.A(r0)
        L92:
            return r2
        L93:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "This scope has already been closed."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
