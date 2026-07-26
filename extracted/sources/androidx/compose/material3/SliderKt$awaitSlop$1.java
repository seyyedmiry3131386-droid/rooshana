package androidx.compose.material3;

import defpackage.ah6;
import defpackage.g8;
import defpackage.tb1;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", l = {2188}, m = "awaitSlop-8vUncbI")
final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    public Ref$FloatRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        Ref$FloatRef ref$FloatRef;
        this.b = obj;
        int i = this.c | Integer.MIN_VALUE;
        this.c = i;
        int i2 = o.a;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.c = i - Integer.MIN_VALUE;
            sliderKt$awaitSlop$1 = this;
        } else {
            sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(this);
        }
        Object obj2 = sliderKt$awaitSlop$1.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = sliderKt$awaitSlop$1.c;
        if (i3 == 0) {
            kotlin.b.b(obj2);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            g8 g8Var = new g8(24, ref$FloatRef2);
            sliderKt$awaitSlop$1.a = ref$FloatRef2;
            sliderKt$awaitSlop$1.c = 1;
            Object objA = androidx.compose.material3.internal.i.a(g8Var, sliderKt$awaitSlop$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objA;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$FloatRef = sliderKt$awaitSlop$1.a;
            kotlin.b.b(obj2);
        }
        ah6 ah6Var = (ah6) obj2;
        if (ah6Var != null) {
            return new Pair(ah6Var, new Float(ref$FloatRef.a));
        }
        return null;
    }
}
