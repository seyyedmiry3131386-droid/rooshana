package defpackage;

import androidx.room.coroutines.e;

/* JADX INFO: loaded from: classes.dex */
public final class p11 implements u61 {
    public final v61 a;
    public final e b;

    public p11(v61 v61Var, e eVar) {
        js3.p(eVar, "connectionWrapper");
        this.a = v61Var;
        this.b = eVar;
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
        return this.a;
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
