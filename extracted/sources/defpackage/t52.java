package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t52 implements q94, n31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ t52(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((qg6) obj).J0(this.b, this.c);
                break;
            default:
                qg6 qg6Var = (qg6) obj;
                qg6Var.L0();
                o80 o80Var = (o80) qg6Var.a;
                int i = this.b;
                int i2 = this.c;
                if (i != i2) {
                    ((e62) o80Var).M0(i, i + 1, i2);
                }
                break;
        }
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((eb6) obj).T(this.b, this.c);
                break;
            default:
                ((eb6) obj).T(this.b, this.c);
                break;
        }
    }
}
