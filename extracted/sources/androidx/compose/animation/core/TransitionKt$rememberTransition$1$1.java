package androidx.compose.animation.core;

import defpackage.a18;
import defpackage.e71;
import defpackage.g51;
import defpackage.om0;
import defpackage.qp2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tt9;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2174}, m = "invokeSuspend", v = 1)
final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements qp2 {
    public kotlinx.coroutines.sync.a a;
    public tt9 b;
    public int c;
    public final /* synthetic */ tt9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(tt9 tt9Var, g51 g51Var) {
        super(2, g51Var);
        this.d = tt9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TransitionKt$rememberTransition$1$1(this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TransitionKt$rememberTransition$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [c24, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        tt9 tt9Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            tt9 tt9Var2 = this.d;
            e eVar = (e) tt9Var2;
            eVar.getClass();
            ((a18) h.b.getValue()).d(eVar, h.a, eVar.h);
            aVar = eVar.k;
            this.a = aVar;
            this.b = tt9Var2;
            this.c = 1;
            if (aVar.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            tt9Var = tt9Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tt9Var = this.b;
            aVar = this.a;
            kotlin.b.b(obj);
        }
        try {
            ((e) tt9Var).e = ((s08) ((e) tt9Var).c).getValue();
            om0 om0Var = ((e) tt9Var).j;
            if (om0Var != null) {
                om0Var.resumeWith(((s08) ((e) tt9Var).c).getValue());
            }
            ((e) tt9Var).j = null;
            aVar.d(null);
            return tx8.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
    }
}
