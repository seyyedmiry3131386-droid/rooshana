package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class bh0 implements qx4 {
    public final oy6 a;
    public final rb4 b = new rb4(2);

    public bh0(oy6 oy6Var) {
        this.a = oy6Var;
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        return bt2.H(this, v61Var);
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return eq.D;
    }

    @Override // defpackage.qx4
    public final Object k0(g51 g51Var, dp2 dp2Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        zg0 zg0Var = new zg0();
        zg0Var.a = om0Var;
        zg0Var.b = dp2Var;
        om0Var.x(new ah0(0, this.b.i(zg0Var, this.a)));
        Object objU = om0Var.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objU;
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        return bt2.x(this, v61Var);
    }
}
