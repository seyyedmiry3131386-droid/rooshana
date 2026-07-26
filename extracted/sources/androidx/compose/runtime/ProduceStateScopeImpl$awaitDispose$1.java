package androidx.compose.runtime;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", l = {208}, m = "awaitDispose", v = 1)
final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {
    public defpackage.d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceStateScopeImpl$awaitDispose$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        this.c.a(null, this);
        return CoroutineSingletons.a;
    }
}
