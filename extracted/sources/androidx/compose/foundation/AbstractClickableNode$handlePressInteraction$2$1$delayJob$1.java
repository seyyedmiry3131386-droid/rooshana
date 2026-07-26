package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.e71;
import defpackage.g51;
import defpackage.it0;
import defpackage.qp2;
import defpackage.rj6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1744, 1747}, m = "invokeSuspend", v = 1)
final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements qp2 {
    public rj6 a;
    public int b;
    public final /* synthetic */ a c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ab5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(a aVar, long j, ab5 ab5Var, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
        this.d = j;
        this.e = ab5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rj6 rj6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        a aVar = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            if (aVar.H0()) {
                long j = it0.a;
                this.b = 1;
                if (kotlinx.coroutines.a.e(j, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rj6Var = this.a;
                kotlin.b.b(obj);
                aVar.B = rj6Var;
                return tx8.a;
            }
            kotlin.b.b(obj);
        }
        rj6 rj6Var2 = new rj6(this.d);
        this.a = rj6Var2;
        this.b = 2;
        if (this.e.a(rj6Var2, this) != coroutineSingletons) {
            rj6Var = rj6Var2;
            aVar.B = rj6Var;
            return tx8.a;
        }
        return coroutineSingletons;
    }
}
