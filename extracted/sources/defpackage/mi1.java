package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mi1 implements w61 {
    public final w61 a;

    public mi1(w61 w61Var) {
        this.a = w61Var;
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return this.a.J(qp2Var, obj);
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        w61 w61VarP = this.a.P(v61Var);
        int i = q29.b;
        x61 x61Var = y61.b;
        y61 y61Var = (y61) r0(x61Var);
        y61 y61Var2 = (y61) w61VarP.r0(x61Var);
        if ((y61Var instanceof ni1) && !y61Var.equals(y61Var2)) {
            ((ni1) y61Var).d = 0;
        }
        return new mi1(w61VarP);
    }

    public final boolean equals(Object obj) {
        return js3.i(this.a, obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        w61 w61VarL0 = this.a.l0(w61Var);
        int i = q29.b;
        x61 x61Var = y61.b;
        y61 y61Var = (y61) r0(x61Var);
        y61 y61Var2 = (y61) w61VarL0.r0(x61Var);
        if ((y61Var instanceof ni1) && !y61Var.equals(y61Var2)) {
            ((ni1) y61Var).d = 0;
        }
        return new mi1(w61VarL0);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        return this.a.r0(v61Var);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.a + ")";
    }
}
