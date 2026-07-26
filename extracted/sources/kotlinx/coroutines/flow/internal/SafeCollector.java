package kotlinx.coroutines.flow.internal;

import defpackage.f71;
import defpackage.g51;
import defpackage.g66;
import defpackage.g8;
import defpackage.g88;
import defpackage.js3;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.w61;
import defpackage.yn5;
import defpackage.ze2;
import defpackage.zt1;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SafeCollector<T> extends ContinuationImpl implements ze2 {
    public final ze2 a;
    public final w61 b;
    public final int c;
    public w61 d;
    public g51 e;

    public SafeCollector(ze2 ze2Var, w61 w61Var) {
        super(yn5.a, EmptyCoroutineContext.a);
        this.a = ze2Var;
        this.b = w61Var;
        this.c = ((Number) w61Var.J(new g66(23), 0)).intValue();
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        try {
            Object objL = l(g51Var, obj);
            return objL == CoroutineSingletons.a ? objL : tx8.a;
        } catch (Throwable th) {
            this.d = new zt1(g51Var.getContext(), th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, defpackage.f71
    public final f71 getCallerFrame() {
        g51 g51Var = this.e;
        if (g51Var instanceof f71) {
            return (f71) g51Var;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, defpackage.g51
    public final w61 getContext() {
        w61 w61Var = this.d;
        return w61Var == null ? EmptyCoroutineContext.a : w61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            this.d = new zt1(getContext(), thA);
        }
        g51 g51Var = this.e;
        if (g51Var != null) {
            g51Var.resumeWith(obj);
        }
        return CoroutineSingletons.a;
    }

    public final Object l(g51 g51Var, Object obj) {
        w61 context = g51Var.getContext();
        kotlinx.coroutines.a.f(context);
        w61 w61Var = this.d;
        if (w61Var != context) {
            if (w61Var instanceof zt1) {
                throw new IllegalStateException(g88.O("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((zt1) w61Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.J(new g8(21, this), 0)).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = g51Var;
        rp2 rp2Var = l.a;
        ze2 ze2Var = this.a;
        js3.n(ze2Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objA = rp2Var.a(ze2Var, obj, this);
        if (!js3.i(objA, CoroutineSingletons.a)) {
            this.e = null;
        }
        return objA;
    }
}
