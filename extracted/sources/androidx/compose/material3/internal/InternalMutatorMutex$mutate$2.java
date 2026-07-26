package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import defpackage.as3;
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
import defpackage.zr3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {179, 103}, m = "invokeSuspend")
final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements qp2 {
    public dc5 a;
    public Object b;
    public as3 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ MutatePriority f;
    public final /* synthetic */ as3 g;
    public final /* synthetic */ SuspendLambda h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, as3 as3Var, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.f = mutatePriority;
        this.g = as3Var;
        this.h = (SuspendLambda) dp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.f, this.g, this.h, g51Var);
        internalMutatorMutex$mutate$2.e = obj;
        return internalMutatorMutex$mutate$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InternalMutatorMutex$mutate$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [dc5, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [dp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        as3 as3Var;
        dc5 dc5Var;
        ?? r3;
        zr3 zr3Var;
        dc5 dc5Var2;
        as3 as3Var2;
        Throwable th;
        zr3 zr3Var2;
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
                    zr3 zr3Var3 = new zr3(this.f, (wt3) u61VarR0);
                    as3Var = this.g;
                    AtomicReference atomicReference3 = as3Var.a;
                    while (true) {
                        zr3 zr3Var4 = (zr3) atomicReference3.get();
                        if (zr3Var4 != null && zr3Var3.a.compareTo(zr3Var4.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(zr3Var4, zr3Var3)) {
                            if (atomicReference3.get() != zr3Var4) {
                                break;
                            }
                        }
                        if (zr3Var4 != null) {
                            zr3Var4.b.g(null);
                        }
                        dc5Var = as3Var.b;
                        this.e = zr3Var3;
                        this.a = dc5Var;
                        SuspendLambda suspendLambda = this.h;
                        this.b = suspendLambda;
                        this.c = as3Var;
                        this.d = 1;
                        if (dc5Var.b(this) != coroutineSingletons) {
                            r3 = suspendLambda;
                            zr3Var = zr3Var3;
                        }
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    as3Var2 = (as3) this.b;
                    dc5Var2 = this.a;
                    zr3Var2 = (zr3) this.e;
                    try {
                        kotlin.b.b(obj);
                        atomicReference2 = as3Var2.a;
                        while (!atomicReference2.compareAndSet(zr3Var2, null) && atomicReference2.get() == zr3Var2) {
                        }
                        dc5Var2.d(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = as3Var2.a;
                        while (!atomicReference.compareAndSet(zr3Var2, null)) {
                        }
                        throw th;
                    }
                }
                as3 as3Var3 = this.c;
                dp2 dp2Var = (dp2) this.b;
                dc5Var = this.a;
                zr3Var = (zr3) this.e;
                kotlin.b.b(obj);
                as3Var = as3Var3;
                r3 = dp2Var;
                this.e = zr3Var;
                this.a = dc5Var2;
                this.b = as3Var;
                this.c = null;
                this.d = 2;
                Object objInvoke = r3.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    as3Var2 = as3Var;
                    obj = objInvoke;
                    zr3Var2 = zr3Var;
                    atomicReference2 = as3Var2.a;
                    while (!atomicReference2.compareAndSet(zr3Var2, null)) {
                    }
                    dc5Var2.d(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                as3Var2 = as3Var;
                th = th3;
                zr3Var2 = zr3Var;
                atomicReference = as3Var2.a;
                while (!atomicReference.compareAndSet(zr3Var2, null) && atomicReference.get() == zr3Var2) {
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
