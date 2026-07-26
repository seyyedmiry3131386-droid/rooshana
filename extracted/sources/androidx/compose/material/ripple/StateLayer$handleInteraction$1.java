package androidx.compose.material.ripple;

import defpackage.ai0;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sk;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {480}, m = "invokeSuspend", v = 1)
final class StateLayer$handleInteraction$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ai0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ sk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$1(ai0 ai0Var, float f, sk skVar, g51 g51Var) {
        super(2, g51Var);
        this.b = ai0Var;
        this.c = f;
        this.d = skVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new StateLayer$handleInteraction$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((StateLayer$handleInteraction$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) this.b.c;
            Float f = new Float(this.c);
            this.a = 1;
            if (androidx.compose.animation.core.a.b(aVar, f, this.d, null, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
