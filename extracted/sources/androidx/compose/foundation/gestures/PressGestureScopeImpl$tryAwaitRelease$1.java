package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {540}, m = "tryAwaitRelease", v = 1)
final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ j b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$tryAwaitRelease$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
