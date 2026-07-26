package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v52 implements r94, q94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e62 b;

    public /* synthetic */ v52(e62 e62Var, int i) {
        this.a = i;
        this.b = e62Var;
    }

    @Override // defpackage.r94
    public void d(Object obj, vd2 vd2Var) {
        ((eb6) obj).y(this.b.f, new db6(vd2Var));
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        eb6 eb6Var = (eb6) obj;
        switch (this.a) {
            case 3:
                eb6Var.N(this.b.O);
                break;
            default:
                eb6Var.D(this.b.Q);
                break;
        }
    }
}
