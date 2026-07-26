package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.qp2;
import defpackage.rg7;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
final class ScrollExtensionsKt$stopScroll$2 extends SuspendLambda implements qp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ScrollExtensionsKt$stopScroll$2(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ScrollExtensionsKt$stopScroll$2 scrollExtensionsKt$stopScroll$2 = (ScrollExtensionsKt$stopScroll$2) create((rg7) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        scrollExtensionsKt$stopScroll$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return tx8.a;
    }
}
