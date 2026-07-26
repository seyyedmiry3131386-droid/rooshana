package androidx.compose.foundation.gestures;

import defpackage.c26;
import defpackage.g51;
import defpackage.kg7;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4", f = "ScrollExtensions.kt", l = {63}, m = "invokeSuspend", v = 1)
final class ScrollExtensionsKt$animateScrollBy$4 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Ref$LongRef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$4(Ref$LongRef ref$LongRef, g51 g51Var) {
        super(2, g51Var);
        this.c = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollExtensionsKt$animateScrollBy$4 scrollExtensionsKt$animateScrollBy$4 = new ScrollExtensionsKt$animateScrollBy$4(this.c, g51Var);
        scrollExtensionsKt$animateScrollBy$4.b = obj;
        return scrollExtensionsKt$animateScrollBy$4;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollExtensionsKt$animateScrollBy$4) create((ug7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ug7 ug7Var = (ug7) this.b;
            nr5 nr5Var = new nr5(0L);
            nr5 nr5Var2 = new nr5(0L);
            kg7 kg7Var = new kg7(this.c, ug7Var);
            this.a = 1;
            if (androidx.compose.animation.core.f.c(c26.m, nr5Var, nr5Var2, null, null, kg7Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
