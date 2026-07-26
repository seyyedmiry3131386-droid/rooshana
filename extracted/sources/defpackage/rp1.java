package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rp1 extends ze8 {
    public int c;

    public rp1(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract g51 g();

    public Throwable h(Object obj) {
        rx0 rx0Var = obj instanceof rx0 ? (rx0) obj : null;
        if (rx0Var != null) {
            return rx0Var.a;
        }
        return null;
    }

    public final void k(Throwable th) {
        is3.w(g().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object l();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            g51 g51VarG = g();
            js3.n(g51VarG, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            qp1 qp1Var = (qp1) g51VarG;
            ContinuationImpl continuationImpl = qp1Var.e;
            Object obj = qp1Var.g;
            w61 context = continuationImpl.getContext();
            Object objP = is3.P(context, obj);
            wt3 wt3Var = null;
            ox8 ox8VarB = objP != is3.j ? ct2.B(continuationImpl, context, objP) : null;
            try {
                w61 context2 = continuationImpl.getContext();
                Object objL = l();
                Throwable thH = h(objL);
                if (thH == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        wt3Var = (wt3) context2.r0(th0.n);
                    }
                }
                if (wt3Var != null && !wt3Var.b()) {
                    CancellationException cancellationExceptionI = wt3Var.I();
                    d(cancellationExceptionI);
                    continuationImpl.resumeWith(b.a(cancellationExceptionI));
                } else if (thH != null) {
                    continuationImpl.resumeWith(b.a(thH));
                } else {
                    continuationImpl.resumeWith(i(objL));
                }
                if (ox8VarB == null || ox8VarB.o0()) {
                    is3.H(context, objP);
                }
            } catch (Throwable th) {
                if (ox8VarB == null || ox8VarB.o0()) {
                    is3.H(context, objP);
                }
                throw th;
            }
        } catch (DispatchException e) {
            is3.w(g().getContext(), e.a);
        } catch (Throwable th2) {
            k(th2);
        }
    }

    public void d(CancellationException cancellationException) {
    }

    public Object i(Object obj) {
        return obj;
    }
}
