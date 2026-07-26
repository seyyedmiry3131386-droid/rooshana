package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc1 implements q94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be b;
    public final /* synthetic */ String c;

    public /* synthetic */ sc1(be beVar, String str, int i) {
        this.a = i;
        this.b = beVar;
        this.c = str;
    }

    @Override // defpackage.q94
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ce) obj).d(this.b, this.c);
                break;
            case 1:
                ce ceVar = (ce) obj;
                ceVar.getClass();
                ceVar.g(this.b, this.c);
                break;
            case 2:
                ((ce) obj).v(this.b, this.c);
                break;
            default:
                ce ceVar2 = (ce) obj;
                ceVar2.getClass();
                ceVar2.M(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ sc1(be beVar, String str, long j, long j2, int i) {
        this.a = i;
        this.b = beVar;
        this.c = str;
    }
}
