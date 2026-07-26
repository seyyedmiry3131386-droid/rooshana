package androidx.datastore.core;

import defpackage.g51;
import defpackage.kv6;
import defpackage.qp2;
import defpackage.t48;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {324, 328}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readDataAndUpdateCache$4 extends SuspendLambda implements qp2 {
    public Throwable a;
    public int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ d d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(d dVar, int i, g51 g51Var) {
        super(2, g51Var);
        this.d = dVar;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.d, this.e, g51Var);
        dataStoreImpl$readDataAndUpdateCache$4.c = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DataStoreImpl$readDataAndUpdateCache$4) create(bool, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r0;
        ?? r02;
        t48 t48Var;
        ?? r1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        ?? r12 = this.b;
        d dVar = this.d;
        try {
        } catch (Throwable th2) {
            if (r12 != 0) {
                f fVarI = dVar.i();
                this.a = th2;
                this.c = r12;
                this.b = 2;
                Integer numA = fVarI.a();
                if (numA != coroutineSingletons) {
                    r02 = r12;
                    th = th2;
                    obj = numA;
                }
                return coroutineSingletons;
            }
            ?? r5 = r12;
            th = th2;
            iIntValue = this.e;
            r0 = r5 == true ? 1 : 0;
        }
        if (r12 == 0) {
            kotlin.b.b(obj);
            boolean z = this.c;
            this.c = z;
            this.b = 1;
            obj = d.h(dVar, z, this);
            r12 = z;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = this.c;
                th = this.a;
                kotlin.b.b(obj);
                r02 = z2;
                iIntValue = ((Number) obj).intValue();
                r0 = r02;
                kv6 kv6Var = new kv6(th, iIntValue);
                r1 = r0;
                t48Var = kv6Var;
                return new Pair(t48Var, Boolean.valueOf((boolean) r1));
            }
            boolean z3 = this.c;
            kotlin.b.b(obj);
            r12 = z3;
        }
        t48Var = (t48) obj;
        r1 = r12;
        return new Pair(t48Var, Boolean.valueOf((boolean) r1));
    }
}
