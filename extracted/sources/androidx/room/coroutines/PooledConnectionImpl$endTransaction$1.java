package androidx.room.coroutines;

import defpackage.e21;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "endTransaction")
final class PooledConnectionImpl$endTransaction$1 extends ContinuationImpl {
    public boolean a;
    public e21 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$endTransaction$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(false, this);
    }
}
