package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ad1 implements q94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be b;
    public final /* synthetic */ op4 c;

    public /* synthetic */ ad1(be beVar, op4 op4Var, int i) {
        this.a = i;
        this.b = beVar;
        this.c = op4Var;
    }

    @Override // defpackage.q94
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ce) obj).K(this.b, this.c);
                break;
            default:
                ((ce) obj).m(this.b, this.c);
                break;
        }
    }
}
