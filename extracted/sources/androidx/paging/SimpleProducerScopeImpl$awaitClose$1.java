package androidx.paging;

import defpackage.bp2;
import defpackage.ok4;
import defpackage.om0;
import defpackage.pk6;
import defpackage.pw7;
import defpackage.tb1;
import defpackage.th0;
import defpackage.tx8;
import defpackage.u61;
import defpackage.wt3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {96}, m = "awaitClose", v = 1)
final class SimpleProducerScopeImpl$awaitClose$1 extends ContinuationImpl {
    public bp2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pw7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleProducerScopeImpl$awaitClose$1(pw7 pw7Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = pw7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SimpleProducerScopeImpl$awaitClose$1 simpleProducerScopeImpl$awaitClose$1;
        Throwable th;
        bp2 bp2Var;
        this.b = obj;
        int i = this.d | Integer.MIN_VALUE;
        this.d = i;
        int i2 = i & Integer.MIN_VALUE;
        pw7 pw7Var = this.c;
        if (i2 != 0) {
            this.d = i - Integer.MIN_VALUE;
            simpleProducerScopeImpl$awaitClose$1 = this;
        } else {
            simpleProducerScopeImpl$awaitClose$1 = new SimpleProducerScopeImpl$awaitClose$1(pw7Var, this);
        }
        Object obj2 = simpleProducerScopeImpl$awaitClose$1.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = simpleProducerScopeImpl$awaitClose$1.d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bp2Var = simpleProducerScopeImpl$awaitClose$1.a;
            try {
                kotlin.b.b(obj2);
                bp2Var.invoke();
                return tx8.a;
            } catch (Throwable th2) {
                th = th2;
                bp2Var.invoke();
                throw th;
            }
        }
        kotlin.b.b(obj2);
        try {
            u61 u61VarR0 = pw7Var.a.getCoroutineContext().r0(th0.n);
            if (u61VarR0 == null) {
                throw new IllegalStateException("Internal error, context should have a job.");
            }
            simpleProducerScopeImpl$awaitClose$1.a = null;
            simpleProducerScopeImpl$awaitClose$1.d = 1;
            om0 om0Var = new om0(1, ok4.I(simpleProducerScopeImpl$awaitClose$1));
            om0Var.v();
            ((wt3) u61VarR0).s0(new pk6(om0Var, 1));
            if (om0Var.u() == coroutineSingletons) {
                return coroutineSingletons;
            }
            bp2Var = null;
            bp2Var.invoke();
            return tx8.a;
        } catch (Throwable th3) {
            th = th3;
            bp2Var = null;
            bp2Var.invoke();
            throw th;
        }
    }
}
