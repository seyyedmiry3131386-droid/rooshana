package ir.myket.persistent.datasource;

import defpackage.bj6;
import defpackage.e71;
import defpackage.eb1;
import defpackage.g51;
import defpackage.pb5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.datasource.MyketDataStoreDelegate$get$1", f = "MyketDataStoreDelegate.kt", l = {36}, m = "invokeSuspend", v = 1)
final class MyketDataStoreDelegate$get$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ eb1 b;
    public final /* synthetic */ bj6 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketDataStoreDelegate$get$1(g51 g51Var, eb1 eb1Var, bj6 bj6Var, Object obj) {
        super(2, g51Var);
        this.b = eb1Var;
        this.c = bj6Var;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MyketDataStoreDelegate$get$1(g51Var, this.b, this.c, this.d);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyketDataStoreDelegate$get$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            xe2 xe2VarB = this.b.b();
            this.a = 1;
            obj = d.q(xe2VarB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        Object objC = ((pb5) obj).c(this.c);
        return objC == null ? this.d : objC;
    }
}
