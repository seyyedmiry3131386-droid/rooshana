package androidx.compose.animation.core;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {520, 2169}, m = "waitForCompositionAfterTargetStateChange", v = 1)
final class SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return e.F(this.c, this);
    }
}
