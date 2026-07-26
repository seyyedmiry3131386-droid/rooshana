package androidx.compose.animation.core;

import defpackage.e71;
import defpackage.g51;
import defpackage.jr8;
import defpackage.js3;
import defpackage.l34;
import defpackage.ml9;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1202}, m = "invokeSuspend", v = 1)
final class Transition$animateTo$1$1$1 extends SuspendLambda implements qp2 {
    public float a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jr8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(jr8 jr8Var, g51 g51Var) {
        super(2, g51Var);
        this.d = jr8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.d, g51Var);
        transition$animateTo$1$1$1.c = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((Transition$animateTo$1$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float fH;
        e71 e71Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            e71 e71Var2 = (e71) this.c;
            fH = f.h(e71Var2.getCoroutineContext());
            e71Var = e71Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fH = this.a;
            e71Var = (e71) this.c;
            kotlin.b.b(obj);
        }
        while (js3.C(e71Var)) {
            l34 l34Var = new l34(this.d, fH, 2);
            this.c = e71Var;
            this.a = fH;
            this.b = 1;
            if (ml9.s(getContext()).k0(this, l34Var) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8.a;
    }
}
