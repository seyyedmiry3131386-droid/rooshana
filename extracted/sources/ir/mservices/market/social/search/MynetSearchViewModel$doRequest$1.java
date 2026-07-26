package ir.mservices.market.social.search;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.search.MynetSearchAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.search.MynetSearchViewModel$doRequest$1", f = "MynetSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class MynetSearchViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ MynetSearchViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MynetSearchViewModel$doRequest$1(MynetSearchViewModel mynetSearchViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = mynetSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MynetSearchViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        MynetSearchViewModel$doRequest$1 mynetSearchViewModel$doRequest$1 = (MynetSearchViewModel$doRequest$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        mynetSearchViewModel$doRequest$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        MynetSearchViewModel mynetSearchViewModel = this.a;
        if (mynetSearchViewModel.w.a.getValue() == null) {
            mynetSearchViewModel.onFirstCallAction(new MynetSearchAction.FirstCallAction(true));
        }
        return tx8.a;
    }
}
