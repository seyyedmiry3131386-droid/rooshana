package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {977}, m = "onPostFling-RZ2iAVY", v = 1)
final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.v(0L, 0L, this);
    }
}
