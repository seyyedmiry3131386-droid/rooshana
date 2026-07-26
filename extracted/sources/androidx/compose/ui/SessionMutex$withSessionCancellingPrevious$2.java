package androidx.compose.ui;

import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import defpackage.zp7;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend", v = 1)
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ AtomicReference d;
    public final /* synthetic */ qp2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(dp2 dp2Var, AtomicReference atomicReference, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = dp2Var;
        this.d = atomicReference;
        this.e = qp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.c, this.d, this.e, g51Var);
        sessionMutex$withSessionCancellingPrevious$2.b = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        zp7 zp7Var;
        zp7 zp7Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        AtomicReference atomicReference = this.d;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e71 e71Var = (e71) this.b;
                zp7Var = new zp7(kotlinx.coroutines.a.h(e71Var.getCoroutineContext()), this.c.invoke(e71Var));
                zp7 zp7Var3 = (zp7) atomicReference.getAndSet(zp7Var);
                if (zp7Var3 != null) {
                    wt3 wt3Var = zp7Var3.a;
                    this.b = zp7Var;
                    this.a = 1;
                    if (kotlinx.coroutines.a.d(wt3Var, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zp7Var2 = (zp7) this.b;
                    try {
                        kotlin.b.b(obj);
                        while (!atomicReference.compareAndSet(zp7Var2, null) && atomicReference.get() == zp7Var2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(zp7Var2, null)) {
                        }
                        throw th;
                    }
                }
                zp7Var = (zp7) this.b;
                kotlin.b.b(obj);
            }
            qp2 qp2Var = this.e;
            Object obj2 = zp7Var.b;
            this.b = zp7Var;
            this.a = 2;
            obj = qp2Var.invoke(obj2, this);
            if (obj != coroutineSingletons) {
                zp7Var2 = zp7Var;
                while (!atomicReference.compareAndSet(zp7Var2, null)) {
                }
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            zp7Var2 = zp7Var;
            while (!atomicReference.compareAndSet(zp7Var2, null) && atomicReference.get() == zp7Var2) {
            }
            throw th;
        }
    }
}
