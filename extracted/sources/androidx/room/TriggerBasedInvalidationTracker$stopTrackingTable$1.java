package androidx.room;

import defpackage.tb1;
import defpackage.vh6;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {347}, m = "stopTrackingTable")
final class TriggerBasedInvalidationTracker$stopTrackingTable$1 extends ContinuationImpl {
    public vh6 a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ h g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$stopTrackingTable$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return h.c(this.g, null, 0, this);
    }
}
