package ir.myket.callback.data.repositories;

import defpackage.bn5;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rl0;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xl0;
import defpackage.zm5;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$sendCallbackUrl$$inlined$safeCall$default$1", f = "CallbackUrlRepositoryImpl.kt", l = {103}, m = "invokeSuspend", v = 1)
public final class CallbackUrlRepositoryImpl$sendCallbackUrl$$inlined$safeCall$default$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ xl0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackUrlRepositoryImpl$sendCallbackUrl$$inlined$safeCall$default$1(g51 g51Var, xl0 xl0Var, String str) {
        super(2, g51Var);
        this.b = xl0Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CallbackUrlRepositoryImpl$sendCallbackUrl$$inlined$safeCall$default$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CallbackUrlRepositoryImpl$sendCallbackUrl$$inlined$safeCall$default$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        try {
            if (i == 0) {
                b.b(obj);
                rl0 rl0Var = this.b.a;
                String str = this.c;
                this.a = 1;
                if (rl0Var.a(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return new bn5(tx8.a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            return new zm5(js3.B(th));
        }
    }
}
