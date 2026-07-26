package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {266}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", v = 1)
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 extends ContinuationImpl {
    public i a;
    public Ref$ObjectRef b;
    public Ref$FloatRef c;
    public o d;
    public Ref$ObjectRef e;
    public /* synthetic */ Object f;
    public int g;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.g |= Integer.MIN_VALUE;
        return i.b(null, null, null, null, null, 0L, this);
    }
}
