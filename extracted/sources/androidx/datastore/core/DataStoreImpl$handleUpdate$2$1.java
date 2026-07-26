package androidx.datastore.core;

import defpackage.aa1;
import defpackage.bo5;
import defpackage.e71;
import defpackage.g51;
import defpackage.ix8;
import defpackage.kv6;
import defpackage.qc2;
import defpackage.qp2;
import defpackage.t48;
import defpackage.tb1;
import defpackage.tu4;
import defpackage.tx8;
import defpackage.w61;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$handleUpdate$2$1", f = "DataStoreImpl.kt", l = {256, 262, 265}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$handleUpdate$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ tu4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$handleUpdate$2$1(d dVar, tu4 tu4Var, g51 g51Var) {
        super(2, g51Var);
        this.b = dVar;
        this.c = tu4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DataStoreImpl$handleUpdate$2$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$handleUpdate$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    /* JADX WARN: Type inference failed for: r9v13, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tu4 tu4Var = this.c;
        d dVar = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            t48 t48VarM = dVar.h.m();
            if (t48VarM instanceof aa1) {
                ?? r9 = tu4Var.a;
                w61 w61Var = tu4Var.d;
                this.a = 1;
                Object objB = dVar.i().b(new DataStoreImpl$transformAndWrite$2(dVar, w61Var, r9, null), this);
                if (objB != coroutineSingletons) {
                    return objB;
                }
            } else {
                if (!(t48VarM instanceof kv6) && !(t48VarM instanceof ix8)) {
                    if (t48VarM instanceof qc2) {
                        throw ((qc2) t48VarM).b;
                    }
                    if (t48VarM instanceof bo5) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (t48VarM != tu4Var.c) {
                    throw ((kv6) t48VarM).b;
                }
                this.a = 2;
                if (d.f(dVar, this) != coroutineSingletons) {
                }
            }
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return obj;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        ?? r92 = tu4Var.a;
        w61 w61Var2 = tu4Var.d;
        this.a = 3;
        Object objB2 = dVar.i().b(new DataStoreImpl$transformAndWrite$2(dVar, w61Var2, r92, null), this);
        return objB2 == coroutineSingletons ? coroutineSingletons : objB2;
    }
}
