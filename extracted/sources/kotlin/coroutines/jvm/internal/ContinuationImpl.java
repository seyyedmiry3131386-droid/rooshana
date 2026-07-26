package kotlin.coroutines.jvm.internal;

import defpackage.dy3;
import defpackage.eq;
import defpackage.g51;
import defpackage.i51;
import defpackage.js3;
import defpackage.om0;
import defpackage.qp1;
import defpackage.qx0;
import defpackage.u61;
import defpackage.w61;
import defpackage.y61;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final w61 _context;
    private transient g51<Object> intercepted;

    public ContinuationImpl(g51 g51Var, w61 w61Var) {
        super(g51Var);
        this._context = w61Var;
    }

    @Override // defpackage.g51
    public w61 getContext() {
        w61 w61Var = this._context;
        js3.m(w61Var);
        return w61Var;
    }

    public final g51<Object> intercepted() {
        g51<Object> g51Var = this.intercepted;
        if (g51Var != null) {
            return g51Var;
        }
        i51 i51Var = (i51) getContext().r0(eq.u);
        g51<Object> qp1Var = i51Var != null ? new qp1((y61) i51Var, this) : this;
        this.intercepted = qp1Var;
        return qp1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        g51<Object> g51Var = this.intercepted;
        if (g51Var != null && g51Var != this) {
            u61 u61VarR0 = getContext().r0(eq.u);
            js3.m(u61VarR0);
            qp1 qp1Var = (qp1) g51Var;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qp1.h;
            while (atomicReferenceFieldUpdater.get(qp1Var) == dy3.b) {
            }
            Object obj = atomicReferenceFieldUpdater.get(qp1Var);
            om0 om0Var = obj instanceof om0 ? (om0) obj : null;
            if (om0Var != null) {
                om0Var.r();
            }
        }
        this.intercepted = qx0.a;
    }

    public ContinuationImpl(g51 g51Var) {
        this(g51Var, g51Var != null ? g51Var.getContext() : null);
    }
}
