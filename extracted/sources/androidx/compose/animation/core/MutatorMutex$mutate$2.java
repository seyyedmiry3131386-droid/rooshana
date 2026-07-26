package androidx.compose.animation.core;

import defpackage.cc5;
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
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, 126}, m = "invokeSuspend", v = 1)
final class MutatorMutex$mutate$2 extends SuspendLambda implements qp2 {
    public dc5 a;
    public Object b;
    public d c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ d f;
    public final /* synthetic */ SuspendLambda g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(d dVar, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        MutatePriority mutatePriority = MutatePriority.a;
        this.f = dVar;
        this.g = (SuspendLambda) dp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MutatePriority mutatePriority = MutatePriority.a;
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f, this.g, g51Var);
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
        d dVar;
        dc5 dc5Var;
        ?? r3;
        cc5 cc5Var;
        dc5 dc5Var2;
        d dVar2;
        Throwable th;
        cc5 cc5Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    e71 e71Var = (e71) this.e;
                    MutatePriority mutatePriority = MutatePriority.a;
                    u61 u61VarR0 = e71Var.getCoroutineContext().r0(th0.n);
                    js3.m(u61VarR0);
                    cc5 cc5Var3 = new cc5((wt3) u61VarR0);
                    dVar = this.f;
                    AtomicReference atomicReference3 = dVar.a;
                    while (true) {
                        cc5 cc5Var4 = (cc5) atomicReference3.get();
                        if (cc5Var4 != null) {
                            MutatePriority mutatePriority2 = MutatePriority.a;
                            if (mutatePriority2.compareTo(mutatePriority2) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(cc5Var4, cc5Var3)) {
                            if (atomicReference3.get() != cc5Var4) {
                                break;
                            }
                        }
                        if (cc5Var4 != null) {
                            cc5Var4.a.g(new MutationInterruptedException());
                        }
                        dc5Var = dVar.b;
                        this.e = cc5Var3;
                        this.a = dc5Var;
                        SuspendLambda suspendLambda = this.g;
                        this.b = suspendLambda;
                        this.c = dVar;
                        this.d = 1;
                        if (dc5Var.b(this) != coroutineSingletons) {
                            r3 = suspendLambda;
                            cc5Var = cc5Var3;
                        }
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar2 = (d) this.b;
                    dc5Var2 = this.a;
                    cc5Var2 = (cc5) this.e;
                    try {
                        kotlin.b.b(obj);
                        atomicReference2 = dVar2.a;
                        while (!atomicReference2.compareAndSet(cc5Var2, null) && atomicReference2.get() == cc5Var2) {
                        }
                        dc5Var2.d(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = dVar2.a;
                        while (!atomicReference.compareAndSet(cc5Var2, null)) {
                        }
                        throw th;
                    }
                }
                d dVar3 = this.c;
                dp2 dp2Var = (dp2) this.b;
                dc5Var = this.a;
                cc5Var = (cc5) this.e;
                kotlin.b.b(obj);
                dVar = dVar3;
                r3 = dp2Var;
                this.e = cc5Var;
                this.a = dc5Var2;
                this.b = dVar;
                this.c = null;
                this.d = 2;
                Object objInvoke = r3.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    dVar2 = dVar;
                    obj = objInvoke;
                    cc5Var2 = cc5Var;
                    atomicReference2 = dVar2.a;
                    while (!atomicReference2.compareAndSet(cc5Var2, null)) {
                    }
                    dc5Var2.d(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                dVar2 = dVar;
                th = th3;
                cc5Var2 = cc5Var;
                atomicReference = dVar2.a;
                while (!atomicReference.compareAndSet(cc5Var2, null) && atomicReference.get() == cc5Var2) {
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
