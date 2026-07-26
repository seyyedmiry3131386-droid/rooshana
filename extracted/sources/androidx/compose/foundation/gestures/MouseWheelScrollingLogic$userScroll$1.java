package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {150}, m = "userScroll", v = 1)
final class MouseWheelScrollingLogic$userScroll$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ i b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$userScroll$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, null, this);
    }
}
