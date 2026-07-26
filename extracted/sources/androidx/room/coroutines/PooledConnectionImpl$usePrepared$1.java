package androidx.room.coroutines;

import defpackage.dp2;
import defpackage.e21;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {640}, m = "usePrepared")
final class PooledConnectionImpl$usePrepared$1<R> extends ContinuationImpl {
    public String a;
    public dp2 b;
    public e21 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$usePrepared$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, null, this);
    }
}
