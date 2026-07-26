package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.dp3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$uninstall$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$uninstall$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ TogoFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$uninstall$1(g51 g51Var, TogoFragment togoFragment, String str) {
        super(2, g51Var);
        this.a = str;
        this.b = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$uninstall$1(g51Var, this.b, this.a);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$uninstall$1 togoFragment$MyketInterface$uninstall$1 = (TogoFragment$MyketInterface$uninstall$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$uninstall$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        String str = this.a;
        if (str != null) {
            if ((!f88.n0(str) ? str : null) != null) {
                dp3 dp3Var = this.b.V0;
                if (dp3Var == null) {
                    js3.V("installManager");
                    throw null;
                }
                dp3Var.Q(str);
            }
        }
        return tx8.a;
    }
}
