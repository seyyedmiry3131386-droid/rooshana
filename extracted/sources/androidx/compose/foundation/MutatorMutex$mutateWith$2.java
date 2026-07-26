package androidx.compose.foundation;

import defpackage.bc5;
import defpackage.dc5;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.th0;
import defpackage.tx8;
import defpackage.u61;
import defpackage.wt3;
import defpackage.xg1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {212, 167}, m = "invokeSuspend", v = 1)
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements qp2 {
    public dc5 a;
    public Object b;
    public xg1 c;
    public l d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MutatePriority g;
    public final /* synthetic */ l h;
    public final /* synthetic */ qp2 i;
    public final /* synthetic */ xg1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, l lVar, qp2 qp2Var, xg1 xg1Var, g51 g51Var) {
        super(2, g51Var);
        this.g = mutatePriority;
        this.h = lVar;
        this.i = qp2Var;
        this.j = xg1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.g, this.h, this.i, this.j, g51Var);
        mutatorMutex$mutateWith$2.f = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutateWith$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dc5, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l lVar;
        xg1 xg1Var;
        bc5 bc5Var;
        dc5 dc5Var;
        qp2 qp2Var;
        l lVar2;
        Throwable th;
        bc5 bc5Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        ?? r1 = this.e;
        try {
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    u61 u61VarR0 = ((e71) this.f).getCoroutineContext().r0(th0.n);
                    js3.m(u61VarR0);
                    bc5 bc5Var3 = new bc5(this.g, (wt3) u61VarR0);
                    lVar = this.h;
                    l.a(lVar, bc5Var3);
                    kotlinx.coroutines.sync.a aVar = lVar.b;
                    this.f = bc5Var3;
                    this.a = aVar;
                    qp2 qp2Var2 = this.i;
                    this.b = qp2Var2;
                    xg1 xg1Var2 = this.j;
                    this.c = xg1Var2;
                    this.d = lVar;
                    this.e = 1;
                    if (aVar.b(this) != coroutineSingletons) {
                        xg1Var = xg1Var2;
                        bc5Var = bc5Var3;
                        dc5Var = aVar;
                        qp2Var = qp2Var2;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar2 = (l) this.b;
                    dc5Var = this.a;
                    bc5Var2 = (bc5) this.f;
                    try {
                        kotlin.b.b(obj);
                        atomicReference2 = lVar2.a;
                        while (!atomicReference2.compareAndSet(bc5Var2, null) && atomicReference2.get() == bc5Var2) {
                        }
                        dc5Var.d(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = lVar2.a;
                        while (!atomicReference.compareAndSet(bc5Var2, null)) {
                        }
                        throw th;
                    }
                }
                l lVar3 = this.d;
                xg1Var = this.c;
                qp2Var = (qp2) this.b;
                dc5 dc5Var2 = this.a;
                bc5Var = (bc5) this.f;
                kotlin.b.b(obj);
                lVar = lVar3;
                dc5Var = dc5Var2;
                this.f = bc5Var;
                this.a = dc5Var;
                this.b = lVar;
                this.c = null;
                this.d = null;
                this.e = 2;
                Object objInvoke = qp2Var.invoke(xg1Var, this);
                if (objInvoke != coroutineSingletons) {
                    lVar2 = lVar;
                    obj = objInvoke;
                    bc5Var2 = bc5Var;
                    atomicReference2 = lVar2.a;
                    while (!atomicReference2.compareAndSet(bc5Var2, null)) {
                    }
                    dc5Var.d(null);
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
        } catch (Throwable th4) {
            r1.d(null);
            throw th4;
        }
    }
}
