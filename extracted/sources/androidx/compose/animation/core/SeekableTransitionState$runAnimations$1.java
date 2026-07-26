package androidx.compose.animation.core;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {354, 357}, m = "runAnimations", v = 1)
final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$runAnimations$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return e.D(this.b, this);
    }
}
