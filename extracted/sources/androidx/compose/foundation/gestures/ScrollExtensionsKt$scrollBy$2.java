package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.qp2;
import defpackage.rg7;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
final class ScrollExtensionsKt$scrollBy$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Ref$FloatRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(Ref$FloatRef ref$FloatRef, g51 g51Var) {
        super(2, g51Var);
        this.b = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.b, g51Var);
        scrollExtensionsKt$scrollBy$2.a = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = (ScrollExtensionsKt$scrollBy$2) create((rg7) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        scrollExtensionsKt$scrollBy$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        this.b.a = ((rg7) this.a).f(0.0f);
        return tx8.a;
    }
}
