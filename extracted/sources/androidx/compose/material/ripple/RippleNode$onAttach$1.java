package androidx.compose.material.ripple;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend", v = 1)
final class RippleNode$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ RippleNode c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1(RippleNode rippleNode, g51 g51Var) {
        super(2, g51Var);
        this.c = rippleNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        RippleNode$onAttach$1 rippleNode$onAttach$1 = new RippleNode$onAttach$1(this.c, g51Var);
        rippleNode$onAttach$1.b = obj;
        return rippleNode$onAttach$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleNode$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8.a;
        }
        b.b(obj);
        e71 e71Var = (e71) this.b;
        RippleNode rippleNode = this.c;
        i iVar = rippleNode.o.a;
        a aVar = new a(rippleNode, e71Var);
        this.a = 1;
        iVar.a(aVar, this);
        return coroutineSingletons;
    }
}
