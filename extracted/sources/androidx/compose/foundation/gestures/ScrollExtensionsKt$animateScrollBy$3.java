package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.nr5;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {62}, m = "animateScrollBy-ubNVwUQ", v = 1)
final class ScrollExtensionsKt$animateScrollBy$3 extends ContinuationImpl {
    public Ref$LongRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        int i = (this.c | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.c = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$LongRef ref$LongRef = this.a;
            kotlin.b.b(obj);
            return new nr5(ref$LongRef.a);
        }
        kotlin.b.b(obj);
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.a = 0L;
        new ScrollExtensionsKt$animateScrollBy$4(ref$LongRef2, null);
        this.a = ref$LongRef2;
        this.c = 1;
        MutatePriority mutatePriority = MutatePriority.a;
        throw null;
    }
}
