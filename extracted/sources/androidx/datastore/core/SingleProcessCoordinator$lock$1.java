package androidx.datastore.core;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {62, 40}, m = "lock", v = 1)
final class SingleProcessCoordinator$lock$1<T> extends ContinuationImpl {
    public Object a;
    public kotlinx.coroutines.sync.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessCoordinator$lock$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
