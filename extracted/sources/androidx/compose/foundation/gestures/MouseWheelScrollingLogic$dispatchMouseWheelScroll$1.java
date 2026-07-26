package androidx.compose.foundation.gestures;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {288, 346}, m = "dispatchMouseWheelScroll", v = 1)
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends ContinuationImpl {
    public o a;
    public Ref$FloatRef b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return i.a(this.e, null, null, 0.0f, 0.0f, this);
    }
}
