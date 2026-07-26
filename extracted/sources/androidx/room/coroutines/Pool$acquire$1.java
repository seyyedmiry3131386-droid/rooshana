package androidx.room.coroutines;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {253}, m = "acquire")
final class Pool$acquire$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquire$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
