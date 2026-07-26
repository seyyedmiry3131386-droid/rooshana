package ir.mservices.market.togo;

import defpackage.dp2;
import defpackage.g51;
import defpackage.pt1;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$onViewCreated$7", f = "TogoFragment.kt", l = {420}, m = "invokeSuspend", v = 1)
final class TogoFragment$onViewCreated$7 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ TogoFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$onViewCreated$7(TogoFragment togoFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new TogoFragment$onViewCreated$7(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((TogoFragment$onViewCreated$7) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        int i2 = TogoFragment.o1;
        TogoFragment togoFragment = this.b;
        rv6 rv6Var = togoFragment.n1().P;
        a aVar = new a(togoFragment);
        this.a = 1;
        Object objA = rv6Var.a.a(new pt1(aVar, 3), this);
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
