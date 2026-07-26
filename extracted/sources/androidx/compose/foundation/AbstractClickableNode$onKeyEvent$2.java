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
@tb1(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", l = {1559}, m = "invokeSuspend", v = 1)
final class AbstractClickableNode$onKeyEvent$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ rj6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$2(a aVar, rj6 rj6Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = rj6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AbstractClickableNode$onKeyEvent$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$onKeyEvent$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ab5 ab5Var = this.b.q;
            if (ab5Var != null) {
                sj6 sj6Var = new sj6(this.c);
                this.a = 1;
                if (ab5Var.a(sj6Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
