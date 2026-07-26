package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s implements u61 {
    public final v61 a;

    public s(v61 v61Var) {
        this.a = v61Var;
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public /* bridge */ w61 P(v61 v61Var) {
        return bt2.H(this, v61Var);
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return this.a;
    }

    @Override // defpackage.w61
    public final /* bridge */ w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public /* bridge */ u61 r0(v61 v61Var) {
        return bt2.x(this, v61Var);
    }
}
