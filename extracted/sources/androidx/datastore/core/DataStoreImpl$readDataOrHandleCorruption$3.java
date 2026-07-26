package androidx.datastore.core;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {403, 404, 406}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readDataOrHandleCorruption$3 extends SuspendLambda implements dp2 {
    public Serializable a;
    public int b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ d d;
    public final /* synthetic */ Ref$IntRef e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$3(Ref$ObjectRef ref$ObjectRef, d dVar, Ref$IntRef ref$IntRef, g51 g51Var) {
        super(1, g51Var);
        this.c = ref$ObjectRef;
        this.d = dVar;
        this.e = ref$IntRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DataStoreImpl$readDataOrHandleCorruption$3(this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$readDataOrHandleCorruption$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r9 != r0) goto L30;
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
            kotlin.jvm.internal.Ref$IntRef r2 = r8.e
            kotlin.jvm.internal.Ref$ObjectRef r3 = r8.c
            r4 = 3
            r5 = 2
            androidx.datastore.core.d r6 = r8.d
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 == r7) goto L2e
            if (r1 == r5) goto L26
            if (r1 != r4) goto L1e
            java.io.Serializable r0 = r8.a
            r2 = r0
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref$IntRef) r2
            kotlin.b.b(r9)
            goto L6d
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            java.io.Serializable r1 = r8.a
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref$IntRef) r1
            kotlin.b.b(r9)     // Catch: androidx.datastore.core.CorruptionException -> L60
            goto L57
        L2e:
            java.io.Serializable r1 = r8.a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.b.b(r9)     // Catch: androidx.datastore.core.CorruptionException -> L60
            goto L45
        L36:
            kotlin.b.b(r9)
            r8.a = r3     // Catch: androidx.datastore.core.CorruptionException -> L60
            r8.b = r7     // Catch: androidx.datastore.core.CorruptionException -> L60
            java.lang.Object r9 = r6.j(r8)     // Catch: androidx.datastore.core.CorruptionException -> L60
            if (r9 != r0) goto L44
            goto L6c
        L44:
            r1 = r3
        L45:
            r1.a = r9     // Catch: androidx.datastore.core.CorruptionException -> L60
            androidx.datastore.core.f r9 = r6.i()     // Catch: androidx.datastore.core.CorruptionException -> L60
            r8.a = r2     // Catch: androidx.datastore.core.CorruptionException -> L60
            r8.b = r5     // Catch: androidx.datastore.core.CorruptionException -> L60
            java.lang.Integer r9 = r9.a()     // Catch: androidx.datastore.core.CorruptionException -> L60
            if (r9 != r0) goto L56
            goto L6c
        L56:
            r1 = r2
        L57:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: androidx.datastore.core.CorruptionException -> L60
            int r9 = r9.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L60
            r1.a = r9     // Catch: androidx.datastore.core.CorruptionException -> L60
            goto L75
        L60:
            java.lang.Object r9 = r3.a
            r8.a = r2
            r8.b = r4
            java.lang.Object r9 = r6.k(r9, r8, r7)
            if (r9 != r0) goto L6d
        L6c:
            return r0
        L6d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.a = r9
        L75:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
