package ir.myket.analytics.spix.data.repository;

import defpackage.a38;
import defpackage.bn5;
import defpackage.cw3;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.kv3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.x28;
import defpackage.z28;
import defpackage.zm5;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.analytics.spix.data.repository.SpixRepositoryImpl$sendSpixLog$$inlined$safeCall$default$1", f = "SpixRepositoryImpl.kt", l = {103}, m = "invokeSuspend", v = 1)
public final class SpixRepositoryImpl$sendSpixLog$$inlined$safeCall$default$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ z28 b;
    public final /* synthetic */ a38 c;
    public final /* synthetic */ kv3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpixRepositoryImpl$sendSpixLog$$inlined$safeCall$default$1(g51 g51Var, z28 z28Var, a38 a38Var, kv3 kv3Var) {
        super(2, g51Var);
        this.b = z28Var;
        this.c = a38Var;
        this.d = kv3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SpixRepositoryImpl$sendSpixLog$$inlined$safeCall$default$1(g51Var, this.b, this.c, this.d);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SpixRepositoryImpl$sendSpixLog$$inlined$safeCall$default$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a38 a38Var = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        try {
            if (i == 0) {
                b.b(obj);
                x28 x28Var = this.b.a;
                String strB = a38Var.b();
                cw3 cw3Var = new cw3(kotlin.collections.b.N(new Pair(a38Var.a(), a38Var.c()), new Pair("user", this.d)));
                this.a = 1;
                if (x28Var.a(strB, cw3Var, this) == coroutineSingletons) {
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
