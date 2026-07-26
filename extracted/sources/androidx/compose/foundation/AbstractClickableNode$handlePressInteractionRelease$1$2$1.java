package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rj6;
import defpackage.sj6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$2$1", f = "Clickable.kt", l = {1686}, m = "invokeSuspend", v = 1)
final class AbstractClickableNode$handlePressInteractionRelease$1$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ rj6 b;
    public final /* synthetic */ ab5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$2$1(g51 g51Var, ab5 ab5Var, rj6 rj6Var) {
        super(2, g51Var);
        this.b = rj6Var;
        this.c = ab5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AbstractClickableNode$handlePressInteractionRelease$1$2$1(g51Var, this.c, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteractionRelease$1$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            sj6 sj6Var = new sj6(this.b);
            this.a = 1;
            if (this.c.a(sj6Var, this) == coroutineSingletons) {
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
