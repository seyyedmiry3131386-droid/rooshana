package androidx.paging;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", f = "ContiguousPagedList.jvmAndAndroid.kt", l = {}, m = "invokeSuspend", v = 1)
final class ContiguousPagedList$deferBoundaryCallbacks$1 extends SuspendLambda implements qp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ContiguousPagedList$deferBoundaryCallbacks$1 contiguousPagedList$deferBoundaryCallbacks$1 = (ContiguousPagedList$deferBoundaryCallbacks$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        contiguousPagedList$deferBoundaryCallbacks$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        throw null;
    }
}
