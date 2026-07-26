package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.nr5;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.Scrollable2DKt", f = "Scrollable2D.kt", l = {509}, m = "semanticsScrollBy-d-4ec7I", v = 1)
final class Scrollable2DKt$semanticsScrollBy$1 extends ContinuationImpl {
    public Ref$LongRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Scrollable2DKt$semanticsScrollBy$1 scrollable2DKt$semanticsScrollBy$1;
        this.b = obj;
        int i = this.c | Integer.MIN_VALUE;
        this.c = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.c = i - Integer.MIN_VALUE;
            scrollable2DKt$semanticsScrollBy$1 = this;
        } else {
            scrollable2DKt$semanticsScrollBy$1 = new Scrollable2DKt$semanticsScrollBy$1(this);
        }
        Object obj2 = scrollable2DKt$semanticsScrollBy$1.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = scrollable2DKt$semanticsScrollBy$1.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$LongRef ref$LongRef = scrollable2DKt$semanticsScrollBy$1.a;
            kotlin.b.b(obj2);
            return new nr5(ref$LongRef.a);
        }
        kotlin.b.b(obj2);
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.a = 0L;
        MutatePriority mutatePriority = MutatePriority.a;
        new Scrollable2DKt$semanticsScrollBy$2(ref$LongRef2, null);
        scrollable2DKt$semanticsScrollBy$1.a = ref$LongRef2;
        scrollable2DKt$semanticsScrollBy$1.c = 1;
        throw null;
    }
}
