package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class a26 extends m91 {
    public final Class n;

    public a26(Class cls) {
        this.n = cls;
    }

    @Override // defpackage.m91
    public final void g(e57 e57Var, Object obj) {
        rb4 rb4Var = e57Var.e;
        rb4Var.getClass();
        Class cls = this.n;
        js3.p(cls, "type");
        rb4Var.f = ((b47) rb4Var.f).i(g27.a(cls), obj);
    }
}
