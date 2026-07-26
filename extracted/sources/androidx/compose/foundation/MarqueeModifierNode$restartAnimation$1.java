package androidx.compose.foundation;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.so1;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", l = {390, 391}, m = "invokeSuspend", v = 1)
final class MarqueeModifierNode$restartAnimation$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ wt3 b;
    public final /* synthetic */ k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$restartAnimation$1(wt3 wt3Var, k kVar, g51 g51Var) {
        super(2, g51Var);
        this.b = wt3Var;
        this.c = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MarqueeModifierNode$restartAnimation$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarqueeModifierNode$restartAnimation$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i == 0) {
            kotlin.b.b(obj);
            wt3 wt3Var = this.b;
            if (wt3Var != null) {
                this.a = 1;
                if (wt3Var.D(this) != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        this.a = 2;
        Object objZ = bt2.Z(so1.c, new MarqueeModifierNode$runAnimation$2(this.c, null), this);
        if (objZ != coroutineSingletons) {
            objZ = tx8Var;
        }
        return objZ == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
