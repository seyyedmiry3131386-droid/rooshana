package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc1 implements q94, n31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xc1(int i, be beVar, fb6 fb6Var, fb6 fb6Var2) {
        this.b = beVar;
        this.a = i;
        this.c = fb6Var;
        this.d = fb6Var2;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        pg pgVar = (pg) this.b;
        ((ps4) obj).U(pgVar.b, (ks4) pgVar.c, (da4) this.c, (op4) this.d, this.a);
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        be beVar = (be) this.b;
        fb6 fb6Var = (fb6) this.c;
        fb6 fb6Var2 = (fb6) this.d;
        ce ceVar = (ce) obj;
        ceVar.getClass();
        ceVar.J(this.a, beVar, fb6Var, fb6Var2);
    }

    public /* synthetic */ xc1(pg pgVar, da4 da4Var, op4 op4Var, int i) {
        this.b = pgVar;
        this.c = da4Var;
        this.d = op4Var;
        this.a = i;
    }
}
