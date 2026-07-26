package androidx.compose.animation.core;

import defpackage.dp2;
import defpackage.g51;
import defpackage.jr8;
import defpackage.js3;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {458}, m = "invokeSuspend", v = 1)
final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ jr8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(g51 g51Var, jr8 jr8Var, e eVar, Object obj) {
        super(1, g51Var);
        this.b = eVar;
        this.c = obj;
        this.d = jr8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SeekableTransitionState$snapTo$2(g51Var, this.d, this.b, this.c);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SeekableTransitionState$snapTo$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar = this.b;
        wb5 wb5Var = eVar.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        jr8 jr8Var = this.d;
        if (i == 0) {
            kotlin.b.b(obj);
            eVar.I();
            eVar.m = Long.MIN_VALUE;
            eVar.N(0.0f);
            Object value = ((s08) eVar.d).getValue();
            Object obj2 = this.c;
            float f = js3.i(obj2, value) ? -4.0f : js3.i(obj2, ((s08) wb5Var).getValue()) ? -5.0f : -3.0f;
            jr8Var.q(obj2);
            jr8Var.o(0L);
            ((s08) wb5Var).setValue(obj2);
            eVar.N(0.0f);
            eVar.s(obj2);
            jr8Var.k(f);
            if (f == -3.0f) {
                this.a = 1;
                if (e.F(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        jr8Var.j();
        return tx8.a;
    }
}
