package androidx.datastore.core;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {566}, m = "decrementCollector", v = 1)
final class DataStoreImpl$decrementCollector$1 extends ContinuationImpl {
    public kotlinx.coroutines.sync.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$decrementCollector$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return d.c(this.c, this);
    }
}
