package ir.myket.callback.data.repositories;

import androidx.room.util.a;
import defpackage.e71;
import defpackage.g51;
import defpackage.m;
import defpackage.mb1;
import defpackage.ob1;
import defpackage.ql0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ul0;
import defpackage.vl0;
import defpackage.xl0;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$insertCallbackUrl$$inlined$safeDbCall$default$1", f = "CallbackUrlRepositoryImpl.kt", l = {57}, m = "invokeSuspend", v = 1)
public final class CallbackUrlRepositoryImpl$insertCallbackUrl$$inlined$safeDbCall$default$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ xl0 b;
    public final /* synthetic */ ql0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackUrlRepositoryImpl$insertCallbackUrl$$inlined$safeDbCall$default$1(g51 g51Var, xl0 xl0Var, ql0 ql0Var) {
        super(2, g51Var);
        this.b = xl0Var;
        this.c = ql0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CallbackUrlRepositoryImpl$insertCallbackUrl$$inlined$safeDbCall$default$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CallbackUrlRepositoryImpl$insertCallbackUrl$$inlined$safeDbCall$default$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        try {
            if (i == 0) {
                b.b(obj);
                ul0 ul0Var = this.b.b;
                ql0 ql0Var = this.c;
                vl0 vl0Var = new vl0(0, ql0Var.a, ql0Var.b.name(), ql0Var.c, System.currentTimeMillis());
                this.a = 1;
                Object objB = a.b(this, new m(ul0Var, vl0Var, 11), ul0Var.a, false, true);
                if (objB != coroutineSingletons) {
                    objB = tx8Var;
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return new ob1(tx8Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            return new mb1(th);
        }
    }
}
