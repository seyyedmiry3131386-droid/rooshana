package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
final class ScrollExtensionsKt$scrollBy$4 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Ref$LongRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$4(Ref$LongRef ref$LongRef, g51 g51Var) {
        super(2, g51Var);
        this.b = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollExtensionsKt$scrollBy$4 scrollExtensionsKt$scrollBy$4 = new ScrollExtensionsKt$scrollBy$4(this.b, g51Var);
        scrollExtensionsKt$scrollBy$4.a = obj;
        return scrollExtensionsKt$scrollBy$4;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ScrollExtensionsKt$scrollBy$4 scrollExtensionsKt$scrollBy$4 = (ScrollExtensionsKt$scrollBy$4) create((ug7) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        scrollExtensionsKt$scrollBy$4.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        ((ug7) this.a).getClass();
        this.b.a = 0L;
        return tx8.a;
    }
}
