package androidx.room.coroutines;

import defpackage.bp2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {231}, m = "acquireWithTimeout-KLykuaI")
final class Pool$acquireWithTimeout$1 extends ContinuationImpl {
    public long a;
    public bp2 b;
    public Ref$ObjectRef c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0L, null, this);
    }
}
