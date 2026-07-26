package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd1 implements q94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be b;

    public /* synthetic */ bd1(be beVar, int i) {
        this.a = i;
        this.b = beVar;
    }

    @Override // defpackage.q94
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ce) obj).y(this.b);
                break;
            case 1:
                ((ce) obj).C(this.b);
                break;
            case 2:
                ((ce) obj).r(this.b);
                break;
            case 3:
                ((ce) obj).L(this.b);
                break;
            case 4:
                ((ce) obj).U(this.b);
                break;
            default:
                ((ce) obj).b(this.b);
                break;
        }
    }

    public /* synthetic */ bd1(be beVar, ec1 ec1Var, int i) {
        this.a = i;
        this.b = beVar;
    }
}
