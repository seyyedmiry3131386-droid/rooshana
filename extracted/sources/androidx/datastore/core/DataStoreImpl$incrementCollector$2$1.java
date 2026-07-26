package androidx.datastore.core;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {145, 146}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$incrementCollector$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$incrementCollector$2$1(d dVar, g51 g51Var) {
        super(2, g51Var);
        this.b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DataStoreImpl$incrementCollector$2$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$incrementCollector$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        d dVar = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = dVar.i;
            this.a = 1;
            Object objS = cVar.b.s(this);
            if (objS != coroutineSingletons) {
                objS = tx8Var;
            }
            if (objS != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        xe2 xe2VarD = kotlinx.coroutines.flow.d.d(dVar.i().c, -1);
        r4 r4Var = new r4(19, dVar);
        this.a = 2;
        return xe2VarD.a(r4Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
