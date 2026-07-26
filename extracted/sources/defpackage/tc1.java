package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc1 implements q94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be b;
    public final /* synthetic */ int c;

    public /* synthetic */ tc1(int i, long j, be beVar) {
        this.a = 5;
        this.b = beVar;
        this.c = i;
    }

    @Override // defpackage.q94
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ce) obj).t(this.b, this.c);
                break;
            case 1:
                ((ce) obj).u(this.b, this.c);
                break;
            case 2:
                ((ce) obj).T(this.b, this.c);
                break;
            case 3:
                ((ce) obj).i(this.b, this.c);
                break;
            case 4:
                ((ce) obj).o(this.b, this.c);
                break;
            case 5:
                ((ce) obj).l(this.b, this.c);
                break;
            case 6:
                ce ceVar = (ce) obj;
                ceVar.getClass();
                ceVar.z(this.b, this.c);
                break;
            default:
                ((ce) obj).A(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ tc1(be beVar, int i, int i2) {
        this.a = i2;
        this.b = beVar;
        this.c = i;
    }

    public /* synthetic */ tc1(be beVar, jp4 jp4Var, int i) {
        this.a = 1;
        this.b = beVar;
        this.c = i;
    }
}
