package ir.mservices.market.togo;

import defpackage.e71;
import defpackage.g51;
import defpackage.ip0;
import defpackage.jp0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.togo.TogoAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$MyketInterface$isLogin$1", f = "TogoFragment.kt", l = {689}, m = "invokeSuspend", v = 1)
public final class TogoFragment$MyketInterface$isLogin$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ TogoFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$MyketInterface$isLogin$1(TogoFragment togoFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TogoFragment$MyketInterface$isLogin$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TogoFragment$MyketInterface$isLogin$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = TogoFragment.o1;
            TogoFragment togoFragment = this.b;
            togoFragment.n1().r(TogoAction.IsLoginAction.INSTANCE);
            kotlinx.coroutines.channels.a aVar = togoFragment.n1().y0;
            this.a = 1;
            aVar.getClass();
            objG = kotlinx.coroutines.channels.a.G(aVar, this);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            objG = ((jp0) obj).a;
        }
        if (objG instanceof ip0) {
            objG = Boolean.FALSE;
        }
        Boolean bool = (Boolean) objG;
        bool.getClass();
        return bool;
    }
}
