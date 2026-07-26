package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y61 extends s implements i51 {
    public static final x61 b = new x61(eq.u, new sl0(5));

    public y61() {
        super(eq.u);
    }

    public void C0(w61 w61Var, Runnable runnable) {
        dy3.L(this, w61Var, runnable);
    }

    public boolean D0(w61 w61Var) {
        return !(this instanceof nx8);
    }

    public y61 F0(int i) {
        bt2.r(i);
        return new t64(this, i);
    }

    @Override // defpackage.s, defpackage.w61
    public final w61 P(v61 v61Var) {
        js3.p(v61Var, "key");
        if (v61Var instanceof x61) {
            x61 x61Var = (x61) v61Var;
            v61 v61Var2 = this.a;
            if ((v61Var2 == x61Var || x61Var.b == v61Var2) && ((u61) x61Var.a.invoke(this)) != null) {
                return EmptyCoroutineContext.a;
            }
        } else if (eq.u == v61Var) {
            return EmptyCoroutineContext.a;
        }
        return this;
    }

    public abstract void U(w61 w61Var, Runnable runnable);

    @Override // defpackage.s, defpackage.w61
    public final u61 r0(v61 v61Var) {
        u61 u61Var;
        js3.p(v61Var, "key");
        if (!(v61Var instanceof x61)) {
            if (eq.u == v61Var) {
                return this;
            }
            return null;
        }
        x61 x61Var = (x61) v61Var;
        v61 v61Var2 = this.a;
        if ((v61Var2 == x61Var || x61Var.b == v61Var2) && (u61Var = (u61) x61Var.a.invoke(this)) != null) {
            return u61Var;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ub1.v(this);
    }
}
