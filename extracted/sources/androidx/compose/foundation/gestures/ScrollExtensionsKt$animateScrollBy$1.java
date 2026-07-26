package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy", v = 1)
final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {
    public Ref$FloatRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        this.b = obj;
        int i = this.c | Integer.MIN_VALUE;
        this.c = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.c = i - Integer.MIN_VALUE;
            scrollExtensionsKt$animateScrollBy$1 = this;
        } else {
            scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(this);
        }
        Object obj2 = scrollExtensionsKt$animateScrollBy$1.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = scrollExtensionsKt$animateScrollBy$1.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$FloatRef ref$FloatRef = scrollExtensionsKt$animateScrollBy$1.a;
            kotlin.b.b(obj2);
            return new Float(ref$FloatRef.a);
        }
        kotlin.b.b(obj2);
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        new ScrollExtensionsKt$animateScrollBy$2(0.0f, ref$FloatRef2, null);
        scrollExtensionsKt$animateScrollBy$1.a = ref$FloatRef2;
        scrollExtensionsKt$animateScrollBy$1.c = 1;
        MutatePriority mutatePriority = MutatePriority.a;
        throw null;
    }
}
