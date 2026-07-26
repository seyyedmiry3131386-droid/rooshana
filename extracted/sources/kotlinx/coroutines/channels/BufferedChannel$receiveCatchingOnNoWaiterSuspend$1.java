package kotlinx.coroutines.channels;

import defpackage.jp0;
import defpackage.tb1;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.b;
        Object objH = this.b.H(null, 0, 0L, this);
        return objH == CoroutineSingletons.a ? objH : new jp0(objH);
    }
}
