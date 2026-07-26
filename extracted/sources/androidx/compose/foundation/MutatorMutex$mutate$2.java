package androidx.compose.foundation;

import defpackage.bc5;
import defpackage.dc5;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.th0;
import defpackage.tx8;
import defpackage.u61;
import defpackage.wt3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {212, 127}, m = "invokeSuspend", v = 1)
final class MutatorMutex$mutate$2 extends SuspendLambda implements qp2 {
    public dc5 a;
    public Object b;
    public l c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ MutatePriority f;
    public final /* synthetic */ l g;
    public final /* synthetic */ SuspendLambda h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, l lVar, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.f = mutatePriority;
        this.g = lVar;
        this.h = (SuspendLambda) dp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f, this.g, this.h, g51Var);
        mutatorMutex$mutate$2.e = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutate$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [dc5, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [dp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l lVar;
        dc5 dc5Var;
        ?? r3;
        bc5 bc5Var;
        dc5 dc5Var2;
        l lVar2;
        Throwable th;
        bc5 bc5Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    u61 u61VarR0 = ((e71) this.e).getCoroutineContext().r0(th0.n);
                    js3.m(u61VarR0);
                    bc5 bc5Var3 = new bc5(this.f, (wt3) u61VarR0);
                    lVar = this.g;
                    l.a(lVar, bc5Var3);
                    dc5Var = lVar.b;
                    this.e = bc5Var3;
                    this.a = dc5Var;
                    SuspendLambda suspendLambda = this.h;
                    this.b = suspendLambda;
                    this.c = lVar;
                    this.d = 1;
                    if (dc5Var.b(this) != coroutineSingletons) {
                        r3 = suspendLambda;
                        bc5Var = bc5Var3;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar2 = (l) this.b;
                    dc5Var2 = this.a;
                    bc5Var2 = (bc5) this.e;
                    try {
                        kotlin.b.b(obj);
                        atomicReference2 = lVar2.a;
                        while (!atomicReference2.compareAndSet(bc5Var2, null) && atomicReference2.get() == bc5Var2) {
                        }
                        dc5Var2.d(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = lVar2.a;
                        while (!atomicReference.compareAndSet(bc5Var2, null)) {
                        }
                        throw th;
                    }
                }
                l lVar3 = this.c;
                dp2 dp2Var = (dp2) this.b;
                dc5Var = this.a;
                bc5Var = (bc5) this.e;
                kotlin.b.b(obj);
                lVar = lVar3;
                r3 = dp2Var;
                this.e = bc5Var;
                this.a = dc5Var2;
                this.b = lVar;
                this.c = null;
                this.d = 2;
                Object objInvoke = r3.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    lVar2 = lVar;
                    obj = objInvoke;
                    bc5Var2 = bc5Var;
                    atomicReference2 = lVar2.a;
                    while (!atomicReference2.compareAndSet(bc5Var2, null)) {
                    }
                    dc5Var2.d(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                lVar2 = lVar;
                th = th3;
                bc5Var2 = bc5Var;
                atomicReference = lVar2.a;
                while (!atomicReference.compareAndSet(bc5Var2, null) && atomicReference.get() == bc5Var2) {
                }
                throw th;
            }
            dc5Var2 = dc5Var;
        } catch (Throwable th4) {
            r1.d(null);
            throw th4;
        }
    }
}
