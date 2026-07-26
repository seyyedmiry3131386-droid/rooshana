package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k01 implements m37 {
    public final lf7 a;

    public k01(lf7 lf7Var) {
        this.a = lf7Var;
    }

    @Override // defpackage.m37
    public final void a() {
        b();
    }

    public final void b() {
        lf7 lf7Var = this.a;
        if (lf7Var.c || lf7Var.j) {
            return;
        }
        lf7Var.e.a.t("CompositionKoinScopeLoader close scope: '" + lf7Var.b + '\'');
        lf7Var.a();
    }

    @Override // defpackage.m37
    public final void c() {
        b();
    }

    @Override // defpackage.m37
    public final void e() {
    }
}
