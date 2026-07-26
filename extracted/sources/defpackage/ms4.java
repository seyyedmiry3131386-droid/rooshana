package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ms4 implements n31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg b;
    public final /* synthetic */ da4 c;
    public final /* synthetic */ op4 d;

    public /* synthetic */ ms4(pg pgVar, da4 da4Var, op4 op4Var, int i) {
        this.a = i;
        this.b = pgVar;
        this.c = da4Var;
        this.d = op4Var;
    }

    @Override // defpackage.n31
    public final void accept(Object obj) {
        ps4 ps4Var = (ps4) obj;
        switch (this.a) {
            case 0:
                pg pgVar = this.b;
                ps4Var.s(pgVar.b, (ks4) pgVar.c, this.c, this.d);
                break;
            default:
                pg pgVar2 = this.b;
                ps4Var.p(pgVar2.b, (ks4) pgVar2.c, this.c, this.d);
                break;
        }
    }
}
