package androidx.compose.animation;

import defpackage.bp2;
import defpackage.e9;
import defpackage.g51;
import defpackage.jr8;
import defpackage.qp2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {736}, m = "invokeSuspend", v = 1)
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jr8 c;
    public final /* synthetic */ wb5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(jr8 jr8Var, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.c = jr8Var;
        this.d = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.c, this.d, g51Var);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.b = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create((androidx.compose.runtime.h) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.runtime.h hVar = (androidx.compose.runtime.h) this.b;
            final jr8 jr8Var = this.c;
            vb7 vb7VarL = androidx.compose.runtime.g.l(new bp2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    jr8 jr8Var2 = jr8Var;
                    Object objJ = jr8Var2.a.j();
                    EnterExitState enterExitState = EnterExitState.c;
                    return Boolean.valueOf(objJ == enterExitState && ((s08) jr8Var2.d).getValue() == enterExitState);
                }
            });
            e9 e9Var = new e9(hVar, jr8Var, this.d, 1);
            this.a = 1;
            if (vb7VarL.a(e9Var, this) == coroutineSingletons) {
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
