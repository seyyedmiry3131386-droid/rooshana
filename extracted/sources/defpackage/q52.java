package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q52 implements q94, n31 {
    public final /* synthetic */ qp4 a;

    public /* synthetic */ q52(qp4 qp4Var) {
        this.a = qp4Var;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        qg6 qg6Var = (qg6) obj;
        qg6Var.L0();
        e62 e62Var = (e62) qg6Var.a;
        e62Var.c1();
        qp4 qp4Var = e62Var.Q;
        qp4 qp4Var2 = this.a;
        if (qp4Var2.equals(qp4Var)) {
            return;
        }
        e62Var.Q = qp4Var2;
        e62Var.m.f(15, new v52(e62Var, 4));
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ((eb6) obj).C(this.a);
    }
}
