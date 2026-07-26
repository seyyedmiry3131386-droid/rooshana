package androidx.compose.animation;

import defpackage.du7;
import defpackage.e71;
import defpackage.g51;
import defpackage.nr5;
import defpackage.o38;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.SharedElement$momentumAnimationOffset$1$2$1", f = "SharedElement.kt", l = {102}, m = "invokeSuspend", v = 1)
final class SharedElement$momentumAnimationOffset$1$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ o38 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$momentumAnimationOffset$1$2$1(du7 du7Var, o38 o38Var, g51 g51Var) {
        super(2, g51Var);
        this.b = o38Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SharedElement$momentumAnimationOffset$1$2$1(null, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        SharedElement$momentumAnimationOffset$1$2$1 sharedElement$momentumAnimationOffset$1$2$1 = (SharedElement$momentumAnimationOffset$1$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        sharedElement$momentumAnimationOffset$1$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8.a;
        }
        kotlin.b.b(obj);
        nr5 nr5Var = new nr5(0L);
        this.a = 1;
        androidx.compose.animation.core.a.b(null, nr5Var, this.b, null, null, this, 12);
        throw null;
    }
}
