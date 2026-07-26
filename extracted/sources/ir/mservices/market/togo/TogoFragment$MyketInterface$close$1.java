package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$close$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$close$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ TogoFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$close$1(TogoFragment togoFragment, g51 g51Var) {
        super(2, g51Var);
        this.a = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$close$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$close$1 togoFragment$MyketInterface$close$1 = (TogoFragment$MyketInterface$close$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$close$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        int i = TogoFragment.o1;
        this.a.J0.q();
        return tx8.a;
    }
}
