package androidx.media3.ui.compose.state;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.media3.ui.compose.state.PresentationState", f = "PresentationState.kt", l = {105}, m = "observe")
final class PresentationState$observe$1 extends ContinuationImpl {
    public c a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentationState$observe$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
