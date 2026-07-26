package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b24 extends gx4 implements d26 {
    public float o;
    public boolean p;

    @Override // defpackage.d26
    public final Object q(qj1 qj1Var, Object obj) {
        ab7 ab7Var = obj instanceof ab7 ? (ab7) obj : null;
        if (ab7Var == null) {
            ab7Var = new ab7();
        }
        ab7Var.a = this.o;
        ab7Var.b = this.p;
        return ab7Var;
    }
}
