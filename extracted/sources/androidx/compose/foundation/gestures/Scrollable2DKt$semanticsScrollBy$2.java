package androidx.compose.foundation.gestures;

import defpackage.c26;
import defpackage.dh7;
import defpackage.g51;
import defpackage.iz;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2", f = "Scrollable2D.kt", l = {510}, m = "invokeSuspend", v = 1)
final class Scrollable2DKt$semanticsScrollBy$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Ref$LongRef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DKt$semanticsScrollBy$2(Ref$LongRef ref$LongRef, g51 g51Var) {
        super(2, g51Var);
        this.c = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        Scrollable2DKt$semanticsScrollBy$2 scrollable2DKt$semanticsScrollBy$2 = new Scrollable2DKt$semanticsScrollBy$2(this.c, g51Var);
        scrollable2DKt$semanticsScrollBy$2.b = obj;
        return scrollable2DKt$semanticsScrollBy$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((Scrollable2DKt$semanticsScrollBy$2) create((dh7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            dh7 dh7Var = (dh7) this.b;
            nr5 nr5Var = new nr5(0L);
            nr5 nr5Var2 = new nr5(0L);
            iz izVar = new iz(this.c, dh7Var, 18);
            this.a = 1;
            if (androidx.compose.animation.core.f.c(c26.m, nr5Var, nr5Var2, null, y97.c0(0.0f, 0.0f, null, 7), izVar, this) == coroutineSingletons) {
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
