package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends c implements g51, e71 {
    public final w61 c;

    public r(w61 w61Var, boolean z) {
        super(z);
        Q((wt3) w61Var.r0(th0.n));
        this.c = w61Var.l0(this);
    }

    @Override // kotlinx.coroutines.c
    public final void O(CompletionHandlerException completionHandlerException) {
        is3.w(this.c, completionHandlerException);
    }

    @Override // kotlinx.coroutines.c
    public final void a0(Object obj) {
        if (!(obj instanceof rx0)) {
            j0(obj);
        } else {
            rx0 rx0Var = (rx0) obj;
            i0(rx0Var.a, rx0.b.get(rx0Var) == 1);
        }
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return this.c;
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        return this.c;
    }

    public final void m0(CoroutineStart coroutineStart, r rVar, qp2 qp2Var) {
        Object objInvoke;
        int iOrdinal = coroutineStart.ordinal();
        tx8 tx8Var = tx8.a;
        if (iOrdinal == 0) {
            try {
                dy3.K(ok4.I(ok4.x(rVar, this, qp2Var)), tx8Var);
                return;
            } finally {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).a;
                }
                resumeWith(b.a(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                js3.p(qp2Var, "<this>");
                ok4.I(ok4.x(rVar, this, qp2Var)).resumeWith(tx8Var);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                w61 w61Var = this.c;
                Object objP = is3.P(w61Var, null);
                try {
                    if (qp2Var instanceof BaseContinuationImpl) {
                        wu8.i(2, qp2Var);
                        objInvoke = qp2Var.invoke(rVar, this);
                    } else {
                        objInvoke = ok4.a0(qp2Var, rVar, this);
                    }
                    is3.H(w61Var, objP);
                    if (objInvoke != CoroutineSingletons.a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    is3.H(w61Var, objP);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new rx0(thA, false);
        }
        Object objW = W(obj);
        if (objW == at2.n) {
            return;
        }
        r(objW);
    }

    @Override // kotlinx.coroutines.c
    public final String x() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void j0(Object obj) {
    }

    public void i0(Throwable th, boolean z) {
    }
}
