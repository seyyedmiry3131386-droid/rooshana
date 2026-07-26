package androidx.datastore.core;

import defpackage.g51;
import defpackage.t48;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {305, 314, 322}, m = "readDataAndUpdateCache", v = 1)
final class DataStoreImpl$readDataAndUpdateCache$1 extends ContinuationImpl {
    public boolean a;
    public t48 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$1(d dVar, g51 g51Var) {
        super(g51Var);
        this.d = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return d.g(this.d, false, this);
    }
}
