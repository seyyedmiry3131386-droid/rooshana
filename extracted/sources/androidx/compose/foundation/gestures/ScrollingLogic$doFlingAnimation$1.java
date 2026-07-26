package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {857}, m = "doFlingAnimation-QWom1Mo", v = 1)
final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {
    public Ref$LongRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
