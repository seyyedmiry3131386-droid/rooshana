package ir.myket.navigation.host;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.navigation.host.MyketNavDisplayHostKt$NavDisplayHost$1$1", f = "MyketNavDisplayHost.kt", l = {}, m = "invokeSuspend", v = 1)
final class MyketNavDisplayHostKt$NavDisplayHost$1$1 extends SuspendLambda implements qp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MyketNavDisplayHostKt$NavDisplayHost$1$1(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        MyketNavDisplayHostKt$NavDisplayHost$1$1 myketNavDisplayHostKt$NavDisplayHost$1$1 = (MyketNavDisplayHostKt$NavDisplayHost$1$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        myketNavDisplayHostKt$NavDisplayHost$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        return tx8.a;
    }
}
