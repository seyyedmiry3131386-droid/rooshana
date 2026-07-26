package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc1 implements q94 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ rc1(be beVar, boolean z, int i) {
        this.a = i;
        this.b = beVar;
        this.c = z;
    }

    @Override // defpackage.q94
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ce ceVar = (ce) obj;
                ceVar.getClass();
                ceVar.N(this.b, this.c);
                break;
            case 1:
                ((ce) obj).c(this.b, this.c);
                break;
            case 2:
                ((ce) obj).a(this.b, this.c);
                break;
            default:
                ((ce) obj).e(this.b, this.c);
                break;
        }
    }
}
