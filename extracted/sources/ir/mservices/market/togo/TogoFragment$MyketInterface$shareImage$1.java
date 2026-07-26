package ir.mservices.market.togo;

import androidx.fragment.app.FragmentActivity;
import defpackage.f57;
import defpackage.f88;
import defpackage.g51;
import defpackage.ne5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vm8;
import ir.mservices.market.togo.TogoFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$shareImage$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$shareImage$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TogoFragment.MyketInterface c;
    public final /* synthetic */ String d;
    public final /* synthetic */ TogoFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$shareImage$1(String str, TogoFragment.MyketInterface myketInterface, String str2, TogoFragment togoFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = str;
        this.c = myketInterface;
        this.d = str2;
        this.e = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TogoFragment$MyketInterface$shareImage$1 togoFragment$MyketInterface$shareImage$1 = new TogoFragment$MyketInterface$shareImage$1(this.b, this.c, this.d, this.e, g51Var);
        togoFragment$MyketInterface$shareImage$1.a = obj;
        return togoFragment$MyketInterface$shareImage$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TogoFragment$MyketInterface$shareImage$1 togoFragment$MyketInterface$shareImage$1 = (TogoFragment$MyketInterface$shareImage$1) create((FragmentActivity) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        togoFragment$MyketInterface$shareImage$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        tx8 tx8Var = tx8.a;
        TogoFragment.MyketInterface myketInterface = this.c;
        String str = this.d;
        String str2 = this.b;
        if (str2 == null || f88.n0(str2)) {
            myketInterface.shareText(str);
            return tx8Var;
        }
        TogoFragment togoFragment = this.e;
        f57 f57VarS = com.bumptech.glide.a.b(togoFragment.H()).d(togoFragment).m().S(new ne5(str2, null));
        f57VarS.Q(new vm8(togoFragment, fragmentActivity, str, myketInterface), f57VarS);
        return tx8Var;
    }
}
