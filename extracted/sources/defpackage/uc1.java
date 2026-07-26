package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc1 implements q94, co4, gr4 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uc1(Object obj, float f) {
        this.b = obj;
        this.a = f;
    }

    @Override // defpackage.gr4
    public void b(hq4 hq4Var) {
        ((hr4) this.b).g.t.K0(this.a);
    }

    @Override // defpackage.co4
    public void c(xf3 xf3Var, int i) {
        go4 go4Var = (go4) this.b;
        xf3Var.s(go4Var.c, i, this.a);
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ((ce) obj).F((be) this.b, this.a);
    }
}
