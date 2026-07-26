package androidx.datastore.core;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {232, 240}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readState$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readState$2(d dVar, g51 g51Var) {
        super(2, g51Var);
        this.b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DataStoreImpl$readState$2(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$readState$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r7 == r2) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            androidx.datastore.core.d r0 = r6.b
            nm5 r1 = r0.h
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r6.a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            kotlin.b.b(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L20
            goto L3b
        L20:
            r7 = move-exception
            goto L48
        L22:
            kotlin.b.b(r7)
            t48 r7 = r1.m()
            boolean r7 = r7 instanceof defpackage.qc2
            if (r7 == 0) goto L32
            t48 r7 = r1.m()
            return r7
        L32:
            r6.a = r5     // Catch: java.lang.Throwable -> L20
            java.lang.Object r7 = androidx.datastore.core.d.f(r0, r6)     // Catch: java.lang.Throwable -> L20
            if (r7 != r2) goto L3b
            goto L44
        L3b:
            r6.a = r4
            r7 = 0
            java.lang.Object r7 = androidx.datastore.core.d.g(r0, r7, r6)
            if (r7 != r2) goto L45
        L44:
            return r2
        L45:
            t48 r7 = (defpackage.t48) r7
            return r7
        L48:
            kv6 r0 = new kv6
            r1 = -1
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$readState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
