package androidx.datastore.core;

import defpackage.dc5;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {566, 517}, m = "runIfNeeded", v = 1)
final class RunOnce$runIfNeeded$1 extends ContinuationImpl {
    public dc5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunOnce$runIfNeeded$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
