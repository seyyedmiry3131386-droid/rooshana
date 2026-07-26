package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.bt5;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rn8;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.activity.BaseContentActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$changeTitle$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$changeTitle$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$changeTitle$1(String str, g51 g51Var) {
        super(2, g51Var);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TogoFragment$MyketInterface$changeTitle$1 togoFragment$MyketInterface$changeTitle$1 = new TogoFragment$MyketInterface$changeTitle$1(this.b, g51Var);
        togoFragment$MyketInterface$changeTitle$1.a = obj;
        return togoFragment$MyketInterface$changeTitle$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$changeTitle$1 togoFragment$MyketInterface$changeTitle$1 = (TogoFragment$MyketInterface$changeTitle$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$changeTitle$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bt5 bt5Var = (FragmentActivity) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        rn8 rn8Var = bt5Var instanceof rn8 ? (rn8) bt5Var : null;
        if (rn8Var != null) {
            String str = this.b;
            if (str == null) {
                str = "";
            }
            ((BaseContentActivity) rn8Var).c0(str);
        }
        return tx8.a;
    }
}
