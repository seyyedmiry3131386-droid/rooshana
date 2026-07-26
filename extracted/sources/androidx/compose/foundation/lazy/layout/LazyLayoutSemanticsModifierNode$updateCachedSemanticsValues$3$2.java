package androidx.compose.foundation.lazy.layout;

import defpackage.e71;
import defpackage.g51;
import defpackage.n34;
import defpackage.q34;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend", v = 1)
final class LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ q34 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(q34 q34Var, int i, g51 g51Var) {
        super(2, g51Var);
        this.b = q34Var;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        n34 n34Var = this.b.p;
        this.a = 1;
        Object objI = androidx.compose.foundation.lazy.b.i(n34Var.b, this.c, this);
        if (objI != coroutineSingletons) {
            objI = tx8Var;
        }
        return objI == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
