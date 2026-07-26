package kotlin.coroutines;

import defpackage.js3;
import defpackage.qp2;
import defpackage.u61;
import defpackage.v61;
import defpackage.w61;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class EmptyCoroutineContext implements w61, Serializable {
    public static final EmptyCoroutineContext a = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        js3.p(v61Var, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        js3.p(w61Var, "context");
        return w61Var;
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        js3.p(v61Var, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return obj;
    }
}
