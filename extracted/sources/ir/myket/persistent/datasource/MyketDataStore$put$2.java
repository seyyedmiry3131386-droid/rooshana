package ir.myket.persistent.datasource;

import defpackage.bj6;
import defpackage.g51;
import defpackage.pb5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.datasource.MyketDataStore$put$2", f = "MyketDataStore.kt", l = {}, m = "invokeSuspend", v = 1)
final class MyketDataStore$put$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bj6 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketDataStore$put$2(bj6 bj6Var, String str, g51 g51Var) {
        super(2, g51Var);
        this.b = bj6Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MyketDataStore$put$2 myketDataStore$put$2 = new MyketDataStore$put$2(this.b, this.c, g51Var);
        myketDataStore$put$2.a = obj;
        return myketDataStore$put$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        MyketDataStore$put$2 myketDataStore$put$2 = (MyketDataStore$put$2) create((pb5) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        myketDataStore$put$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pb5 pb5Var = (pb5) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        pb5Var.e(this.b, this.c);
        return tx8.a;
    }
}
