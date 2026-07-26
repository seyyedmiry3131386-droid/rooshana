package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.au7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$shareText$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$shareText$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ TogoFragment a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$shareText$1(g51 g51Var, TogoFragment togoFragment, String str) {
        super(2, g51Var);
        this.a = togoFragment;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$shareText$1(g51Var, this.a, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$shareText$1 togoFragment$MyketInterface$shareText$1 = (TogoFragment$MyketInterface$shareText$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$shareText$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        FragmentActivity fragmentActivityF = this.a.F();
        String str = this.b;
        if (str == null) {
            str = "";
        }
        au7.a(fragmentActivityF, str, new v7(27));
        return tx8.a;
    }
}
