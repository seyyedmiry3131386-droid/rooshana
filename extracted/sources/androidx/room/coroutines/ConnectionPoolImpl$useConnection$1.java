package androidx.room.coroutines;

import defpackage.fv;
import defpackage.tb1;
import defpackage.w61;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {131, 135, 154, 159}, m = "useConnection")
final class ConnectionPoolImpl$useConnection$1<R> extends ContinuationImpl {
    public boolean a;
    public Object b;
    public Object c;
    public Ref$ObjectRef d;
    public w61 e;
    public Ref$ObjectRef f;
    public fv g;
    public /* synthetic */ Object h;
    public final /* synthetic */ a i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPoolImpl$useConnection$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.M(false, null, this);
    }
}
