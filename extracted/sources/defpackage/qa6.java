package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qa6 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n08 b;

    public /* synthetic */ qa6(n08 n08Var, int i) {
        this.a = i;
        this.b = n08Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                v04 v04Var = (v04) obj;
                js3.p(v04Var, "it");
                this.b.i((int) (v04Var.k() & 4294967295L));
                break;
            default:
                this.b.i(((Integer) obj).intValue());
                break;
        }
        return tx8.a;
    }
}
