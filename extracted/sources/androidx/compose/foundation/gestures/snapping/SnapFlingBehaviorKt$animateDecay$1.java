package androidx.compose.foundation.gestures.snapping;

import defpackage.tb1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {308}, m = "animateDecay", v = 1)
final class SnapFlingBehaviorKt$animateDecay$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        this.a = obj;
        int i = this.b | Integer.MIN_VALUE;
        this.b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.b = i - Integer.MIN_VALUE;
            snapFlingBehaviorKt$animateDecay$1 = this;
        } else {
            snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(this);
        }
        Object obj2 = snapFlingBehaviorKt$animateDecay$1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = snapFlingBehaviorKt$animateDecay$1.b;
        if (i2 == 0) {
            b.b(obj2);
            new Ref$FloatRef();
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj2);
        throw null;
    }
}
