package androidx.media3.ui.compose.state;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.media3.ui.compose.state.PlayPauseButtonState", f = "PlayPauseButtonState.kt", l = {87}, m = "observe")
final class PlayPauseButtonState$observe$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPauseButtonState$observe$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.a(this);
        return CoroutineSingletons.a;
    }
}
