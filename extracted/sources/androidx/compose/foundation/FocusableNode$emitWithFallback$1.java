package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.bq1;
import defpackage.e71;
import defpackage.g51;
import defpackage.gr3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {322}, m = "invokeSuspend", v = 1)
final class FocusableNode$emitWithFallback$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ab5 b;
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ bq1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$1(ab5 ab5Var, gr3 gr3Var, bq1 bq1Var, g51 g51Var) {
        super(2, g51Var);
        this.b = ab5Var;
        this.c = gr3Var;
        this.d = bq1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FocusableNode$emitWithFallback$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FocusableNode$emitWithFallback$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (this.b.a(this.c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        bq1 bq1Var = this.d;
        if (bq1Var != null) {
            bq1Var.a();
        }
        return tx8.a;
    }
}
