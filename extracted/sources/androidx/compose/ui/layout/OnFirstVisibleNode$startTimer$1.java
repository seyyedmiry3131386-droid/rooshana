package androidx.compose.ui.layout;

import defpackage.bl8;
import defpackage.e71;
import defpackage.g51;
import defpackage.li1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.layout.OnFirstVisibleNode$startTimer$1", f = "OnFirstVisibleModifier.kt", l = {179}, m = "invokeSuspend", v = 1)
final class OnFirstVisibleNode$startTimer$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnFirstVisibleNode$startTimer$1(i iVar, g51 g51Var) {
        super(2, g51Var);
        this.b = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new OnFirstVisibleNode$startTimer$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((OnFirstVisibleNode$startTimer$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (kotlinx.coroutines.a.e(0L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        i iVar = this.b;
        bl8 bl8Var = iVar.p;
        if (bl8Var != null) {
            bl8Var.b();
        }
        li1 li1Var = iVar.q;
        if (li1Var != null) {
            li1Var.g(null);
        }
        iVar.o.invoke();
        return tx8.a;
    }
}
