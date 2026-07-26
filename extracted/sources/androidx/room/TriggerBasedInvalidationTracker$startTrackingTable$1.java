package androidx.room;

import defpackage.tb1;
import defpackage.vh6;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {328, 333}, m = "startTrackingTable")
final class TriggerBasedInvalidationTracker$startTrackingTable$1 extends ContinuationImpl {
    public vh6 a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$startTrackingTable$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return h.b(this.h, null, 0, this);
    }
}
