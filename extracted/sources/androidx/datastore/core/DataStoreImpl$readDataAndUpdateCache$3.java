package androidx.datastore.core;

import defpackage.dp2;
import defpackage.g51;
import defpackage.kv6;
import defpackage.t48;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {316, 318}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$readDataAndUpdateCache$3 extends SuspendLambda implements dp2 {
    public Throwable a;
    public int b;
    public final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$3(d dVar, g51 g51Var) {
        super(1, g51Var);
        this.c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DataStoreImpl$readDataAndUpdateCache$3(this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$readDataAndUpdateCache$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        t48 kv6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        d dVar = this.c;
        try {
        } catch (Throwable th2) {
            f fVarI = dVar.i();
            this.a = th2;
            this.b = 2;
            Integer numA = fVarI.a();
            if (numA != coroutineSingletons) {
                th = th2;
                obj = numA;
            }
            return coroutineSingletons;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            this.b = 1;
            obj = d.h(dVar, true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.a;
                kotlin.b.b(obj);
                kv6Var = new kv6(th, ((Number) obj).intValue());
                return new Pair(kv6Var, Boolean.TRUE);
            }
            kotlin.b.b(obj);
        }
        kv6Var = (t48) obj;
        return new Pair(kv6Var, Boolean.TRUE);
    }
}
