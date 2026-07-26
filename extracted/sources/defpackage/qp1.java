package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class qp1 extends rp1 implements f71, g51 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(qp1.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final y61 d;
    public final ContinuationImpl e;
    public Object f;
    public final Object g;

    public qp1(y61 y61Var, ContinuationImpl continuationImpl) {
        super(-1);
        this.d = y61Var;
        this.e = continuationImpl;
        this.f = dy3.a;
        this.g = is3.M(continuationImpl.getContext());
    }

    @Override // defpackage.f71
    public final f71 getCallerFrame() {
        return this.e;
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.rp1
    public final Object l() {
        Object obj = this.f;
        this.f = dy3.a;
        return obj;
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        Object rx0Var = thA == null ? obj : new rx0(thA, false);
        ContinuationImpl continuationImpl = this.e;
        w61 context = continuationImpl.getContext();
        y61 y61Var = this.d;
        if (dy3.M(y61Var, context)) {
            this.f = rx0Var;
            this.c = 0;
            dy3.L(y61Var, continuationImpl.getContext(), this);
            return;
        }
        g42 g42VarA = tk8.a();
        if (g42VarA.c >= 4294967296L) {
            this.f = rx0Var;
            this.c = 0;
            g42VarA.L0(this);
            return;
        }
        g42VarA.R0(true);
        try {
            w61 context2 = continuationImpl.getContext();
            Object objP = is3.P(context2, this.g);
            try {
                continuationImpl.resumeWith(obj);
                while (g42VarA.Y0()) {
                }
            } finally {
                is3.H(context2, objP);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + ub1.P(this.e) + ']';
    }

    @Override // defpackage.rp1
    public final g51 g() {
        return this;
    }
}
