package androidx.compose.foundation.gestures;

import defpackage.dh7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1119}, m = "invokeSuspend", v = 1)
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Ref$FloatRef e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(o oVar, long j, Ref$FloatRef ref$FloatRef, g51 g51Var) {
        super(2, g51Var);
        this.c = oVar;
        this.d = j;
        this.e = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.c, this.d, this.e, g51Var);
        scrollableKt$semanticsScrollBy$2.b = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableKt$semanticsScrollBy$2) create((dh7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            dh7 dh7Var = (dh7) this.b;
            long j = this.d;
            o oVar = this.c;
            float fG = oVar.g(j);
            w8 w8Var = new w8(this.e, oVar, dh7Var, 10);
            this.a = 1;
            if (androidx.compose.animation.core.f.d(0.0f, fG, null, w8Var, this, 12) == coroutineSingletons) {
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
