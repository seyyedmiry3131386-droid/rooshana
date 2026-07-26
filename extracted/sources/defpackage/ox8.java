package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ox8 extends mf7 {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public ox8(g51 g51Var, w61 w61Var) {
        sm0 sm0Var = sm0.d;
        super(g51Var, w61Var.r0(sm0Var) == null ? w61Var.l0(sm0Var) : w61Var);
        this.e = new ThreadLocal();
        if (g51Var.getContext().r0(eq.u) instanceof y61) {
            return;
        }
        Object objP = is3.P(w61Var, null);
        is3.H(w61Var, objP);
        q0(w61Var, objP);
    }

    @Override // defpackage.mf7
    public final void n0() {
        p0();
    }

    public final boolean o0() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void p0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.e.get();
            if (pair != null) {
                is3.H((w61) pair.a, pair.b);
            }
            this.e.remove();
        }
    }

    public final void q0(w61 w61Var, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new Pair(w61Var, obj));
    }

    @Override // defpackage.mf7, kotlinx.coroutines.c
    public final void r(Object obj) {
        p0();
        Object objP = js3.P(obj);
        g51 g51Var = this.d;
        w61 context = g51Var.getContext();
        Object objP2 = is3.P(context, null);
        ox8 ox8VarB = objP2 != is3.j ? ct2.B(g51Var, context, objP2) : null;
        try {
            g51Var.resumeWith(objP);
            if (ox8VarB == null || ox8VarB.o0()) {
                is3.H(context, objP2);
            }
        } catch (Throwable th) {
            if (ox8VarB == null || ox8VarB.o0()) {
                is3.H(context, objP2);
            }
            throw th;
        }
    }
}
