package androidx.room.coroutines;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {464, 468, 482, 482, 482}, m = "transaction")
final class PooledConnectionImpl$transaction$1<R> extends ContinuationImpl {
    public Object a;
    public Throwable b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$transaction$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, null, this);
    }
}
