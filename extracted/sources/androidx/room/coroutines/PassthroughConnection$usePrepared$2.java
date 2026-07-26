package androidx.room.coroutines;

import defpackage.dp2;
import defpackage.g51;
import defpackage.m91;
import defpackage.rb7;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
final class PassthroughConnection$usePrepared$2 extends SuspendLambda implements dp2 {
    public final /* synthetic */ b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ dp2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$usePrepared$2(b bVar, String str, dp2 dp2Var, g51 g51Var) {
        super(1, g51Var);
        this.a = bVar;
        this.b = str;
        this.c = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PassthroughConnection$usePrepared$2(this.a, this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PassthroughConnection$usePrepared$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        rb7 rb7VarM1 = this.a.b.m1(this.b);
        try {
            Object objInvoke = this.c.invoke(rb7VarM1);
            m91.i(rb7VarM1, null);
            return objInvoke;
        } finally {
        }
    }
}
