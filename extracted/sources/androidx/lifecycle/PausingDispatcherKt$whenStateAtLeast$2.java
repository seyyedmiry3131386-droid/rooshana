package androidx.lifecycle;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.i64;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.th0;
import defpackage.tx8;
import defpackage.u54;
import defpackage.wt3;
import defpackage.y36;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend", v = 1)
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i64 c;
    public final /* synthetic */ Lifecycle$State d;
    public final /* synthetic */ SuspendLambda e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(i64 i64Var, Lifecycle$State lifecycle$State, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = i64Var;
        this.d = lifecycle$State;
        this.e = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.c, this.d, this.e, g51Var);
        pausingDispatcherKt$whenStateAtLeast$2.b = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        u54 u54Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u54Var = (u54) this.b;
            try {
                kotlin.b.b(obj);
                u54Var.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                u54Var.a();
                throw th;
            }
        }
        kotlin.b.b(obj);
        wt3 wt3Var = (wt3) ((e71) this.b).getCoroutineContext().r0(th0.n);
        if (wt3Var == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        y36 y36Var = new y36();
        u54 u54Var2 = new u54(this.c, this.d, y36Var.c, wt3Var);
        try {
            ?? r8 = this.e;
            this.b = u54Var2;
            this.a = 1;
            obj = bt2.Z(y36Var, r8, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            u54Var = u54Var2;
            u54Var.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            u54Var = u54Var2;
            u54Var.a();
            throw th;
        }
    }
}
