package androidx.datastore.core;

import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w61;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {350, 351, 357}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$transformAndWrite$2 extends SuspendLambda implements dp2 {
    public Object a;
    public int b;
    public final /* synthetic */ d c;
    public final /* synthetic */ w61 d;
    public final /* synthetic */ SuspendLambda e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$transformAndWrite$2(d dVar, w61 w61Var, qp2 qp2Var, g51 g51Var) {
        super(1, g51Var);
        this.c = dVar;
        this.d = w61Var;
        this.e = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DataStoreImpl$transformAndWrite$2(this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$transformAndWrite$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.b
            androidx.datastore.core.d r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r0 = r8.a
            kotlin.b.b(r9)
            return r0
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.a
            aa1 r1 = (defpackage.aa1) r1
            kotlin.b.b(r9)
            goto L4f
        L27:
            kotlin.b.b(r9)
            goto L37
        L2b:
            kotlin.b.b(r9)
            r8.b = r5
            java.lang.Object r9 = androidx.datastore.core.d.h(r2, r5, r8)
            if (r9 != r0) goto L37
            goto L6f
        L37:
            r1 = r9
            aa1 r1 = (defpackage.aa1) r1
            androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r9 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r8.e
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.a = r1
            r8.b = r4
            w61 r4 = r8.d
            java.lang.Object r9 = defpackage.bt2.Z(r4, r9, r8)
            if (r9 != r0) goto L4f
            goto L6f
        L4f:
            java.lang.Object r4 = r1.b
            if (r4 == 0) goto L58
            int r4 = r4.hashCode()
            goto L59
        L58:
            r4 = 0
        L59:
            int r6 = r1.c
            if (r4 != r6) goto L71
            java.lang.Object r1 = r1.b
            boolean r1 = defpackage.js3.i(r1, r9)
            if (r1 != 0) goto L70
            r8.a = r9
            r8.b = r3
            java.lang.Object r1 = r2.k(r9, r8, r5)
            if (r1 != r0) goto L70
        L6f:
            return r0
        L70:
            return r9
        L71:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$transformAndWrite$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
