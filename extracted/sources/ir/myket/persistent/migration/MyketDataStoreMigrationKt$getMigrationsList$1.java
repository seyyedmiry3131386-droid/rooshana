package ir.myket.persistent.migration;

import defpackage.bj6;
import defpackage.g51;
import defpackage.js3;
import defpackage.pb5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.migration.MyketDataStoreMigrationKt$getMigrationsList$1", f = "MyketDataStoreMigration.kt", l = {}, m = "invokeSuspend", v = 1)
final class MyketDataStoreMigrationKt$getMigrationsList$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MyketDataStoreMigrationKt$getMigrationsList$1 myketDataStoreMigrationKt$getMigrationsList$1 = new MyketDataStoreMigrationKt$getMigrationsList$1(2, g51Var);
        myketDataStoreMigrationKt$getMigrationsList$1.a = obj;
        return myketDataStoreMigrationKt$getMigrationsList$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyketDataStoreMigrationKt$getMigrationsList$1) create((pb5) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pb5 pb5Var = (pb5) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        ir.myket.persistent.datasource.a.m.getClass();
        bj6 bj6Var = ir.myket.persistent.datasource.a.o;
        pb5Var.getClass();
        js3.p(bj6Var, "key");
        return Boolean.valueOf(!pb5Var.a.containsKey(bj6Var));
    }
}
