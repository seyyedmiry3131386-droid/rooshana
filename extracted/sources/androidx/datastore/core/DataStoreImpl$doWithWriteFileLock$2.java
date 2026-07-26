package androidx.datastore.core;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$2", f = "DataStoreImpl.kt", l = {434}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$doWithWriteFileLock$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ dp2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$doWithWriteFileLock$2(g51 g51Var, dp2 dp2Var) {
        super(1, g51Var);
        this.b = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new DataStoreImpl$doWithWriteFileLock$2(g51Var, this.b);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$doWithWriteFileLock$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        this.a = 1;
        Object objInvoke = ((DataStoreImpl$readDataOrHandleCorruption$3) this.b).invoke(this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
