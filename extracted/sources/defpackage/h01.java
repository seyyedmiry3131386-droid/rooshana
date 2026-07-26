package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h01 implements lv5, u61 {
    public static final cv b = new cv(8);
    public final qz0 a;

    public h01(qz0 qz0Var) {
        this.a = qz0Var;
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public final /* bridge */ w61 P(v61 v61Var) {
        return bt2.H(this, v61Var);
    }

    @Override // defpackage.lv5
    public final List a(Integer num) {
        return this.a.F();
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return b;
    }

    @Override // defpackage.w61
    public final /* bridge */ w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public final /* bridge */ u61 r0(v61 v61Var) {
        return bt2.x(this, v61Var);
    }
}
